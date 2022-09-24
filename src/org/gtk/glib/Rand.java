package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GRand struct is an opaque data structure. It should only be
 * accessed through the g_rand_* functions.
 */
public class Rand extends io.github.jwharm.javagi.ResourceBase {

    public Rand(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Copies a {@link Rand} into a new one with the same exact state as before.
     * This way you can take a snapshot of the random number generator for
     * replaying later.
     */
    public Rand copy() {
        var RESULT = gtk_h.g_rand_copy(handle());
        return new Rand(References.get(RESULT, false));
    }
    
    /**
     * Returns the next random {@code gdouble} from {@code rand_} equally distributed over
     * the range [0..1).
     */
    public double double_() {
        var RESULT = gtk_h.g_rand_double(handle());
        return RESULT;
    }
    
    /**
     * Returns the next random {@code gdouble} from {@code rand_} equally distributed over
     * the range [{@code begin}..{@code end}).
     */
    public double doubleRange(double begin, double end) {
        var RESULT = gtk_h.g_rand_double_range(handle(), begin, end);
        return RESULT;
    }
    
    /**
     * Frees the memory allocated for the {@link Rand}.
     */
    public void free() {
        gtk_h.g_rand_free(handle());
    }
    
    /**
     * Returns the next random {@code guint32} from {@code rand_} equally distributed over
     * the range [0..2^32-1].
     */
    public int int_() {
        var RESULT = gtk_h.g_rand_int(handle());
        return RESULT;
    }
    
    /**
     * Returns the next random {@code gint32} from {@code rand_} equally distributed over
     * the range {@code end-1}.
     */
    public int intRange(int begin, int end) {
        var RESULT = gtk_h.g_rand_int_range(handle(), begin, end);
        return RESULT;
    }
    
    /**
     * Sets the seed for the random number generator {@link Rand} to {@code seed}.
     */
    public void setSeed(int seed) {
        gtk_h.g_rand_set_seed(handle(), seed);
    }
    
    /**
     * Initializes the random number generator by an array of longs.
     * Array can be of arbitrary size, though only the first 624 values
     * are taken.  This function is useful if you have many low entropy
     * seeds, or if you require more then 32 bits of actual entropy for
     * your application.
     */
    public void setSeedArray(PointerInteger seed, int seedLength) {
        gtk_h.g_rand_set_seed_array(handle(), seed.handle(), seedLength);
    }
    
    /**
     * Creates a new random number generator initialized with a seed taken
     * either from {@code /dev/urandom} (if existing) or from the current time
     * (as a fallback).
     * <p>
     * On Windows, the seed is taken from rand_s().
     */
    public static Rand new_() {
        var RESULT = gtk_h.g_rand_new();
        return new Rand(References.get(RESULT, false));
    }
    
    /**
     * Creates a new random number generator initialized with {@code seed}.
     */
    public static Rand newWithSeed(int seed) {
        var RESULT = gtk_h.g_rand_new_with_seed(seed);
        return new Rand(References.get(RESULT, false));
    }
    
    /**
     * Creates a new random number generator initialized with {@code seed}.
     */
    public static Rand newWithSeedArray(PointerInteger seed, int seedLength) {
        var RESULT = gtk_h.g_rand_new_with_seed_array(seed.handle(), seedLength);
        return new Rand(References.get(RESULT, false));
    }
    
}
