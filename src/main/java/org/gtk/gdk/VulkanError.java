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
    
    /**
     * Create a new VulkanError for the provided value
     * @param numeric value the enum value
     */
    VulkanError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new VulkanError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VulkanError of(int value) {
        return switch (value) {
            case 0 -> UNSUPPORTED;
            case 1 -> NOT_AVAILABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
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
