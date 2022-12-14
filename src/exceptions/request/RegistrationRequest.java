package exceptions.request;

public class RegistrationRequest implements RegistrationRequestInterface {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public RegistrationRequest(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
