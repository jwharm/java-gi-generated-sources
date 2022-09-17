package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Any of the fields in #GMarkupParser can be <code>NULL,</code> in which case they
 * will be ignored. Except for the @error function, any of these callbacks
 * can set an error; in particular the <code>G_MARKUP_ERROR_UNKNOWN_ELEMENT,
 * %G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE,</code> and <code>G_MARKUP_ERROR_INVALID_CONTENT
 * errors</code> are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 */
public class MarkupParser extends io.github.jwharm.javagi.ResourceBase {

    public MarkupParser(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
