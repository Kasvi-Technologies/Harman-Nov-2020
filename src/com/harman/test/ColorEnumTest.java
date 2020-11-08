package com.harman.test;

//enum -> is used to create constants

enum Color{
	RED (5),
	YELLOW (1),
	GREEN (2),
	BLAK (4);
	
	private int colorCode;
	Color (int colorCode){
		this.colorCode = colorCode;
	}
	
	public int getColorCode() {
		return colorCode;
	}
	
}



public class ColorEnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color color = Color.RED;
		System.out.println(color);
		
		if(color == Color.GREEN) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("using values...");
		Color[] colors = Color.values();
		for (Color d : colors) {
			System.out.println(d + " " + d.getColorCode());
		}		
	}
}
