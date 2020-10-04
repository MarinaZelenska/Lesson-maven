import utils.PropertiesReaderCalssLoader;

public class PropertiesUsage {
    public static void main(String[] args) {
        String timeoutValue = PropertiesReaderCalssLoader.getInstance().getValueFromProperty("defaultTimeout");
        String baseUrlValue = PropertiesReaderCalssLoader.getInstance().getValueFromProperty("baseUrl");

        System.out.println("timeoutValue" + timeoutValue);
        System.out.println("baseUrlValue" + baseUrlValue);
    }
}
