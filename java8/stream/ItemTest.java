package com.example.assigment.java8.stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemTest {

	public static void main(String[] args) {

		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "Laptop", LocalDateTime.of(2022, 12, 01, 01, 10),LocalDateTime.of(2024, 12, 01, 01, 20), 10000f));
		itemList.add(new Item(2, "TV", LocalDateTime.of(2022, 11, 01, 01, 10), LocalDateTime.of(2024, 11, 01, 01, 20),20000f));
		itemList.add(new Item(3, "water bottle", LocalDateTime.of(2022, 12, 01, 01, 10), null, 100f));
		itemList.add(new Item(4, "Dresses", LocalDateTime.of(2022, 12, 01, 01, 10), null, 2000f));
		itemList.add(new Item(5, "Jwellary", LocalDateTime.of(2022, 10, 01, 01, 10), null, 2000f));

		//1. WAP to find the average price of item from the list of given items.
		Double priceLst = itemList.stream().map(p -> p.getPrice()).collect(Collectors.averagingDouble(p -> p.floatValue()));
		System.out.println("Average price of item from the list :" + priceLst);
		
		//2. WAP to print detail of item which is having highest and lowest price.
		Float maxPrice = itemList.stream().map(p -> p.getPrice()).max(Comparator.naturalOrder()).get();
		Float minPrice = itemList.stream().map(p -> p.getPrice()).min(Comparator.naturalOrder()).get();

		System.out.println("Highest price :"+maxPrice);
		System.out.println("Lowest price :"+minPrice);
		
		//4. WAP to store item name and price from list to set. 
		
		Set<Item>list=itemList.stream().map(i->new Item(i.getIname(),i.getPrice() ) ).collect(Collectors.toSet());
		System.out.println("Set of item name and price :");
		for (Item item : list) {
			System.out.println(item.getIname()+" "+item.getPrice());
		}
		
		
		//5. WAP to remove duplicate prices from the list of the items.
		List<Float>distinct=itemList.stream().map(i->i.getPrice()).distinct().collect(Collectors.toList());
		System.out.println("Removed duplicate prices from the list of the items :"+distinct);
		
		//3.WAP to print the item with maximum price and not having any expiry date
		Optional<Float>item=itemList.stream().filter(p ->p.getDate_of_expiry().isEqual(null))
						.map(p -> p.getPrice()).max(Comparator.naturalOrder());
		System.out.println("Items having Maximum price and not having any expiry date :"+item);
				
				
	}
}
	
class Item {
	private int itemid;
	private String iname;
	private LocalDateTime date_of_manufacturing, date_of_expiry;
	private float price;

	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}

	

	public Item(String iname, float price) {
		super();
		this.iname = iname;
		this.price = price;
	}



	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}

}

