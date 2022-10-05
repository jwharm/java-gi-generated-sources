package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
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
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
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
 * <p>
 * <h1>Accessibility</h1>
 * <p>
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
    
    static final MethodHandle gtk_window_controls_new = Interop.downcallHandle(
        "gtk_window_controls_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(PackType side) {
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
    public WindowControls(PackType side) {
        super(constructNew(side));
    }
    
    static final MethodHandle gtk_window_controls_get_decoration_layout = Interop.downcallHandle(
        "gtk_window_controls_get_decoration_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the decoration layout of this {@code GtkWindowControls}.
     */
    public java.lang.String getDecorationLayout() {
        try {
            var RESULT = (MemoryAddress) gtk_window_controls_get_decoration_layout.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_window_controls_get_empty = Interop.downcallHandle(
        "gtk_window_controls_get_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the widget has any window buttons.
     */
    public boolean getEmpty() {
        try {
            var RESULT = (int) gtk_window_controls_get_empty.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_window_controls_get_side = Interop.downcallHandle(
        "gtk_window_controls_get_side",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the side to which this {@code GtkWindowControls} instance belongs.
     */
    public PackType getSide() {
        try {
            var RESULT = (int) gtk_window_controls_get_side.invokeExact(handle());
            return new PackType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_window_controls_set_decoration_layout = Interop.downcallHandle(
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
    public void setDecorationLayout(java.lang.String layout) {
        try {
            gtk_window_controls_set_decoration_layout.invokeExact(handle(), Interop.allocateNativeString(layout).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_window_controls_set_side = Interop.downcallHandle(
        "gtk_window_controls_set_side",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines which part of decoration layout the {@code GtkWindowControls} uses.
     * <p>
     * See {@code Gtk.WindowControls:decoration-layout}.
     */
    public void setSide(PackType side) {
        try {
            gtk_window_controls_set_side.invokeExact(handle(), side.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
