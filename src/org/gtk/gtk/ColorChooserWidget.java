package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkColorChooserWidget` widget lets the user select a color.
 * 
 * By default, the chooser presents a predefined palette of colors,
 * plus a small number of settable custom colors. It is also possible
 * to select a different color with the single-color editor.
 * 
 * To enter the single-color editing mode, use the context menu of any
 * color of the palette, or use the '+' button to add a new custom color.
 * 
 * The chooser automatically remembers the last selection, as well
 * as custom colors.
 * 
 * To create a `GtkColorChooserWidget`, use [ctor@Gtk.ColorChooserWidget.new].
 * 
 * To change the initially selected color, use
 * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
 * [method@Gtk.ColorChooser.get_rgba].
 * 
 * The `GtkColorChooserWidget` is used in the [class@Gtk.ColorChooserDialog]
 * to provide a dialog for selecting colors.
 * 
 * # CSS names
 * 
 * `GtkColorChooserWidget` has a single CSS node with name colorchooser.
 */
public class ColorChooserWidget extends Widget implements Accessible, Buildable, ColorChooser, ConstraintTarget {

    public ColorChooserWidget(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ColorChooserWidget */
    public static ColorChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new ColorChooserWidget(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkColorChooserWidget`.
     */
    public ColorChooserWidget() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_color_chooser_widget_new(), false));
    }
    
}
