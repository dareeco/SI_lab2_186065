import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) { //node A
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        if (user!=null) {  //node B
            if (user.getUsername()!=null && user.getPassword()!=null) { //node c
                String password = user.getPassword();   //node D
                String passwordLower = password.toLowerCase();
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //node E
                    boolean digit = false, upper = false, special = false; //Node F
                    for (int i=0;i<password.length();i++) { //node G
                        if (Character.isDigit(password.charAt(i))) //node H
                            digit = true;
                        if (Character.isUpperCase(password.charAt(i))) //node I
                            upper = true;
                        if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //node J
                            special = true;
                    }	//node K
                    if (digit && upper && special) //node L
                        return true; //Node n
                }
            }
        }
        return false; //Node m
    }
}

