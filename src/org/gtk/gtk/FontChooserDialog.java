package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkFontChooserDialog` widget is a dialog for selecting a font.
 * 
 * ![An example GtkFontChooserDialog](fontchooser.png)
 * 
 * `GtkFontChooserDialog` implements the [iface@Gtk.FontChooser] interface
 * and does not provide much API of its own.
 * 
 * To create a `GtkFontChooserDialog`, use [ctor@Gtk.FontChooserDialog.new].
 * 
 * # GtkFontChooserDialog as GtkBuildable
 * 
 * The `GtkFontChooserDialog` implementation of the `GtkBuildable`
 * interface exposes the buttons with the names “select_button”
 * and “cancel_button”.
 */
public class FontChooserDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, FontChooser, Native, Root, ShortcutManager {

    public FontChooserDialog(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FontChooserDialog */
    public static FontChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserDialog(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkFontChooserDialog`.
     */
    public FontChooserDialog(java.lang.String title, Window parent) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_font_chooser_dialog_new(Interop.allocateNativeString(title).HANDLE(), parent.HANDLE()), false));
    }
    
}
