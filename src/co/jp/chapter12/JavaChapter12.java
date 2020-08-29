package co.jp.chapter12;

public class JavaChapter12 {


	    //12例外――質問集
	    //質問1
	    //配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発生します。該当例外を処理するサンプルコードを書いてください。
	    public static void main(String[] args) {
	    	try {
	    		int[]arr = new int[] {1,2,3};
 		        System.out.println(arr[3]);
 	        } catch (ArrayIndexOutOfBoundsException e) {
			    System.out.println("エラーを発生します。");
			}
	    }


        //質問2
	    //Validation Exceptionを作成して、ユーザー入力した値を検証します。該当は実際商用アプリで利用しています。
	    //STEP1: ValidationException クラスを定義する
        //STEP2: チェック処理（サンプル）





}