package co.jp.chapter09;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		//質問1: 以下ソースにラムダ式の使う場所を解釈してください。
		class GUISample{
			public void main(String[] args) {
				JFrame window = new JFrame("DCNet Java　教育");
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setSize(800,600);
				JButton btn = new JButton("hello world");
				window.getContentPane().add(btn);
				//ラムダ式
			    btn.addActionListener((ActionEvent e) -> {
			    	System.out.println("ボタンクリックしました。");
			    });

			    window.setVisible(true);
			}
		}

		//質問2: 以下ソースに匿名クラスの利用する行は?
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


		//09OOP-練習問題————質問集
	    //質問1: クラス（Class）とは？クラス定義用のキーワードは「 class 」である。

	    //質問2: クラスメンバ（Class member）の何種類ありますか。
		  //1. 属性・フィールド (Field)
		  //2. 関数(Function)・メソッド(Method)・操作(Operator)

		//質問3： クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。

		//質問4： コンストラクタの特徴
		  //1. 戻り値不要
		  //2. 関数名＝クラス名称

		//質問5： コンストラクタの作用: クラス属性の初期化する。

	    //質問6： 1つクラスに複数のコンストラクタ持つ可能。

		//質問7： キーワード this の使用方法: this.name
	      class People{
	    	  private String name;
	    	  public void setName(String name) {
	    		  this.name = name;
	    	  }
	      }

		//質問8： クラスを利用料する為、インスタンス化する必要です。インスタンスの演算子は new です。

		//質問9： 演算子は new の直後呼び出しているメソッドは「コンストラクタ」;

		//質問10： アクセス制御の3種類あります。
		  //1. + public
		  //2. # protected
		  //3. - private

		//質問11： 静的のメンバの定義するキーワード（修飾子）は static 。

		//質問12： 静的のメンバアクセス時、インスタンス化不要。アクセス方法は「クラス名.静的のメンバ」。
	      //1.System.out.println("1234");// 静的のField
	      //2.String value = String.format("%05d".0);//静的のメソッド

	    //質問13： クラス「Animal」を定義して、インスタンス化しオブジェクトcatを作成します。変数catのsayHello()メソッドを呼び出してください。
	      //Animal objname = new Animal();
			//objname.setName("Cat");
			//objname.setAge(5);
			//objname.setSex(1);
			//System.out.println(objname.getName());
			//System.out.println(objname.getAge());
			//System.out.println(objname.getSex());
			//if(objname.setSex() == 1) {
				//System.out.println("男性");
			//}else if(objname.setSex() == 0) {
				//System.out.println("女性");
			//}else {
				//System.out.println(objname.setSex());
			//}
			//class Cat{
				//public void say() {
				//TODO 自動生成されたメソッド・スタブ
					//System.out.println("hello");
				//}
			//}

		//質問14： 以下1行を解釈してください。
		  //1.System.out.println(new Animal("cat").getName());
		  //変量「new Animal("cat")」は自分の名称を返す。

		//質問15:  クラス継承する用キーワードは「 extends 」。

		//質問16： 継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは「サブクラス」と呼びます。

		//質問17： サブクラス＆アクセス制御（ public, protected ）。

		//質問18： サブクラスと親クラス同じメソッド名かつメソッドの引数は一致する場合、「オーバーライド」となります。

		//質問19： 以下Animalクラスを継承して以下2クラスを作成してください。
		  //1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println("ニャー");
		  //2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println("ワン");

		//※親クラスに明示的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコンストラクタをオーバーライドします。

		//質問20:  以下コードをIS-A関係で説明してください。
		  //1. Animal v0 = new Animal();//OK: new Animal は Animal。
		  //2. Animal v1 = new Cat("a cat");//OK: new Cat は Animal。
          //3. Animal v2 = new Dog("a dog");//OK: new Dog は Animal。
          //5. Cat v3 = new Cat("");//OK: new Cat は Cat。
		  //6. Dog v4 = new Dog("");//OK: new Dog は Dog。
		  //8. Cat v5 = new Animal("");//NG: new Animal は Cat。






    }

}