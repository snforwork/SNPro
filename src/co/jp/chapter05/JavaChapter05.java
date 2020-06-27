package co.jp.chapter05;

import java.util.Arrays;

public class JavaChapter05 {

	public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ


		//2020.04.18(05)
        //05初心6問――質問集
        //質問1
        //1から100までの偶数の和を求める(for + if)。
        //方法1
        int k1 = 100;
        int sum3 = 0;
        for(int ik1 = 0; ik1 < k1; ik1++){
            if((ik1+1) % 2==0) {
            	sum3 += (ik1+1) ;
            }
        }
        System.out.println("偶数の和:"+ sum3 );
        //方法2
        do {
        	if(k1 % 2==0) {
        		sum3 += k1;
        	}
        	k1--;
        	System.out.println(sum3);
        }while(k1 != 0);

		//質問2
		//5の階乗を求める(for)。
        //方法1
        int q2 = 5;
        int q2re = 1;
		for(int i1 = 0; i1 < q2; i1++){
			int i = 0;
			q2re*= q2-i;
		}
		System.out.println("5の階乗:"+ q2re);
        //方法2
        while(q2 != 0);{
        	q2re*=q2;
            q2--;
        }
        System.out.println("5の階乗:" + q2re);

		//質問3
		//配列 {1, 2, 6, 7, 9, 6, 2, 1,0,-1,123,333,-999} の最大値、最小値、和、平均値を求める。
		int[] arr9 = new int[] {1, 2, 6, 7, 9, 6, 2, 1,0,-1,123,333,-999};
		int max1 = arr9[0];
		int min1 = arr9[0];
        for(int i1 = 0;  i1 < arr9.length; i1++) {
            if(arr9[i1]>max1) {
               max1 = arr9[i1];
            }
            if(arr9[i1]<min1) {
               min1 = arr9[i1];
            }
        }
        System.out.println("MAX:" + max1);
        System.out.println("MIN:" + min1);

        int sum5 = arr9[0];
        for(int i1 = 0; i1 < arr9.length; i1++) {
            sum5 += arr9[i1];
        }
        System.out.println("配列の和:" + sum5);

        int sum6 = arr9[0];
		    sum6 = sum5 / arr9.length;
		System.out.println("配列の平均値:" + sum6);

		//質問4
        //質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		int[] arr10 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int loopCount = 0;
		for(int i1 = 0; i1 < arr10.length; i1++){
		   for(int j = 0; j < arr10.length; j++){
		      if(i1>=j) {
		    	 continue;
		      }
		      if(arr10[i1]==arr10[j]) {
		    	  System.out.println("重複ある要素:" + arr10[i1] + "i1&j:" + i1 + "" + j);
		      }
		      loopCount++;
		   }
		}
		System.out.println(loopCount);

	    //質問5
		//質問３の配列に値「7」のインデックスを求む。
		int[] arr11 = new int[] {1, 2, 6, 7, 9, 6, 2, 1} ;
		for(int q3 = 0; q3 < arr11.length; q3++) {
		   if(arr11[q3]==7) {
			   System.out.println("「7」のインデックス:" + q3);
			   break;
		   }
	    }

		//質問6
		//任意行列（２次元配列）の積を求める。
        int[][] arr12 = new int[][] {
	                    {1,2},
	                    {3,4}
        };
        int[][] arr13 = new int[][] {
        	            {5,6},
                        {7,8}
        };
        for(int i1 = 0; i1 < arr12.length; i1++) {
        	for(int j = 0; j < arr12.length; j++) {
        		System.out.println(arr12[i1][j] * arr13[i1][j] + ",");
        	}
        	System.out.println("");
        }

        //質問7
        //配列を昇順でソートする（java.util等メソッド利用禁止）。
        int[] arr14 = new int[] {5,7,1,3,2,6,9,0,8,4};
        int loopCount14 = 0;
        int temp = 0;
        for(int i1 = 0; i1 < arr14.length - 1; i1++) {
        	for(int j = 0; j < arr14.length - 1; j++) {
        		if(arr14[j] > arr14[j + 1]) {
        			temp = arr14[j];
        			arr14[j] = arr14[j + 1];
        			arr14[j + 1] = temp;
        		}
        		loopCount14++;
        	}
        }
        System.out.println(Arrays.toString(arr14));
        System.out.println(loopCount14);

        //質問8
        //LV10のパスカルの三角形を出力してください。
        int n = 5;
        int[][] a = new int[n][n];
        for(int i1 = 0; i1 < n; i1++) {
        	for(int j = 0; j < i1; j++) {
        		if(j == 0 || j == i1) {
        			a[i1][j] = 1;
        		}else {
        			a[i1][j] = a[i1 - 1][j - 1] + a[i1 - 1][j];
        		}
        	}
        	System.out.println(Arrays.toString(a[i1]));
        }

        //TODO Auto-generated method stub
        int[][] yoko = new int[10][10];
        for(int i1 = 0; i1 < yoko.length; i1++) {
        	yoko[i1] = new int[i1 + 1];
        	for(int x = 0; x <= i1; x++) {
        		if(x == 0 || i1 == x) {
        			yoko[i1][x] = 1;
        		}else {
        			yoko[i1][x] = yoko[i1 - 1][x] + yoko[i1 - 1][x - 1];
        		}
        		System.out.println(yoko[i1][x]);
        	}
        	System.out.println();
        }

        int n1 = 10;
        int[][] arr = new int[n1][];
        for(int i1 = 0; i1 <arr.length; i1++) {
        	arr[i1] = new int[i1 + 1];
        	//左边打印空格，打印等腰三角形
        	for(int k = 0; k <= n - 1; k++) {
        		System.out.println(" ");
        	}
        	for(int j = 0; j < arr[i1].length; j++) {
        		if(i1 == 0 || j == 0 || i1 == j) {
        			arr[i1][j] = 1;
        		}else {
        			arr[i1][j] = arr[i1 - 1][j] + arr[i1 -1][j -1];
        		}
        		System.out.println(arr[i1][j] + " ");
        	}
        	System.out.println();
        }



    }

}
