package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error enumeration for {@code GdkVulkanContext}.
 */
public class VulkanError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Vulkan is not supported on this backend or has not been
     *   compiled in.
     */
    public static final VulkanError UNSUPPORTED = new VulkanError(0);
    
    /**
     * Vulkan support is not available on this Surface
     */
    public static final VulkanError NOT_AVAILABLE = new VulkanError(1);
    
    public VulkanError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_vulkan_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_vulkan_error_quark = Interop.downcallHandle(
            "gdk_vulkan_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
