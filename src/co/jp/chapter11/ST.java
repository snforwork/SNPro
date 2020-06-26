package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ST {


	public static void main(String[] args) {
		Sname ss = new Sname();
         ss.setName  ("山手線");
		  System.out.println(ss.getName());
		List<String> cz = new ArrayList<>();
		   cz.add("森下");
		   cz.add("住吉");
		   cz.add("西大島");
		   cz.add("大島");
		   cz.add("東大島");
		   System.out.println(cz);


	     cz.forEach(data -> {
			  if("西大島".equals(data)) {
				  System.out.println("西大島は路線内である");
			  }

		  });

	    Map<String, List<String>> map2 = new HashMap<>();



       for (int i = 0;i<10;i++) {
    	   List<String> list = new ArrayList<>();
    	   for(int j = 0;j<5;j++) {
    		   list.add(String.valueOf(i*5+j+1));
    		   if( (i*5+j+1)<=31) {
				   System.out.print("有");
			   }else {
				   System.out.print("無");
			   }
    	   }
    	   map2.put(String.valueOf(i+1),list);
    	   System.out.println();
       }
       System.out.println(map2);

	}

}