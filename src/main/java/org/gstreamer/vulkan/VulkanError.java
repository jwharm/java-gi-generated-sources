package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanError implements io.github.jwharm.javagi.Enumeration {
    /**
     * undetermined error
     */
    FAILED(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanError";
    
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
            case 0 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * if {@code result} indicates an error condition, fills out {@link org.gtk.glib.Error} with details of
     * the error
     * @param result a VkResult
     * @param error a {@link org.gtk.glib.Error} to fill
     * @param format the printf-like format to write into the {@link org.gtk.glib.Error}
     * @param varargs arguments for {@code format}
     * @return {@code result} for easy chaining
     */
    public static org.vulkan.Result toGError(org.vulkan.Result result, @Nullable Out<org.gtk.glib.Error> error, java.lang.String format, java.lang.Object... varargs) {
        MemorySegment errorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_error_to_g_error.invokeExact(
                    result.handle(),
                    (Addressable) errorPOINTER.address(),
                    Marshal.stringToAddress.marshal(format, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        error.set(org.gtk.glib.Error.fromAddress.marshal(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.vulkan.Result.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_error_quark = Interop.downcallHandle(
            "gst_vulkan_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_error_to_g_error = Interop.downcallHandle(
            "gst_vulkan_error_to_g_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
    }
}
