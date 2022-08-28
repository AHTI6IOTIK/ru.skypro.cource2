package exceptions.validator;

import exceptions.exception.WrongLoginException;
import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequestInterface;

public interface ValidatorRequestInterface {
    void setNext(ValidatorRequestInterface handler);
    boolean validate(RegistrationRequestInterface request) throws WrongLoginException, WrongPasswordException;
}
