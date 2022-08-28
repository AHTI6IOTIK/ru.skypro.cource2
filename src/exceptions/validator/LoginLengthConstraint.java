package exceptions.validator;

import exceptions.exception.WrongLoginException;
import exceptions.request.RegistrationRequestInterface;

public class LoginLengthConstraint extends BaseLengthHandlerValidatorRequest {
    @Override
    protected String getValue(RegistrationRequestInterface request) {
        return request.getLogin();
    }

    @Override
    protected int getLength() {
        return 20;
    }

    @Override
    protected void processError() throws WrongLoginException {
        throw new WrongLoginException(
            String.format(
                "The login cannot be shorter than %d characters",
                getLength()
            )
        );
    }
}
