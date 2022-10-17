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
public class CairoContext extends DrawContext {

    public CairoContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CairoContext */
    public static CairoContext castFrom(org.gtk.gobject.Object gobject) {
        return new CairoContext(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_cairo_context_cairo_create = Interop.downcallHandle(
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
    public @Nullable org.cairographics.Context cairoCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_cairo_context_cairo_create.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Context(Refcounted.get(RESULT, true));
    }
    
}
