package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A dialog for choosing a color.
 * 
 * ![An example GtkColorChooserDialog](colorchooser.png)
 * 
 * `GtkColorChooserDialog` implements the [iface@Gtk.ColorChooser] interface
 * and does not provide much API of its own.
 * 
 * To create a `GtkColorChooserDialog`, use [ctor@Gtk.ColorChooserDialog.new].
 * 
 * To change the initially selected color, use
 * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
 * [method@Gtk.ColorChooser.get_rgba].
 */
public class ColorChooserDialog extends Dialog implements Accessible, Buildable, ColorChooser, ConstraintTarget, Native, Root, ShortcutManager {

    public ColorChooserDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColorChooserDialog */
    public static ColorChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new ColorChooserDialog(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, Window parent) {
        Reference RESULT = References.get(gtk_h.gtk_color_chooser_dialog_new(Interop.allocateNativeString(title).handle(), parent.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkColorChooserDialog`.
     */
    public ColorChooserDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
}
