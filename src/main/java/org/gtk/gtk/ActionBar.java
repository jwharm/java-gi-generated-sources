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
 * <p>
 * <strong>CSS nodes</strong><br/>
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
public class ActionBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkActionBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ActionBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ActionBar if its GType is a (or inherits from) "GtkActionBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ActionBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkActionBar", a ClassCastException will be thrown.
     */
    public static ActionBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkActionBar"))) {
            return new ActionBar(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkActionBar");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_action_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkActionBar} widget.
     */
    public ActionBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Retrieves the center bar widget of the bar.
     * @return the center {@code GtkWidget}
     */
    public @Nullable org.gtk.gtk.Widget getCenterWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_action_bar_get_center_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the contents of the action bar are revealed.
     * @return the current value of the {@code Gtk.ActionBar:revealed}
     *   property
     */
    public boolean getRevealed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_action_bar_get_revealed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Adds {@code child} to {@code action_bar}, packed with reference to the
     * end of the {@code action_bar}.
     * @param child the {@code GtkWidget} to be added to {@code action_bar}
     */
    public void packEnd(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_action_bar_pack_end.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code child} to {@code action_bar}, packed with reference to the
     * start of the {@code action_bar}.
     * @param child the {@code GtkWidget} to be added to {@code action_bar}
     */
    public void packStart(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_action_bar_pack_start.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code action_bar}.
     * @param child the {@code GtkWidget} to be removed
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_action_bar_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the center widget for the {@code GtkActionBar}.
     * @param centerWidget a widget to use for the center
     */
    public void setCenterWidget(@Nullable org.gtk.gtk.Widget centerWidget) {
        try {
            DowncallHandles.gtk_action_bar_set_center_widget.invokeExact(
                    handle(),
                    (Addressable) (centerWidget == null ? MemoryAddress.NULL : centerWidget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reveals or conceals the content of the action bar.
     * <p>
     * Note: this does not show or hide {@code action_bar} in the
     * {@code Gtk.Widget:visible} sense, so revealing has
     * no effect if the action bar is hidden.
     * @param revealed The new value of the property
     */
    public void setRevealed(boolean revealed) {
        try {
            DowncallHandles.gtk_action_bar_set_revealed.invokeExact(
                    handle(),
                    revealed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_action_bar_new = Interop.downcallHandle(
            "gtk_action_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_get_center_widget = Interop.downcallHandle(
            "gtk_action_bar_get_center_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_get_revealed = Interop.downcallHandle(
            "gtk_action_bar_get_revealed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_pack_end = Interop.downcallHandle(
            "gtk_action_bar_pack_end",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_pack_start = Interop.downcallHandle(
            "gtk_action_bar_pack_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_remove = Interop.downcallHandle(
            "gtk_action_bar_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_set_center_widget = Interop.downcallHandle(
            "gtk_action_bar_set_center_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_action_bar_set_revealed = Interop.downcallHandle(
            "gtk_action_bar_set_revealed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
