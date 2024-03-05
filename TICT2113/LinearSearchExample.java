public class LinearSearchExample{
	
	public static void main(String a[]){    
		int[] a1= {10,20,30,50,70,90};    // Initialize an array with some values
		int key = 21;    // Define the key to be searched for
		
		// Call the linearSearch method and print the result
		System.out.println(key+" is found at index: "+linearSearch(a1, key));    
	}
	
	public static int linearSearch(int[] arr, int key){    // Define a method for linear search
		for(int i=0;i<arr.length;i++){    // Iterate through the array
			if(arr[i] == key){    // Check if the current element is equal to the key
				return i;    // If found, return the index of the element
			}    
		}    
		return -1;    // If key is not found, return -1
	}
}


