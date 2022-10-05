package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkColorChooserWidget} widget lets the user select a color.
 * <p>
 * By default, the chooser presents a predefined palette of colors,
 * plus a small number of settable custom colors. It is also possible
 * to select a different color with the single-color editor.
 * <p>
 * To enter the single-color editing mode, use the context menu of any
 * color of the palette, or use the '+' button to add a new custom color.
 * <p>
 * The chooser automatically remembers the last selection, as well
 * as custom colors.
 * <p>
 * To create a {@code GtkColorChooserWidget}, use {@link ColorChooserWidget#ColorChooserWidget}.
 * <p>
 * To change the initially selected color, use
 * {@link ColorChooser#setRgba}. To get the selected color use
 * {@link ColorChooser#getRgba}.
 * <p>
 * The {@code GtkColorChooserWidget} is used in the {@link ColorChooserDialog}
 * to provide a dialog for selecting colors.
 * <p>
 * <h1>CSS names</h1>
 * <p>
 * {@code GtkColorChooserWidget} has a single CSS node with name colorchooser.
 */
public class ColorChooserWidget extends Widget implements Accessible, Buildable, ColorChooser, ConstraintTarget {

    public ColorChooserWidget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorChooserWidget */
    public static ColorChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new ColorChooserWidget(gobject.refcounted());
    }
    
    static final MethodHandle gtk_color_chooser_widget_new = Interop.downcallHandle(
        "gtk_color_chooser_widget_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_color_chooser_widget_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkColorChooserWidget}.
     */
    public ColorChooserWidget() {
        super(constructNew());
    }
    
}