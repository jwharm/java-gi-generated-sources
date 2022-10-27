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
        ValueLayout.JAVA_INT.withName("v_error")
    ).withName("GTokenValue");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TokenValue(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}

