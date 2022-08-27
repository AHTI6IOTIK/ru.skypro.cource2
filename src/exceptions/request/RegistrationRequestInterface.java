package exceptions.request;

public interface RegistrationRequestInterface extends RequestInterface {
    String getLogin();

    String getPassword();

    String getConfirmPassword();
}
