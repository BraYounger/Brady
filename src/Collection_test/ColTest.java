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
		 * ����ArrayList����
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		/*
		 * ����TreeSet����
		 */
		Set<Integer> set = new TreeSet<Integer>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		/*
		 * ����HashMap����
		 */
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(1, a);
		map.put(2, b);
		map.put(3, c);
		
		/*
		 * List����:1.��ͨforѭ��
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * List����:2.��ǿforѭ��
		 */
		for(Integer i : list){
			System.out.println(i);
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * List������3.Iterator������
		 */
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * Set������1.��ͨforѭ��
		 */
		Object[] integers = set.toArray();
		for (int i = 0; i < integers.length; i++) {
			System.out.println((Integer)integers[i]);
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * Set������2.��ǿforѭ��
		 */
		for(Object integer : integers){
			System.out.println((Integer)integer);
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * Set������3.Iterator������
		 */
		Iterator iterator2 = set.iterator();
		while(iterator2.hasNext()){
			Integer integer = (Integer)iterator2.next();
			System.out.println(integer);
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * Map������1.��ǿforѭ��(keySet����)
		 */
		for(Integer integer : map.keySet()){
			System.out.println(integer +" : "+ map.get(integer));
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * Map������2.Iterator������
		 */
		Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
		Iterator<Map.Entry<Integer,Integer>> iterator3 = entries.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("----------------���Ƿָ���----------------");
		
		/*
		 * Map������3.��ǿforѭ��(entrySet����),�Ƽ�ʹ�ã�����������ʱ
		 */
		for(Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
