package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufNonAnim extends org.gtk.gdkpixbuf.PixbufAnimation {
    
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
    public PixbufNonAnim(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PixbufNonAnim if its GType is a (or inherits from) "null".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PixbufNonAnim" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "null", a ClassCastException will be thrown.
     */
    public static PixbufNonAnim castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("null"))) {
            return new PixbufNonAnim(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of null");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNull(pixbuf, "Parameter 'pixbuf' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_pixbuf_non_anim_new.invokeExact(
                    pixbuf.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public PixbufNonAnim(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        super(constructNew(pixbuf));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_non_anim_new = Interop.downcallHandle(
            "gdk_pixbuf_non_anim_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
