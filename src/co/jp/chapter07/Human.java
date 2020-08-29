package co.jp.chapter07;

public class Human{

	public static String count;
	Human(String string, int i, int j){

	}

	public Human(String string, int i) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Human() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex セットする sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	//名前
	String name;
	//年齢
    int age;
	//性別　男性:1　女性:0
	int sex;
	public char[] Age;
	public char[] Name;
	public char[] Sex;
	public char[] getName;
	public char[] getAge;
	public char[] getSex;

	public int setSex() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}



}