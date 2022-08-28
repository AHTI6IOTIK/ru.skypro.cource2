package exceptions.validator;

import exceptions.exception.WrongLoginException;
import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequestInterface;

public abstract class BaseLengthHandlerValidatorRequest extends BaseHandlerValidatorRequest {
    @Override
    public boolean doValidate(RegistrationRequestInterface request) throws WrongLoginException, WrongPasswordException {
        if (getValue(request).length() < getLength()) {
            processError();
        }

        return true;
    }

    protected abstract String getValue(RegistrationRequestInterface request);

    protected abstract int getLength();

    protected abstract void processError() throws WrongLoginException, WrongPasswordException;
}
