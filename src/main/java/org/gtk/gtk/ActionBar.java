package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkActionBar} is designed to present contextual actions.
 * <p>
 * <img src="./doc-files/action-bar.png" alt="An example GtkActionBar">
 * <p>
 * It is expected to be displayed below the content and expand
 * horizontally to fill the area.
 * <p>
 * It allows placing children at the start or the end. In addition, it
 * contains an internal centered box which is centered with respect to
 * the full width of the box, even if the children at either side take
 * up different amounts of space.
 * 
 * <h1>CSS nodes</h1>
 * <pre>{@code 
 * actionbar
 * ╰── revealer
 *     ╰── box
 *         ├── box.start
 *         │   ╰── [start children]
 *         ├── [center widget]
 *         ╰── box.end
 *             ╰── [end children]
 * }</pre>
 * <p>
 * A {@code GtkActionBar}'s CSS node is called {@code actionbar}. It contains a {@code revealer}
 * subnode, which contains a {@code box} subnode, which contains two {@code box} subnodes at
 * the start and end of the action bar, with {@code start} and `end style classes
 * respectively, as well as a center node that represents the center child.
 * <p>
 * Each of the boxes contains children packed for that side.
 */
public class ActionBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ActionBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ActionBar */
    public static ActionBar castFrom(org.gtk.gobject.Object gobject) {
        return new ActionBar(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_action_bar_new = Interop.downcallHandle(
        "gtk_action_bar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_action_bar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkActionBar} widget.
     */
    public ActionBar() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_action_bar_get_center_widget = Interop.downcallHandle(
        "gtk_action_bar_get_center_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the center bar widget of the bar.
     */
    public @Nullable Widget getCenterWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_action_bar_get_center_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_action_bar_get_revealed = Interop.downcallHandle(
        "gtk_action_bar_get_revealed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the contents of the action bar are revealed.
     */
    public boolean getRevealed() {
        int RESULT;
        try {
            RESULT = (int) gtk_action_bar_get_revealed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_action_bar_pack_end = Interop.downcallHandle(
        "gtk_action_bar_pack_end",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to {@code action_bar}, packed with reference to the
     * end of the {@code action_bar}.
     */
    public @NotNull void packEnd(@NotNull Widget child) {
        try {
            gtk_action_bar_pack_end.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_action_bar_pack_start = Interop.downcallHandle(
        "gtk_action_bar_pack_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to {@code action_bar}, packed with reference to the
     * start of the {@code action_bar}.
     */
    public @NotNull void packStart(@NotNull Widget child) {
        try {
            gtk_action_bar_pack_start.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_action_bar_remove = Interop.downcallHandle(
        "gtk_action_bar_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code action_bar}.
     */
    public @NotNull void remove(@NotNull Widget child) {
        try {
            gtk_action_bar_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_action_bar_set_center_widget = Interop.downcallHandle(
        "gtk_action_bar_set_center_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the center widget for the {@code GtkActionBar}.
     */
    public @NotNull void setCenterWidget(@Nullable Widget centerWidget) {
        try {
            gtk_action_bar_set_center_widget.invokeExact(handle(), centerWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_action_bar_set_revealed = Interop.downcallHandle(
        "gtk_action_bar_set_revealed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Reveals or conceals the content of the action bar.
     * <p>
     * Note: this does not show or hide {@code action_bar} in the
     * {@code Gtk.Widget:visible} sense, so revealing has
     * no effect if the action bar is hidden.
     */
    public @NotNull void setRevealed(@NotNull boolean revealed) {
        try {
            gtk_action_bar_set_revealed.invokeExact(handle(), revealed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
