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
    @ApiStatus.Internal
    public CairoContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CairoContext if its GType is a (or inherits from) "GdkCairoContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CairoContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkCairoContext", a ClassCastException will be thrown.
     */
    public static CairoContext castFrom(org.gtk.gobject.Object gobject) {
            return new CairoContext(gobject.handle(), gobject.yieldOwnership());
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_cairo_context_cairo_create.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Context(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_cairo_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.DrawContext.Build {
        
         /**
         * A {@link CairoContext.Build} object constructs a {@link CairoContext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CairoContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CairoContext} using {@link CairoContext#castFrom}.
         * @return A new instance of {@code CairoContext} with the properties 
         *         that were set in the Build object.
         */
        public CairoContext construct() {
            return CairoContext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CairoContext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
