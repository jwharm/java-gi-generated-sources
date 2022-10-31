package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to drag and drop operations.
 */
public class DNDEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDNDEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public DNDEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DNDEvent if its GType is a (or inherits from) "GdkDNDEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DNDEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDNDEvent", a ClassCastException will be thrown.
     */
    public static DNDEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkDNDEvent"))) {
            return new DNDEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDNDEvent");
        }
    }
    
    /**
     * Gets the {@code GdkDrop} object from a DND event.
     * @return the drop
     */
    public @Nullable org.gtk.gdk.Drop getDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_dnd_event_get_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drop(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_dnd_event_get_drop = Interop.downcallHandle(
            "gdk_dnd_event_get_drop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
