package java_classes_and_objects;

public class Pet {
	private String name;
	private int age;
	@SuppressWarnings("unused")
	private String location;
	private String type;
	

	public Pet(String name,int age, String location,String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public Pet() {
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setLocation(String newLocation) {
		this.location = newLocation;
	}
}
