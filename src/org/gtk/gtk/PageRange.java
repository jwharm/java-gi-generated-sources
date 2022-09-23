package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A range of pages to print.
 * <p>
 * See also {@link PrintSettings#setPageRanges}.
 */
public class PageRange extends io.github.jwharm.javagi.ResourceBase {

    public PageRange(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PageRange() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkPageRange.allocate(Interop.getAllocator()).address()));
    }
    
}
