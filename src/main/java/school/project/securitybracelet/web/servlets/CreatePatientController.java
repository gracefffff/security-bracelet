package school.project.securitybracelet.web.servlets;

import com.google.zxing.WriterException;
import school.project.securitybracelet.core.model.Patient;
import school.project.securitybracelet.core.model.User;
import school.project.securitybracelet.core.repository.IUserRepository;
import school.project.securitybracelet.core.repository.PatientRepository;
import school.project.securitybracelet.core.repository.UserRepository;
import school.project.securitybracelet.web.service.QRCodeGenerator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class CreatePatientController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/createPatient.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PatientRepository repository = PatientRepository.getInstance();

        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String contactNumber = request.getParameter("contactNumber");
        String diseaseDescription = request.getParameter("diseaseDescription");
        String firstAidDescription = request.getParameter("firstAidDescription");
        String additionalInformation = request.getParameter("additionalInformation");


        Patient patient = new Patient(
                firstName,
                middleName,
                lastName,
                age,
                address,
                contactNumber,
                diseaseDescription,
                firstAidDescription,
                additionalInformation
        );

        String id = UUID.randomUUID().toString();

        System.out.println("id = "+ id);
        repository.createPatient(
                id,
                patient);

        QRCodeGenerator qrCodeGenerator = new QRCodeGenerator();
        try {
            qrCodeGenerator.generateQRCodeImage(id);
        } catch (WriterException e) {
            e.printStackTrace();
        }


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
        requestDispatcher.forward(request, response);
    }
}
