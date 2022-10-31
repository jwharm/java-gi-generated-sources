package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a button on a pointer device.
 */
public class ButtonEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkButtonEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ButtonEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ButtonEvent if its GType is a (or inherits from) "GdkButtonEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ButtonEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkButtonEvent", a ClassCastException will be thrown.
     */
    public static ButtonEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkButtonEvent"))) {
            return new ButtonEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkButtonEvent");
        }
    }
    
    /**
     * Extract the button number from a button event.
     * @return the button of {@code event}
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_button_event_get_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_button_event_get_button = Interop.downcallHandle(
            "gdk_button_event_get_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
