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
public class Ordering extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkOrdering";
    
    /**
     * the first value is smaller than the second
     */
    public static final Ordering SMALLER = new Ordering(-1);
    
    /**
     * the two values are equal
     */
    public static final Ordering EQUAL = new Ordering(0);
    
    /**
     * the first value is larger than the second
     */
    public static final Ordering LARGER = new Ordering(1);
    
    public Ordering(int value) {
        super(value);
    }
    
    /**
     * Converts the result of a {@code GCompareFunc} like strcmp() to a
     * {@code GtkOrdering} value.
     * @param cmpfuncResult Result of a comparison function
     * @return the corresponding {@code GtkOrdering}
     */
    public static @NotNull org.gtk.gtk.Ordering fromCmpfunc(int cmpfuncResult) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_ordering_from_cmpfunc.invokeExact(
                    cmpfuncResult);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Ordering(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_ordering_from_cmpfunc = Interop.downcallHandle(
            "gtk_ordering_from_cmpfunc",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
}
