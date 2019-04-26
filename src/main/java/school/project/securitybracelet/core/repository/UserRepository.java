package school.project.securitybracelet.core.repository;

import school.project.securitybracelet.core.model.User;

import java.util.HashMap;

public class UserRepository implements IUserRepository {
    private HashMap<String, User> userHashMap;
    private static UserRepository instance;

    private UserRepository() {
        userHashMap = new HashMap<String, User>();
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public User createNewUser(User user) {
        return userHashMap.put(user.getEmail(), user);
    }

    public User getUserByEmail(final String email) {
        return userHashMap.get(email);
    }
}
