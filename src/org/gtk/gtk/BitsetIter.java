package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque, stack-allocated struct for iterating
 * over the elements of a `GtkBitset`.
 * 
 * Before a `GtkBitsetIter` can be used, it needs to be initialized with
 * [func@Gtk.BitsetIter.init_first], [func@Gtk.BitsetIter.init_last]
 * or [func@Gtk.BitsetIter.init_at].
 */
public class BitsetIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public BitsetIter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the current value that @iter points to.
     * 
     * If @iter is not valid and [method@Gtk.BitsetIter.is_valid]
     * returns %FALSE, this function returns 0.
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
