package co.jp.chapter10;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class JavaChapter10 {

public static class getFlieType {


	    //10文字列操作――質問集
	    //質問1
	    //以下3行文字列を「改行コード」と「,」を分割して2つペットオブジェクトを作成してください。
	      //1. Petクラスを事前作成してください。
	      //2. ペットのタイプは列挙型である： type = 0：猫、type = 1：犬
	      //ペット病院用ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意



	    //質問2
	    //Windowsは各ファイルの拡張子を持っています。例「新規ドキュメント.docx」の拡張子は「docx」である。メソッドを作成して、ファイルパス(String型)から拡張子を取得してください。
        public static String getFileType(String path) {
        	return path;
        	// return ??
	    }

        public static void main(String[] args)throws UnsupportedEncodingException  {
	    // TODO 自動生成されたメソッド・スタブ
	    File file = new File("c://windows//aa.xlsx");
	    File file1 = new File("c://windows//a a.test");
	    File file2 = new File("c://windows//aa.bb.docx");
		File file3 = new File("c://windows//aaaaa");

	    String fileName = file.getName();
		String file1Name = file1.getName();
		String file2Name = file2.getName();
		String file3Name = file3.getName();
		String fileTyle = fileName.substring(fileName.lastIndexOf("."),fileName.length());
		String file1Tyle = file1Name.substring(file1Name.lastIndexOf("."),file1Name.length());
		String file2Tyle = file2Name.substring(file2Name.lastIndexOf("."),file2Name.length());
		//String file3Tyle = file3Name.substring(file3Name.lastIndexOf("."),file3Name.length());

		System.out.println(fileTyle);
		System.out.println(file1Tyle);
		System.out.println(file2Tyle);
		//System.out.println(file3Tyle);
		//System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
     	//System.out.println(getFileType("c://windows//a a.test")); // test
		//System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		//System.out.println(getFileType("c://windows//aaaaa")); // Empty

        //質問3
        //Javaには、全ての文字コードはUTF-8であり。日本語（全角文字）の場合1文字 ＝3バイト。以下文字列のバイト数と桁数を求めてください。
	    //バイト数は?
        System.out.println("abcde12345あいうえお１２３４５".getBytes("UTF-8").length);
        //桁数は?
        System.out.println("abcde12345あいうえお１２３４５".length());
        //format
        System.out.println(String.format("%05.2f", 123456.99999));
        //16
        int a = 0x16;
        System.out.println(a);
        }

        //質問4
        //各現場は文字列に null又はempty判断要共通メソッドを実装しています。似ているメソッドを実装してください。
        //valueはnull or Empty判断してください。
        public static boolean isNull(String value) {
        	if(value== null || "".equals(value) || "null".equals(value)) {
        		return true;
        	} else {
        		return false;
        	}
        }



}

}