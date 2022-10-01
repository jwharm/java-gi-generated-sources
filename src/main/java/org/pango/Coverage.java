package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoCoverage} structure is a map from Unicode characters
 * to {@code Pango.CoverageLevel} values.
 * <p>
 * It is often necessary in Pango to determine if a particular
 * font can represent a particular character, and also how well
 * it can represent that character. The {@code PangoCoverage} is a data
 * structure that is used to represent that information. It is an
 * opaque structure with no public fields.
 */
public class Coverage extends org.gtk.gobject.Object {

    public Coverage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Coverage */
    public static Coverage castFrom(org.gtk.gobject.Object gobject) {
        return new Coverage(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.pango_coverage_new(), true);
        return RESULT;
    }
    
    /**
     * Create a new {@code PangoCoverage}
     */
    public Coverage() {
        super(constructNew());
    }
    
    /**
     * Copy an existing {@code PangoCoverage}.
     */
    public Coverage copy() {
        var RESULT = gtk_h.pango_coverage_copy(handle());
        return new Coverage(Refcounted.get(RESULT, true));
    }
    
    /**
     * Determine whether a particular index is covered by {@code coverage}.
     */
    public CoverageLevel get(int index) {
        var RESULT = gtk_h.pango_coverage_get(handle(), index);
        return new CoverageLevel(RESULT);
    }
    
    /**
     * Modify a particular index within {@code coverage}
     */
    public void set(int index, CoverageLevel level) {
        gtk_h.pango_coverage_set(handle(), index, level.getValue());
    }
    
}
