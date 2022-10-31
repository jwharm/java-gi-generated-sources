package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSeparator} is a horizontal or vertical separator widget.
 * <p>
 * <img src="./doc-files/separators.png" alt="An example GtkSeparator">
 * <p>
 * A {@code GtkSeparator} can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkSeparator} has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkSeparator} uses the {@link AccessibleRole#SEPARATOR} role.
 */
public class Separator extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSeparator";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Separator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Separator if its GType is a (or inherits from) "GtkSeparator".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Separator" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSeparator", a ClassCastException will be thrown.
     */
    public static Separator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSeparator"))) {
            return new Separator(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSeparator");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_separator_new.invokeExact(
                    orientation.getValue()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSeparator} with the given orientation.
     * @param orientation the separator’s orientation.
     */
    public Separator(@NotNull org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_separator_new = Interop.downcallHandle(
            "gtk_separator_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
