package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    MailInfo mailInfo;
    Client client;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client("Arman", 20, Sex.MALE, "arman@ucu.edu.ua");
        mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
    }

    @Test
    void getText() {
        assertEquals("Arman is wishing you a happy birthday!", mailInfo.getText());
    }
}