package CatAtributes;

public class cat implements Comparable<cat>{

	

	
	private String name;
	private Integer age;
	private String colour;
	
	public cat(String name, Integer age, String colour) {
		
		this.name = name;
		this.age = age;
		this.colour = colour;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getColour() {
		return colour;
	}
	
	@Override
	public String toString() {
		return "{" +
				"name=" + name + 
				"age: " + age + 
				", colour" + colour  +
				')';
		
	}

	@Override
	public int compareTo(cat cats) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(cats.getName());
	}
}
