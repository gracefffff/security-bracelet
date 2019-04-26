package school.project.securitybracelet.core.model;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final boolean enabled;
    private final String passportData;


    public User(String firstName, String lastName, String email, String password, boolean enabled, String passportData) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.passportData = passportData;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getPassportData() {
        return passportData;
    }
}
