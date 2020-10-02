package co.jp.chapter12;

public class ValidationException extends Exception {
	public static class MyException extends Exception {
		public String message;
		public MyException(String msg) {
		this.message = msg;
		}
	}
//	public static void dosomething(String input) throws MyException {
//		if (input.equals("123")) {
			// 例外をthrowする
//		throw new MyException("半角英数字を入力してください");
//			}
//	}

}
