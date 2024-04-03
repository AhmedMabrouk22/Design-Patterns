package MessageFormatterExample;

public interface MessageFormatterStrategy {
    String formatMessage(String message);

    String getType();
}
