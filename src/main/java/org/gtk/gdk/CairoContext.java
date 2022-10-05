package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkCairoContext} is an object representing the platform-specific
 * draw context.
 * <p>
 * {@code GdkCairoContext}s are created for a surface using
 * {@link Surface#createCairoContext}, and the context
 * can then be used to draw on that surface.
 */
public class CairoContext extends DrawContext {

    public CairoContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CairoContext */
    public static CairoContext castFrom(org.gtk.gobject.Object gobject) {
        return new CairoContext(gobject.refcounted());
    }
    
    static final MethodHandle gdk_cairo_context_cairo_create = Interop.downcallHandle(
        "gdk_cairo_context_cairo_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a Cairo context to be used to draw on the {@code GdkSurface}
     * of {@code context}.
     * <p>
     * A call to {@link DrawContext#beginFrame} with this
     * {@code context} must have been done or this function will return {@code null}.
     * <p>
     * The returned context is guaranteed to be valid until
     * {@link DrawContext#endFrame} is called.
     */
    public org.cairographics.Context cairoCreate() {
        try {
            var RESULT = (MemoryAddress) gdk_cairo_context_cairo_create.invokeExact(handle());
            return new org.cairographics.Context(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
