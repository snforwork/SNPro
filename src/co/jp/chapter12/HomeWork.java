package co.jp.chapter12;

public class HomeWork {

	private static Object object;

	public static void main(String[] args) throws ValidationException {
		// TODO 自動生成されたメソッド・スタブ
	//質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣します。
	//該当例外を処理するサンプルコードを書いてください。
		
		//数组越界
		int []arr = {1,2,3};
		
		for(int i = 0;i<arr.length+1;i++) {
			System.out.println(arr[i]);
		}

		
	}

}

