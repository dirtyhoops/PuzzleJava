import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	//calculates the sum of the array
	public int sumArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	//returns values in the array that are greater than 10
	public ArrayList<Object> greaterArray(int[] arr) {
		ArrayList<Object> myArray = new ArrayList<Object>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 10){
				myArray.add(arr[i]);
			}
		}
		return myArray;
	}

	//returns names with more than 5 characters
	public ArrayList<String> getNames(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<String>();
		for(int i=0; i < list.size(); i++){
			if(list.get(i).length() > 5){
				newList.add(list.get(i));
			}
		}
		return newList;
	}

	public ArrayList<Integer> randomNumbers() {
		ArrayList<Integer> randomNum = new ArrayList<Integer>();
		Random ran = new Random();
		int i = 0;
		while(i < 10) {
			int nxt = ran.nextInt(45)+55;
			randomNum.add(nxt); 
			i++;
		}
		return randomNum;
	}

	








}		

