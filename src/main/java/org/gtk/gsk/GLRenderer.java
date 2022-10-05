package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class GLRenderer extends Renderer {

    public GLRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLRenderer */
    public static GLRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new GLRenderer(gobject.refcounted());
    }
    
    static final MethodHandle gsk_gl_renderer_new = Interop.downcallHandle(
        "gsk_gl_renderer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_gl_renderer_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GskRenderer} using the new OpenGL renderer.
     */
    public GLRenderer() {
        super(constructNew());
    }
    
}
