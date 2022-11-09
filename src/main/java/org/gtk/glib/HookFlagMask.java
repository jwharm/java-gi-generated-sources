package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used internally in the {@link Hook} implementation.
 */
public class HookFlagMask extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GHookFlagMask";
    
    /**
     * set if the hook has not been destroyed
     */
    public static final HookFlagMask ACTIVE = new HookFlagMask(1);
    
    /**
     * set if the hook is currently being run
     */
    public static final HookFlagMask IN_CALL = new HookFlagMask(2);
    
    /**
     * A mask covering all bits reserved for
     *   hook flags; see {@code G_HOOK_FLAG_USER_SHIFT}
     */
    public static final HookFlagMask MASK = new HookFlagMask(15);
    
    public HookFlagMask(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public HookFlagMask combined(HookFlagMask mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static HookFlagMask combined(HookFlagMask mask, HookFlagMask... masks) {
        for (HookFlagMask arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
