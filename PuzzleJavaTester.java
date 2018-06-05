import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTester {
	public static void main(String[] args) {
		//import PuzzleJava class
		PuzzleJava puzzling = new PuzzleJava();
		int[] numbers = {3,5,1,2,7,9,8,13,25,32};

		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("a");
		alphabet.add("b");
		alphabet.add("c");
		alphabet.add("d");
		alphabet.add("e");
		alphabet.add("f");
		alphabet.add("g");
		alphabet.add("h");
		alphabet.add("i");
		alphabet.add("j");
		alphabet.add("k");
		alphabet.add("l");
		alphabet.add("m");
		alphabet.add("n");
		alphabet.add("o");
		alphabet.add("p");
		alphabet.add("q");
		alphabet.add("r");
		alphabet.add("s");
		alphabet.add("t");
		alphabet.add("u");
		alphabet.add("v");
		alphabet.add("w");
		alphabet.add("x");
		alphabet.add("y");
		alphabet.add("z");

		ArrayList<String> names = new ArrayList<String>();
		names.add("Nancy");
		names.add("Jinichi");
		names.add("Fujibiyashi");
		names.add("Momochi");
		names.add("Ishikawa");


		//calls the sumArray function to print the sum of the given array
		int sum1 = puzzling.sumArray(numbers);
		System.out.println("Sum of the array is " + sum1);

		ArrayList<Object> list = puzzling.greaterArray(numbers);
		System.out.println("Array values greater than 10 are:");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if(i < list.size()-1) {
				System.out.print(", ");
			}
		}

		//shuffles the names and then prints it out
		Collections.shuffle(names);
		System.out.println("\nShuffled list or names: " + names);

		//prints out names with more than 5 characters
		ArrayList<String> newlist = puzzling.getNames(names);
		System.out.println("Names with more than 5 characters are: " + newlist);

		//shuffles the alphabet and prints the first and last letter after shuffling.
		Collections.shuffle(alphabet);
		System.out.println("First letter is \"" + alphabet.get(0) + "\", and the last letter is \"" + alphabet.get(25) + "\"");

		//generate 10 random numbers and prints it out.
		ArrayList<Integer> randomNumbers = puzzling.randomNumbers();
		System.out.println("Random 10 numbers are: " + randomNumbers);

		//prints out a sorted random numbers 
		Collections.sort(randomNumbers);
		System.out.println("Sorted random 10 numbers are: " + randomNumbers);


	}
}