package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of message being displayed in a {@link MessageDialog}.
 */
public enum MessageType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Informational message
     */
    INFO(0),
    /**
     * Non-fatal warning message
     */
    WARNING(1),
    /**
     * Question requiring a choice
     */
    QUESTION(2),
    /**
     * Fatal error message
     */
    ERROR(3),
    /**
     * None of the above
     */
    OTHER(4);
    
    private static final java.lang.String C_TYPE_NAME = "GtkMessageType";
    
    private final int value;
    MessageType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MessageType of(int value) {
        return switch (value) {
            case 0 -> INFO;
            case 1 -> WARNING;
            case 2 -> QUESTION;
            case 3 -> ERROR;
            case 4 -> OTHER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
