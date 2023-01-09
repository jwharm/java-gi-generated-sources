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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PadEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PadEvent(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PadEvent> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PadEvent(input);
    
    /**
     * Extracts the information from a pad strip or ring event.
     * @param index Return location for the axis index
     * @param value Return location for the axis value
     */
    public void getAxisValue(Out<Integer> index, Out<Double> value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment indexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            try {
                DowncallHandles.gdk_pad_event_get_axis_value.invokeExact(
                        handle(),
                        (Addressable) indexPOINTER.address(),
                        (Addressable) valuePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
                    value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        }
    }
    
    /**
     * Extracts information about the pressed button from
     * a pad event.
     * @return the button of {@code event}
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pad_event_get_button.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment groupPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment modePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gdk_pad_event_get_group_mode.invokeExact(
                        handle(),
                        (Addressable) groupPOINTER.address(),
                        (Addressable) modePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    group.set(groupPOINTER.get(Interop.valueLayout.C_INT, 0));
                    mode.set(modePOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pad_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pad_event_get_axis_value = Interop.downcallHandle(
                "gdk_pad_event_get_axis_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pad_event_get_button = Interop.downcallHandle(
                "gdk_pad_event_get_button",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pad_event_get_group_mode = Interop.downcallHandle(
                "gdk_pad_event_get_group_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pad_event_get_type = Interop.downcallHandle(
                "gdk_pad_event_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_pad_event_get_type != null;
    }
}
