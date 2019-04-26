package school.project.securitybracelet.core.repository;

import school.project.securitybracelet.core.model.Patient;

import java.util.HashMap;

/**
 * Implementation of IPatientRepository interface (singleton class)
 */
public class PatientRepository implements IPatientRepository {
    private static PatientRepository instance;
    private HashMap<String, Patient> patientHashMap;

    private PatientRepository() {
        patientHashMap = new HashMap<String, Patient>();
    }

    public static PatientRepository getInstance() {
        if (instance == null) {
            instance = new PatientRepository();
        }
        return instance;
    }

    public int getRepositorySize() {
        return patientHashMap.size();
    }

    public void createPatient(String id,String firstName, String middleName, String lastName, int age, String address, String contactNumber,
                              String diseaseDescription, String firstAidDescription, String additionalInformation) {
        // TODO: remove System.out.println()
//        String id = UUID.randomUUID().toString();
        System.out.println(id);
        patientHashMap.put(id, new Patient(firstName, middleName, lastName, age, address, contactNumber,
                diseaseDescription, firstAidDescription, additionalInformation));
    }

    public Patient getPatient(String id) {
        return patientHashMap.get(id);
    }
}
