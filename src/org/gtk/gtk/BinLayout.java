package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkBinLayout} is a {@code GtkLayoutManager} subclass useful for create "bins" of
 * widgets.
 * <p>
 * {@code GtkBinLayout} will stack each child of a widget on top of each other,
 * using the {@code Gtk.Widget:vexpand},
 * {@code Gtk.Widget:valign} properties
 * of each child to determine where they should be positioned.
 */
public class BinLayout extends LayoutManager {

    public BinLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BinLayout */
    public static BinLayout castFrom(org.gtk.gobject.Object gobject) {
        return new BinLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_bin_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBinLayout} instance.
     */
    public BinLayout() {
        super(constructNew());
    }
    
}
