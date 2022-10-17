package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GRand struct is an opaque data structure. It should only be
 * accessed through the g_rand_* functions.
 */
public class Rand extends io.github.jwharm.javagi.ResourceBase {

    public Rand(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_rand_copy = Interop.downcallHandle(
        "g_rand_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@link Rand} into a new one with the same exact state as before.
     * This way you can take a snapshot of the random number generator for
     * replaying later.
     */
    public @NotNull Rand copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_rand_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Rand(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_rand_double = Interop.downcallHandle(
        "g_rand_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the next random {@code gdouble} from {@code rand_} equally distributed over
     * the range [0..1).
     */
    public double double_() {
        double RESULT;
        try {
            RESULT = (double) g_rand_double.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_rand_double_range = Interop.downcallHandle(
        "g_rand_double_range",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Returns the next random {@code gdouble} from {@code rand_} equally distributed over
     * the range [{@code begin}..{@code end}).
     */
    public double doubleRange(@NotNull double begin, @NotNull double end) {
        double RESULT;
        try {
            RESULT = (double) g_rand_double_range.invokeExact(handle(), begin, end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_rand_free = Interop.downcallHandle(
        "g_rand_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory allocated for the {@link Rand}.
     */
    public @NotNull void free() {
        try {
            g_rand_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_rand_int = Interop.downcallHandle(
        "g_rand_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the next random {@code guint32} from {@code rand_} equally distributed over
     * the range [0..2^32-1].
     */
    public int int_() {
        int RESULT;
        try {
            RESULT = (int) g_rand_int.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_rand_int_range = Interop.downcallHandle(
        "g_rand_int_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the next random {@code gint32} from {@code rand_} equally distributed over
     * the range {@code end-1}.
     */
    public int intRange(@NotNull int begin, @NotNull int end) {
        int RESULT;
        try {
            RESULT = (int) g_rand_int_range.invokeExact(handle(), begin, end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_rand_set_seed = Interop.downcallHandle(
        "g_rand_set_seed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the seed for the random number generator {@link Rand} to {@code seed}.
     */
    public @NotNull void setSeed(@NotNull int seed) {
        try {
            g_rand_set_seed.invokeExact(handle(), seed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_rand_set_seed_array = Interop.downcallHandle(
        "g_rand_set_seed_array",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes the random number generator by an array of longs.
     * Array can be of arbitrary size, though only the first 624 values
     * are taken.  This function is useful if you have many low entropy
     * seeds, or if you require more then 32 bits of actual entropy for
     * your application.
     */
    public @NotNull void setSeedArray(@NotNull PointerInteger seed, @NotNull int seedLength) {
        try {
            g_rand_set_seed_array.invokeExact(handle(), seed.handle(), seedLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_rand_new = Interop.downcallHandle(
        "g_rand_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new random number generator initialized with a seed taken
     * either from {@code /dev/urandom} (if existing) or from the current time
     * (as a fallback).
     * <p>
     * On Windows, the seed is taken from rand_s().
     */
    public static @NotNull Rand new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_rand_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Rand(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_rand_new_with_seed = Interop.downcallHandle(
        "g_rand_new_with_seed",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new random number generator initialized with {@code seed}.
     */
    public static @NotNull Rand newWithSeed(@NotNull int seed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_rand_new_with_seed.invokeExact(seed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Rand(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_rand_new_with_seed_array = Interop.downcallHandle(
        "g_rand_new_with_seed_array",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new random number generator initialized with {@code seed}.
     */
    public static @NotNull Rand newWithSeedArray(@NotNull PointerInteger seed, @NotNull int seedLength) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_rand_new_with_seed_array.invokeExact(seed.handle(), seedLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Rand(Refcounted.get(RESULT, false));
    }
    
}
