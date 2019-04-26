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
     * @param firstName             - patient first name
     * @param middleName            - patient middle name
     * @param lastName              - patient last name
     * @param age                   - patient age
     * @param address               - patient address
     * @param contactNumber         - patient contact number
     * @param diseaseDescription    - patient disease description
     * @param firstAidDescription   - patient first aid description and advice
     * @param additionalInformation - patient additional information
     */
    void createPatient(String id, String firstName, String middleName, String lastName, int age, String address, String contactNumber,
                       String diseaseDescription, String firstAidDescription, String additionalInformation);

    /**
     * Function to get patient
     *
     * @param id - patient id
     * @return patient
     */
    Patient getPatient(String id);
}
