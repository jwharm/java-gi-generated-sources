package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkBinLayout</code> is a <code>GtkLayoutManager</code> subclass useful for create &<code>#34</code> bins&<code>#34</code>  of
 * widgets.
 * <p><code>GtkBinLayout</code> will stack each child of a widget on top of each other,
 * using the {@link [property@Gtk.Widget:hexpand] (ref=property)}, {@link [property@Gtk.Widget:vexpand] (ref=property)},
 * {@link [property@Gtk.Widget:halign] (ref=property)}, and {@link [property@Gtk.Widget:valign] (ref=property)} properties
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
     * Creates a new <code>GtkBinLayout</code> instance.
     */
    public BinLayout() {
        super(constructNew());
    }
    
}
