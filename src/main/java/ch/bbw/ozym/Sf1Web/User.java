package ch.bbw.ozym.Sf1Web;

class User {
    private final String email;
    private final String password;

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
