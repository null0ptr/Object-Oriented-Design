import java.util.ArrayList;
import java.util.List;

interface HousingStructure {
	void build();
}

class Room implements HousingStructure {
	private String name;

	public Room(String name) {
		this.name = name;
	}

	@Override
	public void build() {
		System.out.println("Build a room : " + name);
	}
}

class Floor implements HousingStructure {
	private List<HousingStructure> rooms = new ArrayList<>();
	private int floorNumber;

	public Floor(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public void addStructure(HousingStructure structure) {
		rooms.add(structure);
	}

	public void removeStructure(HousingStructure structure) {
		rooms.removeIf(room -> (room.equals(structure)));
	}

	@Override
	public void build() {
		System.out.println("Building a floor : " + floorNumber);
		for (HousingStructure structure : rooms) {
			structure.build();
		}
	}
}

public class HousingService {
	public static void main(String[] args) {
		Room r1 = new Room("Room 1");
		Room r2 = new Room("Room 2");
		Room r3 = new Room("Room 3");
		Floor f = new Floor(1);
		f.addStructure(r1);
		f.addStructure(r2);
		f.addStructure(r3);
		f.build();
	}
}