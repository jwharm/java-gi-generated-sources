package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_crossing_event_get_detail = Interop.downcallHandle(
        "gdk_crossing_event_get_detail",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the notify detail from a crossing event.
     */
    public @NotNull NotifyType getDetail() {
        int RESULT;
        try {
            RESULT = (int) gdk_crossing_event_get_detail.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NotifyType(RESULT);
    }
    
    private static final MethodHandle gdk_crossing_event_get_focus = Interop.downcallHandle(
        "gdk_crossing_event_get_focus",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     */
    public boolean getFocus() {
        int RESULT;
        try {
            RESULT = (int) gdk_crossing_event_get_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_crossing_event_get_mode = Interop.downcallHandle(
        "gdk_crossing_event_get_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the crossing mode from a crossing event.
     */
    public @NotNull CrossingMode getMode() {
        int RESULT;
        try {
            RESULT = (int) gdk_crossing_event_get_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CrossingMode(RESULT);
    }
    
}
