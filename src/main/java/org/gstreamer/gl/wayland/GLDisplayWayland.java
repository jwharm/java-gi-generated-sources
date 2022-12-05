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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a GLDisplayWayland proxy instance for the provided memory address.
     * <p>
     * Because GLDisplayWayland is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLDisplayWayland(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLDisplayWayland if its GType is a (or inherits from) "GstGLDisplayWayland".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLDisplayWayland} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLDisplayWayland", a ClassCastException will be thrown.
     */
    public static GLDisplayWayland castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLDisplayWayland.getType())) {
            return new GLDisplayWayland(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLDisplayWayland");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String name) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_wayland_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
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
    
    private static Addressable constructNewWithDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        Addressable RESULT;
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
        return new GLDisplayWayland(constructNewWithDisplay(display), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_wayland_get_type.invokeExact();
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
         * A {@link GLDisplayWayland.Build} object constructs a {@link GLDisplayWayland} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLDisplayWayland} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayWayland} using {@link GLDisplayWayland#castFrom}.
         * @return A new instance of {@code GLDisplayWayland} with the properties 
         *         that were set in the Build object.
         */
        public GLDisplayWayland construct() {
            return GLDisplayWayland.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLDisplayWayland.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
