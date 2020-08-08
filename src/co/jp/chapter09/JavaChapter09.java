package co.jp.chapter09;

import co.jp.chapter09.Cat;
import co.jp.chapter09.Dog;

public class JavaChapter09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


        //2020.05.23(09)
		Dog dog = new Dog();
		dog.eat();
		dog.say();

		Cat cat = new Cat();
		cat.eat();
		cat.say();

		//宿題
		//09OOP-その3――質問集
		//質問2︓以下ソースに匿名クラスの利用する行は?
		class Kicker{
			public void main(String...args) {
				new Thread() {
					@Override
					public void run() {
						System.out.println("thread runnning...");
					}
				}.start();
			}
		}


		//09OOP-練習問題――質問集
		//質問１︓クラス（Class）とは︖クラス定義⽤のキーワードは「 class 」である。
		//質問２︓クラスメンバ（Class member）の何種類ありますか。
		//1. 属性・フィールド (Field)
		//2. 関数(Function)・メソッド(Method)・操作(Operator)
		//質問３︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
		//質問４︓コンストラクタの特徴
		//1. 戻り値不要
		//2. 関数名＝クラス名称
		//質問５︓コンストラクタの作⽤︓クラス属性の初期化する。
		//質問６︓１つクラスに複数のコンストラクタ持つ可能。
		//質問７︓キーワード this の使⽤⽅法︓ this.name
		//質問８︓クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦は new です。
		//質問９︓演算⼦ new の直後呼び出しているメソッドは「コンストラクタ」︔
		//質問１０︓アクセス制御の３種類あります。
		//1. + public
		//2. # protected
		//3. - private
		//質問１１︓静的のメンバの定義するキーワード（修飾⼦）は static 。
		//質問１２︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.静的のメン バ」
		//質問１５︓クラス継承する⽤キーワードは「 extends 」
		//質問１６︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは 「サブクラス」と呼びます。
		//質問１７︓サブクラス＆アクセス制御（ public, protected ）。
		//質問１８︓サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、「オーバー ライド」となります。
		//質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。
		//1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
		//2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);



    }

}