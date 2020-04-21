package co.jp.chapter05;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     //設問1 1から100までの偶数の和を求める（for+if）
		int sum = 0;
		   for(int i = 1; i < 101; i++) {
			   if(i % 2 == 0) {
			sum = sum + i;
			   }
		   }
		System.out.println(" 1から100までの偶数の和は:"+sum);
		 System.out.println("*******************");
		//2 5の階乗を求める
		int num = 1;
		for(int i = 1 ; i < 6; i++) {
    	  num = num * i;
      }
		System.out.println("5の階乗:"+num);
		 System.out.println("*******************");


        //3 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値 和、平均値を求める。
	       int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
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
              int sum1 = 0;
             for(int k = 0; k<array.length; k++) {
	           sum1 = sum1 + array[k];

   }
                 System.out.println("配列の和="+sum1);

               float ave = ((float) sum1)/array.length;
             System.out.println("配列の平均値="+ave);


             System.out.println("*******************");

              //4 質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。

               for(int i = 0; i<array.length-1;i++) {
            	   for(int j=i+1; j < array.length; j++) {
            	if((array[i] == array[j])&&(i!=j)) {
            		System.out.println("重複要素は:"+array[j]);
            	}
            	   }




               }
               System.out.println("*******************");

             //5 質問３の配列に値「7」のインデックスを求む

                for(int i = 0;i<array.length;i++) {
                	if(array[i]==7) {
                		System.out.println("7のindexは："+i);
                	}
                }
                System.out.println("*******************");

               //6任意行列（２次元配列）の積を求める
                int[][] array2d = new int[][]{
   				 {1, 2, 3, 4},
   				 {21, 22, 23, 24} };
   				 int num1 = 1;
   			for(int a1 = 0;a1<4;a1++) {
                for(int b = 0; b<2;b++) {


   					num1 = num1*array2d[b][a1];
                }

   			}

   			System.out.println("配列の積は："+num1);

   		  System.out.println("*******************");

           //7配列の昇順でソートする
   		       int[] array1 = {96,45,31,29,84,77};
		   for(int i=0; i < array1.length-1; i++) {
		    for(int j=0; j < array1.length-i-1; j++) {
		        if(array1[j] > array1[j+1]) {    //←ここの不等号で昇順か降順か決まる
		            int asc = array1[j];
		            array1[j] = array1[j+1];
		            array1[j+1] = asc;
		             }
		          }

		}
              for (int k = 0; k < array1.length;k++)	{
    	      System.out.print(array1[k]+",");

    }
              System.out.println();

             //8 lv10のパスカルの三角型を出力してください
              int max1 = 10;
		        //控制行数
		        for(int i = 1; i<=10 ; i++) {
		            //控制空格
		            for (int j = 1; j <= max1 - i; j++)
		                System.out.print(" ");
		                //控制星数
		                for (int k = 1; k <= i * 2 - 1; k++)
		                    System.out.print("*");
		                    System.out.println();
		        }









	}
             }

