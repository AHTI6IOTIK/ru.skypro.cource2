package exceptions.validator;

import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequestInterface;

public class ConfirmPasswordConstraint extends BaseHandlerValidatorRequest {
    @Override
    public boolean doValidate(RegistrationRequestInterface request) {
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new WrongPasswordException("Password confirmation is not correct");
        }

        return true;
    }
}
