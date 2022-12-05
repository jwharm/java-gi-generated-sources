package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufSimpleAnimIter extends org.gtk.gdkpixbuf.PixbufAnimationIter {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PixbufSimpleAnimIter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PixbufSimpleAnimIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufSimpleAnimIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PixbufSimpleAnimIter if its GType is a (or inherits from) "PixbufSimpleAnimIter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PixbufSimpleAnimIter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PixbufSimpleAnimIter", a ClassCastException will be thrown.
     */
    public static PixbufSimpleAnimIter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PixbufSimpleAnimIter.getType())) {
            return new PixbufSimpleAnimIter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PixbufSimpleAnimIter");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_simple_anim_iter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdkpixbuf.PixbufAnimationIter.Build {
        
         /**
         * A {@link PixbufSimpleAnimIter.Build} object constructs a {@link PixbufSimpleAnimIter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PixbufSimpleAnimIter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufSimpleAnimIter} using {@link PixbufSimpleAnimIter#castFrom}.
         * @return A new instance of {@code PixbufSimpleAnimIter} with the properties 
         *         that were set in the Build object.
         */
        public PixbufSimpleAnimIter construct() {
            return PixbufSimpleAnimIter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PixbufSimpleAnimIter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_simple_anim_iter_get_type = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_iter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
