package cn.itheima.entity;

public class Example {
	private Integer id;
	private Student student;
	private Boolean flag;
	private Integer value;
	
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getNum() {
		return 10;
	}
	
	public static Integer getTotal() {
		return 100;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}



	@Override
	public String toString() {
		return "Example [id=" + id + ", student=" + student + ", flag=" + flag + ", value=" + value + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(Integer id, Student student, Boolean flag) {
		super();
		this.id = id;
		this.student = student;
		this.flag = flag;
	}
	
	

}
