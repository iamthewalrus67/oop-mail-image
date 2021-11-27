package mail_sender;

import java.io.FileNotFoundException;

public class MailSender {
    public static void sendMail(MailInfo mailInfo) {
        System.out.println(mailInfo.getText());
    }
}
