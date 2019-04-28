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
                        "Test additional information",
                        "mr.heylovskiy@gmail.com"));

        patientRepository.createPatient(
                "805082c4-698e-11e9-a923-1681be663d3e",
                new Patient("Gleb",
                        "V",
                        "Kheilovskii",
                        21,
                        "Svetlaya street, Omsk",
                        "+79039276656",
                        "No disease",
                        "Make him smile",
                        "Sometimes can be upset",
                        "mr.heylovskiy@gmail.com"));

        userRepository.createNewUser(
                new User(
                        null,
                        null,
                        "admin@admin.com",
                        "21232F297A57A5A743894A0E4A801FC3",
                        true, null));
    }


    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext context = null;
    }
}
