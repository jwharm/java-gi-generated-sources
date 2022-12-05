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
    @ApiStatus.Internal
    public PixbufNonAnim(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PixbufNonAnim if its GType is a (or inherits from) "PixbufNonAnim".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PixbufNonAnim} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PixbufNonAnim", a ClassCastException will be thrown.
     */
    public static PixbufNonAnim castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PixbufNonAnim.getType())) {
            return new PixbufNonAnim(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PixbufNonAnim");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNull(pixbuf, "Parameter 'pixbuf' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_non_anim_new.invokeExact(
                    pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public PixbufNonAnim(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        super(constructNew(pixbuf), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_non_anim_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdkpixbuf.PixbufAnimation.Build {
        
         /**
         * A {@link PixbufNonAnim.Build} object constructs a {@link PixbufNonAnim} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PixbufNonAnim} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufNonAnim} using {@link PixbufNonAnim#castFrom}.
         * @return A new instance of {@code PixbufNonAnim} with the properties 
         *         that were set in the Build object.
         */
        public PixbufNonAnim construct() {
            return PixbufNonAnim.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PixbufNonAnim.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
