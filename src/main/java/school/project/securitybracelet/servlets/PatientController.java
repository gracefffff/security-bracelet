package school.project.securitybracelet.servlets;

import school.project.securitybracelet.core.model.Patient;
import school.project.securitybracelet.core.repository.IPatientRepository;
import school.project.securitybracelet.core.repository.PatientRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PatientController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id != null && !id.equals("")) {
            IPatientRepository patientRepository = PatientRepository.getInstance();
            Patient patient = patientRepository.getPatient(id);
            request.setAttribute("patient", patient);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/patient.jsp");
            requestDispatcher.forward(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IPatientRepository patientRepository = PatientRepository.getInstance();


    }
}
