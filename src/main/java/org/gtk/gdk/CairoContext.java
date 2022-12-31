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
    
    private static final java.lang.String C_TYPE_NAME = "GdkCairoContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CairoContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CairoContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CairoContext> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CairoContext(input, ownership);
    
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_cairo_context_cairo_create.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.Context.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_cairo_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CairoContext.Builder} object constructs a {@link CairoContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CairoContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gdk.DrawContext.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CairoContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CairoContext}.
         * @return A new instance of {@code CairoContext} with the properties 
         *         that were set in the Builder object.
         */
        public CairoContext build() {
            return (CairoContext) org.gtk.gobject.GObject.newWithProperties(
                CairoContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_cairo_context_cairo_create = Interop.downcallHandle(
            "gdk_cairo_context_cairo_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cairo_context_get_type = Interop.downcallHandle(
            "gdk_cairo_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
