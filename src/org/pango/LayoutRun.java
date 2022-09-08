package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoLayoutRun` represents a single run within a `PangoLayoutLine`.
 * 
 * It is simply an alternate name for [struct@Pango.GlyphItem].
 * See the [struct@Pango.GlyphItem] docs for details on the fields.
 */
public class LayoutRun extends GlyphItem {

    public LayoutRun(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
