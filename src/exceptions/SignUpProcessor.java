package exceptions;

import exceptions.exception.WrongLoginException;
import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequest;
import exceptions.service.RegisterService;

public class SignUpProcessor {
    public static void main(String[] args) {
        RegisterService service = new RegisterService();
        RegistrationRequest request = new RegistrationRequest(
            "java_skypro.go",
            "D_1hWiKjjP_9",
            "D_1hWiKjjP_9"
        );

        try {
            boolean result = service.processRegistration(request);
            if (result) {
                System.out.println("Registration success");
            } else {
                System.out.println("Unknown error");
            }
        } catch (WrongPasswordException | WrongLoginException exception) {
            System.out.printf(
                "Registration error: %s",
                exception.getMessage()
            );
        }
    }


}
