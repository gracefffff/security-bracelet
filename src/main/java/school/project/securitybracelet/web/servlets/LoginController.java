package school.project.securitybracelet.web.servlets;

import school.project.securitybracelet.core.repository.IUserRepository;
import school.project.securitybracelet.core.repository.UserRepository;
import school.project.securitybracelet.core.service.HashService;
import school.project.securitybracelet.web.service.EmailSender;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private HashService hashService = new HashService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IUserRepository userRepository = UserRepository.getInstance();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (userRepository.getUserByEmail(email) == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/login.jsp");
            requestDispatcher.forward(request, response);
        }

        if (userRepository.login(email, password) != null) {
//            SmsSender smsSender = new SmsSender();
//            smsSender.sendSMS();

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/createPatient.jsp");
            requestDispatcher.forward(request, response);
        }

        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/login.jsp");
        requestDispatcher.forward(request, response);
    }
}
