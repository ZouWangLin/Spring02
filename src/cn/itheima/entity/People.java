package cn.itheima.entity;

public class People {
	private Integer id;
	private String username;
	private String sex;
	private Integer age;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println("username属性被赋值！");
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public People(Integer id, String username, String sex, Integer age, String address) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}
	public People() {
		super();
		System.out.println("无参构造器被调用!");
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", username=" + username + ", sex=" + sex + ", age=" + age + ", address=" + address
				+ "]";
	}
	public People(String username) {
		super();
		this.username = username;
	}
	
	public void init() {
		System.out.println("对象初始化!");
	}
	
	public void destory() {
		System.out.println("对象销毁!");
	}
	
	
	

}
