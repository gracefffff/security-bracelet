package school.project.securitybracelet.core.repository;

import school.project.securitybracelet.core.model.User;

public interface IUserRepository {

    User createNewUser(User user);

    User getUserByEmail(final String email);
}
