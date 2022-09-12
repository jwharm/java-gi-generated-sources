package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkMultiSorter` combines multiple sorters by trying them
 * in turn.
 * 
 * If the first sorter compares two items as equal,
 * the second is tried next, and so on.
 */
public class MultiSorter extends Sorter implements org.gtk.gio.ListModel, Buildable {

    public MultiSorter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MultiSorter */
    public static MultiSorter castFrom(org.gtk.gobject.Object gobject) {
        return new MultiSorter(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_multi_sorter_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new multi sorter.
     * 
     * This sorter compares items by trying each of the sorters
     * in turn, until one returns non-zero. In particular, if
     * no sorter has been added to it, it will always compare
     * items as equal.
     */
    public MultiSorter() {
        super(constructNew());
    }
    
    /**
     * Add @sorter to @self to use for sorting at the end.
     * 
     * @self will consult all existing sorters before it will
     * sort with the given @sorter.
     */
    public void append(Sorter sorter) {
        gtk_h.gtk_multi_sorter_append(handle(), sorter.getReference().unowned().handle());
    }
    
    /**
     * Removes the sorter at the given @position from the list of sorter
     * used by @self.
     * 
     * If @position is larger than the number of sorters, nothing happens.
     */
    public void remove(int position) {
        gtk_h.gtk_multi_sorter_remove(handle(), position);
    }
    
}
