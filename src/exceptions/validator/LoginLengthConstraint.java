package exceptions.validator;

import exceptions.exception.WrongLoginException;
import exceptions.request.RegistrationRequestInterface;

public class LoginLengthConstraint extends BaseHandlerValidatorRequest {
    private static final int MINIMUM_LOGIN_LENGTH = 20;

    @Override
    public boolean doValidate(RegistrationRequestInterface request) {
        if (request.getLogin().length() < MINIMUM_LOGIN_LENGTH) {
            throw new WrongLoginException(
                String.format(
                    "The login cannot be shorter than %d characters",
                    MINIMUM_LOGIN_LENGTH
                )
            );
        }

        return true;
    }
}
