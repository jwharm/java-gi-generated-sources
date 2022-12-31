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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OrientableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OrientableImpl(input, ownership);
    
    /**
     * Retrieves the orientation of the {@code orientable}.
     * @return the orientation of the {@code orientable}
     */
    default org.gtk.gtk.Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_orientable_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Orientation.of(RESULT);
    }
    
    /**
     * Sets the orientation of the {@code orientable}.
     * @param orientation the orientable’s new orientation
     */
    default void setOrientation(org.gtk.gtk.Orientation orientation) {
        try {
            DowncallHandles.gtk_orientable_set_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_orientable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_orientable_get_orientation = Interop.downcallHandle(
            "gtk_orientable_get_orientation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_orientable_set_orientation = Interop.downcallHandle(
            "gtk_orientable_set_orientation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_orientable_get_type = Interop.downcallHandle(
            "gtk_orientable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class OrientableImpl extends org.gtk.gobject.GObject implements Orientable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public OrientableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
