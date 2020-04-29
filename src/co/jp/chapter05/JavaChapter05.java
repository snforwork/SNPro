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

		//2
//		int num = 1;
//		for (int i = 1; i < 6; i++) {
//			num = num * i;
//		}
//		System.out.println("5の階乗:" + num);

		//3
//		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
//		int max = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//		}
//		System.out.println("配列の最大値:" + max);
//
//		int mix = max;
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
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if ((array[i] == array[j]) && (i != j)) {
//					System.out.println("重複要素は:" + array[j]);
//				}
//			}
//		}

		//5
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == 7) {
//				System.out.println("7のindexは：" + i);
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

		//7
//		int[] array1 = { 96, 45, 31, 29, 84, 77 };
//		for (int i = 0; i < array1.length - 1; i++) {
//			for (int j = 0; j < array1.length - i - 1; j++) {
//				if (array1[j] > array1[j + 1]) { //←ここの不等号で昇順か降順か決まる
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

		//8
		int row = 6;//行数
        int[][] yanghui = new int[row][row];//6行6列数组

        for (int i = 0; i < row; i++){//行
            for(int j = 0;j<= i;j++){//列
                if (j==0 || j==i){
                    yanghui[i][j]=1;

                }else{
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }
        }
            for (int i = 0; i < row; i++){
                int num = row -i;
                for(int j = 0;j<= num;j++){
                    System.out.print(" ");
            }
                for(int k= 0;k<= i;k++){
                    System.out.print(yanghui[i][k]+" ");
            }
                System.out.println();
        }

        }
    }
