package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Any of the fields in {@link org.gtk.glib.MarkupParser} can be <code>null</code>  in which case they
 * will be ignored. Except for the @error function, any of these callbacks
 * can set an error; in particular the {@link org.gtk.glib.MarkupError<code>#UNKNOWN_ELEMENT</code>  
 * {@link org.gtk.glib.MarkupError<code>#UNKNOWN_ATTRIBUTE</code>   and {@link org.gtk.glib.MarkupError<code>#INVALID_CONTENT</code>  errors are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 */
public class MarkupParser extends io.github.jwharm.javagi.ResourceBase {

    public MarkupParser(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
