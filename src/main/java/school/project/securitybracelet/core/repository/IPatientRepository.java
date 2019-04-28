package school.project.securitybracelet.core.repository;


import school.project.securitybracelet.core.model.Patient;

public interface IPatientRepository {
    /**
     * Function to get number of patients
     *
     * @return number of patients
     */
    int getRepositorySize();

    /**
     * Function to create new Patient
     *
     */
    void createPatient(String id,Patient patient);

    /**
     * Function to get patient
     *
     * @param id - patient id
     * @return patient
     */
    Patient getPatient(String id);
}
