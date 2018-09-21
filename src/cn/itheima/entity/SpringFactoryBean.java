package cn.itheima.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * 通过spring提供的FactoryBean创建对象
 */
public class SpringFactoryBean implements FactoryBean<Student> {

	/**
	 * 该方法返回对象
	 */
	@Override
	public Student getObject() throws Exception {
		return new Student("小邹",18);
	}

	/**
	 * 该方法返回对象类型
	 */
	@Override
	public Class<Student> getObjectType() {
		return null;
	}

	
	/**
	 * isSingleton方法可以设置创建对象的是否是单例或者多例
	 */
	@Override
	public boolean isSingleton() {
		//返回true为多例
		return true;
	}

}
