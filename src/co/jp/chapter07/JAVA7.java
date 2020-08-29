package co.jp.chapter07;

import java.util.Arrays;

public class JAVA7 {
	int[]arr= {0,3,2,100,-100};
	
	
	public static int max(int[]arr) {
		
		int[]arrtemp = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			arrtemp[i]=arr[i];
		}
		Arrays.sort(arrtemp);
		
		return arrtemp[arrtemp.length-1];
	}
	
}
