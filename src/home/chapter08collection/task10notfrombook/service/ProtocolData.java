package home.chapter08collection.task10notfrombook.service;

public enum ProtocolData {
    BUYER (1),
    PRODUCT(2),
    AMOUNT(3),
    FIELD_COUNT(4);

    private int value;

    ProtocolData(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
