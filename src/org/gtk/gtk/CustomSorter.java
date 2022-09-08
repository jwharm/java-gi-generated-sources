package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
 * function.
 */
public class CustomSorter extends Sorter {

    public CustomSorter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomSorter */
    public static CustomSorter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomSorter(gobject.getReference());
    }
    
}
