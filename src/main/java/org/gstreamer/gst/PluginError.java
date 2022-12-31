package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The plugin loading errors
 */
public enum PluginError implements io.github.jwharm.javagi.Enumeration {
    /**
     * The plugin could not be loaded
     */
    MODULE(0),
    /**
     * The plugin has unresolved dependencies
     */
    DEPENDENCIES(1),
    /**
     * The plugin has already be loaded from a different file
     */
    NAME_MISMATCH(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginError";
    
    private final int value;
    PluginError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PluginError of(int value) {
        return switch (value) {
            case 0 -> MODULE;
            case 1 -> DEPENDENCIES;
            case 2 -> NAME_MISMATCH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Get the error quark.
     * @return The error quark used in GError messages
     */
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_plugin_error_quark = Interop.downcallHandle(
            "gst_plugin_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
