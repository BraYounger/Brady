package Collection_test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ColTest {
	
	
	public static void main(String[] args) {
		
		int a = 37;
		int b = 43;
		int c = 58;
		
		/*
		 * 创建ArrayList对象
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		/*
		 * 创建TreeSet对象
		 */
		Set<Integer> set = new TreeSet<Integer>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		/*
		 * 创建HashMap对象
		 */
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(1, a);
		map.put(2, b);
		map.put(3, c);
		
		/*
		 * List遍历:1.普通for循环
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * List遍历:2.增强for循环
		 */
		for(Integer i : list){
			System.out.println(i);
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * List遍历：3.Iterator迭代器
		 */
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * Set遍历：1.普通for循环
		 */
		Object[] integers = set.toArray();
		for (int i = 0; i < integers.length; i++) {
			System.out.println((Integer)integers[i]);
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * Set遍历：2.增强for循环
		 */
		for(Object integer : integers){
			System.out.println((Integer)integer);
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * Set遍历：3.Iterator迭代器
		 */
		Iterator iterator2 = set.iterator();
		while(iterator2.hasNext()){
			Integer integer = (Integer)iterator2.next();
			System.out.println(integer);
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * Map遍历：1.增强for循环(keySet方法)
		 */
		for(Integer integer : map.keySet()){
			System.out.println(integer +" : "+ map.get(integer));
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * Map遍历：2.Iterator迭代器
		 */
		Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
		Iterator<Map.Entry<Integer,Integer>> iterator3 = entries.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("----------------我是分割线----------------");
		
		/*
		 * Map遍历：3.增强for循环(entrySet方法),推荐使用，尤其容量大时
		 */
		for(Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
