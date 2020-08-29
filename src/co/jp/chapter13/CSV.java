package co.jp.chapter13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {
	      //カンマ
	      private static final String COMMA = ",";

	      //改行
	      private static final String NEW_LINE= "\r\n";

	      public static void main(String[] args) {
          //Personクラスのインスタンスに各値を設定
	      Person p1 = new Person("apple", 15, "female");
	      Person p2 = new Person("banana", 16, "female");
	      Person p3 = new Person("orange", 17, "male");

	      //リスト化を行う
	      List<Person> persons = new ArrayList();
	      persons.add(p1);
	      persons.add(p2);
	      persons.add(p3);

	      FileWriter fileWriter = null;
          try {
	      fileWriter = new FileWriter("person.csv");

	      //リスト内容を順に処理
	      for (Person p : persons) {
	      fileWriter.append(p.getName());
	      fileWriter.append(COMMA);
	      fileWriter.append(String.valueOf(p.getAge()));
	      fileWriter.append(COMMA);
	      fileWriter.append(p.getGender());
	      fileWriter.append(NEW_LINE);
	      }
	      System.out.println("CSVファイル出力完了");
	      } catch (Exception e) {
	      e.printStackTrace();
	      } finally {
	    	  try {
	    		  fileWriter.flush();
	              fileWriter.close();
	              } catch (IOException e) {
	            	  e.printStackTrace();
	              }
	    	  }
          }




}