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
 * {@link [property@Gtk.WindowControls:side] (ref=property)}), so it&<code>#39</code> s intended to be always used
 * in pair with another <code>GtkWindowControls</code> for the opposite side, for example:
 * <p><pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkBox&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> child&<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkWindowControls&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> side&<code>#34</code> &<code>#62</code> start&<code>#60</code> /property&<code>#62</code> 
 *     &<code>#60</code> /object&<code>#62</code> 
 *   &<code>#60</code> /child&<code>#62</code> 
 * <p>
 *   ...
 * <p>
 *   &<code>#60</code> child&<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkWindowControls&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> side&<code>#34</code> &<code>#62</code> end&<code>#60</code> /property&<code>#62</code> 
 *     &<code>#60</code> /object&<code>#62</code> 
 *   &<code>#60</code> /child&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * windowcontrols
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [image.icon]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [button.minimize]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [button.maximize]}
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [button.close]}
 * </pre>
 * <p>
 * A <code>GtkWindowControls</code>&<code>#39</code>  CSS node is called windowcontrols. It contains
 * subnodes corresponding to each title button. Which of the title buttons
 * exist and where they are placed exactly depends on the desktop environment
 * and {@link [property@Gtk.WindowControls:decoration-layout] (ref=property)} value.
 * <p>
 * When {@link [property@Gtk.WindowControls:empty] (ref=property)} is <code>true</code>  it gets the .empty
 * style class.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkWindowControls</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#GROUP</code>  role.
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
     * For example, &<code>#8220</code> icon:minimize,maximize,close&<code>#8221</code>  specifies a icon
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
