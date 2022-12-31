package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BroadwayRenderer extends org.gtk.gsk.Renderer {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskBroadwayRenderer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BroadwayRenderer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BroadwayRenderer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BroadwayRenderer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BroadwayRenderer(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_broadway_renderer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new Broadway renderer.
     * <p>
     * The Broadway renderer is the default renderer for the broadway backend.
     * It will only work with broadway surfaces, otherwise it will fail the
     * call to gsk_renderer_realize().
     * <p>
     * This function is only available when GTK was compiled with Broadway
     * support.
     */
    public BroadwayRenderer() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_broadway_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BroadwayRenderer.Builder} object constructs a {@link BroadwayRenderer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BroadwayRenderer.Builder#build()}. 
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
         * Finish building the {@link BroadwayRenderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BroadwayRenderer}.
         * @return A new instance of {@code BroadwayRenderer} with the properties 
         *         that were set in the Builder object.
         */
        public BroadwayRenderer build() {
            return (BroadwayRenderer) org.gtk.gobject.GObject.newWithProperties(
                BroadwayRenderer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_broadway_renderer_new = Interop.downcallHandle(
            "gsk_broadway_renderer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_broadway_renderer_get_type = Interop.downcallHandle(
            "gsk_broadway_renderer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
