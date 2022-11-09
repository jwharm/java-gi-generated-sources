package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The match types specify what g_signal_handlers_block_matched(),
 * g_signal_handlers_unblock_matched() and g_signal_handlers_disconnect_matched()
 * match signals by.
 */
public class SignalMatchType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GSignalMatchType";
    
    /**
     * The signal id must be equal.
     */
    public static final SignalMatchType ID = new SignalMatchType(1);
    
    /**
     * The signal detail must be equal.
     */
    public static final SignalMatchType DETAIL = new SignalMatchType(2);
    
    /**
     * The closure must be the same.
     */
    public static final SignalMatchType CLOSURE = new SignalMatchType(4);
    
    /**
     * The C closure callback must be the same.
     */
    public static final SignalMatchType FUNC = new SignalMatchType(8);
    
    /**
     * The closure data must be the same.
     */
    public static final SignalMatchType DATA = new SignalMatchType(16);
    
    /**
     * Only unblocked signals may be matched.
     */
    public static final SignalMatchType UNBLOCKED = new SignalMatchType(32);
    
    public SignalMatchType(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SignalMatchType combined(SignalMatchType mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SignalMatchType combined(SignalMatchType mask, SignalMatchType... masks) {
        for (SignalMatchType arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
