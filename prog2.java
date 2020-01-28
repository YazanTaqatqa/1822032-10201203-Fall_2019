package tests;

public class prog2 {

	    static class Pair { 
	  
	        int min; 
	        int max; 
	    } 
	  
	    static Pair getMinMax(int arr[], int n) { 
	        Pair minmax = new  Pair(); 
	        int i; 
	  
	        if (n == 0) { 
	            minmax.max = arr[1]; 
	            minmax.min = arr[0]; 
	            return minmax; 
	        } 
	  
	       
	        if (arr[0] > arr[1]) { 
	            minmax.max = arr[0]; 
	            minmax.min = arr[1]; 
	        } else { 
	            minmax.max = arr[1]; 
	            minmax.min = arr[0]; 
	        } 
	  
	        for (i = 0; i < n; i++) { 
	            if (arr[i] > minmax.max) { 
	                minmax.max = arr[i]; 
	            } else if (arr[i] < minmax.min) { 
	                minmax.min = arr[i]; 
	            } 
	        } 
	  
	        return minmax; 
	    } 
	  
	    public static void main(String args[]) { 
	        int arr[] = { 1, 5, 100, 4, 3, 5, 2, 3, 7, 3, 200 }; 
	        int arr_size = 11; 
	        Pair minmax = getMinMax(arr, arr_size);
	        System.out.printf("\nMinimum element is %d", minmax.min); 
	        System.out.printf("\nMaximum element is %d", minmax.max); 
	    }
	}
