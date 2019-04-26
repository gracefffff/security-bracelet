package school.project.securitybracelet.config;

import school.project.securitybracelet.core.repository.PatientRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartUpConfig implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        PatientRepository patientRepository = PatientRepository.getInstance();
        patientRepository.createPatient(
                "3d1fffea-bc6e-4857-a704-5b3edbb2d801",
                "Test first name",
                "Test middle name",
                "Test last name",
                0,
                "Test address",
                "Test contact",
                "Test disease",
                "Test first aid",
                "Test additional information");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext context = null;
    }
}
