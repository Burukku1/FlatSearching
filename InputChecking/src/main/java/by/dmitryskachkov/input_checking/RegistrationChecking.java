package by.dmitryskachkov.input_checking;

public class RegistrationChecking implements Checking {
    @Override
    public boolean isGoodEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return emailRegex.matches(emailRegex);
    }

    @Override
    public boolean isGoodPassword(String password) {
        String passwordRegex = "^[a-zA-Z][a-zA-Z0-9]{7,31}$";
        return passwordRegex.matches(passwordRegex);
    }

    @Override
    public boolean isGoodFullName(String fullName) {
        String fullNameRegex = "^(?:(?:[a-zA-Z]+ ){0,2}[a-zA-Z]+|(?:[a-zA-Z]+ )?[a-zA-Z]+)$";
        return fullNameRegex.matches(fullName);
    }
}
