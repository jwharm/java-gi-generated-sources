package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkWindowControls</code> shows window frame controls.
 * <p>
 * Typical window frame controls are minimize, maximize and close buttons,
 * and the window icon.
 * <p>
 * !{@link [An example GtkWindowControls]}(windowcontrols.png)
 * <p><code>GtkWindowControls</code> only displays start or end side of the controls (see
 * {@link [property@Gtk.WindowControls:side] (ref=property)}), so it&#39;s intended to be always used
 * in pair with another <code>GtkWindowControls</code> for the opposite side, for example:
 * <p><pre>xml
 * &#60;object class=&#34;GtkBox&#34;&#62;
 *   &#60;child&#62;
 *     &#60;object class=&#34;GtkWindowControls&#34;&#62;
 *       &#60;property name=&#34;side&#34;&#62;start&#60;/property&#62;
 *     &#60;/object&#62;
 *   &#60;/child&#62;
 * <p>
 *   ...
 * <p>
 *   &#60;child&#62;
 *     &#60;object class=&#34;GtkWindowControls&#34;&#62;
 *       &#60;property name=&#34;side&#34;&#62;end&#60;/property&#62;
 *     &#60;/object&#62;
 *   &#60;/child&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * windowcontrols
 * &#9500;&#9472;&#9472; {@link [image.icon]}
 * &#9500;&#9472;&#9472; {@link [button.minimize]}
 * &#9500;&#9472;&#9472; {@link [button.maximize]}
 * &#9584;&#9472;&#9472; {@link [button.close]}
 * </pre>
 * <p>
 * A <code>GtkWindowControls</code>&#39; CSS node is called windowcontrols. It contains
 * subnodes corresponding to each title button. Which of the title buttons
 * exist and where they are placed exactly depends on the desktop environment
 * and {@link [property@Gtk.WindowControls:decoration-layout] (ref=property)} value.
 * <p>
 * When {@link [property@Gtk.WindowControls:empty] (ref=property)} is <code>TRUE,</code> it gets the .empty
 * style class.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkWindowControls</code> uses the {@link org.gtk.gtk.AccessibleRole#GROUP} role.
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
     * Creates a new <code>GtkWindowControls</code>.
     */
    public WindowControls(PackType side) {
        super(constructNew(side));
    }
    
    /**
     * Gets the decoration layout of this <code>GtkWindowControls</code>.
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
     * Gets the side to which this <code>GtkWindowControls</code> instance belongs.
     */
    public PackType getSide() {
        var RESULT = gtk_h.gtk_window_controls_get_side(handle());
        return PackType.fromValue(RESULT);
    }
    
    /**
     * Sets the decoration layout for the title buttons.
     * 
     * This overrides the {@link [property@Gtk.Settings:gtk-decoration-layout] (ref=property)}
     * setting.
     * 
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * 
     * For example, &#8220;icon:minimize,maximize,close&#8221; specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     * 
     * If {@link [property@Gtk.WindowControls:side] (ref=property)} value is @GTK_PACK_START, @self
     * will display the part before the colon, otherwise after that.
     */
    public void setDecorationLayout(java.lang.String layout) {
        gtk_h.gtk_window_controls_set_decoration_layout(handle(), Interop.allocateNativeString(layout).handle());
    }
    
    /**
     * Determines which part of decoration layout the <code>GtkWindowControls</code> uses.
     * 
     * See {@link [property@Gtk.WindowControls:decoration-layout] (ref=property)}.
     */
    public void setSide(PackType side) {
        gtk_h.gtk_window_controls_set_side(handle(), side.getValue());
    }
    
}
