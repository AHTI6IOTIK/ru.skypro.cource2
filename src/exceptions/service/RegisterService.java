package exceptions.service;

import exceptions.exception.WrongLoginException;
import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequest;
import exceptions.validator.*;

public class RegisterService {
    private final ValidatorRequestInterface registerValidator;

    public RegisterService() {

        registerValidator = new ConfirmPasswordConstraint();

        ValidatorRequestInterface passwordLengthConstraint = new PasswordLengthConstraint();
        ValidatorRequestInterface loginLengthConstraint = new LoginLengthConstraint();

        ValidatorRequestInterface emptyPasswordConstraint = new EmptyPasswordConstraint();
        ValidatorRequestInterface allowedCharacters = new AllowedCharactersConstraint();
        ValidatorRequestInterface emptyLoginConstraint = new EmptyLoginConstraint();

        registerValidator.setNext(passwordLengthConstraint);
        passwordLengthConstraint.setNext(loginLengthConstraint);
        loginLengthConstraint.setNext(emptyPasswordConstraint);
        emptyPasswordConstraint.setNext(allowedCharacters);
        allowedCharacters.setNext(emptyLoginConstraint);
    }

    public boolean processRegistration(RegistrationRequest request) throws WrongLoginException, WrongPasswordException {
        return registerValidator.validate(request);
    }
}
