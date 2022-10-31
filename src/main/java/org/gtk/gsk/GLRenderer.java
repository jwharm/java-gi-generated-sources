package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLRenderer extends org.gtk.gsk.Renderer {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskGLRenderer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public GLRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to GLRenderer if its GType is a (or inherits from) "GskGLRenderer".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GLRenderer" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskGLRenderer", a ClassCastException will be thrown.
     */
    public static GLRenderer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskGLRenderer"))) {
            return new GLRenderer(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskGLRenderer");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_gl_renderer_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GskRenderer} using the new OpenGL renderer.
     */
    public GLRenderer() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_gl_renderer_new = Interop.downcallHandle(
            "gsk_gl_renderer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
