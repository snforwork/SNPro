package co.jp.chapter09;

public class HomeWork {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/**質問１︓以下ソースにラムダ式の使う場所を解釈してください。**/
			/**import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	public class GUISample {
	public static void main(String[] args) {
	JFrame window = new JFrame("DCNet Java 教育");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(800, 600);
	JButton btn = new JButton("hello world");
	window.getContentPane().add(btn);
	
//以下の部分はラムダ式の使う場所
	btn.addActionListener((ActionEvent e) -> {
	System.out.println("ボタンクリックしました。");
	});
	window.setVisible(true);
	}
	}**/
		
/**質問２︓以下ソースに匿名クラスの利⽤する⾏は︖**/
	/***public class Kicker {
		public static void main(String... args) {
	// 匿名クラス	
		new Thread() {
		@Override
		public void run() {
		System.out.println("thread running...");
					}
				}.start();
			}
		}*/
		
/**OOP- 練習問題**/
		
		/**質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。変数
	catのsayHello()メソッドを呼び出してください。**/
		Cat cat = new Cat("HelloKitty",10,1);
		System.out.println("cat's name is  "+cat.getName());
		
		/**質問１４︓以下１⾏を解釈してください。*/
		System.out.println(new Animal("cat", 0, 0).getName());
		//解釈:new AnimalのNAMEを取得します。
		
		/**質問１５︓クラス継承する⽤キーワードは「extends 」**/
		//Cat.javaを参照
		
		/**質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。**/
		//cat1.javaとdog1.javaを参照
		
		/**質問２０︓以下コードをIS-A関係で説明してください。*/
		
		/**Animal v0 = new Animal(); // v0 は Animal 型
		Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
		Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
		Cat v3 = new Cat(""); // 実装プロジェクト
		Dog v4 = new Dog(""); // 実装プロジェクト
		Cat v5 = new Animal(""); //継承されるクラスのプロジェクトを実装出来ません**/ 
	}

}
