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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CairoRenderer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CairoRenderer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CairoRenderer if its GType is a (or inherits from) "GskCairoRenderer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CairoRenderer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskCairoRenderer", a ClassCastException will be thrown.
     */
    public static CairoRenderer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskCairoRenderer"))) {
            return new CairoRenderer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskCairoRenderer");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_renderer_new.invokeExact();
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
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cairo_renderer_new = Interop.downcallHandle(
            "gsk_cairo_renderer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
