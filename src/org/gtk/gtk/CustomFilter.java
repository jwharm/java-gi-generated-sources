package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomFilter` determines whether to include items with a callback.
 */
public class CustomFilter extends Filter {

    public CustomFilter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomFilter */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomFilter(gobject.getReference());
    }
    
}
