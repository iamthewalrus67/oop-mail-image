package mail_sender;

import lombok.Getter;
import lombok.Setter;

public class Client {
    private static int idCounter = 1;
    @Getter
    private int id = 0;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Sex sex;
    @Getter @Setter
    private String email;

    public Client() {
        id = idCounter++;
    }

    public Client(String name, int age, Sex sex, String email) {
        this.id = idCounter++;
        setName(name);
        setAge(age);
        setSex(sex);
        setEmail(email);
    }
}
