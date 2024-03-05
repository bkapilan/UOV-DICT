public class BinarySearchExample{ 

    // Main method to test the binary search implementation
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;
		
        // Calling the binarySearch method with the array, starting index, ending index, and key to search
        binarySearch(arr,0,last,key);     
    }  
 
    // Method to perform binary search on an array
    public static void binarySearch(int arr[], int first, int last, int key){  
        // Calculating the middle index of the array
        int mid = (first + last)/2;  
		
        // Loop until the first index is less than or equal to the last index
        while( first <= last ){  
            // If the element at mid index is less than the key, update the first index
            if ( arr[mid] < key ){  
                first = mid + 1;     
            }
            // If the element at mid index is equal to the key, the element is found
            else if ( arr[mid] == key ){  
                System.out.println("Element is found at index: " + mid);  
                // Exit the loop
                break;  
            }
            // If the element at mid index is greater than the key, update the last index
            else{  
                last = mid - 1;  
            }  
            // Recalculate the mid index
            mid = (first + last)/2;  
        }  
		
        // If first index becomes greater than last index, the element is not found
        if ( first > last ){  
            System.out.println("Element is not found!");  
        }
    }
    

	
}  
