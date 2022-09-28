package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoScriptIter} is used to iterate through a string
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
     * Create a new {@code PangoScriptIter}, used to break a string of
     * Unicode text into runs by Unicode script.
     * <p>
     * No copy is made of {@code text}, so the caller needs to make
     * sure it remains valid until the iterator is freed with
     * {@link ScriptIter#free}.
     */
    public ScriptIter(java.lang.String text, int length) {
        super(constructNew(text, length));
    }
    
    /**
     * Frees a {@code PangoScriptIter}.
     */
    public void free() {
        gtk_h.pango_script_iter_free(handle());
    }
    
    /**
     * Gets information about the range to which {@code iter} currently points.
     * <p>
     * The range is the set of locations p where <strong>start <= p < </strong>end.
     * (That is, it doesn't include the character stored at *end)
     * <p>
     * Note that while the type of the {@code script} argument is declared
     * as {@code PangoScript}, as of Pango 1.18, this function simply returns
     * {@code GUnicodeScript} values. Callers must be prepared to handle unknown
     * values.
     */
    public void getRange(java.lang.String[] start, java.lang.String[] end, Script script) {
        gtk_h.pango_script_iter_get_range(handle(), Interop.allocateNativeArray(start).handle(), Interop.allocateNativeArray(end).handle(), new PointerInteger(script.getValue()).handle());
    }
    
    /**
     * Advances a {@code PangoScriptIter} to the next range.
     * <p>
     * If {@code iter} is already at the end, it is left unchanged
     * and {@code false} is returned.
     */
    public boolean next() {
        var RESULT = gtk_h.pango_script_iter_next(handle());
        return RESULT != 0;
    }
    
}
