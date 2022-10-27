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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public TouchEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TouchEvent */
    public static TouchEvent castFrom(org.gtk.gobject.Object gobject) {
        return new TouchEvent(gobject.refcounted());
    }
    
    /**
     * Extracts whether a touch event is emulating a pointer event.
     * @return {@code true} if {@code event} is emulating
     */
    public boolean getEmulatingPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_touch_event_get_emulating_pointer.invokeExact(handle());
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
