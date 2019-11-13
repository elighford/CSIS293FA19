/*
	Jamie Steck and CSIS 293 FA19 0939
	Nov 13, 2019
	FavoriteMethods.java
	A collection of our favorite useful methods
	Dependencies: none
	Credit: none
*/

import java.util.Random;

public class FavoriteMethods
{
	public static void main(String[] parameters)
	{
		//the purpose of this program is to create a collection of useful methods
		//methods that could be used in many different programs
		//methods that could be useful for future projects!
		//each person can add in a method that they think is useful
		//it can be something new or something we've done in the past
		//here is Prof Steck's:

		System.out.println("Prof Steck:  Generate a random number in range...");
		System.out.println(randomNumber(5,7));


	}

	//randomNumber() returns a random number in the given range (between low and high, inclusive)
	public static int randomNumber(int low, int high)
	{
		Random ranGen = new Random();
		int ranNum = ranGen.nextInt(high-low+1) + low;
		return ranNum;
	}


}