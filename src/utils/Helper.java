package utils;

public class Helper {
	public static void displayStrByIndices(String str) {
		StringBuilder lettersSeparated = new StringBuilder();
		StringBuilder indexesSeparated = new StringBuilder();
		for(int i = 0; i <= str.length()-1; i++) {
			lettersSeparated.append(str.charAt(i) + " ");
			indexesSeparated.append(i + " ");
		}
		System.out.println(lettersSeparated);
		System.out.println(indexesSeparated);
	}
	public static void addBreakLine() {
		System.out.println("-------------------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {

	}

}
