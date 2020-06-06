package co.jp.chapter02;

import java.util.Arrays;

public class JavaChapter02 {

	public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ


		//2020.04.18(04+05)
        //1.転釈
        String strtest="12\\\\3";
        System.out.println("String型:"+strtest);


        //2.文字列 String(アドレスと内容を比較する)
        String strA="123";
        String strB=new String("123");
        System.out.println(strA==strB);//Stringの場合、==比較　アドレス＆バリュー
        System.out.println(strA.equals(strB));//バリュー(内容)のみ比較


        //3.loop-for
        //before
        System.out.println("loop start");

        //loop
        //例:for(初期値;終了条件;自増減変量)
        //i++ == i=i+1　
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
        //after
        System.out.println("loop end");

        int i=0;
        //loop　1回目(i=0)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　2回目(i=1)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　3回目(i=2)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　4回目(i=3)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　5回目(i=4)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　6回目(i=5)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　7回目(i=6)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　8回目(i=7)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　9回目(i=8)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　10回目(i=9)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }
        //loop　11回目(i=10)
        if(i<10) {
            System.out.println(i);
            i=i+1;//i++ or ++i
        }else {
            //ループ終了;
        }


        //練習1
        //ループ15;53-39
        System.out.println("loop start");
         for(int i1=53;i1>=39;i1--) {
              System.out.println(i1);
          }
        System.out.println("loop end");

        //練習2
        //ロジック不変;53-39
        //方法1
        System.out.println("loop start");
          for(int i2=0;i2<15;i2++) {
              int j2=53;
              j2=j2-i2;
              System.out.println(j2);
          }
        System.out.println("loop end");
        //方法２
        System.out.println("loop start");
          for(int i2=0;i2<15;i2++) {
          System.out.println(53-i2);
          }
        System.out.println("loop end");


        //4.loop-for+if
          int ateru=5;
          for(int i3=0;i3<10;i3++) {
              System.out.println("index="+i3);
              if(i3==ateru) {
                  System.out.println("数値["+i3+"]は当てる！！");
                  break;
              }else {
                  System.out.println("数値["+i3+"]は当てない！！");
                  continue;
              }
          }


        //練習3
        //日本のコインを1円、5円、10円、100円、500円があります。3348円のコイン数をまとめください。
        int money = 3348;
        int m500 = 0;
        int m100 = 0;
        int m50 = 0;
        int m10 = 0;
        int m5 = 0;
        int m1 = 0;
        for(;;) {
            if(money>=500&&money%500!=0) {
                m500=money/500;
                money=money%500;
            }else if(money>=100&&money%100!=0) {
                m100=money/100;
                money=money%100;
            }else if(money>=50&&money%50!=0) {
                m50=money/50;
                money=money%50;
            }else if(money>=10&&money%10!=0) {
                m10=money/10;
                money=money%10;
            }else if(money>=5&&money%5!=0) {
                m5=money/5;
                money=money%5;
            }else if(money>=1) {
                m1=money/1;
                money=money%1;
            }
            if(money==0) {
                break;
            }
        }
        System.out.println("500円コインが["+m500+"]枚です");
        System.out.println("100円コインが["+m100+"]枚です");
        System.out.println("50円コインが["+m50+"]枚です");
        System.out.println("10円コインが["+m10+"]枚です");
        System.out.println("5円コインが["+m5+"]枚です");
        System.out.println("1円コインが["+m1+"]枚です");


        //5.配列
        int [] arr1=new int[4];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        //System.out.println(arr1[4]);//サイズを超える要素


        //04配列――質問集
        //質問1
        int [] arr2=new int[4];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);

        //質問2
        int[] arr3= new int[] {5, 6};
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);

        //質問3
        int[][] arr4 = new int[2][3];
        arr4[0] = new int[0];
        arr4[0] = new int[1];
        arr4[0] = new int[2];
        arr4[1] = new int[0];
        arr4[1] = new int[1];
        arr4[1] = new int[2];

        //質問4
        int[][] arr5= new int[4][2];
        for (int[] out : arr5) {
        	for (int inner : out) {
        		System.out.println(inner);
        	}
        }

        //質問5
        //int[] arr6= new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を System.out.println()。
        int[] arr6= new int[] {1, 3, 5, 7, 100, 0, 1};
        int max = 0;
        for(int i6 = 0; i6 < arr6.length; i6++){
            if(arr6[i6]>max) {
               max = arr6[i6];
               System.out.println("最大値="+max);
            }
        }

        int min = 0;
        for(int i5 = 0; i5 < arr6.length; i5++){
        	if(arr6[i5]<min) {
        		min = arr6[i5];
        		System.out.println("最小値="+min);
        	}
        }

        //質問6
        //質問1の配列のSUMを求める。
        int [] arr7=new int[4];
        System.out.println(arr7[0]);
        System.out.println(arr7[1]);
        System.out.println(arr7[2]);
        System.out.println(arr7[3]);
        System.out.println("loop start");
        int sum = 0;
        for(int i7 = 0; i7 < 4; i7++){
            sum += arr7[i7];
            System.out.println("配列の和="+sum);
        }
        System.out.println("loop end");

        //質問7
        //行列（２次元配列）の和と積を計算してください。
        int[][] arr21 = new int[][] {
            {1,2},
            {3,4,5}
        };
        int[][] arr22 = new int[][] {
            {5,6},
            {7,8,9}
        };
        for(int i1 = 0; i1 < arr21.length; i1++) {
        	for(int j = 0; j < arr22.length; j++) {
        	System.out.println("配列の和:" + arr21[i1][j] + arr22[i1][j] + ",");
        	System.out.println("配列の積:" + arr21[i1][j] * arr22[i1][j] + ",");
            }
        System.out.println("");
        }


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