package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * List of flags that can be passed to action activation.
 * <p>
 * More flags may be added in the future.
 */
public class ShortcutActionFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The action is the only
     *   action that can be activated. If this flag is not set,
     *   a future activation may select a different action.
     */
    public static final ShortcutActionFlags EXCLUSIVE = new ShortcutActionFlags(1);
    
    public ShortcutActionFlags(int value) {
        super(value);
    }
}
