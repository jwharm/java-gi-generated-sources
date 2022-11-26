package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A union holding the value of the token.
 */
public class TokenValue extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTokenValue";
    
    private static final GroupLayout memoryLayout = MemoryLayout.unionLayout(
        Interop.valueLayout.ADDRESS.withName("v_symbol"),
        Interop.valueLayout.ADDRESS.withName("v_identifier"),
        Interop.valueLayout.C_LONG.withName("v_binary"),
        Interop.valueLayout.C_LONG.withName("v_octal"),
        Interop.valueLayout.C_LONG.withName("v_int"),
        Interop.valueLayout.C_LONG.withName("v_int64"),
        Interop.valueLayout.C_DOUBLE.withName("v_float"),
        Interop.valueLayout.C_LONG.withName("v_hex"),
        Interop.valueLayout.ADDRESS.withName("v_string"),
        Interop.valueLayout.ADDRESS.withName("v_comment"),
        Interop.valueLayout.C_BYTE.withName("v_char"),
        Interop.valueLayout.C_INT.withName("v_error")
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

