package co.jp.chapter10;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class getFlieType {



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
//		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
//		 System.out.println(getFileType("c://windows//a a.test")); // test
//		 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
//		 System.out.println(getFileType("c://windows//aaaaa")); // Empty



		// バイト数は︖
        System.out.println("abcde12345あいうえお１２３４５".getBytes("UTF-8").length);

        // 桁数は︖

        System.out.println("abcde12345あいうえお１２３４５".length());
        //format
        System.out.println(String.format("%05.2f", 123456.99999));

        //16
        int a = 0x16;
        System.out.println(a);
	}




	    //value は null or Empty 判断してください。
        public static boolean isNull(String value) {
        	if(value== null || "".equals(value) || "null".equals(value)) {
        		return true;
        	} else {
        		return false;
        	}





	}



}