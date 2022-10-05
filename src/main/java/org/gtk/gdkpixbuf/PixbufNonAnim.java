package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PixbufNonAnim extends PixbufAnimation {

    public PixbufNonAnim(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufNonAnim */
    public static PixbufNonAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufNonAnim(gobject.refcounted());
    }
    
    static final MethodHandle gdk_pixbuf_non_anim_new = Interop.downcallHandle(
        "gdk_pixbuf_non_anim_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Pixbuf pixbuf) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_non_anim_new.invokeExact(pixbuf.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public PixbufNonAnim(Pixbuf pixbuf) {
        super(constructNew(pixbuf));
    }
    
}
