package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * the contents of a {@link GLDisplayEGLDevice} are private and should only be accessed
 * through the provided API
 * @version 1.18
 */
public class GLDisplayEGLDevice extends org.gstreamer.gl.GLDisplay {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayEGLDevice";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLDisplayEGLDevice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLDisplayEGLDevice(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLDisplayEGLDevice> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayEGLDevice(input);
    
    private static MemoryAddress constructNew(int deviceIndex) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_device_new.invokeExact(deviceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link GLDisplayEGLDevice} with an EGLDevice supported device
     * @param deviceIndex the index of device to use
     */
    public GLDisplayEGLDevice(int deviceIndex) {
        super(constructNew(deviceIndex));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithEglDevice(@Nullable java.lang.foreign.MemoryAddress device) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_device_new_with_egl_device.invokeExact((Addressable) (device == null ? MemoryAddress.NULL : (Addressable) device));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link GLDisplayEGLDevice} with EGLDeviceEXT .
     * The {@code device} must be created using EGLDevice enumeration.
     * @param device an existing EGLDeviceEXT
     * @return a new {@link GLDisplayEGLDevice}
     */
    public static GLDisplayEGLDevice newWithEglDevice(@Nullable java.lang.foreign.MemoryAddress device) {
        var RESULT = constructNewWithEglDevice(device);
        var OBJECT = (org.gstreamer.gl.egl.GLDisplayEGLDevice) Interop.register(RESULT, org.gstreamer.gl.egl.GLDisplayEGLDevice.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_egl_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLDisplayEGLDevice.Builder} object constructs a {@link GLDisplayEGLDevice} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLDisplayEGLDevice.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gl.GLDisplay.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLDisplayEGLDevice} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayEGLDevice}.
         * @return A new instance of {@code GLDisplayEGLDevice} with the properties 
         *         that were set in the Builder object.
         */
        public GLDisplayEGLDevice build() {
            return (GLDisplayEGLDevice) org.gtk.gobject.GObject.newWithProperties(
                GLDisplayEGLDevice.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_display_egl_device_new = Interop.downcallHandle(
                "gst_gl_display_egl_device_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_display_egl_device_new_with_egl_device = Interop.downcallHandle(
                "gst_gl_display_egl_device_new_with_egl_device",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_display_egl_device_get_type = Interop.downcallHandle(
                "gst_gl_display_egl_device_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_display_egl_device_get_type != null;
    }
}
