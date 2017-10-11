package utn.frd.bean;

public class Persona {

	private long id;
	private String name;
	private int age;
	private String gender;

	public Persona(int id, String name2, int edad, String gender2) {
		setId(id);
		setName(name2);
		setAge(edad);
		setGender(gender2);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
