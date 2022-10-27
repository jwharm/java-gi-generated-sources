package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkKeymapKey} is a hardware key that can be mapped to a keyval.
 */
public class KeymapKey extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("keycode"),
        ValueLayout.JAVA_INT.withName("group"),
        ValueLayout.JAVA_INT.withName("level")
    ).withName("GdkKeymapKey");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public KeymapKey(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
