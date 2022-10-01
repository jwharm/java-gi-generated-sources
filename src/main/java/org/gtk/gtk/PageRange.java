package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A range of pages to print.
 * <p>
 * See also {@link PrintSettings#setPageRanges}.
 */
public class PageRange extends io.github.jwharm.javagi.ResourceBase {

    public PageRange(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public PageRange() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GtkPageRange.allocate(Interop.getAllocator()).address()));
    }
    
}
