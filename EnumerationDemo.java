package com.demo;
enum Shape
{
	Circle,
	Rectangle,
	Triangle
}
enum Days
{
	Monday,
	Tuesday,
	Wednesday
}
enum Month
{
	January,
	February,
	March
}
enum Weekends
{
	Saturday,
	Sunday
}
enum Direction
{
	North,
	South,
	East,
	West
	
}
public class EnumerationDemo {

	public static void main(String[] args) {
		/*Direction di1=Direction.North;
		Direction di2=Direction.South;
		System.out.println("First direction: " + di1);
		System.out.println("Second direction: " + di2);*/
		
		/*for(Direction dir : Direction.values());
		{
			System.out.println(dir);
		}*/
		
		Direction dir=Direction.North;
		if(dir==Direction.East)
		   System.out.println("Direction: East");
		else if(dir==Direction.West)
		{
			System.out.println("Direction: West");
		}
		else if(dir==Direction.West)
		{
			System.out.println("Direction: West");
		}
		

	}

}
