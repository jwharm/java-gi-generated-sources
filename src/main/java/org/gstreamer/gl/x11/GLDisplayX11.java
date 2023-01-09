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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("display"),
            Interop.valueLayout.ADDRESS.withName("xcb_connection"),
            Interop.valueLayout.C_INT.withName("foreign_display"),
            MemoryLayout.paddingLayout(224),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLDisplayX11 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLDisplayX11(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLDisplayX11> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayX11(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_x11_new.invokeExact((Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new {@link GLDisplayX11} from the x11 display name.  See {@code XOpenDisplay}()
     * for details on what is a valid name.
     * @param name a display name
     */
    public GLDisplayX11(@Nullable java.lang.String name) {
        super(constructNew(name));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithDisplay(java.lang.foreign.MemoryAddress display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_x11_new_with_display.invokeExact((Addressable) display);
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
    public static GLDisplayX11 newWithDisplay(java.lang.foreign.MemoryAddress display) {
        var RESULT = constructNewWithDisplay(display);
        var OBJECT = (org.gstreamer.gl.x11.GLDisplayX11) Interop.register(RESULT, org.gstreamer.gl.x11.GLDisplayX11.fromAddress).marshal(RESULT, null);
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
            RESULT = (long) DowncallHandles.gst_gl_display_x11_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLDisplayX11.Builder} object constructs a {@link GLDisplayX11} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLDisplayX11.Builder#build()}. 
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
         * Finish building the {@link GLDisplayX11} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayX11}.
         * @return A new instance of {@code GLDisplayX11} with the properties 
         *         that were set in the Builder object.
         */
        public GLDisplayX11 build() {
            return (GLDisplayX11) org.gtk.gobject.GObject.newWithProperties(
                GLDisplayX11.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_display_x11_get_type != null;
    }
}
