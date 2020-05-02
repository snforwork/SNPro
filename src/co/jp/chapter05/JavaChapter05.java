package co.jp.chapter05;

public class JavaChapter05 {

	public JavaChapter05() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//設問1
		//		int sum = 0;
		//		for (int i = 1; i < 101; i++) {
		//			if (i % 2 == 0) {
		//				sum = sum + i;
		//			}
		//		}
		//		System.out.println(" 1から100までの偶数の和は:" + sum);

		//		int sum = 0;
		//		for(int i = 0;i < 100;i++) {
		//			if((i + 1)%2 == 0){
		//				sum +=(i+1);
		//			}
		//		}
		//		System.out.println(sum);
		//2
		//		int num = 1;
		//		for (int i = 1; i < 6; i++) {
		//			num = num * i;
		//		}
		//		System.out.println("5の階乗:" + num);

		//		int q2 = 5;
		//		int q2re = 1;
		////		for(int i = 0;i < 5;i++) {
		////			q2re*=q2-i;
		////		}
		//		while(q2 != 0) {
		//			q2re *= q2;
		//			q2--;
		//		}
		//		System.out.println(q2re);

		//3
		//		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 ,-1};
		//		int max = array[0];
		//		for (int i = 0; i < array.length; i++) {
		//			if (array[i] > max) {
		//				max = array[i];
		//			}
		//		}
		//		System.out.println("配列の最大値:" + max);
		//
		//		int mix = array[0];
		//		for (int j = 0; j < array.length; j++) {
		//			if (array[j] < mix) {
		//				mix = array[j];
		//			}
		//		}
		//		System.out.println("配列の最小値:" + mix);
		//		int sum1 = 0;
		//		for (int k = 0; k < array.length; k++) {
		//			sum1 = sum1 + array[k];
		//
		//		}
		//		System.out.println("配列の和:" + sum1);
		//
		//		float ave = ((float) sum1) / array.length;
		//		System.out.println("配列の平均値:" + ave);

		//4
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1, -1, -1 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					System.out.println("重複要素は:" + array[j]);
				}
			}
		}

		//5
		//		for (int i = 0; i < array.length; i++) {
		//			if (array[i] == 7) {
		//				System.out.println("7のindexは：" + i);
		//		        break;
		//			}
		//		}

		//6
		//		int[][] array2d = new int[][] {
		//				{ 1, 2, 3, 4 },
		//				{ 21, 22, 23, 24 } };
		//		int num1 = 1;
		//		for (int a1 = 0; a1 < 4; a1++) {
		//			for (int b = 0; b < 2; b++) {
		//
		//				num1 = num1 * array2d[b][a1];
		//			}
		//
		//		}
		//
		//		System.out.println("配列の積は：" + num1);

		//		int[][] arr6A = new int[][]{
		//			{1,2},
		//			{3,4}
		//		};
		//
		//		int[][] arr6B = new int[][]{
		//			{5,6},
		//			{7,8}
		//		};
		//		for(int i =0;i < arr6A.length;i++) {
		//			for( j =0;i < arr6A.length;j++) {
		//
		//			}
		//		}

		//7
		//		int[] array1 = { 96, 45, 31, 29, 84, 77 };
		//		for (int i = 0; i < array1.length - 1; i++) {
		//			for (int j = 0; j < array1.length - i - 1; j++) {
		//				if (array1[j] > array1[j + 1]) {
		//					int asc = array1[j];
		//					array1[j] = array1[j + 1];
		//					array1[j + 1] = asc;
		//				}
		//			}
		//
		//		}
		//		for (int k = 0; k < array1.length; k++) {
		//			System.out.print(array1[k] + ",");
		//
		//		}


//		int temp = 0;
//		int loopCount = 0;
//		int[] arr7 = new int[] { 5, 7, 1, 3, 2, 6, 9, 0, 8, 4, };
//		for (int i = 0; i < arr7.length; i++) {
//			for (int j = 0; j < arr7.length - 1; j++) {
//				if (i == j) {
//					continue;
//				}
//				if (arr7[j] > arr7[j + 1]) {
//					temp = arr7[j];
//					arr7[j] = arr7[j + 1];
//					arr7[j + 1] = temp;
//				}
//				loopCount++;
//			}
//		}
//		System.out.println(Arrays.toString(arr7));
//		System.out.println(loopCount);

		//8
//				int row = 6;//行数
//		        int[][] yanghui = new int[row][row];//6行6列数组
//
//		        for (int i = 0; i < row; i++){//行
//		            for(int j = 0;j<= i;j++){//列
//		                if (j==0 || j==i){
//		                    yanghui[i][j]=1;
//
//		                }else{
//		                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
//		                }
//		            }
//		        }
//		            for (int i = 0; i < row; i++){
//		                int num = row -i;
//		                for(int j = 0;j<= num;j++){
//		                    System.out.print(" ");
//		            }
//		                for(int k= 0;k<= i;k++){
//		                    System.out.print(yanghui[i][k]+" ");
//		            }
//		                System.out.println();
//
//		            }

//		          int n = 5;
//		          int[][] a = new int[n][2*n-1];
//		          for(int i = 0;i < n;i++) {
//		        	  for(int j = 0;j <2*n-1;j++) {
//
//		        	  }
//		        	  System.out.println(Arrays.toString(a[i]));


	}
}
