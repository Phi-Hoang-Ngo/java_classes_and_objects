package java_classes_and_objects;

import java.util.Date;

public class Person {
	private String name;
	private Date birthday;
	private String sex;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, Date birthday, String sex) {
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
	}
	
	public Person(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setBirthday(Date newBirthday) {
		this.birthday = newBirthday;
	}
	
	public void setLocation(String newSex) {
		this.sex = newSex;
	}
	
	public  boolean isFemale() {
		if(sex == "female") {
			return true;
		}
		return false;
	}
	
	public String sexInfo() {
		return  name + " is " + sex + " .";
	}
	
}
