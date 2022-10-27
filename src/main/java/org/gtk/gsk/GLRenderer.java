package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLRenderer extends org.gtk.gsk.Renderer {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GLRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLRenderer */
    public static GLRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new GLRenderer(gobject.refcounted());
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
