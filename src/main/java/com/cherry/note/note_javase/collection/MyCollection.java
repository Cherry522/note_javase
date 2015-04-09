package com.cherry.note.note_javase.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class MyCollection{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
//		//Iterable接口
		Iterable<String> iterable = new ArrayList<String>();
//		//Collection接口		
//		Collection<String> myCollection = new ArrayList<String>();
		//List接口
		//ArrayList  线程不安全的，底层通过数组实现，初始化大小是10，扩容为1.5倍，适合平凡的查找和修改操作，但是不适合频繁的"随机"添加或者删除操作
		List<Integer> list  = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		//LinkedList 链表,底层是一个双向链表结构，所以适合频繁的增删操作，不适合平凡的查询操作
		List<String> linkedList = new LinkedList<>();
		
		//Vector 线程安全的，效率低，所以现在用得比较少，底层和ArrayList一样，是数组实现的，初始化大小是10，扩容为2倍
		List<String> vector = new Vector<>();
		
		//Set接口，继承自Collection接口，里面的值是无序的（放进去的和取出来的不一定是一个顺序），值是不可以重复的
//		Set<String> set = new HashSet<String>();
		
		//HashSet类 ,底层是hashMap
		Set<String> hashSet = new HashSet<>();
		
		//SortedSet接口,继承自Set接口，但是存进去的元素是可以按照大小顺序排序的。
		//TreeSet是二叉树结构
		SortedSet<String> sortedSet = new TreeSet<String>();
		
		
		
		
		
//		int i = -4;
//		System.out.println(Integer.toBinaryString(i));
//		//算数右移，运算符“>>”执行算术右移，它使用最高位填充移位后左侧的空位。右移的结果为：每移一位，第一个操作数被2除一次，移动的次数由第二个操作数确定。
//		//用1填充
//		System.out.println(Integer.toBinaryString(i >> 1));
//		//逻辑右移或叫无符号右移运算符“>>>“只对位进行操作，没有算术含义，它用0填充左侧的空位
//		System.out.println(Integer.toBinaryString(i >>> 1));
		
		//Map接口
		//HashMap类继承自Map接口，key部分可以看做HashSet集合(无序的，不可重复的)，底层用过散列表实现，初始化容量是16，增长因子为0.75，扩容为2倍
		Map<String,String> hashMap = new HashMap<>();
		
		//Hashtabled类实现了Map接口，初始化大小是11，增长因子为0.75，扩容为2倍
		Map<String,String> hashtable = new Hashtable<String,String>();
		
		//Propterties类，继承自Hashtable类，但是properties里的属性都是String类型
		Hashtable<Object,Object> properties = new Properties();
		
		//sortedMap接口，继承自Map接口，key是无序的，不可重复的，可以根据大小排序
		//TreeMap 实现自SortedMap接口
		SortedMap<String,String> sortedMap = new TreeMap<String,String>();
		
		
	}
	
	

}
