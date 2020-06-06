package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str;
		
		int[] arr = new int[10];
		
//		arr[0]="132";
		System.out.println("Array:"+arr.length);
		System.out.println(arr[0]);
		
		List<Integer> list = new ArrayList();
		
//		list.add("1234");
		System.out.println("List:" + list.size());
		
		list.add(1234657890);
		System.out.println("List:" + list.size());
		
		System.out.println("List:" + list.get(0));
		
		/*
		 *	３ 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		 */

		List<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		list1.add(6);
		list1.add(2);
		list1.add(1);

		int max = list1.get(0);
		int min = list1.get(0);
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) > max) {
				max = list1.get(i);
			}
			if (list1.get(i) < min) {
				min = list1.get(i);
			}
		}
		System.out.println(" MAX : " + max);
		System.out.println(" MIN : " + min);
		
		/*
		 *	３ 
		 */
		List<Integer> list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(6);
		list2.add(7);
		list2.add(9);
		list2.add(6);
		list2.add(2);
		list2.add(1);
		list2.add(0);
		list2.add(-1);
		list2.add(123);
		list2.add(333);
		list2.add(-999);

		int max2 = list2.get(0);
		int min2 = list2.get(0);
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) > max2) {
				max2 = list2.get(i);
			}
			if (list2.get(i) < min2) {
				min2 = list2.get(i);
			}
		}
		System.out.println(" MAX : " + max2);
		System.out.println(" MIN : " + min2);
		
		List<Integer> list3 = new ArrayList();
		list3.add(1);
		list3.add(2);
		list3.add(6);
		list3.add(7);
		list3.add(9);
		list3.add(6);
		list3.add(2);
		list3.add(1);
		int max3 = list3.get(0);
		int min3 = list3.get(0);
		for (int i = 0; i < list3.size(); i++) {
			if (list3.get(i) > max3) {
				max3 = list3.get(i);
			}
			if (list3.get(i) < min3) {
				min3 = list3.get(i);
			}
		}
		System.out.println(" MAX : " + max3);
		System.out.println(" MIN : " + min3);
		
		System.out.println(list3);
		
		Integer[] arr1 = new Integer[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		
		List<Integer> list11 = Arrays.asList(arr1);
		System.out.println(list11);
		
//		list11.set(4,null);
//		list11.remove(4);
		
		Collections.sort(list11);
		System.out.println(list11);
		
		Collections.sort(list11, (t1, t2) -> {
			//
			return t2.compareTo(t1);
			});
			System.out.println(list11); // [u3, u2, u1]
	
	List<String> Is = new ArrayList();
	Is.add("1");
	Is.add("2");
	Is.add("3");
	Is.add("4");
	Is.add("5");
	System.out.println(Is);
	Is.remove(4);
	System.out.println(Is);
	
	//Map
	Map<String, Object> map = new HashMap<>();
	 map.put("101", "Aさん");
	 map.put("54", "Bさん");
	 map.put("15", "Bさん");
	 map.put("101", "Dさん");
	 map.put("102", "Aさん");
	 map.put("ZZZ", "Aさん");
	 map.put("ZZ", "");
	 map.remove("ZZZ");
	 System.out.println(map);
	 System.out.println(map.get("101"));
	 System.out.println(map.getOrDefault("111111", "Empty"));
//	 System.out.println(map.get("111").toString());
	 Iterator<Entry<String, Object>> it = map.entrySet().iterator();
	 while (it.hasNext()) {
	 System.out.println(it.next());
	 }
	 
	 //
	 Map<String,List> listMap = new HashMap<>();
	 for (int i = 0; i < 10; i++) {
		 List<String> List1 = new ArrayList<>();
			for (int j = 0; j < 10; j++) {
				List1.add(String.valueOf(i*10+j+1));
			}
			System.out.println(List1);
			listMap.put(String.valueOf(i+1), List1);
		}
	 System.out.println(listMap);
	}
	

//	private static int list1(int i) {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
	}

//}
