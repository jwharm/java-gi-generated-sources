package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event caused by a pointing device moving between surfaces.
 */
public class CrossingEvent extends org.gtk.gdk.Event {
    
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
    
    public CrossingEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CrossingEvent */
    public static CrossingEvent castFrom(org.gtk.gobject.Object gobject) {
        return new CrossingEvent(gobject.refcounted());
    }
    
    /**
     * Extracts the notify detail from a crossing event.
     * @return the notify detail of {@code event}
     */
    public @NotNull org.gtk.gdk.NotifyType getDetail() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_detail.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.NotifyType(RESULT);
    }
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     * @return {@code true} if the surface is the focus surface
     */
    public boolean getFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extracts the crossing mode from a crossing event.
     * @return the mode of {@code event}
     */
    public @NotNull org.gtk.gdk.CrossingMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.CrossingMode(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_crossing_event_get_detail = Interop.downcallHandle(
            "gdk_crossing_event_get_detail",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_crossing_event_get_focus = Interop.downcallHandle(
            "gdk_crossing_event_get_focus",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_crossing_event_get_mode = Interop.downcallHandle(
            "gdk_crossing_event_get_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
