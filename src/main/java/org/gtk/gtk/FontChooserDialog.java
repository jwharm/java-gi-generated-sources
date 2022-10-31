package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>GtkFontChooserDialog as GtkBuildable</strong><br/>
 * The {@code GtkFontChooserDialog} implementation of the {@code GtkBuildable}
 * interface exposes the buttons with the names “select_button”
 * and “cancel_button”.
 */
public class FontChooserDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FontChooser, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public FontChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FontChooserDialog if its GType is a (or inherits from) "GtkFontChooserDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FontChooserDialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFontChooserDialog", a ClassCastException will be thrown.
     */
    public static FontChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFontChooserDialog"))) {
            return new FontChooserDialog(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFontChooserDialog");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_font_chooser_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle())), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFontChooserDialog}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     */
    public FontChooserDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_font_chooser_dialog_new = Interop.downcallHandle(
            "gtk_font_chooser_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
