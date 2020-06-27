package co.jp.chapter12;

public class Chapter12 {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		int a[] = new int[2];
		try {
        System.out.println("Access element three :" + a[3]);
     }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception thrown  :" + e);
     }
     System.out.println("ArrayIndexOutOfBoundsException例外を発生します");

	}

}
