package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBinLayout` is a `GtkLayoutManager` subclass useful for create "bins" of
 * widgets.
 * 
 * `GtkBinLayout` will stack each child of a widget on top of each other,
 * using the [property@Gtk.Widget:hexpand], [property@Gtk.Widget:vexpand],
 * [property@Gtk.Widget:halign], and [property@Gtk.Widget:valign] properties
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
     * Creates a new `GtkBinLayout` instance.
     */
    public BinLayout() {
        super(constructNew());
    }
    
}
