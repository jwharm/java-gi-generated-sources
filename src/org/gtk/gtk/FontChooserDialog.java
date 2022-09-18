package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkFontChooserDialog</code> widget is a dialog for selecting a font.
 * <p>
 * !{@link [An example GtkFontChooserDialog]}(fontchooser.png)
 * <p><code>GtkFontChooserDialog</code> implements the {@link [iface@Gtk.FontChooser] (ref=iface)} interface
 * and does not provide much API of its own.
 * <p>
 * To create a <code>GtkFontChooserDialog</code>, use {@link [ctor@Gtk.FontChooserDialog.new] (ref=ctor)}.
 * <p>
 * <h1>GtkFontChooserDialog as GtkBuildable</h1>
 * <p>
 * The <code>GtkFontChooserDialog</code> implementation of the <code>GtkBuildable</code>
 * interface exposes the buttons with the names &<code>#8220</code> select_button&<code>#8221</code> 
 * and &<code>#8220</code> cancel_button&<code>#8221</code> .
 */
public class FontChooserDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, FontChooser, Native, Root, ShortcutManager {

    public FontChooserDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontChooserDialog */
    public static FontChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserDialog(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, Window parent) {
        Reference RESULT = References.get(gtk_h.gtk_font_chooser_dialog_new(Interop.allocateNativeString(title).handle(), parent.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkFontChooserDialog</code>.
     */
    public FontChooserDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
}
