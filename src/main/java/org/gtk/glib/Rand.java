package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GRand struct is an opaque data structure. It should only be
 * accessed through the g_rand_* functions.
 */
public class Rand extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GRand";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Rand}
     * @return A new, uninitialized @{link Rand}
     */
    public static Rand allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Rand newInstance = new Rand(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Rand proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Rand(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Rand> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Rand(input);
    
    /**
     * Copies a {@link Rand} into a new one with the same exact state as before.
     * This way you can take a snapshot of the random number generator for
     * replaying later.
     * @return the new {@link Rand}
     */
    public org.gtk.glib.Rand copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_rand_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Rand.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the next random {@code gdouble} from {@code rand_} equally distributed over
     * the range [0..1).
     * @return a random number
     */
    public double double_() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_rand_double.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the next random {@code gdouble} from {@code rand_} equally distributed over
     * the range [{@code begin}..{@code end}).
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public double doubleRange(double begin, double end) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_rand_double_range.invokeExact(
                    handle(),
                    begin,
                    end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the memory allocated for the {@link Rand}.
     */
    public void free() {
        try {
            DowncallHandles.g_rand_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the next random {@code guint32} from {@code rand_} equally distributed over
     * the range [0..2^32-1].
     * @return a random number
     */
    public int int_() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_rand_int.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the next random {@code gint32} from {@code rand_} equally distributed over
     * the range {@code end-1}.
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public int intRange(int begin, int end) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_rand_int_range.invokeExact(
                    handle(),
                    begin,
                    end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the seed for the random number generator {@link Rand} to {@code seed}.
     * @param seed a value to reinitialize the random number generator
     */
    public void setSeed(int seed) {
        try {
            DowncallHandles.g_rand_set_seed.invokeExact(
                    handle(),
                    seed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes the random number generator by an array of longs.
     * Array can be of arbitrary size, though only the first 624 values
     * are taken.  This function is useful if you have many low entropy
     * seeds, or if you require more then 32 bits of actual entropy for
     * your application.
     * @param seed array to initialize with
     * @param seedLength length of array
     */
    public void setSeedArray(PointerInteger seed, int seedLength) {
        try {
            DowncallHandles.g_rand_set_seed_array.invokeExact(
                    handle(),
                    seed.handle(),
                    seedLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new random number generator initialized with a seed taken
     * either from {@code /dev/urandom} (if existing) or from the current time
     * (as a fallback).
     * <p>
     * On Windows, the seed is taken from rand_s().
     * @return the new {@link Rand}
     */
    public static org.gtk.glib.Rand new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_rand_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Rand.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Creates a new random number generator initialized with {@code seed}.
     * @param seed a value to initialize the random number generator
     * @return the new {@link Rand}
     */
    public static org.gtk.glib.Rand newWithSeed(int seed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_rand_new_with_seed.invokeExact(seed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Rand.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Creates a new random number generator initialized with {@code seed}.
     * @param seed an array of seeds to initialize the random number generator
     * @param seedLength an array of seeds to initialize the random number
     *     generator
     * @return the new {@link Rand}
     */
    public static org.gtk.glib.Rand newWithSeedArray(PointerInteger seed, int seedLength) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_rand_new_with_seed_array.invokeExact(
                    seed.handle(),
                    seedLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Rand.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_rand_copy = Interop.downcallHandle(
                "g_rand_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rand_double = Interop.downcallHandle(
                "g_rand_double",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rand_double_range = Interop.downcallHandle(
                "g_rand_double_range",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle g_rand_free = Interop.downcallHandle(
                "g_rand_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rand_int = Interop.downcallHandle(
                "g_rand_int",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rand_int_range = Interop.downcallHandle(
                "g_rand_int_range",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_rand_set_seed = Interop.downcallHandle(
                "g_rand_set_seed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_rand_set_seed_array = Interop.downcallHandle(
                "g_rand_set_seed_array",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_rand_new = Interop.downcallHandle(
                "g_rand_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rand_new_with_seed = Interop.downcallHandle(
                "g_rand_new_with_seed",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_rand_new_with_seed_array = Interop.downcallHandle(
                "g_rand_new_with_seed_array",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
