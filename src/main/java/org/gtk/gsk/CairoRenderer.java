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
    protected CairoRenderer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CairoRenderer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CairoRenderer(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_cairo_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CairoRenderer.Builder} object constructs a {@link CairoRenderer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CairoRenderer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gsk.Renderer.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CairoRenderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CairoRenderer}.
         * @return A new instance of {@code CairoRenderer} with the properties 
         *         that were set in the Builder object.
         */
        public CairoRenderer build() {
            return (CairoRenderer) org.gtk.gobject.GObject.newWithProperties(
                CairoRenderer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cairo_renderer_new = Interop.downcallHandle(
            "gsk_cairo_renderer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cairo_renderer_get_type = Interop.downcallHandle(
            "gsk_cairo_renderer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
