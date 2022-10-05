package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A struct that specifies a border around a rectangular area.
 * <p>
 * Each side can have different width.
 */
public class Border extends io.github.jwharm.javagi.ResourceBase {

    public Border(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_border_new = Interop.downcallHandle(
        "gtk_border_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_border_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@code GtkBorder} struct and initializes its elements to zero.
     */
    public Border() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_border_copy = Interop.downcallHandle(
        "gtk_border_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code GtkBorder}.
     */
    public Border copy() {
        try {
            var RESULT = (MemoryAddress) gtk_border_copy.invokeExact(handle());
            return new Border(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_border_free = Interop.downcallHandle(
        "gtk_border_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code GtkBorder}.
     */
    public void free() {
        try {
            gtk_border_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
