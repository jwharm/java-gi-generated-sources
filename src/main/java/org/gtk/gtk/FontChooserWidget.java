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
 * {@link FontChooser#setFont} or {@link FontChooser#setFontDesc}.
 * <p>
 * To get the selected font use {@link FontChooser#getFont} or
 * {@link FontChooser#getFontDesc}.
 * <p>
 * To change the text which is shown in the preview area, use
 * {@link FontChooser#setPreviewText}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkFontChooserWidget} has a single CSS node with name fontchooser.
 */
public class FontChooserWidget extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FontChooser {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public FontChooserWidget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontChooserWidget */
    public static FontChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserWidget(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_font_chooser_widget_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFontChooserWidget}.
     */
    public FontChooserWidget() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_font_chooser_widget_new = Interop.downcallHandle(
            "gtk_font_chooser_widget_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
