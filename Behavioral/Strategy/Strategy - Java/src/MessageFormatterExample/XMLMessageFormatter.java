package MessageFormatterExample;

public class XMLMessageFormatter implements MessageFormatterStrategy {
    @Override
    public String formatMessage(String message) {
        return "XML format: " + message;
    }

    @Override
    public String getType() {
        return "XML";
    }
}
