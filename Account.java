package components;

public class Account {
    private String username;
    private String password;
// Optional: for budget tracking

    public Account(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }

}
