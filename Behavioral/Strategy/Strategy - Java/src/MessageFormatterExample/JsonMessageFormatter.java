package MessageFormatterExample;

public class JsonMessageFormatter implements MessageFormatterStrategy {
    @Override
    public String formatMessage(String message) {
        return "Json format: " + message;
    }

    @Override
    public String getType() {
        return "Json";
    }
}
