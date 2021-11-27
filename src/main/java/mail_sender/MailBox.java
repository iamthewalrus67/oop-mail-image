package mail_sender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<MailInfo> infos;

    public MailBox() {
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo info: infos) {
            MailSender.sendMail(info);
        }
    }
}
