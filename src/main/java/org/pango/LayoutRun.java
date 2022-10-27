package org.pango;

/**
 * A {@code PangoLayoutRun} represents a single run within a {@code PangoLayoutLine}.
 * <p>
 * It is simply an alternate name for {@code Pango.GlyphItem}.
 * See the {@code Pango.GlyphItem} docs for details on the fields.
 */
public class LayoutRun extends org.pango.GlyphItem {

    
    public LayoutRun(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LayoutRun */
    public static LayoutRun castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutRun(gobject.refcounted());
    }
}
