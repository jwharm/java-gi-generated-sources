package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoGlyphVisAttr} structure communicates information between
 * the shaping and rendering phases.
 * <p>
 * Currently, it contains cluster start and color information.
 * More attributes may be added in the future.
 * <p>
 * Clusters are stored in visual order, within the cluster, glyphs
 * are always ordered in logical order, since visual order is meaningless;
 * that is, in Arabic text, accent glyphs follow the glyphs for the
 * base character.
 */
public class GlyphVisAttr extends io.github.jwharm.javagi.ResourceBase {

    public GlyphVisAttr(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public GlyphVisAttr() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoGlyphVisAttr.allocate(Interop.getAllocator()).address()));
    }
    
}
