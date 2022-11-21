package project.system_bank;

public class ClassLogin {

    private String login;

    private String senha;

    public ClassLogin(String login, String password) {
        this.login = login;
        this.senha = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return senha;
    }

    public void setPassword(String password) {
        this.senha = password;
    }

    @Override
    public String toString() {
        return "Login_Home{" +
                "login='" + login + '\'' +
                ", password='" + senha + '\'' +
                '}';
    }
}