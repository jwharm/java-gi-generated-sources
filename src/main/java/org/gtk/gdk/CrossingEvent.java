package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event caused by a pointing device moving between surfaces.
 */
public class CrossingEvent extends Event {

    public CrossingEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CrossingEvent */
    public static CrossingEvent castFrom(org.gtk.gobject.Object gobject) {
        return new CrossingEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_crossing_event_get_detail = Interop.downcallHandle(
        "gdk_crossing_event_get_detail",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the notify detail from a crossing event.
     */
    public NotifyType getDetail() {
        try {
            var RESULT = (int) gdk_crossing_event_get_detail.invokeExact(handle());
            return new NotifyType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_crossing_event_get_focus = Interop.downcallHandle(
        "gdk_crossing_event_get_focus",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     */
    public boolean getFocus() {
        try {
            var RESULT = (int) gdk_crossing_event_get_focus.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_crossing_event_get_mode = Interop.downcallHandle(
        "gdk_crossing_event_get_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the crossing mode from a crossing event.
     */
    public CrossingMode getMode() {
        try {
            var RESULT = (int) gdk_crossing_event_get_mode.invokeExact(handle());
            return new CrossingMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
