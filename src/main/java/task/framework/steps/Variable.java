package task.framework.steps;

public class Variable {

    private static String expectedProductName;
    private static String expectedProductPrice;

    private Variable() {}

    public static String getExpectedProductName() {
        return expectedProductName;
    }

    public static void setExpectedProductName(String expectedProductName) {
        Variable.expectedProductName = expectedProductName;
    }

    public static String getExpectedProductPrice() {
        return expectedProductPrice;
    }

    public static void setExpectedProductPrice(String expectedProductPrice) {
        Variable.expectedProductPrice = expectedProductPrice;
    }
}
