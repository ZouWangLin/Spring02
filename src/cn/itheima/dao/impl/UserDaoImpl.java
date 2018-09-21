package cn.itheima.dao.impl;

import org.springframework.stereotype.Repository;


/**
 * spring中常见的注解
 * 1.@Repository	一般用于将dao对象注入IOC容器
 * 2.@Service		一般用于将service对象注入IOC容器
 * 3.@Controller	一般用于将controller对象注入IOC容器
 * 4.@Component		 用于将任何对象注入IOC容器中
 * 上面的注入方式：注入的对象id默认为类名首字母小写
 * 如果要指定注入对象的id，可以在注解上添加value属性
 */
@Repository//将当前对象加入容器中
public class UserDaoImpl implements UserDao{
	public void save() {
		System.out.println("数据添加成功!");
	}
	

}
