package exceptions.validator;

import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequestInterface;

public class PasswordLengthConstraint extends BaseLengthGteHandlerValidatorRequest {
    @Override
    protected String getValue(RegistrationRequestInterface request) {
        return request.getLogin();
    }

    @Override
    protected int getLength() {
        return 20;
    }

    @Override
    protected void processError() throws WrongPasswordException {
        throw new WrongPasswordException(
            String.format(
                "The password cannot be shorter than %d characters",
                getLength()
            )
        );
    }
}
