package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkOrientable} interface is implemented by all widgets that can be
 * oriented horizontally or vertically.
 * <p>
 * {@code GtkOrientable} is more flexible in that it allows the orientation to be
 * changed at runtime, allowing the widgets to “flip”.
 */
public interface Orientable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_orientable_get_orientation = Interop.downcallHandle(
        "gtk_orientable_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the orientation of the {@code orientable}.
     */
    public default Orientation getOrientation() {
        try {
            var RESULT = (int) gtk_orientable_get_orientation.invokeExact(handle());
            return new Orientation(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_orientable_set_orientation = Interop.downcallHandle(
        "gtk_orientable_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the orientation of the {@code orientable}.
     */
    public default void setOrientation(Orientation orientation) {
        try {
            gtk_orientable_set_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class OrientableImpl extends org.gtk.gobject.Object implements Orientable {
        public OrientableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
