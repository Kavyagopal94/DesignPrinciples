interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}

class NotificationService {
    private final Notifier notifier;

    // Dependency Injection through constructor
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.send(message);
    }
}

//SOC
public class DIP {
    public static void main(String[] args) {
        //assing reference variable of Notifier to Email and SMS Notifier classes
        Notifier emailNotifier = new EmailNotifier();
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.notifyUser("Your email notification!");

        Notifier smsNotifier = new SMSNotifier();
        NotificationService smsService = new NotificationService(smsNotifier);
        smsService.notifyUser("Your SMS notification!");
    }
}
