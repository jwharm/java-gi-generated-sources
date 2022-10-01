package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure representing a single field in a structured log entry. See
 * g_log_structured() for details.
 * <p>
 * Log fields may contain arbitrary values, including binary with embedded nul
 * bytes. If the field contains a string, the string must be UTF-8 encoded and
 * have a trailing nul byte. Otherwise, {@code length} must be set to a non-negative
 * value.
 */
public class LogField extends io.github.jwharm.javagi.ResourceBase {

    public LogField(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public LogField() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GLogField.allocate(Interop.getAllocator()).address()));
    }
    
}
