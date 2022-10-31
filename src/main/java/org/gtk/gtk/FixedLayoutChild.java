package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkFixedLayout}.
 */
public class FixedLayoutChild extends org.gtk.gtk.LayoutChild {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFixedLayoutChild";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public FixedLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FixedLayoutChild if its GType is a (or inherits from) "GtkFixedLayoutChild".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FixedLayoutChild" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFixedLayoutChild", a ClassCastException will be thrown.
     */
    public static FixedLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFixedLayoutChild"))) {
            return new FixedLayoutChild(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFixedLayoutChild");
        }
    }
    
    /**
     * Retrieves the transformation of the child.
     * @return a {@code GskTransform}
     */
    public @Nullable org.gtk.gsk.Transform getTransform() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_layout_child_get_transform.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Transform(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the transformation of the child of a {@code GtkFixedLayout}.
     * @param transform a {@code GskTransform}
     */
    public void setTransform(@NotNull org.gtk.gsk.Transform transform) {
        java.util.Objects.requireNonNull(transform, "Parameter 'transform' must not be null");
        try {
            DowncallHandles.gtk_fixed_layout_child_set_transform.invokeExact(
                    handle(),
                    transform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_fixed_layout_child_get_transform = Interop.downcallHandle(
            "gtk_fixed_layout_child_get_transform",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_fixed_layout_child_set_transform = Interop.downcallHandle(
            "gtk_fixed_layout_child_set_transform",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
