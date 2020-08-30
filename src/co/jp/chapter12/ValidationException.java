/**
 *
 */
package co.jp.chapter12;

/**
 * @author ASUS
 *
 */


        //質問2
        //Validation Exceptionを作成して、ユーザー入力した値を検証します。該当は実際商用アプリで利用しています。
        //STEP1: ValidationException クラスを定義する
public class ValidationException extends Exception {

	    public ValidationException(String string, String string2) throws ValidationException {
		// TODO 自動生成されたコンストラクター・スタブ

		String name = null;//カラム名称
	    String message;//エラーメッセージ


	    //STEP2: チェック処理（サンプル）
	    if(name.matches("^[0-9]+$")) {
	    	throw new ValidationException("名称", "半角数字を入力してください。");
	        }

	    }

}

