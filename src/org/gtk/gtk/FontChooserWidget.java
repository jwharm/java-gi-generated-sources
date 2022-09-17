package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkFontChooserWidget</code> widget lets the user select a font.
 * <p>
 * It is used in the <code>GtkFontChooserDialog</code> widget to provide a
 * dialog for selecting fonts.
 * <p>
 * To set the font which is initially selected, use
 * {@link org.gtk.gtk.FontChooser#setFont} or {@link org.gtk.gtk.FontChooser#setFontDesc}.
 * <p>
 * To get the selected font use {@link org.gtk.gtk.FontChooser#getFont} or
 * {@link org.gtk.gtk.FontChooser#getFontDesc}.
 * <p>
 * To change the text which is shown in the preview area, use
 * {@link org.gtk.gtk.FontChooser#setPreviewText}.
 * <p>
 * <h1>SS nodes</h1>
 * <p><code>GtkFontChooserWidget</code> has a single CSS node with name fontchooser.
 */
public class FontChooserWidget extends Widget implements Accessible, Buildable, ConstraintTarget, FontChooser {

    public FontChooserWidget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontChooserWidget */
    public static FontChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new FontChooserWidget(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_font_chooser_widget_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkFontChooserWidget</code>.
     */
    public FontChooserWidget() {
        super(constructNew());
    }
    
}
