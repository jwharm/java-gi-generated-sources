package org.gstreamer.gl.x11;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * the contents of a {@link GLDisplayX11} are private and should only be accessed
 * through the provided API
 */
public class GLDisplayX11 extends org.gstreamer.gl.GLDisplay {
    
    static {
        GstGLX11.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayX11";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("display"),
        Interop.valueLayout.ADDRESS.withName("xcb_connection"),
        Interop.valueLayout.C_INT.withName("foreign_display"),
        MemoryLayout.paddingLayout(224),
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
     * Create a GLDisplayX11 proxy instance for the provided memory address.
     * <p>
     * Because GLDisplayX11 is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLDisplayX11(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLDisplayX11 if its GType is a (or inherits from) "GstGLDisplayX11".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLDisplayX11} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLDisplayX11", a ClassCastException will be thrown.
     */
    public static GLDisplayX11 castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLDisplayX11.getType())) {
            return new GLDisplayX11(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLDisplayX11");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String name) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_x11_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link GLDisplayX11} from the x11 display name.  See {@code XOpenDisplay}()
     * for details on what is a valid name.
     * @param name a display name
     */
    public GLDisplayX11(@Nullable java.lang.String name) {
        super(constructNew(name), Ownership.FULL);
    }
    
    private static Addressable constructNewWithDisplay(@NotNull java.lang.foreign.MemoryAddress display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_x11_new_with_display.invokeExact(
                    (Addressable) display);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new display connection from a X11 Display.
     * @param display an existing, x11 display
     * @return a new {@link GLDisplayX11}
     */
    public static GLDisplayX11 newWithDisplay(@NotNull java.lang.foreign.MemoryAddress display) {
        return new GLDisplayX11(constructNewWithDisplay(display), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_x11_get_type.invokeExact();
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
         * A {@link GLDisplayX11.Build} object constructs a {@link GLDisplayX11} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLDisplayX11} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayX11} using {@link GLDisplayX11#castFrom}.
         * @return A new instance of {@code GLDisplayX11} with the properties 
         *         that were set in the Build object.
         */
        public GLDisplayX11 construct() {
            return GLDisplayX11.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLDisplayX11.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_display_x11_new = Interop.downcallHandle(
            "gst_gl_display_x11_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_x11_new_with_display = Interop.downcallHandle(
            "gst_gl_display_x11_new_with_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_x11_get_type = Interop.downcallHandle(
            "gst_gl_display_x11_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
