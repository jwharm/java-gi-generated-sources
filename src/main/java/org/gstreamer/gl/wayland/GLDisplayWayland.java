package org.gstreamer.gl.wayland;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * the contents of a {@link GLDisplayWayland} are private and should only be accessed
 * through the provided API
 */
public class GLDisplayWayland extends org.gstreamer.gl.GLDisplay {
    
    static {
        GstGLWayland.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayWayland";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("display"),
            Interop.valueLayout.ADDRESS.withName("registry"),
            Interop.valueLayout.ADDRESS.withName("compositor"),
            Interop.valueLayout.ADDRESS.withName("subcompositor"),
            Interop.valueLayout.ADDRESS.withName("shell"),
            Interop.valueLayout.C_INT.withName("foreign_display"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLDisplayWayland proxy instance for the provided memory address.
     * <p>
     * Because GLDisplayWayland is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLDisplayWayland(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLDisplayWayland> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayWayland(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_wayland_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link GLDisplayWayland} from the wayland display name.  See {@code wl_display_connect}()
     * for details on what is a valid name.
     * @param name a display name
     */
    public GLDisplayWayland(@Nullable java.lang.String name) {
        super(constructNew(name), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_wayland_new_with_display.invokeExact(
                    (Addressable) (display == null ? MemoryAddress.NULL : (Addressable) display));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new display connection from a wl_display Display.
     * @param display an existing, wayland display
     * @return a new {@link GLDisplayWayland}
     */
    public static GLDisplayWayland newWithDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        var RESULT = constructNewWithDisplay(display);
        return (org.gstreamer.gl.wayland.GLDisplayWayland) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.wayland.GLDisplayWayland.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_wayland_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLDisplayWayland.Builder} object constructs a {@link GLDisplayWayland} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLDisplayWayland.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gl.GLDisplay.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLDisplayWayland} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayWayland}.
         * @return A new instance of {@code GLDisplayWayland} with the properties 
         *         that were set in the Builder object.
         */
        public GLDisplayWayland build() {
            return (GLDisplayWayland) org.gtk.gobject.GObject.newWithProperties(
                GLDisplayWayland.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_display_wayland_new = Interop.downcallHandle(
            "gst_gl_display_wayland_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_wayland_new_with_display = Interop.downcallHandle(
            "gst_gl_display_wayland_new_with_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_wayland_get_type = Interop.downcallHandle(
            "gst_gl_display_wayland_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
