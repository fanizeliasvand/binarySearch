
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {


		int [] arr = new int[50];

		SecureRandom generator = new SecureRandom();


		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = generator.nextInt(2000);
		}

		System.out.println("The unsorted array:");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + ", ");

		}

		System.out.println();


		Arrays.sort(arr);


		System.out.println("The sorted array:");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + ", ");

		}

		System.out.println();
		System.out.println();
		System.out.println();




		while(true) {

			System.out.println("Please enter an integer value (-1 to quit):");

			int inputNumber = input.nextInt();

			if(inputNumber == -1) {
				break;
			}

			int index = binarySearch(arr, inputNumber);
			if(index == -1) {
				System.out.println("input was not found for the value");
			} else {
				System.out.println("was found at index " + index);
			}
			
			//System.out.println("was found at index " + binarySearch(arr, inputNumber));


		}
		System.out.println("Program terminated successfully!");


	}

	public static int binarySearch(int[]arr, int key) {

		int lh = 0;
		int rh = arr.length-1;


		while(lh <= rh) {

			int mid = (lh+rh)/2;

			if(key == arr[mid]) {
				return mid;
			}
			else if(key < arr[mid]) {
				rh = mid -1;
			}else {			//key > arr[mid]
				lh = mid+1;
			}


		}
		return -1;




	}


}
