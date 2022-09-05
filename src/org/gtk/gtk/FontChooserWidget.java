package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkFontChooserWidget` widget lets the user select a font.
 * 
 * It is used in the `GtkFontChooserDialog` widget to provide a
 * dialog for selecting fonts.
 * 
 * To set the font which is initially selected, use
 * [method@Gtk.FontChooser.set_font] or [method@Gtk.FontChooser.set_font_desc].
 * 
 * To get the selected font use [method@Gtk.FontChooser.get_font] or
 * [method@Gtk.FontChooser.get_font_desc].
 * 
 * To change the text which is shown in the preview area, use
 * [method@Gtk.FontChooser.set_preview_text].
 * 
 * # CSS nodes
 * 
 * `GtkFontChooserWidget` has a single CSS node with name fontchooser.
 */
public class FontChooserWidget extends Widget implements Accessible, Buildable, ConstraintTarget, FontChooser {

    public FontChooserWidget(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FontChooserWidget */
    public static FontChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserWidget(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkFontChooserWidget`.
     */
    public FontChooserWidget() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_font_chooser_widget_new(), false));
    }
    
}
