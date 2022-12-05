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
    
    /**
     * Cast object to Orientable if its GType is a (or inherits from) "GtkOrientable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Orientable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkOrientable", a ClassCastException will be thrown.
     */
    public static Orientable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Orientable.getType())) {
            return new OrientableImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkOrientable");
        }
    }
    
    /**
     * Retrieves the orientation of the {@code orientable}.
     * @return the orientation of the {@code orientable}
     */
    default @NotNull org.gtk.gtk.Orientation getOrientation() {
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
    default void setOrientation(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class OrientableImpl extends org.gtk.gobject.Object implements Orientable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public OrientableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
