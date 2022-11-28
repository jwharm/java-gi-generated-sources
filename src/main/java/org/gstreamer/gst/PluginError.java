package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The plugin loading errors
 */
public class PluginError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginError";
    
    /**
     * The plugin could not be loaded
     */
    public static final PluginError MODULE = new PluginError(0);
    
    /**
     * The plugin has unresolved dependencies
     */
    public static final PluginError DEPENDENCIES = new PluginError(1);
    
    /**
     * The plugin has already be loaded from a different file
     */
    public static final PluginError NAME_MISMATCH = new PluginError(2);
    
    public PluginError(int value) {
        super(value);
    }
    
    /**
     * Get the error quark.
     * @return The error quark used in GError messages
     */
    public static @NotNull org.gtk.glib.Quark quark() {
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
