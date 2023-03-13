import java.util.Arrays;

class Main{
	public static void main(String[]args) {
		//0,1,2,3,4.
		char vowels[]={'e','u','a','o','i'};
	
		Arrays.sort(vowels);
		//We can also perform our search between certain values
		int startingIndex= 1;
		int endingIndex= 4;
		//Find a specific array.'o'
		//If we insert a character that isn't lsited we will get a negative number.
		//If it's correct we will always get a positive output.
		char key='o';
		//binarySearch method
		int foundItemIndex = Arrays.binarySearch(vowels,startingIndex,endingIndex,key);
		//print the array
		System.out.print(Arrays.toString(vowels));
		//Then print out foundItemIndex
		System.out.print(foundItemIndex);
	}
}