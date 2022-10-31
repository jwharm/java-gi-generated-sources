package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a touch-based device.
 */
public class TouchEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkTouchEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public TouchEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to TouchEvent if its GType is a (or inherits from) "GdkTouchEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TouchEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkTouchEvent", a ClassCastException will be thrown.
     */
    public static TouchEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkTouchEvent"))) {
            return new TouchEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkTouchEvent");
        }
    }
    
    /**
     * Extracts whether a touch event is emulating a pointer event.
     * @return {@code true} if {@code event} is emulating
     */
    public boolean getEmulatingPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_touch_event_get_emulating_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_touch_event_get_emulating_pointer = Interop.downcallHandle(
            "gdk_touch_event_get_emulating_pointer",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
