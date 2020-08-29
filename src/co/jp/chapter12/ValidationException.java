/**
 *
 */
package co.jp.chapter12;

/**
 * @author ASUS
 *
 */


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

