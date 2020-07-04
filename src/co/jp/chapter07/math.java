package co.jp.chapter07;

import java.util.Arrays;

public class math {
	public static int max(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
	public static  int min(int[] arr) {
		Arrays.sort(arr);

        return arr[0];
    }
	public static  int ave(int[] arr) {
		int sum = 0;
		for(int value: arr) {
			sum+= value;
		}
        
		return sum/arr.length;
    }
}
