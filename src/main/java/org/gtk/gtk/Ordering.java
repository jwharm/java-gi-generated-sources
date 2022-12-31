package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the way two values can be compared.
 * <p>
 * These values can be used with a {@code GLib.CompareFunc}. However,
 * a {@code GCompareFunc} is allowed to return any integer values.
 * For converting such a value to a {@code GtkOrdering} value, use
 * {@link Ordering#fromCmpfunc}.
 */
public enum Ordering implements io.github.jwharm.javagi.Enumeration {
    /**
     * the first value is smaller than the second
     */
    SMALLER(-1),
    /**
     * the two values are equal
     */
    EQUAL(0),
    /**
     * the first value is larger than the second
     */
    LARGER(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkOrdering";
    
    private final int value;
    Ordering(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Ordering of(int value) {
        return switch (value) {
            case -1 -> SMALLER;
            case 0 -> EQUAL;
            case 1 -> LARGER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Converts the result of a {@code GCompareFunc} like strcmp() to a
     * {@code GtkOrdering} value.
     * @param cmpfuncResult Result of a comparison function
     * @return the corresponding {@code GtkOrdering}
     */
    public static org.gtk.gtk.Ordering fromCmpfunc(int cmpfuncResult) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_ordering_from_cmpfunc.invokeExact(
                    cmpfuncResult);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Ordering.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_ordering_from_cmpfunc = Interop.downcallHandle(
            "gtk_ordering_from_cmpfunc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
