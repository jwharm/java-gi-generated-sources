package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufNonAnim extends org.gtk.gdkpixbuf.PixbufAnimation {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PixbufNonAnim";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PixbufNonAnim proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PixbufNonAnim(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufNonAnim> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PixbufNonAnim(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_non_anim_new.invokeExact(
                    pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public PixbufNonAnim(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        super(constructNew(pixbuf), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_non_anim_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PixbufNonAnim.Builder} object constructs a {@link PixbufNonAnim} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PixbufNonAnim.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gdkpixbuf.PixbufAnimation.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PixbufNonAnim} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufNonAnim}.
         * @return A new instance of {@code PixbufNonAnim} with the properties 
         *         that were set in the Builder object.
         */
        public PixbufNonAnim build() {
            return (PixbufNonAnim) org.gtk.gobject.GObject.newWithProperties(
                PixbufNonAnim.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_non_anim_new = Interop.downcallHandle(
            "gdk_pixbuf_non_anim_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_non_anim_get_type = Interop.downcallHandle(
            "gdk_pixbuf_non_anim_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
