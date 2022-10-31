package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GSK renderer that is using cairo.
 * <p>
 * Since it is using cairo, this renderer cannot support
 * 3D transformations.
 */
public class CairoRenderer extends org.gtk.gsk.Renderer {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskCairoRenderer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CairoRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CairoRenderer if its GType is a (or inherits from) "GskCairoRenderer".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CairoRenderer" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskCairoRenderer", a ClassCastException will be thrown.
     */
    public static CairoRenderer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskCairoRenderer"))) {
            return new CairoRenderer(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskCairoRenderer");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_cairo_renderer_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new Cairo renderer.
     * <p>
     * The Cairo renderer is the fallback renderer drawing in ways similar
     * to how GTK 3 drew its content. Its primary use is as comparison tool.
     * <p>
     * The Cairo renderer is incomplete. It cannot render 3D transformed
     * content and will instead render an error marker. Its usage should be
     * avoided.
     */
    public CairoRenderer() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cairo_renderer_new = Interop.downcallHandle(
            "gsk_cairo_renderer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
