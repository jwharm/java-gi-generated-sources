package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Structure representing a single field in a structured log entry. See
 * g_log_structured() for details.
 * 
 * Log fields may contain arbitrary values, including binary with embedded nul
 * bytes. If the field contains a string, the string must be UTF-8 encoded and
 * have a trailing nul byte. Otherwise, @length must be set to a non-negative
 * value.
 */
public class LogField extends io.github.jwharm.javagi.interop.ResourceBase {

    public LogField(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
}
