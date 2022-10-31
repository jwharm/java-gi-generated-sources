package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A dialog for choosing a color.
 * <p>
 * <img src="./doc-files/colorchooser.png" alt="An example GtkColorChooserDialog">
 * <p>
 * {@code GtkColorChooserDialog} implements the {@code Gtk.ColorChooser} interface
 * and does not provide much API of its own.
 * <p>
 * To create a {@code GtkColorChooserDialog}, use {@link ColorChooserDialog#ColorChooserDialog}.
 * <p>
 * To change the initially selected color, use
 * {@link ColorChooser#setRgba}. To get the selected color use
 * {@link ColorChooser#getRgba}.
 */
public class ColorChooserDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ColorChooser, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ColorChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ColorChooserDialog if its GType is a (or inherits from) "GtkColorChooserDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ColorChooserDialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkColorChooserDialog", a ClassCastException will be thrown.
     */
    public static ColorChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkColorChooserDialog"))) {
            return new ColorChooserDialog(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkColorChooserDialog");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_color_chooser_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle())), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkColorChooserDialog}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     */
    public ColorChooserDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_color_chooser_dialog_new = Interop.downcallHandle(
            "gtk_color_chooser_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
