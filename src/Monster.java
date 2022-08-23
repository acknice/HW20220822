public class Monster {
	
	private String name = "Mystery Monster";
	private String type = "Unknown";
	private Integer level = 0;
	
	public Monster() {
	}
		
	public Monster(String name, Integer level) {
		this.name = name;
		this.type = "Unknown";
		this.level = level;
	}
	
	public Monster(String name, String type, Integer level) {
		this.name = name;
		this.type=type;
		this.level = level;
	}
	
	public void getName() {
		System.out.println("This monster is called a " + this.name);
	}
	
	public void getType() {
		System.out.printf("The %s is of type %s%n", this.name, this.type);
	}
	
	public void getLevel() {
		System.out.printf("The %s is level %d%n", this.name, this.level);
	}
	
	public void setName(String newName) {
		this.name = newName;
		System.out.println("Monster name changed to " + this.name);
	}
	
	public void setType(String newType) {
		this.type = newType;
		System.out.printf("The %s has been changed to type %s%n", this.name, this.type);
	}
	
	public void setLevel(Integer newLevel) {
		Integer oldLevel = this.level;
		this.level = newLevel;
		System.out.printf("The %s has gone from level %d to level %d%n", this.name, oldLevel, this.level);
	}
	
	public void testOfMettle(Integer toughness) {
		if (this.checkLevel(toughness) == true) System.out.printf("You can take a %s, easy!%n", this.name);
		else System.out.printf("Careful! Stay away from the %s, it is too strong.%n", this.name);	
	}
	
	private boolean checkLevel(Integer toughness) {
		if (toughness >= this.level) return true;
		else return false;
	}
	
	public String beware() {
		return "You're off the edge of the map... here there be monsters!";
	}
}
