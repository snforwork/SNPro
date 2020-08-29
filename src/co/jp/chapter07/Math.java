package co.jp.chapter07;

import java.util.Arrays;

public class Math {


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

    public static int max1(int[] arr) {
    	int rtn;
    	int[] arrtemp = new int[arr.length];
    	for(int i = 0; i < arr.length; i++) {
    		arrtemp[i] = arr[i];
    	}
    	Arrays.sort(arrtemp);
        return arrtemp[arrtemp.length-1];
    }


}

