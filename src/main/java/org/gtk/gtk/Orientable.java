package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkOrientable} interface is implemented by all widgets that can be
 * oriented horizontally or vertically.
 * <p>
 * {@code GtkOrientable} is more flexible in that it allows the orientation to be
 * changed at runtime, allowing the widgets to “flip”.
 */
public interface Orientable extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_orientable_get_orientation = Interop.downcallHandle(
        "gtk_orientable_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the orientation of the {@code orientable}.
     */
    default @NotNull Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) gtk_orientable_get_orientation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Orientation(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_orientable_set_orientation = Interop.downcallHandle(
        "gtk_orientable_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the orientation of the {@code orientable}.
     */
    default @NotNull void setOrientation(@NotNull Orientation orientation) {
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
