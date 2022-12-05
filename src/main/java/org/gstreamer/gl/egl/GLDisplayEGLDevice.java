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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a GLDisplayEGLDevice proxy instance for the provided memory address.
     * <p>
     * Because GLDisplayEGLDevice is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLDisplayEGLDevice(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLDisplayEGLDevice if its GType is a (or inherits from) "GstGLDisplayEGLDevice".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLDisplayEGLDevice} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLDisplayEGLDevice", a ClassCastException will be thrown.
     */
    public static GLDisplayEGLDevice castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLDisplayEGLDevice.getType())) {
            return new GLDisplayEGLDevice(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLDisplayEGLDevice");
        }
    }
    
    private static Addressable constructNew(int deviceIndex) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_device_new.invokeExact(
                    deviceIndex);
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
        super(constructNew(deviceIndex), Ownership.FULL);
    }
    
    private static Addressable constructNewWithEglDevice(@Nullable java.lang.foreign.MemoryAddress device) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_device_new_with_egl_device.invokeExact(
                    (Addressable) (device == null ? MemoryAddress.NULL : (Addressable) device));
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
        return new GLDisplayEGLDevice(constructNewWithEglDevice(device), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_egl_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gl.GLDisplay.Build {
        
         /**
         * A {@link GLDisplayEGLDevice.Build} object constructs a {@link GLDisplayEGLDevice} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLDisplayEGLDevice} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayEGLDevice} using {@link GLDisplayEGLDevice#castFrom}.
         * @return A new instance of {@code GLDisplayEGLDevice} with the properties 
         *         that were set in the Build object.
         */
        public GLDisplayEGLDevice construct() {
            return GLDisplayEGLDevice.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLDisplayEGLDevice.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
