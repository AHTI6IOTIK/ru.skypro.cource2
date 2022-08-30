package exceptions.validator;

import exceptions.exception.WrongPasswordException;
import exceptions.request.RegistrationRequestInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllowedCharactersConstraint extends BaseHandlerValidatorRequest{
    private static final String REGEX_PATTERN = "\\W";

    @Override
    protected boolean doValidate(RegistrationRequestInterface request) throws WrongPasswordException {
        String login = request.getLogin();
        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        Matcher matcher = pattern.matcher(login);
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(
                login.substring(matcher.start(), matcher.end())
            );
        }
        if (matches.size() > 0) {
            throw new WrongPasswordException(
                String.format(
                    "Пароль имеет не допустимые символы %s",
                    matches
                )
            );
        }

        return true;
    }
}
