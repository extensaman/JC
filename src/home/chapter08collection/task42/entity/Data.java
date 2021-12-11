package home.chapter08collection.task42.entity;

public class Data {

    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                '}';
    }
}
