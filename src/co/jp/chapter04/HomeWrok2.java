package co.jp.chapter04;

public class HomeWrok2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//設問
		//1　int[] array = new int[4];各要素の値{0，0，0，0}；
		//2 int[] array = new int[]{5,6};各要素の値{5，6}；
		//3 int[][] array = new int [2][3];各要素の値{0，0}{0，0，0}；

		//4
        int[][] array3d = new int[4][2];
		for (int[] out : array3d) {
		 for (int inner : out) {
		 System.out.println(inner);
		 } }

		 System.out.println("*******************");
        //5 int[] array = new int[]{1,3,5,7,100,0,1};左の配列の最大値と最小値を
		 int[] array = new int[]{1,3,5,7,100,0,1};
		 int max = 0;

		 for(int i = 0; i < array.length; i++) {
				if(array[i] > max) {
					max = array[i];
				}
				}
			System.out.println("配列の最大値="+max);

			int mix = max;
			for(int j = 0; j< array.length; j++) {
				if(array[j]<mix) {
					mix = array[j];
				}
			}
			System.out.println("配列の最小値="+mix);
			System.out.println("*******************");

			//6 問題1の配列のＳＵＭを求める
			int[] array1 = new int [4];
			int sum = 0;
			for(int k = 0;k < array1.length;k++) {
				sum = sum + array1[k];
			}
			System.out.println("配列の和は："+sum);

			System.out.println("*******************");
			//7 行列（2次元配列）の和と積を計算してください。
			int[][] array2d = new int[][]{
				 {1, 2},
				 {3,4} };
			int[][] array4d = new int[][]{
					 {5,6},
					 {7,8} };
				 int sum1 = 0; int num = 1;
			for(int a = 0;a<array2d.length;a++) {
             for(int b = 0; b<array4d.length;b++) {

					sum1 = sum1+array2d[a][b]+array4d[a][b];
					num = num*array2d[a][b]*array4d[a][b];
             }

			}
			System.out.println("配列の和は："+sum1);
			System.out.println("配列の積は："+num);
	}

}
