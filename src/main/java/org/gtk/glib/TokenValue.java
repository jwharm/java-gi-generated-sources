package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A union holding the value of the token.
 */
public class TokenValue extends ObjectBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTokenValue";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.unionLayout(
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
    }
    
    /**
     * Create a TokenValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TokenValue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TokenValue> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TokenValue(input, ownership);
}

