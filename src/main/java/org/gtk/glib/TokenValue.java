package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A union holding the value of the token.
 */
public class TokenValue extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTokenValue";
    
    private static GroupLayout memoryLayout = MemoryLayout.unionLayout(
        Interop.valueLayout.ADDRESS.withName("v_symbol"),
        Interop.valueLayout.ADDRESS.withName("v_identifier"),
        ValueLayout.JAVA_LONG.withName("v_binary"),
        ValueLayout.JAVA_LONG.withName("v_octal"),
        ValueLayout.JAVA_LONG.withName("v_int"),
        ValueLayout.JAVA_LONG.withName("v_int64"),
        ValueLayout.JAVA_DOUBLE.withName("v_float"),
        ValueLayout.JAVA_LONG.withName("v_hex"),
        Interop.valueLayout.ADDRESS.withName("v_string"),
        Interop.valueLayout.ADDRESS.withName("v_comment"),
        ValueLayout.JAVA_BYTE.withName("v_char"),
        MemoryLayout.paddingLayout(24),
        ValueLayout.JAVA_INT.withName("v_error")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a TokenValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TokenValue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}

