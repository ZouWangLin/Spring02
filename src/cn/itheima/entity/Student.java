package cn.itheima.entity;
//学生实体类
public class Student {
	private String username;
	private String sex;
	private Integer age;
	private Grade grade;

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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


	public Student(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}

	public Student(String username, String sex, Integer age, Grade grade) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", sex=" + sex + ", age=" + age + ", grade=" + grade + "]";
	}

	
	

}
