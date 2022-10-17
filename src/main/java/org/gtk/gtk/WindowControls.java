package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkWindowControls} shows window frame controls.
 * <p>
 * Typical window frame controls are minimize, maximize and close buttons,
 * and the window icon.
 * <p>
 * <img src="./doc-files/windowcontrols.png" alt="An example GtkWindowControls">
 * <p>
 * {@code GtkWindowControls} only displays start or end side of the controls (see
 * {@code Gtk.WindowControls:side}), so it's intended to be always used
 * in pair with another {@code GtkWindowControls} for the opposite side, for example:
 * 
 * <pre>{@code xml
 * <object class="GtkBox">
 *   <child>
 *     <object class="GtkWindowControls">
 *       <property name="side">start</property>
 *     </object>
 *   </child>
 * 
 *   ...
 * 
 *   <child>
 *     <object class="GtkWindowControls">
 *       <property name="side">end</property>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * 
 * <h1>CSS nodes</h1>
 * <pre>{@code 
 * windowcontrols
 * ├── [image.icon]
 * ├── [button.minimize]
 * ├── [button.maximize]
 * ╰── [button.close]
 * }</pre>
 * <p>
 * A {@code GtkWindowControls}' CSS node is called windowcontrols. It contains
 * subnodes corresponding to each title button. Which of the title buttons
 * exist and where they are placed exactly depends on the desktop environment
 * and {@code Gtk.WindowControls:decoration-layout} value.
 * <p>
 * When {@code Gtk.WindowControls:empty} is {@code true}, it gets the .empty
 * style class.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkWindowControls} uses the {@link AccessibleRole#GROUP} role.
 */
public class WindowControls extends Widget implements Accessible, Buildable, ConstraintTarget {

    public WindowControls(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WindowControls */
    public static WindowControls castFrom(org.gtk.gobject.Object gobject) {
        return new WindowControls(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_window_controls_new = Interop.downcallHandle(
        "gtk_window_controls_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull PackType side) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_window_controls_new.invokeExact(side.getValue()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkWindowControls}.
     */
    public WindowControls(@NotNull PackType side) {
        super(constructNew(side));
    }
    
    private static final MethodHandle gtk_window_controls_get_decoration_layout = Interop.downcallHandle(
        "gtk_window_controls_get_decoration_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the decoration layout of this {@code GtkWindowControls}.
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_window_controls_get_decoration_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_window_controls_get_empty = Interop.downcallHandle(
        "gtk_window_controls_get_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the widget has any window buttons.
     */
    public boolean getEmpty() {
        int RESULT;
        try {
            RESULT = (int) gtk_window_controls_get_empty.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_window_controls_get_side = Interop.downcallHandle(
        "gtk_window_controls_get_side",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the side to which this {@code GtkWindowControls} instance belongs.
     */
    public @NotNull PackType getSide() {
        int RESULT;
        try {
            RESULT = (int) gtk_window_controls_get_side.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PackType(RESULT);
    }
    
    private static final MethodHandle gtk_window_controls_set_decoration_layout = Interop.downcallHandle(
        "gtk_window_controls_set_decoration_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the decoration layout for the title buttons.
     * <p>
     * This overrides the {@code Gtk.Settings:gtk-decoration-layout}
     * setting.
     * <p>
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * <p>
     * For example, “icon:minimize,maximize,close” specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     * <p>
     * If {@code Gtk.WindowControls:side} value is {@code GTK_PACK_START}, {@code self}
     * will display the part before the colon, otherwise after that.
     */
    public @NotNull void setDecorationLayout(@Nullable java.lang.String layout) {
        try {
            gtk_window_controls_set_decoration_layout.invokeExact(handle(), Interop.allocateNativeString(layout));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_window_controls_set_side = Interop.downcallHandle(
        "gtk_window_controls_set_side",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines which part of decoration layout the {@code GtkWindowControls} uses.
     * <p>
     * See {@code Gtk.WindowControls:decoration-layout}.
     */
    public @NotNull void setSide(@NotNull PackType side) {
        try {
            gtk_window_controls_set_side.invokeExact(handle(), side.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
