package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a pad-based device.
 */
public class PadEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPadEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public PadEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PadEvent if its GType is a (or inherits from) "GdkPadEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PadEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkPadEvent", a ClassCastException will be thrown.
     */
    public static PadEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkPadEvent"))) {
            return new PadEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkPadEvent");
        }
    }
    
    /**
     * Extracts the information from a pad strip or ring event.
     * @param index Return location for the axis index
     * @param value Return location for the axis value
     */
    public void getAxisValue(Out<Integer> index, Out<Double> value) {
        java.util.Objects.requireNonNull(index, "Parameter 'index' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.gdk_pad_event_get_axis_value.invokeExact(
                    handle(),
                    (Addressable) indexPOINTER.address(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(ValueLayout.JAVA_INT, 0));
        value.set(valuePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    /**
     * Extracts information about the pressed button from
     * a pad event.
     * @return the button of {@code event}
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pad_event_get_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts group and mode information from a pad event.
     * @param group return location for the group
     * @param mode return location for the mode
     */
    public void getGroupMode(Out<Integer> group, Out<Integer> mode) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        MemorySegment groupPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment modePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gdk_pad_event_get_group_mode.invokeExact(
                    handle(),
                    (Addressable) groupPOINTER.address(),
                    (Addressable) modePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        group.set(groupPOINTER.get(ValueLayout.JAVA_INT, 0));
        mode.set(modePOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pad_event_get_axis_value = Interop.downcallHandle(
            "gdk_pad_event_get_axis_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pad_event_get_button = Interop.downcallHandle(
            "gdk_pad_event_get_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pad_event_get_group_mode = Interop.downcallHandle(
            "gdk_pad_event_get_group_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
