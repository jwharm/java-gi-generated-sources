package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoScriptIter` is used to iterate through a string
 * and identify ranges in different scripts.
 */
public class ScriptIter extends io.github.jwharm.javagi.ResourceBase {

    public ScriptIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String text, int length) {
        Reference RESULT = References.get(gtk_h.pango_script_iter_new(Interop.allocateNativeString(text).handle(), length), true);
        return RESULT;
    }
    
    /**
     * Create a new `PangoScriptIter`, used to break a string of
     * Unicode text into runs by Unicode script.
     * 
     * No copy is made of @text, so the caller needs to make
     * sure it remains valid until the iterator is freed with
     * [method@Pango.ScriptIter.free].
     */
    public ScriptIter(java.lang.String text, int length) {
        super(constructNew(text, length));
    }
    
    /**
     * Frees a `PangoScriptIter`.
     */
    public void free() {
        gtk_h.pango_script_iter_free(handle());
    }
    
    /**
     * Advances a `PangoScriptIter` to the next range.
     * 
     * If @iter is already at the end, it is left unchanged
     * and %FALSE is returned.
     */
    public boolean next() {
        var RESULT = gtk_h.pango_script_iter_next(handle());
        return (RESULT != 0);
    }
    
}
