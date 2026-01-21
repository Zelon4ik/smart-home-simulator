package smarthomesimulator.Device;

public class Device {

    private final String id;
    private final String name;
    private final String type;
    private boolean status;
    private double powerConsumption;

    public Device(String id, String name, String type, boolean status, double powerConsumption) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Device id cannot be null or empty");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Device name cannot be null or empty");
        }
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Device type cannot be null or empty");
        }
        if (powerConsumption < 0) {
            throw new IllegalArgumentException("Power consumption cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.powerConsumption = powerConsumption;
    }
}

