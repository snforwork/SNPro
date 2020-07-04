package co.jp.chapter09;

public class JavaChapter09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
         Dog dog = new Dog();
         dog.eat();
         dog.say();

         Cat cat = new Cat();
         cat.eat();
         cat.say();


//       質問１︓クラス（Class）とは︖クラス定義⽤のキーワードは「 class 」である。
//       質問２︓クラスメンバ（Class member）の何種類ありますか。
//               1. 属性・フィールド (Field)
//               2. 関数(Function)・メソッド(Method)・操作(Operator)
//       質問３︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
//       質問４︓コンストラクタの特徴
//               1. 戻り値不要
//               2. 関数名＝クラス名称
//       質問５︓コンストラクタの作⽤︓クラス属性の初期化する。
//       質問６︓１つクラスに複数のコンストラクタ持つ可能。
//       質問７︓キーワード this の使⽤⽅法︓ this.name
//       質問８︓クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦は new です。
//       質問９︓演算⼦ new の直後呼び出しているメソッドは「コンストラクタ」︔
//       質問１０︓アクセス制御の３種類あります。
//               1. + public
//               2. # protected
//               3. - private
//       質問１１︓静的のメンバの定義するキーワード（修飾⼦）は static 。
//       質問１２︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.静的のメン バ」
//       質問１５︓クラス継承する⽤キーワードは「 extends 」
//       質問１６︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは 「サブクラス」と呼びます。
//       質問１７︓サブクラス＆アクセス制御（ public, protected ）。
//       質問１８︓サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、「オーバー ライド」となります。
//
//       質問２０︓以下コードをIS-A関係で説明してください。
//       Animal v0 = new Animal(); // v0 は Animal 型
//       Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
//       Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
//       Cat v3 = new Cat(""); // OK
//       Dog v4 = new Dog(""); // OK
//       Cat v5 = new Animal(""); // NG
//



	}

}