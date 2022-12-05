package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error enumeration for {@code GdkVulkanContext}.
 */
public enum VulkanError implements io.github.jwharm.javagi.Enumeration {
    /**
     * Vulkan is not supported on this backend or has not been
     *   compiled in.
     */
    UNSUPPORTED(0),
    /**
     * Vulkan support is not available on this Surface
     */
    NOT_AVAILABLE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GdkVulkanError";
    
    private final int value;
    VulkanError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VulkanError of(int value) {
        return switch (value) {
            case 0 -> UNSUPPORTED;
            case 1 -> NOT_AVAILABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
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
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
