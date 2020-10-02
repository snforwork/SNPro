package co.jp.chapter13;

public class Person {
	private String name;
	  private int age;
	  private String gender;



	  public Person(String name, int age, String gender) {
	    this.name = name;
	    this.age = age;
	    this.gender = gender;
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
	    * @return gender
	    */
	    public String getGender() {
	      return gender;
	    }



	    /**
	    * @param gender セットする gender
	    */
	    public void setGender(String gender) {
	      this.gender = gender;
	    }

}
