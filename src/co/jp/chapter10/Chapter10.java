package co.jp.chapter10;

import java.io.File;

public class Chapter10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。

//		String str1 = new String("name, age, type");
		String str2 = new String("みみ,10,1");
		String str3 = new String("レオ,1,0");
		String str4 = new String("マル,2,0");

//		String[] arr= str1.split(",");

		String[] arr1= str2.split(",");

		if(arr1[2].equals("1")) {
			System.out.println("みみは" +" 犬");
		}else {
			System.out.println("みみは" +" 猫");
		}

		String[] arr2= str3.split(",");
		if(arr2[2].equals("1")) {
			System.out.println("レオは" +" 犬");
		}else {
			System.out.println("レオは" +" 猫");
		}

		String[] arr3= str4.split(",");
		if(arr3[2].equals("1")) {
			System.out.println("マルは" +" 犬");
		}else {
			System.out.println("マルは" +" 猫");
		}
//	質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は
//		「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。

		File file1 = new File("c://windows//aa.xlsx");
		File file2 = new File("c://windows//a a.test");
		File file3 = new File("c://windows//aa.bb.docx");
		File file4 = new File("c://windows//aaaaa");

		String fileName1 = file1.getName();
		String fileName2 = file2.getName();
		String fileName3 = file3.getName();
		String fileName4 = file4.getName();

		String FileType1 =fileName1.substring(fileName1.lastIndexOf(".") + 1);
		String FileType2 =fileName2.substring(fileName2.lastIndexOf(".") + 1);
		String FileType3 =fileName3.substring(fileName3.lastIndexOf(".") + 1);
		String FileType4 =fileName1.substring(fileName4.lastIndexOf(".") + 1);
		System.out.println(FileType1);
		System.out.println(FileType2);
		System.out.println(FileType3);
		System.out.println(FileType4);

//質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂字 = 3バイ
//		//Javaには、全ての文字コードはUTF-8であり。日本語（全角文字）の場合1文字 ＝3バイト。以下文字列のバイト数と桁数を求めてください。
//	    //バイト数は?
//        System.out.println("abcde12345あいうえお１２３４５".getBytes("UTF-8").length);
//        //桁数は?
//        System.out.println("abcde12345あいうえお１２３４５".length());
//        //format
//        System.out.println(String.format("%05.2f", 123456.99999));
//        //16
//        int a = 0x16;
//        System.out.println(a);
//        }

//質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似ているメソッ
//を実装してください。
		String value1="";
		String value2 = " ";
		String value3 = null;
		if(value1.length()== 0) {
			System.out.println("value1は" +" Empty；");
		}else if(value1.equals("null")){
			System.out.println("value1は" +" NULL；");
		}else {
			System.out.println("value1は" +" 値がある；");
		}
		if(value2.length()== 0) {
			System.out.println("value2は" +" Empty；");
		}else if(value2.equals("null")){
			System.out.println("value2は" +" NULL；");
		}else {
			System.out.println("value2は" +" 値がある；");
		}
	// 以下は Nullpointなので、コメント化になっています。
		/**if(value3.length()== 0) {
			System.out.println("value3は" +" Empty；");
		}else if(value3.equals("null")){
			System.out.println("value3は" +" NULL；");
		}else {
			System.out.println("value3は" +" 値がある；");
		}**/
//	質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
		double a = 2412.232;
		short b =(short) 1111111111;
		//(1)
		String stra = String.format("%1.20f", a);
			System.out.println(stra);
		//(2)
		String strb = String.format("%05d", b);
			System.out.println(strb);
		//(3)
		String strc = String.format("%.2f", a);
		    System.out.println(strc);
//質問６︓整数16の16進数をSystem.out.println()してください。
		    int i=16;
		    System.out.println(Integer.toHexString(i));
	}

	private static File File(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}