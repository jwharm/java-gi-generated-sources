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
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserWidget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FontChooserWidget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontChooserWidget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FontChooserWidget if its GType is a (or inherits from) "GtkFontChooserWidget".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FontChooserWidget" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFontChooserWidget", a ClassCastException will be thrown.
     */
    public static FontChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFontChooserWidget"))) {
            return new FontChooserWidget(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFontChooserWidget");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_widget_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFontChooserWidget}.
     */
    public FontChooserWidget() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_font_chooser_widget_new = Interop.downcallHandle(
            "gtk_font_chooser_widget_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
