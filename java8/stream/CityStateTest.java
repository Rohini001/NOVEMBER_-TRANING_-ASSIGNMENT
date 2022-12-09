package com.example.assigment.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CityStateTest {

	public static void main(String[] args) {

		List<City> cityList = new ArrayList<>();

		cityList.add(new City(101, "Pune", new State(1, "Maharastra"), 1f, 10, 40));
		cityList.add(new City(102, "Mumbai", new State(2, "Maharastra"), 2f, 20, 50));
		cityList.add(new City(103, "Nagpur", new State(3, "Maharastra"), 3f, 30, 60));
		cityList.add(new City(104, "Nashik", new State(4, "Maharastra"), 4f, 40, 70));
		cityList.add(new City(105, "Shirdi", new State(5, "Maharastra"), 5f, 50, 80));

		// 1. WAP to find the city with less area and highest population
		City lessArea = cityList.stream().min(Comparator.comparingInt(c -> c.getArea_of_city())).get();
		City highPopulation = cityList.stream().max(Comparator.comparingInt(c -> c.getPopulation())).get();

		System.out.println("Highest population :" + highPopulation);
		System.out.println("LesArea :" + lessArea);

		// 2. WAP to find the city with high pollution_index and high city area.

		Optional<City> highPopArea = cityList.stream()
				.max(Comparator.comparing(City::getPollutionIndex).thenComparingInt(City::getArea_of_city));
		System.out.println("City having High pollution_index and high city area :" + highPopArea);

		// 3. WAP to print the city detail on the basis of lowest pollution_index first
		// and so on.
		List<City> pollIndex = cityList.stream().sorted(Comparator.comparing(City::getPollutionIndex)).toList();
		System.out.println("City detail on the basis of lowest pollution_index first :"+pollIndex);

		//4. WAP to print city with lowest pollution index and lowest area of city.
		Optional<City> lowestPopArea = cityList.stream()
				.min(Comparator.comparing(City::getPollutionIndex).thenComparingInt(City::getArea_of_city));
		System.out.println("City having lowest pollution_index and lowest city area :" + lowestPopArea);

		//5. WAP to count how many cities in every state we are having. 
		Map<String, Long> cities = cityList.stream().collect(Collectors.groupingBy(City::getCityname, 
				Collectors.counting()));
        
		System.out.println("Cities in every state :"+cities);
	
	  //6. WAP to print total area of each state. 
	//	List<City> totalArea = cityList.stream()
	
	
	}

}

class State {
	private int stated;
	private String statename;

	public State(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}

	public int getStated() {
		return stated;
	}

	public void setStated(int stated) {
		this.stated = stated;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "State [stated=" + stated + ", statename=" + statename + "]";
	}

}

class City {
	private int cityid;
	private String cityname;
	private State objState;
	private Float pollutionIndex;
	private int population;
	private int area_of_city;

	public City(int cityid, String cityname, State objState, Float pollutionIndex, int population, int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public State getObjState() {
		return objState;
	}

	public void setObjState(State objState) {
		this.objState = objState;
	}

	public Float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(Float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState + ", pollutionIndex="
				+ pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}

}