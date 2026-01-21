package smarthomesimulator.Room;

public class Room {

    private final String id;
    private final String name;
    private final int floor;

    public Room(String id, String name, int floor) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Room id cannot be empty");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Room name cannot be empty");
        }
        if (floor < 0) {
            throw new IllegalArgumentException("Floor cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.floor = floor;
    }
}

