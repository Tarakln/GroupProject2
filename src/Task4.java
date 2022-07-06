public class Task4 {
    /*
    Create Registration Class in which you would have variables as email, userName and password
    that have an access scope only within its own class. After creating an object of the class user should be able to
    call methods and in each method separately pass values to set users email, username and password.
    Requirements:
    --Valid email consider to be only yahoo
    --Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also, valid password cannot contain userName.  */
    public static void main(String[] args) {
        Registration account = new Registration();
        account.setEmail("tara@yahoo.com");
        account.setUserName("TaraAccount");
        account.setPassword("123456789");
    }
}
class Registration {
    private String email;
    private String userName;
    private String password;

    void setEmail(String email) {
        if (email.contains("@yahoo.com")) {
            this.email = email;
            System.out.println("Email is correct");
        } else {
            System.out.println("Please enter yahoo email only");
        }
    }

    void setUserName(String userName) {
        if (!userName.isEmpty()) {
            if (userName.length() > 6) {
                this.userName = userName;
                System.out.println("UserName accepted successfully");
            }
        } else {
            System.out.println("Please provide a username longer than 6 characters");
        }
    }

    void setPassword(String password) {
        if (!password.isEmpty()) {
            if (password.length() > 6) {
                if (!password.contains(userName)) {
                    this.password = password;
                    System.out.println("Password accepted successfully");
                }
            }
        } else {
            System.out.println("Please provide a password longer than 6 characters and it cannot contain username");
        }
    }
}