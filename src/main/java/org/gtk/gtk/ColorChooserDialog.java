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
public class ColorChooserDialog extends Dialog implements Accessible, Buildable, ColorChooser, ConstraintTarget, Native, Root, ShortcutManager {

    public ColorChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorChooserDialog */
    public static ColorChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new ColorChooserDialog(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_color_chooser_dialog_new = Interop.downcallHandle(
        "gtk_color_chooser_dialog_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable Window parent) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_color_chooser_dialog_new.invokeExact(Interop.allocateNativeString(title), parent.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkColorChooserDialog}.
     */
    public ColorChooserDialog(@Nullable java.lang.String title, @Nullable Window parent) {
        super(constructNew(title, parent));
    }
    
}
