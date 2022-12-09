package com.example.assigment.java8.lambda;

@FunctionalInterface
interface InsertString {
	String insert(String orignalString, String insertedString);
}

public class Q4_InsertStringGC {
	private static String string;
	private static String str = "Welcome to";
	private static String insertStr = "Yash Technologies";

	public static void main(String[] args) {

		InsertString si = (s, is) -> {

			string = new String(s);
			String concat = string.concat(is);
			string = null;
			return concat;
		};
		System.out.println("" + si.insert(str, insertStr));
		System.gc();
		System.runFinalization();

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.string + "freed successfully");
		System.out.println(this.str + "freed successfully");
		System.out.println(this.insertStr + "freed successfully");

	}

}
