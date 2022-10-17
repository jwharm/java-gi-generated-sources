package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkFontChooserWidget} widget lets the user select a font.
 * <p>
 * It is used in the {@code GtkFontChooserDialog} widget to provide a
 * dialog for selecting fonts.
 * <p>
 * To set the font which is initially selected, use
 * {@code Gtk.FontChooser.set_font_desc}.
 * <p>
 * To get the selected font use {@link FontChooser#getFont} or
 * {@link FontChooser#getFontDesc}.
 * <p>
 * To change the text which is shown in the preview area, use
 * {@link FontChooser#setPreviewText}.
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkFontChooserWidget} has a single CSS node with name fontchooser.
 */
public class FontChooserWidget extends Widget implements Accessible, Buildable, ConstraintTarget, FontChooser {

    public FontChooserWidget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontChooserWidget */
    public static FontChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserWidget(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_font_chooser_widget_new = Interop.downcallHandle(
        "gtk_font_chooser_widget_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_font_chooser_widget_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkFontChooserWidget}.
     */
    public FontChooserWidget() {
        super(constructNew());
    }
    
}
