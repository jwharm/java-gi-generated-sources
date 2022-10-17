package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a pad-based device.
 */
public class PadEvent extends Event {

    public PadEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PadEvent */
    public static PadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new PadEvent(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_pad_event_get_axis_value = Interop.downcallHandle(
        "gdk_pad_event_get_axis_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the information from a pad strip or ring event.
     */
    public @NotNull void getAxisValue(@NotNull Out<Integer> index, @NotNull Out<Double> value) {
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            gdk_pad_event_get_axis_value.invokeExact(handle(), (Addressable) indexPOINTER.address(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(ValueLayout.JAVA_INT, 0));
        value.set(valuePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    private static final MethodHandle gdk_pad_event_get_button = Interop.downcallHandle(
        "gdk_pad_event_get_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts information about the pressed button from
     * a pad event.
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) gdk_pad_event_get_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_pad_event_get_group_mode = Interop.downcallHandle(
        "gdk_pad_event_get_group_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts group and mode information from a pad event.
     */
    public @NotNull void getGroupMode(@NotNull Out<Integer> group, @NotNull Out<Integer> mode) {
        MemorySegment groupPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment modePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gdk_pad_event_get_group_mode.invokeExact(handle(), (Addressable) groupPOINTER.address(), (Addressable) modePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        group.set(groupPOINTER.get(ValueLayout.JAVA_INT, 0));
        mode.set(modePOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
}
