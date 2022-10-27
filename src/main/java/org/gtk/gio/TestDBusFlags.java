package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to define future {@link TestDBus} behaviour.
 * @version 2.34
 */
public class TestDBusFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags.
     */
    public static final TestDBusFlags NONE = new TestDBusFlags(0);
    
    public TestDBusFlags(int value) {
        super(value);
    }
}
