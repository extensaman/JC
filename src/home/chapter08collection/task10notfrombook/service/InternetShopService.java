package home.chapter08collection.task10notfrombook.service;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InternetShopService implements InternetShopServiceBehavior{

    public static final String ROW_SPLITTER_REGEX = "\\n";
    public static final String ELEMENT_SPLITTER_REGEX = "\\s";


    @Override
    public Map<String, Map<String, Integer>> recognizeInputData(String inputData) {

        Map<String, Map<String, Integer>> generalMap = new TreeMap<>();

        String[] rowData = inputData.split(ROW_SPLITTER_REGEX);

        for(String str : rowData) {

            String[] elementData = str.split(ELEMENT_SPLITTER_REGEX);
            if (elementData.length != 4) {
                throw new IllegalArgumentException("Количество элементов в строке " + elementData +
                        " не соответствует протоколу (!= 4), а равно " + elementData.length);
            }

            Map<String, Integer> productMap = generalMap.get(elementData[ProtocolData.BUYER.getValue()]);
            if (productMap == null) {
                Map<String, Integer> initialProductMap = new TreeMap<>();
                try {
                    initialProductMap.put(elementData[ProtocolData.PRODUCT.getValue()], Integer.valueOf(
                            elementData[ProtocolData.AMOUNT.getValue()]));
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
                generalMap.put(elementData[ProtocolData.BUYER.getValue()], initialProductMap);
            } else {
                Integer productAmount = productMap.get(elementData[ProtocolData.PRODUCT.getValue()]);

                if (productAmount == null) {
                    try {
                        productMap.put(elementData[ProtocolData.PRODUCT.getValue()],
                                Integer.valueOf(
                                        elementData[ProtocolData.AMOUNT.getValue()]));
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    try {
                        productMap.put(elementData[ProtocolData.PRODUCT.getValue()],
                                Integer.valueOf(elementData[ProtocolData.AMOUNT.getValue()]) +
                                        productAmount);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
        return generalMap;
    }

    @Override
    public void printInternetShopData(Map<String, Map<String, Integer>> map) {

        Set<Map.Entry<String, Map<String, Integer>>> generalSet = map.entrySet();

        for (Map.Entry<String, Map<String, Integer>> everyBuyer : generalSet) {

            System.out.println("Покупатель: " + everyBuyer.getKey());

            Map<String, Integer> productInfo = everyBuyer.getValue();

            for (Map.Entry<String, Integer> entry : productInfo.entrySet()) {

                System.out.println(" Продукт: " + entry.getKey() +
                        " Количество " + entry.getValue());
            }
        }

    }
}
