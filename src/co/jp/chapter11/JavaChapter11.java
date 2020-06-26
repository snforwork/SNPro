package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11 {

	public JavaChapter11() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str;

		int[] arr = new int[10];//		arr[0] = "123";
		System.out.println("Array :" + arr.length);
		System.out.println(arr[0]);

		List<Integer> list = new ArrayList();
		//		list.add("1234");
		System.out.println("List :" + list.size());

		list.add(1234567890);
		System.out.println("List :" + list.size());
		list.get(0);
		System.out.println("List :" + list.get(0));

		//3
		int[] arr3 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1, 0, -1, 123, 333, -999 };
		//				int max = arr3[0];
		//				int min = arr3[0];
		//				for (int i = 0; i < arr3.length; i++) {
		//					if (arr3[i] > max) {
		//						max = arr3[i];
		//					}
		//					if (arr3[i] < min) {
		//						min = arr3[i];
		//					}
		//				}
		//				System.out.println(" MAX : " + max);
		//				System.out.println(" MIN : " + min);

		List<Integer> list1 = new ArrayList();
		list1.add(3);
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

		System.out.println(Arrays.toString(arr3));
		System.out.println(list1);

		Integer[] arr4 = new Integer[] { 1, 2, 6, 7, 9, 6, 2, 1, 0, -1, 123, 333, -999 };
		System.out.println(Arrays.toString(arr4));

		List<Integer> list2 = Arrays.asList(arr4);
		//				list2.set(4,null);
		//				list2.remove(4);
		//				System.out.println("sort before" + list2);
		//				Collections.sort(list2);
		//				System.out.println("↑sort after" + list2);
		//
		//				//
		//				Collections.sort(list2,(t1,t2) -> {
		//					return t2.compareTo(t1);
		//				});
		//				System.out.println("↓sort after" + list2);

		List<String> ls = new ArrayList<>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("5");

		System.out.println(ls);
		System.out.println(ls.size());
		//				ls.remove(0);
		ls.set(0, null);
		System.out.println(ls);
		System.out.println(ls.size());

		//MAP
		Map<String, Object> map = new HashMap<>();
		map.put("1ZZ", "Aさん");
		map.put("54", "Bさん");
		map.put("15", "Bさん");
		map.put("101", "Dさん");
		map.put("102", "Aさん");
		map.put("ZZ", "Aさん");
		//				System.out.println(map.size());

		map.remove("101");
		System.out.println(map);
		System.out.println(map.getOrDefault("101", "Empty"));
		//				System.out.println(map.get("999").toString());

//				Iterator<Entry<String, Object>> it = map.entrySet().iterator();
//				while (it.hasNext()) { //
//					map.Entry<String, String> entry = it.next();
//					System.out.println("key=" + entry.getKey() + "; value=" + entry.getValue());
//				}

		Map<String, List> listMap = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			List<String> listC = new ArrayList<>();
			for (int j = 0; j < 10; j++) {
				listC.add(String.valueOf(i*10+j+1));
			}
			System.out.println(listC);
			listMap.put(String.valueOf(i + 1), listC);
		}
		System.out.println(listMap);

	}

}
