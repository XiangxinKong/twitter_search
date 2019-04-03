package javaapplication2;

import java.util.Arrays;

public class Remove {
	public static int removeDuplicateElements(String arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        String[] temp = new String[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (!arr[i].equals( arr[i+1])){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }
	
	public static String[] Remove(String[] arr) {
		
		Arrays.sort(arr);
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		String[] array = new String[length];
		for (int i = 0; i < length; i++)
			array[i] = arr[i];
		return array;
		
	}

}
