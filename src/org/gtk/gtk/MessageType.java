package org.gtk.gtk;

/**
 * The type of message being displayed in a {@link MessageDialog}.
 */
public class MessageType {

    /**
     * Informational message
     */
    public static final MessageType INFO = new MessageType(0);
    
    /**
     * Non-fatal warning message
     */
    public static final MessageType WARNING = new MessageType(1);
    
    /**
     * Question requiring a choice
     */
    public static final MessageType QUESTION = new MessageType(2);
    
    /**
     * Fatal error message
     */
    public static final MessageType ERROR = new MessageType(3);
    
    /**
     * None of the above
     */
    public static final MessageType OTHER = new MessageType(4);
    
    private int value;
    
    public MessageType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MessageType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
