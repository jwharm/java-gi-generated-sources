package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of message being displayed in a {@link MessageDialog}.
 */
public class MessageType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public MessageType(int value) {
        super(value);
    }
}
