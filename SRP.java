// user class with only user details methods
class User {
    String name;
    String email;

    public User(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public void showUser()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }
}

// email service class to send email
class EmailService {
    public void sendEmail(User user, String message)
    {
        System.out.println("Email sent to " + user.email
                + " with message: " + message);
    }
}

// file service class to save to file
class FileService {
    public void saveToFile(User user)
    {
        System.out.println("Saving user to file...");
    }
}

public class SRP{
    public static void main(String[] args) {

        User user = new User("Thanu", "thanu@gmail.com");
        user.showUser();

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Hello Thanu");

        FileService fileService = new FileService();
        fileService.saveToFile(user);
    }
}
