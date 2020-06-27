package co.jp.chapter12;

public class Kicker {
public class ValidationException extends Exception {
	private String name; // カラム名称
	private String message; // エラーメッセージ
	public ValidationException(String msg) {
		this.message = msg;
		}
//	if(Kicker.equals("^[0-9]+$")) {
//		throw new ValidationException();
	public ValidationException() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	}
public static void dosomething(String name) throws Exception {
	if (name.matches("^[0-9]+$")) {
		// 例外をthrowする
		
		throw new Exception("NullpointerException");
//		throw new MyException("カスタマイズ例外");
		
		}
	 
	}
}
