package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used internally in the {@link Hook} implementation.
 */
public class HookFlagMask extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
}
