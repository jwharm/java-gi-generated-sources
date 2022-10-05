package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkRequisition} represents the desired size of a widget. See
 * <a href="class.Widget.html#height-for-width-geometry-management">GtkWidget’s geometry management section</a> for
 * more information.
 */
public class Requisition extends io.github.jwharm.javagi.ResourceBase {

    public Requisition(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_requisition_new = Interop.downcallHandle(
        "gtk_requisition_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_requisition_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@code GtkRequisition}.
     * <p>
     * The struct is initialized to zero.
     */
    public Requisition() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_requisition_copy = Interop.downcallHandle(
        "gtk_requisition_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code GtkRequisition}.
     */
    public Requisition copy() {
        try {
            var RESULT = (MemoryAddress) gtk_requisition_copy.invokeExact(handle());
            return new Requisition(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_requisition_free = Interop.downcallHandle(
        "gtk_requisition_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code GtkRequisition}.
     */
    public void free() {
        try {
            gtk_requisition_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
