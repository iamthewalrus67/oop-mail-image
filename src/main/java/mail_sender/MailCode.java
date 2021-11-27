package mail_sender;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            System.out.println(stringBuilder);
            stringBuilder.append(scanner.nextLine());
        }
        scanner.close();

        return stringBuilder.toString();
    }
}
