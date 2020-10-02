package co.jp.chapter12;

public class ValidationException extends Exception {
	private static String name; // カラム名称
	private String message; // エラーメッセージ

	public ValidationException(String name, String message) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void dosomething(String input) throws Exception {
		if(name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角英数字を入力してください。");
			}
	}

}		


