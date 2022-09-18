package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkColorChooserWidget</code> widget lets the user select a color.
 * <p>
 * By default, the chooser presents a predefined palette of colors,
 * plus a small number of settable custom colors. It is also possible
 * to select a different color with the single-color editor.
 * <p>
 * To enter the single-color editing mode, use the context menu of any
 * color of the palette, or use the &<code>#39</code> +&<code>#39</code>  button to add a new custom color.
 * <p>
 * The chooser automatically remembers the last selection, as well
 * as custom colors.
 * <p>
 * To create a <code>GtkColorChooserWidget</code>, use {@link [ctor@Gtk.ColorChooserWidget.new] (ref=ctor)}.
 * <p>
 * To change the initially selected color, use
 * {@link org.gtk.gtk.ColorChooser<code>#setRgba</code> . To get the selected color use
 * {@link org.gtk.gtk.ColorChooser<code>#getRgba</code> .
 * <p>
 * The <code>GtkColorChooserWidget</code> is used in the {@link org.gtk.gtk.ColorChooserDialog}
 * to provide a dialog for selecting colors.
 * <p>
 * <h1>CSS names</h1>
 * <p><code>GtkColorChooserWidget</code> has a single CSS node with name colorchooser.
 */
public class ColorChooserWidget extends Widget implements Accessible, Buildable, ColorChooser, ConstraintTarget {

    public ColorChooserWidget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColorChooserWidget */
    public static ColorChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new ColorChooserWidget(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_color_chooser_widget_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkColorChooserWidget</code>.
     */
    public ColorChooserWidget() {
        super(constructNew());
    }
    
}
