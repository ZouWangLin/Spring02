package cn.itheima.entity;

import java.util.HashMap;
import java.util.Map;

public class MyFactory {
	private static Map<String,Student> students;
	static {
		students=new HashMap<String,Student>();
		students.put("1", new Student("小明1",20));
		students.put("2", new Student("小明2",20));
		students.put("3", new Student("小明3",20));
		students.put("4", new Student("小明4",20));
		students.put("5", new Student("小明5",20));
	}
	
	public static Student getBean(String key) {
		return students.get(key);
	}
	
	public Student getBeanByBean(String key) {
		return students.get(key);
	}

}
