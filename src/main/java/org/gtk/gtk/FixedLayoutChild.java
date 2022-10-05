package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkFixedLayout}.
 */
public class FixedLayoutChild extends LayoutChild {

    public FixedLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FixedLayoutChild */
    public static FixedLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new FixedLayoutChild(gobject.refcounted());
    }
    
    static final MethodHandle gtk_fixed_layout_child_get_transform = Interop.downcallHandle(
        "gtk_fixed_layout_child_get_transform",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the transformation of the child.
     */
    public org.gtk.gsk.Transform getTransform() {
        try {
            var RESULT = (MemoryAddress) gtk_fixed_layout_child_get_transform.invokeExact(handle());
            return new org.gtk.gsk.Transform(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_fixed_layout_child_set_transform = Interop.downcallHandle(
        "gtk_fixed_layout_child_set_transform",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the transformation of the child of a {@code GtkFixedLayout}.
     */
    public void setTransform(org.gtk.gsk.Transform transform) {
        try {
            gtk_fixed_layout_child_set_transform.invokeExact(handle(), transform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
