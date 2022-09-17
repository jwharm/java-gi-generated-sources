package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoCoverage</code> structure is a map from Unicode characters
 * to {@link [enum@Pango.CoverageLevel] (ref=enum)} values.
 * <p>
 * It is often necessary in Pango to determine if a particular
 * font can represent a particular character, and also how well
 * it can represent that character. The <code>PangoCoverage</code> is a data
 * structure that is used to represent that information. It is an
 * opaque structure with no public fields.
 */
public class Coverage extends org.gtk.gobject.Object {

    public Coverage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Coverage */
    public static Coverage castFrom(org.gtk.gobject.Object gobject) {
        return new Coverage(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.pango_coverage_new(), true);
        return RESULT;
    }
    
    /**
     * Create a new <code>PangoCoverage</code>
     */
    public Coverage() {
        super(constructNew());
    }
    
    /**
     * Copy an existing <code>PangoCoverage</code>.
     */
    public Coverage copy() {
        var RESULT = gtk_h.pango_coverage_copy(handle());
        return new Coverage(References.get(RESULT, true));
    }
    
    /**
     * Determine whether a particular index is covered by @coverage.
     */
    public CoverageLevel get(int index) {
        var RESULT = gtk_h.pango_coverage_get(handle(), index);
        return CoverageLevel.fromValue(RESULT);
    }
    
    /**
     * Modify a particular index within @coverage
     */
    public void set(int index, CoverageLevel level) {
        gtk_h.pango_coverage_set(handle(), index, level.getValue());
    }
    
}
