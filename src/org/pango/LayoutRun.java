package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoLayoutRun</code> represents a single run within a <code>PangoLayoutLine</code>.
 * 
 * It is simply an alternate name for {@link [struct@Pango.GlyphItem] (ref=struct)}.
 * See the {@link [struct@Pango.GlyphItem] (ref=struct)} docs for details on the fields.
 */
public class LayoutRun extends GlyphItem {

    public LayoutRun(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
