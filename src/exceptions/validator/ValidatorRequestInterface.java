package exceptions.validator;

import exceptions.request.RegistrationRequestInterface;

public interface ValidatorRequestInterface {
    void setNext(ValidatorRequestInterface handler);
    boolean validate(RegistrationRequestInterface request);
}
