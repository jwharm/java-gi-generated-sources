package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS names</strong><br/>
 * {@code GtkColorChooserWidget} has a single CSS node with name colorchooser.
 */
public class ColorChooserWidget extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ColorChooser, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserWidget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ColorChooserWidget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ColorChooserWidget if its GType is a (or inherits from) "GtkColorChooserWidget".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ColorChooserWidget" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkColorChooserWidget", a ClassCastException will be thrown.
     */
    public static ColorChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkColorChooserWidget"))) {
            return new ColorChooserWidget(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkColorChooserWidget");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_color_chooser_widget_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkColorChooserWidget}.
     */
    public ColorChooserWidget() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_color_chooser_widget_new = Interop.downcallHandle(
            "gtk_color_chooser_widget_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
