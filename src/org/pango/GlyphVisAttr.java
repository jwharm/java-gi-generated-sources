package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoGlyphVisAttr` structure communicates information between
 * the shaping and rendering phases.
 * 
 * Currently, it contains cluster start and color information.
 * More attributes may be added in the future.
 * 
 * Clusters are stored in visual order, within the cluster, glyphs
 * are always ordered in logical order, since visual order is meaningless;
 * that is, in Arabic text, accent glyphs follow the glyphs for the
 * base character.
 */
public class GlyphVisAttr extends io.github.jwharm.javagi.interop.ResourceBase {

    public GlyphVisAttr(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
