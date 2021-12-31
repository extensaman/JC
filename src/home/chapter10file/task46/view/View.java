package home.chapter10file.task46.view;

import java.util.Scanner;

public class View {

    public static String inputLine () {

        Scanner sc = null;

        try {
            sc = new Scanner (System.in);
            return sc.nextLine();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
