package MessageFormatterExample;

public class PlainTextMessageFormatter implements MessageFormatterStrategy {

    @Override
    public String formatMessage(String message) {
        return "Plain text format: " + message;
    }

    @Override
    public String getType() {
        return "Plain Text";
    }
}
