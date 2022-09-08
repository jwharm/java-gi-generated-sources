package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkWindowControls` shows window frame controls.
 * 
 * Typical window frame controls are minimize, maximize and close buttons,
 * and the window icon.
 * 
 * ![An example GtkWindowControls](windowcontrols.png)
 * 
 * `GtkWindowControls` only displays start or end side of the controls (see
 * [property@Gtk.WindowControls:side]), so it's intended to be always used
 * in pair with another `GtkWindowControls` for the opposite side, for example:
 * 
 * ```xml
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
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * windowcontrols
 * ├── [image.icon]
 * ├── [button.minimize]
 * ├── [button.maximize]
 * ╰── [button.close]
 * ```
 * 
 * A `GtkWindowControls`' CSS node is called windowcontrols. It contains
 * subnodes corresponding to each title button. Which of the title buttons
 * exist and where they are placed exactly depends on the desktop environment
 * and [property@Gtk.WindowControls:decoration-layout] value.
 * 
 * When [property@Gtk.WindowControls:empty] is %TRUE, it gets the .empty
 * style class.
 * 
 * # Accessibility
 * 
 * `GtkWindowControls` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public class WindowControls extends Widget implements Accessible, Buildable, ConstraintTarget {

    public WindowControls(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to WindowControls */
    public static WindowControls castFrom(org.gtk.gobject.Object gobject) {
        return new WindowControls(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkWindowControls`.
     */
    public WindowControls(PackType side) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_controls_new(side.getValue()), false));
    }
    
    /**
     * Gets the decoration layout of this `GtkWindowControls`.
     */
    public java.lang.String getDecorationLayout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_controls_get_decoration_layout(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the widget has any window buttons.
     */
    public boolean getEmpty() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_controls_get_empty(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the side to which this `GtkWindowControls` instance belongs.
     */
    public PackType getSide() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_controls_get_side(HANDLE());
        return PackType.fromValue(RESULT);
    }
    
    /**
     * Sets the decoration layout for the title buttons.
     * 
     * This overrides the [property@Gtk.Settings:gtk-decoration-layout]
     * setting.
     * 
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * 
     * For example, “icon:minimize,maximize,close” specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     * 
     * If [property@Gtk.WindowControls:side] value is @GTK_PACK_START, @self
     * will display the part before the colon, otherwise after that.
     */
    public void setDecorationLayout(java.lang.String layout) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_controls_set_decoration_layout(HANDLE(), Interop.allocateNativeString(layout).HANDLE());
    }
    
    /**
     * Determines which part of decoration layout the `GtkWindowControls` uses.
     * 
     * See [property@Gtk.WindowControls:decoration-layout].
     */
    public void setSide(PackType side) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_controls_set_side(HANDLE(), side.getValue());
    }
    
}
