package exceptions;

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

        boolean result = service.processRegistration(request);
        System.out.println();
        if (result) {
            System.out.println("Registration approved");
        } else {
            System.out.println("Registration rejected");
        }

    }


}
