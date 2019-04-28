package school.project.securitybracelet.config;

import school.project.securitybracelet.core.model.Patient;
import school.project.securitybracelet.core.model.User;
import school.project.securitybracelet.core.repository.PatientRepository;
import school.project.securitybracelet.core.repository.UserRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartUpConfig implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        PatientRepository patientRepository = PatientRepository.getInstance();
        UserRepository userRepository = UserRepository.getInstance();
        patientRepository.createPatient(
                "3d1fffea-bc6e-4857-a704-5b3edbb2d801",
                new Patient("Test first name",
                        "Test middle name",
                        "Test last name",
                        0,
                        "Test address",
                        "Test contact",
                        "Test disease",
                        "Test first aid",
                        "Test additional information"));

        userRepository.createNewUser(
                new User(
                        null,
                        null,
                        "admin@admin.com",
                        "admin",
                        true, null));
    }


    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext context = null;
    }
}
