package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure holding in-depth information for a specific signal.
 * <p>
 * See also: g_signal_query()
 */
public class SignalQuery extends io.github.jwharm.javagi.ResourceBase {

    public SignalQuery(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SignalQuery() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSignalQuery.allocate(Interop.getAllocator()).address()));
    }
    
}
