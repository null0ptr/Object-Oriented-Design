import java.util.ArrayList;

class Pet {
	private String petName;
	private int age;
	private String color;
	private String type;

	public Pet(String type, String petName, int age, String color) {
		this.type = type;
		this.petName = petName;
		this.age = age;
		this.color = color;
	}

	public String getPetName() {
		return petName;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Type : " + type + ", Name : " + petName + ", age : " + age + ", color : " + color;
	}
}

// Cat subclass
class Cat extends Pet {
	public Cat(String name, int age, String color) {
		super("Cat", name, age, color);
	}
}

// Dog subclass
class Dog extends Pet {
	public Dog(String name, int age, String color) {
		super("Dog", name, age, color);
	}
}

class PetManager {
	private ArrayList<Pet> pets = new ArrayList<>();

	public void addPet(Pet pet) {
		pets.add(pet);
	}

	public void showAllPets() {
		for (Pet pet : pets) {
			System.out.println(pet);
		}
	}
}

public class PetManagement {
	public static void main(String[] args) {
		PetManager petManager = new PetManager();
		petManager.addPet(new Dog("Golden Retriever", 1, "gold"));
		petManager.addPet(new Cat("Persian", 2, "white"));
		petManager.showAllPets();
	}
}