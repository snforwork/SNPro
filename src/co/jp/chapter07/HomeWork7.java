package co.jp.chapter07;

import java.util.Arrays;

public class HomeWork7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		public static int max(int[]arr) {
//			
//			int[]arrtemp = new int[arr.length];
//			for(int i =0;i<arr.length;i++) {
//				arrtemp[i]=arr[i];
//			}
//			Arrays.sort(arrtemp);
//			
//			return arrtemp[arrtemp.length-1];
//		}
	/**質問１*/
		
		//定義されないメソッドsetAge(1234)をアクセスする。
//		public class Pet {
//			public String name;
//			public void setName(String value) {
//			this.name = value;
//			}
//			}
//			// Kicker.java
//			public class Kicker {
//			public static void main(String...args) {
//			Pet cat = new Pet();
//			cat.setAge(1234);
//	
//			}
//			}
		
//	/**質問２*/
	int[] arr = new int[] {0,3,2,100,-100};
		System.out.println("Sort前："+Arrays.toString(arr));
		System.out.println(math.max(arr));
		System.out.println(math.min(arr));
		System.out.println(arr[0]);
		System.out.println("Sort后："+Arrays.toString(arr));
//		int[]arr= {0,3,2,100,-100};
//		System.out.println("Sort前："+Arrays.toString(arr));
//		System.out.println(Math.max(arr));
//		System.out.println(arr[0]);
//		System.out.println("Sort前："+Arrays.deepToString(arr));
	}
	public static int max(int[]arr) {
		
		int[]arrtemp = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			arrtemp[i]=arr[i];
		}
		Arrays.sort(arrtemp);
		
		return arrtemp[arrtemp.length-1];
	}
}
