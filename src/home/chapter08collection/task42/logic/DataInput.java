package home.chapter08collection.task42.logic;

import home.chapter08collection.task42.entity.Data;

import java.util.Scanner;

public class DataInput {

    public static Data inputData () {

        Scanner sc = new Scanner (System.in);

        return new Data(sc.nextLine());
    }
}
