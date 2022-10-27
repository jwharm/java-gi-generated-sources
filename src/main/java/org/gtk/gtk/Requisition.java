package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkRequisition} represents the desired size of a widget. See
 * <a href="class.Widget.html#height-for-width-geometry-management">GtkWidget’s geometry management section</a> for
 * more information.
 */
public class Requisition extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    ).withName("GtkRequisition");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Requisition(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_requisition_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@code GtkRequisition}.
     * <p>
     * The struct is initialized to zero.
     */
    public Requisition() {
        super(constructNew());
    }
    
    /**
     * Copies a {@code GtkRequisition}.
     * @return a copy of {@code requisition}
     */
    public @NotNull org.gtk.gtk.Requisition copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_requisition_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Requisition(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@code GtkRequisition}.
     */
    public void free() {
        try {
            DowncallHandles.gtk_requisition_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_requisition_new = Interop.downcallHandle(
            "gtk_requisition_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_requisition_copy = Interop.downcallHandle(
            "gtk_requisition_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_requisition_free = Interop.downcallHandle(
            "gtk_requisition_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
