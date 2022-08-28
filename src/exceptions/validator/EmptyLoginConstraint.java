package exceptions.validator;

import exceptions.exception.WrongLoginException;
import exceptions.request.RegistrationRequestInterface;

public class EmptyLoginConstraint extends BaseHandlerValidatorRequest {
    @Override
    public boolean doValidate(RegistrationRequestInterface request) throws WrongLoginException {
        if (null == request.getLogin() || request.getLogin().isEmpty()) {
            throw new WrongLoginException("Login is empty");
        }

        return true;
    }
}
