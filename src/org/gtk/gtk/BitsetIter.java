package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public BitsetIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BitsetIter() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBitsetIter.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Gets the current value that {@code iter} points to.
     * <p>
     * If {@code iter} is not valid and {@link BitsetIter#isValid}
     * returns {@code false}, this function returns 0.
     */
    public int getValue() {
        var RESULT = gtk_h.gtk_bitset_iter_get_value(handle());
        return RESULT;
    }
    
    /**
     * Checks if {@code iter} points to a valid value.
     */
    public boolean isValid() {
        var RESULT = gtk_h.gtk_bitset_iter_is_valid(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} to the next value in the set.
     * <p>
     * If it was already pointing to the last value in the set,
     * {@code false} is returned and {@code iter} is invalidated.
     */
    public boolean next(PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_next(handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} to the previous value in the set.
     * <p>
     * If it was already pointing to the first value in the set,
     * {@code false} is returned and {@code iter} is invalidated.
     */
    public boolean previous(PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_previous(handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes {@code iter} to point to {@code target}.
     * <p>
     * If {@code target} is not found, finds the next value after it.
     * If no value >= {@code target} exists in {@code set}, this function returns {@code false}.
     */
    public static boolean initAt(BitsetIter iter, Bitset set, int target, PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_init_at(iter.handle(), set.handle(), target, value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes an iterator for {@code set} and points it to the first
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned and {@code value} is set to {@code G_MAXUINT}.
     */
    public static boolean initFirst(BitsetIter iter, Bitset set, PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_init_first(iter.handle(), set.handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes an iterator for {@code set} and points it to the last
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned.
     */
    public static boolean initLast(BitsetIter iter, Bitset set, PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_init_last(iter.handle(), set.handle(), value.handle());
        return (RESULT != 0);
    }
    
}
