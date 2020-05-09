package co.jp.chapter05;

import java.util.Arrays;

public class HomeWork {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*
 *	１ 1から100までの偶数の和を求める(for + if)
 */
		int sum = 0;
		
		for(int i=0; i<=100;i++ ) {
			if(i % 2 == 0) {
				sum += i;
			}
			
		}
		System.out.println("1から100までの偶数の和 "+sum);

/*
 *	２ 5の階乗を求める(for)。
 */
		
		for (int i = 1; i <= 5; i++) {
			int s = 1;
			for(int j = 1; j <= i; j++) {
				s *= j;
			}
			System.out.println("5の階乗 :"+s);
		}
		

/*
 *	３ 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 */
		int[] arr1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = arr1[0];
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println(" MAX : " + max);
		System.out.println(" MIN : " + min);
		
/*
 *	４ ︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 */
		
		int loopCount = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (i >= j) {
					continue;
				}
				if (arr1[i] == arr1[j]) {
					System.out.println(" 重複要素 : " + arr1[i] + "  i&j : " + i + "" + j);
				}
				loopCount++;
			}
		}
		System.out.println(loopCount);

/*
 *	５ 質問３の配列に値「７」のインデックスを求む。
 */
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 7) {
				System.out.println("配列に値「７」のインデックス:"+i);
				break;
			}
		}

/*
 *	６ 任意⾏列（２次元配列）の積を求める。
 */
		int[][] arr6A = new int[][] {
				{ 1, 2 },
				{ 3, 4 }
		};
		int[][] arr6B = new int[][] {
				{ 5, 6 },
				{ 7, 8 }
		};
		for (int i = 0; i < arr6A.length; i++) {
			for (int j = 0; j < arr6A.length; j++) {
				System.out.print(arr6A[i][j] * arr6B[i][j] + ",");
			}
			System.out.println("");
		}

/*
 *	７ 配列を昇順でソートする
 */		
		int loopCount7 = 0;
		int temp = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
				loopCount7++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(loopCount7);

/*
 *	８ LV10のパスカルの三⾓形を出⼒してください。
 */

		int n = 10;
		int[][] arrays = new int[n][];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = new int[i + 1];
			//左边打印空格，打印等腰三角形
			for (int k = 0; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < arrays[i].length; j++) {
				if (i == 0 || j == 0 || i == j) {
					arrays[i][j] = 1;
				} else {
					arrays[i][j] = arrays[i - 1][j] + arrays[i - 1][j - 1];
				}
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		}

	}

}
