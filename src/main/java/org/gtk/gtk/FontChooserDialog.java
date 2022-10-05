package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkFontChooserDialog} widget is a dialog for selecting a font.
 * <p>
 * <img src="./doc-files/fontchooser.png" alt="An example GtkFontChooserDialog">
 * <p>
 * {@code GtkFontChooserDialog} implements the {@code Gtk.FontChooser} interface
 * and does not provide much API of its own.
 * <p>
 * To create a {@code GtkFontChooserDialog}, use {@link FontChooserDialog#FontChooserDialog}.
 * <p>
 * <h1>GtkFontChooserDialog as GtkBuildable</h1>
 * <p>
 * The {@code GtkFontChooserDialog} implementation of the {@code GtkBuildable}
 * interface exposes the buttons with the names “select_button”
 * and “cancel_button”.
 */
public class FontChooserDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, FontChooser, Native, Root, ShortcutManager {

    public FontChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontChooserDialog */
    public static FontChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserDialog(gobject.refcounted());
    }
    
    static final MethodHandle gtk_font_chooser_dialog_new = Interop.downcallHandle(
        "gtk_font_chooser_dialog_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String title, Window parent) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_font_chooser_dialog_new.invokeExact(Interop.allocateNativeString(title).handle(), parent.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkFontChooserDialog}.
     */
    public FontChooserDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
}