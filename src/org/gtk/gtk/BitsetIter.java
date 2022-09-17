package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque, stack-allocated struct for iterating
 * over the elements of a <code>GtkBitset</code>.
 * <p>
 * Before a <code>GtkBitsetIter</code> can be used, it needs to be initialized with
 * {@link Gtk#BitsetIter}, {@link Gtk#BitsetIter}
 * or {@link Gtk#BitsetIter}.
 */
public class BitsetIter extends io.github.jwharm.javagi.ResourceBase {

    public BitsetIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the current value that @iter points to.
     * 
     * If @iter is not valid and {@link org.gtk.gtk.BitsetIter#isValid}
     * returns <code>FALSE,</code> this function returns 0.
     */
    public int getValue() {
        var RESULT = gtk_h.gtk_bitset_iter_get_value(handle());
        return RESULT;
    }
    
    /**
     * Checks if @iter points to a valid value.
     */
    public boolean isValid() {
        var RESULT = gtk_h.gtk_bitset_iter_is_valid(handle());
        return (RESULT != 0);
    }
    
}
