package co.jp.chapter07;

public class Matrix {

	public static void print(int[][] c) {
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {

			}
			
		}
	}
	

	public static int[][] add(int[][] a, int[][] b) {
		// TODO 自動生成されたメソッド・スタブ
		int[][]c=new int[a.length][b.length ];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			}
	}
		return c;
		
	}
	}
	
//	public static void main(String[] args) {
//
//		int [][]b= {		
//				{3,4}, {5,6},	
//	};
//	int [][]a= { 	
//			{3,4}, {5,6},	
//	};
//	int[][]c=add(a,b);
//	System.out.println(c);
//	}
//
//   
//	}

