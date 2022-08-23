
public class Pet {
	
	private String name;
	private String type;
	private Integer age;
	private String location;
	
	

	public Pet() {
		System.out.println("New pet added!");
		System.out.println("We don't know your new pet's name!");
		System.out.println("We have no idea what your new pet is!");
		System.out.println("We're clueless as your new pet's age!");
		System.out.println("We don't know where the hell they are! You should probably look go for them.");
	}
	
	public Pet(String name, String type, Integer age, String location) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.location = location;
		System.out.println("New pet added!");
		System.out.println("Your new pet's name is " + this.name);
		System.out.println("Your new pet is a " + this.type);
		System.out.println("Your new pet is " + this.age + " years old.");
		System.out.println("Your new pet is located in a " + this.location);
	}

	public void getName() {
		System.out.println("This pet's name is " + this.name);
	}
	
	public void getType() {
		System.out.println("This pet is a " + this.type);
	}
	
	public void getAge() {
		System.out.println("This pet is " + this.age + " years old.");
	}
	
	public void setName(String newName) {
		String oldName = this.name;
		this.name = newName;
		System.out.println("You have changed your pet's name from " + oldName + " to " + this.name);
	}
	
	public void setAge(Integer newAge) {
		Integer oldAge = this.age;
		this.age = newAge;
		System.out.println("Your pet's age changed from " + oldAge + " to " + this.age);
	}
	
	public void setLocation(String newLocation) {
		String oldLocation = this.location;
		this.location = newLocation;
		System.out.println("Your pet has moved from a " + oldLocation + " to a " + this.location);
	}
	
	
	
}

