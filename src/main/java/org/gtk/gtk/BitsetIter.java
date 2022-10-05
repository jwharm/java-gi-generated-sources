package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque, stack-allocated struct for iterating
 * over the elements of a {@code GtkBitset}.
 * <p>
 * Before a {@code GtkBitsetIter} can be used, it needs to be initialized with
 * {@code Gtk.BitsetIter.init_last}
 * or {@link Gtk#BitsetIter}.
 */
public class BitsetIter extends io.github.jwharm.javagi.ResourceBase {

    public BitsetIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_bitset_iter_get_value = Interop.downcallHandle(
        "gtk_bitset_iter_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value that {@code iter} points to.
     * <p>
     * If {@code iter} is not valid and {@link BitsetIter#isValid}
     * returns {@code false}, this function returns 0.
     */
    public int getValue() {
        try {
            var RESULT = (int) gtk_bitset_iter_get_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_is_valid = Interop.downcallHandle(
        "gtk_bitset_iter_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code iter} points to a valid value.
     */
    public boolean isValid() {
        try {
            var RESULT = (int) gtk_bitset_iter_is_valid.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_next = Interop.downcallHandle(
        "gtk_bitset_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} to the next value in the set.
     * <p>
     * If it was already pointing to the last value in the set,
     * {@code false} is returned and {@code iter} is invalidated.
     */
    public boolean next(PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_next.invokeExact(handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_previous = Interop.downcallHandle(
        "gtk_bitset_iter_previous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} to the previous value in the set.
     * <p>
     * If it was already pointing to the first value in the set,
     * {@code false} is returned and {@code iter} is invalidated.
     */
    public boolean previous(PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_previous.invokeExact(handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_init_at = Interop.downcallHandle(
        "gtk_bitset_iter_init_at",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes {@code iter} to point to {@code target}.
     * <p>
     * If {@code target} is not found, finds the next value after it.
     * If no value >= {@code target} exists in {@code set}, this function returns {@code false}.
     */
    public static boolean initAt(BitsetIter iter, Bitset set, int target, PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_init_at.invokeExact(iter.handle(), set.handle(), target, value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_init_first = Interop.downcallHandle(
        "gtk_bitset_iter_init_first",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes an iterator for {@code set} and points it to the first
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned and {@code value} is set to {@code G_MAXUINT}.
     */
    public static boolean initFirst(BitsetIter iter, Bitset set, PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_init_first.invokeExact(iter.handle(), set.handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_init_last = Interop.downcallHandle(
        "gtk_bitset_iter_init_last",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes an iterator for {@code set} and points it to the last
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned.
     */
    public static boolean initLast(BitsetIter iter, Bitset set, PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_init_last.invokeExact(iter.handle(), set.handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
