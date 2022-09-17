package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for <code>GtkEntry</code>. All virtual functions have a default
 * implementation. Derived classes may set the virtual function pointers for the
 * signal handlers to <code>NULL,</code> but must keep @get_text_area_size and
 * @get_frame_size non-<code>NULL;</code> either use the default implementation, or provide
 * a custom one.
 */
public class EntryClass extends io.github.jwharm.javagi.ResourceBase {

    public EntryClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
