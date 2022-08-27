package exceptions.validator;

import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequestInterface;

public class PasswordLengthConstraint extends BaseHandlerValidatorRequest {
    private static final int MINIMUM_PASSWORD_LENGTH = 20;

    @Override
    public boolean doValidate(RegistrationRequestInterface request) {
        if (request.getPassword().length() < MINIMUM_PASSWORD_LENGTH) {
            throw new WrongPasswordException(
                String.format(
                    "The password cannot be shorter than %d characters",
                    MINIMUM_PASSWORD_LENGTH
                )
            );
        }

        return true;
    }
}
