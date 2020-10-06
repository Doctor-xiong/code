package com.lyf.china.bean;
/**
 * 对应与mysql中user表的类
 * @author liuyifan
 */
public class User {
	/**
	 * user的唯一标志
	 */
	private Integer id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户真实姓名
	 */
	private String name;
	/**
	 * 用户性别
	 */
	private Integer sex;
	/**
	 * 用户所在部门
	 */
	private String department;
	/**
	 * 用户公司
	 */
	private String workspace;
	/**
	 * 用户邮箱地址
	 */
	private String email;

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
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getWorkspace() {
		return workspace;
	}
	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
		// 指自动生成的构造函数
	}
	public User(Integer id, String username, String password,String name, Integer sex, String department, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.department = department;
		this.workspace = null;
		this.email = email;
	}
	public User(Integer id, String username, String password,String name, Integer sex, String department, String workspace, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.department = department;
		this.workspace = workspace;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password +",name=" + name + ", sex="+ sex + ", department=" + department + ", workspace=" + workspace + ", email=" + email + "]";
	}
}
