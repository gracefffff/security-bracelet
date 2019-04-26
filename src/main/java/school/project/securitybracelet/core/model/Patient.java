package school.project.securitybracelet.core.model;

public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String address;
    private String contactNumber;
    private String diseaseDescription;
    private String firstAidDescription;
    private String additionalInformation;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public String getFirstAidDescription() {
        return firstAidDescription;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public Patient(String firstName, String middleName, String lastName, int age, String address, String contactNumber,
                   String diseaseDescription, String firstAidDescription, String additionalInformation) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.diseaseDescription = diseaseDescription;
        this.firstAidDescription = firstAidDescription;
        this.additionalInformation = additionalInformation;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", diseaseDescription='" + diseaseDescription + '\'' +
                ", firstAidDescription='" + firstAidDescription + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                '}';
    }
}
