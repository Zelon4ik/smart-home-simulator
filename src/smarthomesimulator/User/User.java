package smarthomesimulator.User;

public class User {

    private final String id;
    private final String name;
    private final String email;
    private final String role;

    public User(String id, String name, String email, String role) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("User id cannot be empty");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (role == null || role.isBlank()) {
            throw new IllegalArgumentException("User role cannot be empty");
        }

        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
