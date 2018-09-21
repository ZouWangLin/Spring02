package cn.itheima.beanpostprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import cn.itheima.entity.People;
/**
 * 自定义后置处理器
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

	/**
	 * init方法调用之前，紧接着就是init方法
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//1.判断类型
		if(bean instanceof People) {
			System.out.println("后置处理器的后方法被调用!");
		}
		return bean;
	}

	/**
	 * init方法调用之后，前面紧接着init方法
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//1.判断类型
		if(bean instanceof People) {
			System.out.println("后置处理器的前方法被调用!");
		}
		return bean;
	}

}
