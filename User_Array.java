import java.util.Scanner;

public class User_Array{
	
	Scanner scan = new Scanner(System.in);
	int length;
	
	public int getArrayLength() {
		//Asks for the desired array length
		System.out.println("How long should the array be?");
		do {
			//Catches inputs that are not type int and keeps asking until an int is given
			try {
				String input = scan.nextLine();
				length = Integer.parseInt(input);
				break;
			}
			catch (Exception e){
				System.out.println("Error, please enter an integer value.");
			}
			
		}while(true);
		return length;
		
	}
	
	public void populateArray(int[] array) {
		//Loops through prompting the user to provide a number for each index
		for(int i=0;i<array.length;i++) {
			System.out.println("What should the value be for index " + i);
			do {
				try {
					String input = scan.nextLine();
					array[i] = Integer.parseInt(input);
					break;
				}
				catch (Exception e){
					System.out.println("Error, please enter an integer value.");
				}
			}while(true);
		}
	}
	
	public void printArray(int[] array) {
		//uses a loop to print the array it is passed
		System.out.println("Your array: ");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void getLargest(int[] array) {
		//loops through to find the index of the largest value
		int largest = 0;
		for (int i=1; i<array.length; i++) {
			if (array[i] > array[largest]) {
				largest = i;
			}
		}
		System.out.println("The largest value in your array is: " + array[largest]);
	}
	public void getSmallest(int[] array) {
		//loops through to find the index of the smallest value
		int smallest = 0;
		for (int i=1; i<array.length;i++) {
			if (array[i] < array[smallest]) {
				smallest = i;
			}
		}
		System.out.println("The smallest value in your array is: " + array[smallest]);
	}
	
	
	public static void main(String [] args) {
		User_Array array_tool = new User_Array();
		int[] my_array = new int[array_tool.getArrayLength()];
		array_tool.populateArray(my_array);
		array_tool.printArray(my_array);
		array_tool.getLargest(my_array);
		array_tool.getSmallest(my_array);
		
	}
	
	
	
	
}