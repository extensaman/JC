package home.chapter15reflectionandannotation.task71;

public class HelloWorldPrinter implements HelloWorldPrinting {
    @Override
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }
}
