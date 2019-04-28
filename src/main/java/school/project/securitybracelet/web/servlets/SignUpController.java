package school.project.securitybracelet.web.servlets;

import school.project.securitybracelet.core.model.User;
import school.project.securitybracelet.core.repository.IUserRepository;
import school.project.securitybracelet.core.repository.UserRepository;
import school.project.securitybracelet.core.service.HashService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpController extends HttpServlet {
    private HashService hashService = new HashService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/signup.jsp");
        requestDispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IUserRepository userRepository = UserRepository.getInstance();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String passportId = request.getParameter("passportId");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String hashPass = hashService.generateHash(password);
        System.out.println(hashPass);

        User newUser = new User(
                firstName,
                lastName,
                email,
                hashPass,
                true,
                passportId
        );

        userRepository.createNewUser(newUser);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
        requestDispatcher.forward(request, response);
    }
}
