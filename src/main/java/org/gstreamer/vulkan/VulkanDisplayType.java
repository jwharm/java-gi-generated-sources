package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDisplayType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDisplayType";
    
    /**
     * no display
     */
    public static final VulkanDisplayType NONE = new VulkanDisplayType(0);
    
    /**
     * XCB display
     */
    public static final VulkanDisplayType XCB = new VulkanDisplayType(1);
    
    /**
     * wayland display
     */
    public static final VulkanDisplayType WAYLAND = new VulkanDisplayType(2);
    
    /**
     * cocoa display for macOS
     */
    public static final VulkanDisplayType COCOA = new VulkanDisplayType(4);
    
    /**
     * ios display
     */
    public static final VulkanDisplayType IOS = new VulkanDisplayType(8);
    
    /**
     * win32 display
     */
    public static final VulkanDisplayType WIN32 = new VulkanDisplayType(16);
    
    public static final VulkanDisplayType ANDROID = new VulkanDisplayType(32);
    
    /**
     * any display type
     */
    public static final VulkanDisplayType ANY = new VulkanDisplayType(-1);
    
    public VulkanDisplayType(int value) {
        super(value);
    }
    
    public static @NotNull java.lang.String toExtensionString(@NotNull org.gstreamer.vulkan.VulkanDisplayType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_type_to_extension_string.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VulkanDisplayType or(VulkanDisplayType mask) {
        return new VulkanDisplayType(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VulkanDisplayType combined(VulkanDisplayType mask, VulkanDisplayType... masks) {
        int value = mask.getValue();        for (VulkanDisplayType arg : masks) {
            value |= arg.getValue();
        }
        return new VulkanDisplayType(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_display_type_to_extension_string = Interop.downcallHandle(
            "gst_vulkan_display_type_to_extension_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
