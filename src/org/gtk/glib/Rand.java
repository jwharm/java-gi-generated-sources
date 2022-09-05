package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GRand struct is an opaque data structure. It should only be
 * accessed through the g_rand_* functions.
 */
public class Rand extends io.github.jwharm.javagi.interop.ResourceBase {

    public Rand(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Copies a #GRand into a new one with the same exact state as before.
     * This way you can take a snapshot of the random number generator for
     * replaying later.
     */
    public Rand copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_copy(HANDLE());
        return new Rand(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the next random #gdouble from @rand_ equally distributed over
     * the range [0..1).
     */
    public double double_() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_double(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the next random #gdouble from @rand_ equally distributed over
     * the range [@begin..@end).
     */
    public double doubleRange(double begin, double end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_double_range(HANDLE(), begin, end);
        return RESULT;
    }
    
    /**
     * Frees the memory allocated for the #GRand.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_free(HANDLE());
    }
    
    /**
     * Returns the next random #guint32 from @rand_ equally distributed over
     * the range [0..2^32-1].
     */
    public int int_() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_int(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the next random #gint32 from @rand_ equally distributed over
     * the range [@begin..@end-1].
     */
    public int intRange(int begin, int end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_int_range(HANDLE(), begin, end);
        return RESULT;
    }
    
    /**
     * Sets the seed for the random number generator #GRand to @seed.
     */
    public void setSeed(int seed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_rand_set_seed(HANDLE(), seed);
    }
    
}
