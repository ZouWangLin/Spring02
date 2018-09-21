package cn.itheima.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itheima.dao.impl.UserDao;
import cn.itheima.entity.Example;
import cn.itheima.entity.People;
import cn.itheima.entity.Student;

class TestSpring {
	/**
	 * Autowired注解详解：
	 * 	（1）首先从IOC容器中找当前类型的对象，找到后自动注入
	 * 	（2）如果找到多个就按照用户写的变量找，例子中的即找(userDao)
	 * 	（3）如果用户需要精确找到某个id的对象，可以添加Qualifier注解
	 */
	@Autowired
	private UserDao userDao;
	/**
	 * spring的第一个实例：级联属性赋值
	 */
	@Test
	void test1() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("student");
		//3.验证结果
		System.out.println(student);
		
	}
	
	/**
	 * spring的第二个实例：基于xml的自动装配byName
	 */
	@Test
	void test2() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("student1");
		//3.验证结果
		System.out.println(student);
	}
	
	/**
	 * spring的第三个案例:基于xml的自动装配byType
	 */
	@Test
	void test3() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("student2");
		//3.验证结果
		System.out.println(student);
	}
	
	/**
	 * spring的第四个案例:bean之间的关系之继承
	 */
	@Test
	void test4() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("student3");
		//3.验证结果
		System.out.println(student);
	}
	
	/**
	 * spring的第五个案例:bean之间的关系之依赖
	 */
	@Test
	void test6() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("student4");
		//3.验证结果
		System.out.println(student);
	}
	
	/**
	 * spring的第六个案例:bean的作用域，讨论单例和多例的区别
	 */
	@Test
	void test7() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student_single1 = (Student) applicationContext.getBean("student5");
		Student student_single2 = (Student) applicationContext.getBean("student5");
		Student student_prototype1 = (Student) applicationContext.getBean("student6");
		Student student_prototype2 = (Student) applicationContext.getBean("student6");
		//3.验证结果
		System.out.println("单例对象比较:"+(student_single1==student_single2));
		System.out.println("多例对象比较:"+(student_prototype1==student_prototype2));
	}

	/**
	 * spring的第七个案例:sqEl表达式的使用
	 */
	@Test
	void test8() {
		//1.初始化IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Example example = (Example) applicationContext.getBean("example");
		//3.验证结果
		System.out.println(example);
	}
	
	/**
	 * spring的第八个案例:bean的生命周期
	 * 		注意：单例对象的生命周期如果是通过set属性赋值
	 * 				（1）默认调用无参构造器
	 * 				（2）调用set属性赋值
	 * 				（3）后置处理器的前方法
	 * 				（4）调用init方法
	 * 				（5）后置处理器的后方法
	 * 				（6）容器IOC销毁调用destory方法
	 */
	@Test
	void test9() {
		//1.初始化IOC容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		People people = (People) applicationContext.getBean("people");
		//3.验证结果
		System.out.println(people);
		//4.销毁IOC容器
		applicationContext.close();
		
	}
	
	/**
	 * spring的第九个案例:通过静态工厂获取对象
	 */
	@Test
	void test10() {
		//1.初始化IOC容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student myFactory = (Student) applicationContext.getBean("myFactory");
		//3.验证结果
		System.out.println(myFactory);
	}
	
	/**
	 * spring的第十个案例：通过实例工厂获取对象
	 */
	@Test
	void test11() {
		//1.初始化IOC容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("studentele");
		//3.验证结果
		System.out.println(student);
	}

	/**
	 * spring的第十一个案例:通过spring提供的FactoryBean创建对象
	 * 	实现方式：（1）书写一个类实现FactoryBean
	 * 		         （2）配置自定义的实体类
	 */
	@Test
	void test12() {
		//1.初始化IOC容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		Student student = (Student) applicationContext.getBean("springFactoryBean");
		//3.验证结果
		System.out.println(student);
	}
	
	/**
	 * spring的第十二案例:获取使用注解注入IOC容器的对象
	 */
	@Test
	void test13() {
		//1.初始化IOC容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取对象
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//3.验证结果
		userDao.save();
	}
	
	
	/**
	 * spring的第十三案例:使用autowired注解获取IOC容器中的对象
	 */
	@Test
	void test14() {
		userDao.save();
	}
	@Test
	void test20() throws Exception {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1.从IOC容器中获取连接池对象
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		//2.获取连接
		Connection connection = dataSource.getConnection();
		//3.验证结果
		System.out.println(connection);
	}

}
