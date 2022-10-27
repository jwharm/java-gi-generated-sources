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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkWindowControls} uses the {@link AccessibleRole#GROUP} role.
 */
public class WindowControls extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public WindowControls(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WindowControls */
    public static WindowControls castFrom(org.gtk.gobject.Object gobject) {
        return new WindowControls(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.PackType side) {
        java.util.Objects.requireNonNull(side, "Parameter 'side' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_window_controls_new.invokeExact(side.getValue()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkWindowControls}.
     * @param side the side
     */
    public WindowControls(@NotNull org.gtk.gtk.PackType side) {
        super(constructNew(side));
    }
    
    /**
     * Gets the decoration layout of this {@code GtkWindowControls}.
     * @return the decoration layout or {@code null} if it is unset
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_controls_get_decoration_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the widget has any window buttons.
     * @return {@code true} if the widget has window buttons, otherwise {@code false}
     */
    public boolean getEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_controls_get_empty.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the side to which this {@code GtkWindowControls} instance belongs.
     * @return the side
     */
    public @NotNull org.gtk.gtk.PackType getSide() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_controls_get_side.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PackType(RESULT);
    }
    
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
     * @param layout a decoration layout, or {@code null} to unset the layout
     */
    public void setDecorationLayout(@Nullable java.lang.String layout) {
        java.util.Objects.requireNonNullElse(layout, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_window_controls_set_decoration_layout.invokeExact(handle(), Interop.allocateNativeString(layout));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines which part of decoration layout the {@code GtkWindowControls} uses.
     * <p>
     * See {@code Gtk.WindowControls:decoration-layout}.
     * @param side a side
     */
    public void setSide(@NotNull org.gtk.gtk.PackType side) {
        java.util.Objects.requireNonNull(side, "Parameter 'side' must not be null");
        try {
            DowncallHandles.gtk_window_controls_set_side.invokeExact(handle(), side.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_window_controls_new = Interop.downcallHandle(
            "gtk_window_controls_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_window_controls_get_decoration_layout = Interop.downcallHandle(
            "gtk_window_controls_get_decoration_layout",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_controls_get_empty = Interop.downcallHandle(
            "gtk_window_controls_get_empty",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_controls_get_side = Interop.downcallHandle(
            "gtk_window_controls_get_side",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_controls_set_decoration_layout = Interop.downcallHandle(
            "gtk_window_controls_set_decoration_layout",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_controls_set_side = Interop.downcallHandle(
            "gtk_window_controls_set_side",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
