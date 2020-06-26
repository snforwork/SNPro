package co.jp.chapter12;

public class Exception {



	public static void main(String[] args) {
		try {
			int[]arr = new int[] {1,2,3};
			System.out.println(arr[3]);

			 } catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("エラーを発⽣します");


			 }

	}


}
