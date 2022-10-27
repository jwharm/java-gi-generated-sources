package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkCairoContext} is an object representing the platform-specific
 * draw context.
 * <p>
 * {@code GdkCairoContext}s are created for a surface using
 * {@link Surface#createCairoContext}, and the context
 * can then be used to draw on that surface.
 */
public class CairoContext extends org.gtk.gdk.DrawContext {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CairoContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CairoContext */
    public static CairoContext castFrom(org.gtk.gobject.Object gobject) {
        return new CairoContext(gobject.refcounted());
    }
    
    /**
     * Retrieves a Cairo context to be used to draw on the {@code GdkSurface}
     * of {@code context}.
     * <p>
     * A call to {@link DrawContext#beginFrame} with this
     * {@code context} must have been done or this function will return {@code null}.
     * <p>
     * The returned context is guaranteed to be valid until
     * {@link DrawContext#endFrame} is called.
     * @return a Cairo context
     *   to draw on `GdkSurface
     */
    public @Nullable org.cairographics.Context cairoCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cairo_context_cairo_create.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Context(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_cairo_context_cairo_create = Interop.downcallHandle(
            "gdk_cairo_context_cairo_create",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
