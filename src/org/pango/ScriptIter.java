package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoScriptIter` is used to iterate through a string
 * and identify ranges in different scripts.
 */
public class ScriptIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public ScriptIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
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
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.pango_script_iter_new(Interop.getAllocator().allocateUtf8String(text), length), true));
    }
    
    /**
     * Frees a `PangoScriptIter`.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_script_iter_free(HANDLE());
    }
    
    /**
     * Advances a `PangoScriptIter` to the next range.
     * 
     * If @iter is already at the end, it is left unchanged
     * and %FALSE is returned.
     */
    public boolean next() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_script_iter_next(HANDLE());
        return (RESULT != 0);
    }
    
}
