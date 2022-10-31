package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufSimpleAnimIter extends org.gtk.gdkpixbuf.PixbufAnimationIter {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "null";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public PixbufSimpleAnimIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PixbufSimpleAnimIter if its GType is a (or inherits from) "null".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PixbufSimpleAnimIter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "null", a ClassCastException will be thrown.
     */
    public static PixbufSimpleAnimIter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("null"))) {
            return new PixbufSimpleAnimIter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of null");
        }
    }
}
