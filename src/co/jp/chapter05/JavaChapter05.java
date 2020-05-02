package co.jp.chapter05;

import java.util.Arrays;

public class JavaChapter05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1
		int q1 = 100;
		int sum = 0;
		//		for (int i = 0; i < q1; i++) {
		//			if ((i + 1) % 2 == 0) {
		//				sum += (i + 1);
		//			}
		//		}
		do {
			if (q1 % 2 == 0) {
				sum += q1;
			}
			q1--;
			System.out.println(sum);
		} while (q1 != 0);

		System.out.println(sum);
		// 2
		int q2 = 80;
		int q2re = 1;
		for (int i = 0; i < q2; i++) {
			q2re *= q2 - i;
		}
		while (q2 != 0) {
			q2re *= q2;
			q2--;
		}
		System.out.println(q2re);

		//3
		int[] arr3 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1, 0, -1, 123, 333, -999 };
		int max = arr3[0];
		int min = arr3[0];
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] > max) {
				max = arr3[i];
			}
			if (arr3[i] < min) {
				min = arr3[i];
			}
		}
		System.out.println(" MAX : " + max);
		System.out.println(" MIN : " + min);
		//4
		int[] arr4 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int loopCount = 0;
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				if (i >= j) {
					continue;
				}
				if (arr4[i] == arr4[j]) {
					System.out.println(" 重複要素 : " + arr4[i] + "  i&j : " + i + "" + j);
				}
				loopCount++;
			}
		}
		System.out.println(loopCount);

		// 5
		for (int i = 0; i < arr4.length; i++) {
			if (arr4[i] == 7) {
				System.out.println(i);
				break;
			}
		}

		// 6
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

		// 7
		int[] arr7 = new int[] { 5, 7, 1, 3, 2, 6, 9, 0, 8, 4 };
		int loopCount7 = 0;
		int temp = 0;
		for (int i = 0; i < arr7.length - 1; i++) {
			for (int j = 0; j < arr7.length - i - 1; j++) {
				if (arr7[j] > arr7[j + 1]) {
					temp = arr7[j];
					arr7[j] = arr7[j + 1];
					arr7[j + 1] = temp;
				}
				loopCount7++;
			}
		}
		System.out.println(Arrays.toString(arr7));
		System.out.println(loopCount7);

		// 8
//		int n = 5;
//		int[][] a = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				if (j == 0 || j == i) {
//					a[i][j] = 1;
//				} else {
//					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
//				}
//			}
//			System.out.println(Arrays.toString(a[i]));
//		}

		// TODO Auto-generated method stub
		int[][] yoko = new int[10][10];
		for (int i = 0; i < yoko.length; i++) {
			yoko[i] = new int[i + 1];
			for (int x = 0; x <= i; x++) {
				if (x == 0 || i == x) {
					yoko[i][x] = 1;
				} else {
					yoko[i][x] = yoko[i - 1][x] + yoko[i - 1][x - 1];
				}
				System.out.print(yoko[i][x]);
			}
			System.out.println();
		}

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
