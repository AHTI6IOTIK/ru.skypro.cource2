package exceptions.validator;

import exceptions.request.RegistrationRequestInterface;

public abstract class BaseHandlerValidatorRequest implements ValidatorRequestInterface {
    private ValidatorRequestInterface next;

    @Override
    public void setNext(ValidatorRequestInterface handler) {
        next = handler;
    }

    public boolean validate(RegistrationRequestInterface request) {

        if (null != next) {
            next.validate(request);
        }

        return this.doValidate(request);
    }

    protected abstract boolean doValidate(RegistrationRequestInterface request);
}
