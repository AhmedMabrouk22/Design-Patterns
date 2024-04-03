package MessageFormatterExample;

public class MessageFormatter {
    private final MessageFormatterStrategy messageFormatterStrategy;
    private String message;

    public MessageFormatter(String message, MessageFormatterStrategy messageFormatterStrategy) {
        this.message = message;
        this.messageFormatterStrategy = messageFormatterStrategy;
    }

    public String format() {
        return messageFormatterStrategy.formatMessage(this.message);
    }

    public String getType() {
        return messageFormatterStrategy.getType();
    }

}
