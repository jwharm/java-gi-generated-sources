package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@code GtkEntry}. All virtual functions have a default
 * implementation. Derived classes may set the virtual function pointers for the
 * signal handlers to {@code null}, but must keep {@code get_text_area_size} and
 * {@code get_frame_size} non-{@code null}; either use the default implementation, or provide
 * a custom one.
 */
public class EntryClass extends io.github.jwharm.javagi.ResourceBase {

    public EntryClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public EntryClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkEntryClass.allocate(Interop.getAllocator()).address()));
    }
    
}
