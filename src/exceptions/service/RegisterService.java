package exceptions.service;

import exceptions.request.RegistrationRequest;
import exceptions.validator.*;

public class RegisterService {
    ValidatorRequestInterface registerValidator;

    public RegisterService() {

        registerValidator = new ConfirmPasswordConstraint();

        ValidatorRequestInterface passwordLengthConstraint = new PasswordLengthConstraint();
        ValidatorRequestInterface loginLengthConstraint = new LoginLengthConstraint();

        ValidatorRequestInterface emptyPasswordConstraint = new EmptyPasswordConstraint();
        ValidatorRequestInterface emptyLoginConstraint = new EmptyLoginConstraint();

        registerValidator.setNext(passwordLengthConstraint);
        passwordLengthConstraint.setNext(loginLengthConstraint);
        loginLengthConstraint.setNext(emptyPasswordConstraint);
        emptyPasswordConstraint.setNext(emptyLoginConstraint);
    }

    public boolean processRegistration(RegistrationRequest request) {
        return registerValidator.validate(request);
    }
}
