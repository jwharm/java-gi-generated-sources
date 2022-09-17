package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A dialog for choosing a color.
 * <p>
 * !{@link [An example GtkColorChooserDialog]}(colorchooser.png)
 * <p><code>GtkColorChooserDialog</code> implements the {@link [iface@Gtk.ColorChooser] (ref=iface)} interface
 * and does not provide much API of its own.
 * <p>
 * To create a <code>GtkColorChooserDialog</code>, use {@link [ctor@Gtk.ColorChooserDialog.new] (ref=ctor)}.
 * 
 * To change the initially selected color, use
 * {@link org.gtk.gtk.ColorChooser#setRgba}. To get the selected color use
 * {@link org.gtk.gtk.ColorChooser#getRgba}.
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
     * Creates a new <code>GtkColorChooserDialog</code>.
     */
    public ColorChooserDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
}
