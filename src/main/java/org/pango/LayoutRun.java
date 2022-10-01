package org.pango;

/**
 * A {@code PangoLayoutRun} represents a single run within a {@code PangoLayoutLine}.
 * <p>
 * It is simply an alternate name for {@code Pango.GlyphItem}.
 * See the {@code Pango.GlyphItem} docs for details on the fields.
 */
public class LayoutRun extends GlyphItem {

    public LayoutRun(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LayoutRun */
    public static LayoutRun castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutRun(gobject.getReference());
    }
    
}
