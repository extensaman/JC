package home.chapter08collection.task39.misc;

public enum FIO {
    FIO_01 ("Иванов Иван Иванович"),
    FIO_02 ("Петров Петр Петрович"),
    FIO_03 ("Сидоров Сидр Сидорович"),
    FIO_04 ("Шауро Виталий Иванович"),
    FIO_05 ("Македонский Александр Алексеевич"),
    FIO_06 ("Гонопольский Константин Федорович");

    private String fio;

    FIO(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
}
