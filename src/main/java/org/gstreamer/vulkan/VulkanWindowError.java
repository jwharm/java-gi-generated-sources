package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanWindowError implements io.github.jwharm.javagi.Enumeration {
    /**
     * failed
     */
    FAILED(0),
    /**
     * old libraries
     */
    OLD_LIBS(1),
    /**
     * resource unavailable
     */
    RESOURCE_UNAVAILABLE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanWindowError";
    
    private final int value;
    VulkanWindowError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VulkanWindowError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> OLD_LIBS;
            case 2 -> RESOURCE_UNAVAILABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_window_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_window_error_quark = Interop.downcallHandle(
            "gst_vulkan_window_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
