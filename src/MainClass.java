import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Pet class demo
		Pet stray = new Pet();
		stray.setName("Perry");
		stray.setLocation("Secret Lair");
		
		Pet pet1 = new Pet("Todo", "dog", 6, "basket");
		pet1.getType();
		pet1.getName();
		pet1.setName("Spot");
		
		Pet pet2 = new Pet("Garfield", "cat", 44, "restaurant");
		pet2.getAge();
		pet2.setAge(45);
		pet2.setLocation("bed");
		
		
		//Custom Monster class demo		
		Monster mon1 = new Monster("Gelatinous Cube", 3);
		mon1.getName();
		mon1.getType();
		mon1.getLevel();
		mon1.setType("Ooze");
		
		Monster mon2 = new Monster("Balrog", "Devil", 18);
		mon2.setName("Balor");
		mon2.setType("Demon");
		mon2.setLevel(20);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your level, adventurer?");
		Integer playerLevel = input.nextInt();
		
		mon1.testOfMettle(playerLevel);
		mon2.testOfMettle(playerLevel);
	}

}
