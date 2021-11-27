package mail_sender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter @AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getText() {
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));
        templates.put("%SEX%", client.getSex().toString());
        templates.put("%EMAIL%", client.getEmail());
        String text = mailCode.generateText();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }

        return text;
    }
}
