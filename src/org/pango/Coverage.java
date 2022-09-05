package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoCoverage` structure is a map from Unicode characters
 * to [enum@Pango.CoverageLevel] values.
 * 
 * It is often necessary in Pango to determine if a particular
 * font can represent a particular character, and also how well
 * it can represent that character. The `PangoCoverage` is a data
 * structure that is used to represent that information. It is an
 * opaque structure with no public fields.
 */
public class Coverage extends org.gtk.gobject.Object {

    public Coverage(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Coverage */
    public static Coverage castFrom(org.gtk.gobject.Object gobject) {
        return new Coverage(gobject.getProxy());
    }
    
    /**
     * Create a new `PangoCoverage`
     */
    public Coverage() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.pango_coverage_new(), true));
    }
    
    /**
     * Copy an existing `PangoCoverage`.
     */
    public Coverage copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_coverage_copy(HANDLE());
        return new Coverage(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Determine whether a particular index is covered by @coverage.
     */
    public CoverageLevel get(int index) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_coverage_get(HANDLE(), index);
        return CoverageLevel.fromValue(RESULT);
    }
    
    /**
     * Modify a particular index within @coverage
     */
    public void set(int index, CoverageLevel level) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_coverage_set(HANDLE(), index, level.getValue());
    }
    
}
