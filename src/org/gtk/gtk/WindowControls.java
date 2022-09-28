package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public WindowControls(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to WindowControls */
    public static WindowControls castFrom(org.gtk.gobject.Object gobject) {
        return new WindowControls(gobject.getReference());
    }
    
    private static Reference constructNew(PackType side) {
        Reference RESULT = References.get(gtk_h.gtk_window_controls_new(side.getValue()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkWindowControls}.
     */
    public WindowControls(PackType side) {
        super(constructNew(side));
    }
    
    /**
     * Gets the decoration layout of this {@code GtkWindowControls}.
     */
    public java.lang.String getDecorationLayout() {
        var RESULT = gtk_h.gtk_window_controls_get_decoration_layout(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the widget has any window buttons.
     */
    public boolean getEmpty() {
        var RESULT = gtk_h.gtk_window_controls_get_empty(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the side to which this {@code GtkWindowControls} instance belongs.
     */
    public PackType getSide() {
        var RESULT = gtk_h.gtk_window_controls_get_side(handle());
        return new PackType(RESULT);
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
     */
    public void setDecorationLayout(java.lang.String layout) {
        gtk_h.gtk_window_controls_set_decoration_layout(handle(), Interop.allocateNativeString(layout).handle());
    }
    
    /**
     * Determines which part of decoration layout the {@code GtkWindowControls} uses.
     * <p>
     * See {@code Gtk.WindowControls:decoration-layout}.
     */
    public void setSide(PackType side) {
        gtk_h.gtk_window_controls_set_side(handle(), side.getValue());
    }
    
}
