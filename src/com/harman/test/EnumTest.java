package com.harman.test;

//enum -> is used to create constants

enum Direction{
	NORTH (5),
	WEST (1),
	EAST (2),
	SOUTH (4);
	
	private int directionCode;
	Direction (int directionCode){
		this.directionCode = directionCode;
	}
	
	public int getDirectionCode() {
		return directionCode;
	}
	
}

enum Week{
	SUNDAY,
	MONDAY,
	TUESDAY
}

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direction north = Direction.NORTH;
		System.out.println(north);
		
		if(north == Direction.NORTH) {
			System.out.println("Yes");
		} else {
			
		}
		System.out.println("using values...");
		Direction[] directions = Direction.values();
		for (Direction d : directions) {
			System.out.println(d + " " + d.getDirectionCode());
		}
		
	}

}
