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
 * or created by {@code Gtk.Adjustment} for more
 * details. The {@code Gtk.Adjustment:value} field sets the position of the
 * thumb and must be between {@code Gtk.Adjustment:lower} and
 * {@code Gtk.Adjustment:page-size}.
 * The {@code Gtk.Adjustment:page-size} represents the size of the visible
 * scrollable area.
 * <p>
 * The fields {@code Gtk.Adjustment:step-increment} and
 * {@code Gtk.Adjustment:page-increment} fields are added to or subtracted
 * from the {@code Gtk.Adjustment:value} when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 * 
 * <h1>CSS nodes</h1>
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
 * 
 * <h1>Accessibility</h1>
 * {@code GtkScrollbar} uses the {@link AccessibleRole#SCROLLBAR} role.
 */
public class Scrollbar extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Scrollbar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Scrollbar */
    public static Scrollbar castFrom(org.gtk.gobject.Object gobject) {
        return new Scrollbar(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_scrollbar_new = Interop.downcallHandle(
        "gtk_scrollbar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull Orientation orientation, @Nullable Adjustment adjustment) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_scrollbar_new.invokeExact(orientation.getValue(), adjustment.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new scrollbar with the given orientation.
     */
    public Scrollbar(@NotNull Orientation orientation, @Nullable Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
    }
    
    private static final MethodHandle gtk_scrollbar_get_adjustment = Interop.downcallHandle(
        "gtk_scrollbar_get_adjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the scrollbar's adjustment.
     */
    public @NotNull Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_scrollbar_get_adjustment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Adjustment(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_scrollbar_set_adjustment = Interop.downcallHandle(
        "gtk_scrollbar_set_adjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the scrollbar use the given adjustment.
     */
    public @NotNull void setAdjustment(@Nullable Adjustment adjustment) {
        try {
            gtk_scrollbar_set_adjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
