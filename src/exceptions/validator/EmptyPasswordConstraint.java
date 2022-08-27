package exceptions.validator;

import exceptions.exception.WrongLoginException;
import exceptions.request.RegistrationRequestInterface;

public class EmptyPasswordConstraint extends BaseHandlerValidatorRequest {
    @Override
    public boolean doValidate(RegistrationRequestInterface request) {
        if (null == request.getPassword() || request.getPassword().isEmpty()) {
            throw new WrongLoginException("Password is empty");
        }

        return true;
    }
}
