package home.chapter05strings.task31patterncommand.view;

import java.io.InputStream;
import java.util.Scanner;

public class View {

    private Scanner sc;

    public View(InputStream inputStream) {
        initializeIn(inputStream);
    }

    public void initializeIn(InputStream inputStream) {
        sc = new Scanner(inputStream);
    }
    public void outMessage(String message) {
        System.out.println(message);
    }

    public int inInteger() {

        while (!sc.hasNextInt()) {
            sc.nextLine();
        }

        return sc.nextInt();
    }

    public String inText () {

        sc.nextLine();
        return sc.nextLine();
    }

}
