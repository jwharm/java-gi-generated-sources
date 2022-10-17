package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to drag and drop operations.
 */
public class DNDEvent extends Event {

    public DNDEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DNDEvent */
    public static DNDEvent castFrom(org.gtk.gobject.Object gobject) {
        return new DNDEvent(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_dnd_event_get_drop = Interop.downcallHandle(
        "gdk_dnd_event_get_drop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GdkDrop} object from a DND event.
     */
    public @Nullable Drop getDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_dnd_event_get_drop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Drop(Refcounted.get(RESULT, false));
    }
    
}
