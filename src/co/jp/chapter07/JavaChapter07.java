package co.jp.chapter07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import co.jp.chapter07.JavaChapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//2020.05.30(11)
		//1.List
		String str;
		int[] arr = new int[10];
		//arr[0] = "123";
		System.out.println("Array:" + arr.length);

		//List<Integer> list = new ArrayList();
		//list.add("1234");
		//System.out.println("List:" + list.size());

		//list.add(0);
		//System.out.println("List:" + list.size());

		//list.add(1234567890);
		//System.out.println("List:" + list.size());
		//System.out.println("List:" + list.get(0));


        //練習1
        //int[] arr6= new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を System.out.println()。
        int[] arr6= new int[] {1, 3, 5, 7, 100, 0, 1};
        int max = 0;
        for(int i6 = 0; i6 < arr6.length; i6++){
            if(arr6[i6]>max) {
               max = arr6[i6];
               System.out.println("最大値="+max);
            }
        }
        int min = 0;
        for(int i5 = 0; i5 < arr6.length; i5++){
        	if(arr6[i5]<min) {
        		min = arr6[i5];
        		System.out.println("最小値="+min);
        	}
        }

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(6);
        list1.add(7);
        list1.add(9);
        list1.add(6);
        list1.add(2);
        list1.add(1);
        list1.add(0);
        list1.add(-1);
        list1.add(123);
        list1.add(333);
        list1.add(-999);
        int max1 = list1.get(0);
        int min1 = list1.get(0);
        for(int i = 0; i < list1.size(); i++){
        	if(list1.get(i)>max1) {
                 max1 = list1.get(i);
            }
        	if(list1.get(i)<min1) {
                 min1 = list1.get(i);
        	}
        }
        System.out.println("最大値="+max1);
        System.out.println("最小値="+min1);

        //練習2
        Integer[] arr7 = new Integer[] {1, 2, 6, 7, 9, 6, 2, 1,0,-1,123,333,-999};
        System.out.println(Arrays.toString(arr7));
        List<Integer> list2 = Arrays.asList(arr7);
        //list2.set(4, null);
        //System.out.println("sort before" + list2);
        //Collections.sort(list2);
        //System.out.println("sort after" + list2);
        //*
        //Collections.sort(list2,(t1,t2) -> {
        //	return t2.compareTo(t1);
        //});
        //System.out.println("sort after" + list2);

        //練習3
        List<String> Is = new ArrayList<>();
        Is.add("1");
        Is.add("2");
        Is.add("3");
        Is.add("4");
        Is.add("5");
        System.out.println(Is);
        System.out.println(Is.size());
        Is.remove(0);
        System.out.println(Is);
        System.out.println(Is.size());


        //2.Map
        Map<String,Object> map = new HashMap<>();
        map.put("ZZZ", "Aさん");
        map.put("101", "Aさん");
        map.put("54", "Bさん");
        map.put("15", "Cさん");
        map.put("101", "Dさん");
        map.put("102", "Aさん");
        map.put("AA", "Aさん");
        map.put("A", "101");
        map.put("a", null);
        map.put(null, "101");
        map.remove("101");
        System.out.println(map);
        System.out.println(map.getOrDefault("111", ""));
        //System.out.println(map.get("999").toString());
        Iterator<Entry<String, Object>> it = map.entrySet().iterator();
        while(it.hasNext()) {
        	Entry<String, Object> entry = it.next();
        	System.out.println("key=" + entry.getKey() + "value=" + entry.getValue());
        }

        //3.Map-for
        Map<String,List<String>> map2 = new HashMap<>();
        for(int i = 0; i < 10; i++) {
        	List<String> list3 = new ArrayList<>();
        	for(int j = 0;j < 10; j++) {
        		list3.add(String.valueOf(i*10+j+1));
        	}
        	map2.put(String.valueOf(i+1),list3);
        }
        System.out.println(map2);


        //11――質問集
        //質問1
        Station yamanote = new Station();
        yamanote.setName  ("山手線");
        System.out.println(yamanote.getName());
		List<String> datas = new ArrayList<>();
		   datas.add("お滝橋");
		   datas.add("高田馬場");
		   datas.add("池袋");
		   datas.add("日暮里");
		   datas.add("上野");
		   datas.add("新橋");
		   System.out.println(datas);

		   datas.forEach(data -> {
	       if("新橋".equals(data)) {
	    	   System.out.println("新橋駅は路線内である。");
		   }

	    });

		//質問2
		Map<String, List<String>> map3 = new HashMap<>();
		for (int k = 0; k < 10; k++) {
			List<String> list4 = new ArrayList<>();
			for(int n = 0; n < 5; n++) {
				list4.add(String.valueOf(k*5+n+1));
				if( (k*5+n+1) <=31) {
					System.out.print("人");
			    }else {
					System.out.print("空");
				}
	    	}
	    	map3.put(String.valueOf(k+1),list4);
	    	System.out.println();
	    }
	    System.out.println(map3);




    }

}
