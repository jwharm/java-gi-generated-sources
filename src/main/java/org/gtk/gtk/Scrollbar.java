package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkScrollbar} widget is a horizontal or vertical scrollbar.
 * <p>
 * <img src="./doc-files/scrollbar.png" alt="An example GtkScrollbar">
 * <p>
 * Its position and movement are controlled by the adjustment that is passed to
 * or created by {@link Scrollbar#Scrollbar}. See {@link Adjustment} for more
 * details. The {@code Gtk.Adjustment:value} field sets the position of the
 * thumb and must be between {@code Gtk.Adjustment:lower} and
 * {@code Gtk.Adjustment:upper} - {@code Gtk.Adjustment:page-size}.
 * The {@code Gtk.Adjustment:page-size} represents the size of the visible
 * scrollable area.
 * <p>
 * The fields {@code Gtk.Adjustment:step-increment} and
 * {@code Gtk.Adjustment:page-increment} fields are added to or subtracted
 * from the {@code Gtk.Adjustment:value} when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * scrollbar
 * ╰── range[.fine-tune]
 *     ╰── trough
 *         ╰── slider
 * }</pre>
 * <p>
 * {@code GtkScrollbar} has a main CSS node with name scrollbar and a subnode for its
 * contents. The main node gets the .horizontal or .vertical style classes applied,
 * depending on the scrollbar's orientation.
 * <p>
 * The range node gets the style class .fine-tune added when the scrollbar is
 * in 'fine-tuning' mode.
 * <p>
 * Other style classes that may be added to scrollbars inside
 * {@link ScrolledWindow} include the positional classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * .dragging, .hovering).
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkScrollbar} uses the {@link AccessibleRole#SCROLLBAR} role.
 */
public class Scrollbar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollbar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Scrollbar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Scrollbar if its GType is a (or inherits from) "GtkScrollbar".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Scrollbar" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkScrollbar", a ClassCastException will be thrown.
     */
    public static Scrollbar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkScrollbar"))) {
            return new Scrollbar(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkScrollbar");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.Orientation orientation, @Nullable org.gtk.gtk.Adjustment adjustment) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_scrollbar_new.invokeExact(
                    orientation.getValue(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle())), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new scrollbar with the given orientation.
     * @param orientation the scrollbar’s orientation.
     * @param adjustment the {@link Adjustment} to use, or {@code null}
     *   to create a new adjustment.
     */
    public Scrollbar(@NotNull org.gtk.gtk.Orientation orientation, @Nullable org.gtk.gtk.Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
    }
    
    /**
     * Returns the scrollbar's adjustment.
     * @return the scrollbar's adjustment
     */
    public @NotNull org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrollbar_get_adjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Adjustment(Refcounted.get(RESULT, false));
    }
    
    /**
     * Makes the scrollbar use the given adjustment.
     * @param adjustment the adjustment to set
     */
    public void setAdjustment(@Nullable org.gtk.gtk.Adjustment adjustment) {
        try {
            DowncallHandles.gtk_scrollbar_set_adjustment.invokeExact(
                    handle(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_scrollbar_new = Interop.downcallHandle(
            "gtk_scrollbar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_scrollbar_get_adjustment = Interop.downcallHandle(
            "gtk_scrollbar_get_adjustment",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_scrollbar_set_adjustment = Interop.downcallHandle(
            "gtk_scrollbar_set_adjustment",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
