package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkActionBar</code> is designed to present contextual actions.
 * <p>
 * !{@link [An example GtkActionBar]}(action-bar.png)
 * <p>
 * It is expected to be displayed below the content and expand
 * horizontally to fill the area.
 * <p>
 * It allows placing children at the start or the end. In addition, it
 * contains an internal centered box which is centered with respect to
 * the full width of the box, even if the children at either side take
 * up different amounts of space.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * actionbar
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  revealer
 *     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  box
 *         &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  box.start
 *         &<code>#9474</code>    &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [start children]}
 *         &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [center widget]}
 *         &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  box.end
 *             &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [end children]}
 * </pre>
 * <p>
 * A <code>GtkActionBar</code>&<code>#39</code> s CSS node is called <code>actionbar</code>. It contains a <code>revealer</code>
 * subnode, which contains a <code>box</code> subnode, which contains two <code>box</code> subnodes at
 * the start and end of the action bar, with <code>start</code> and <code>end style classes
 * respectively, as well as a center node that represents the center child.
 * 
 * Each of the boxes contains children packed for that side.
 */
public class ActionBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ActionBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ActionBar */
    public static ActionBar castFrom(org.gtk.gobject.Object gobject) {
        return new ActionBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_action_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkActionBar</code> widget.
     */
    public ActionBar() {
        super(constructNew());
    }
    
    /**
     * Retrieves the center bar widget of the bar.
     */
    public Widget getCenterWidget() {
        var RESULT = gtk_h.gtk_action_bar_get_center_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the contents of the action bar are revealed.
     */
    public boolean getRevealed() {
        var RESULT = gtk_h.gtk_action_bar_get_revealed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Adds @child to @action_bar, packed with reference to the
     * end of the @action_bar.
     */
    public void packEnd(Widget child) {
        gtk_h.gtk_action_bar_pack_end(handle(), child.handle());
    }
    
    /**
     * Adds @child to @action_bar, packed with reference to the
     * start of the @action_bar.
     */
    public void packStart(Widget child) {
        gtk_h.gtk_action_bar_pack_start(handle(), child.handle());
    }
    
    /**
     * Removes a child from @action_bar.
     */
    public void remove(Widget child) {
        gtk_h.gtk_action_bar_remove(handle(), child.handle());
    }
    
    /**
     * Sets the center widget for the <code>GtkActionBar</code>.
     */
    public void setCenterWidget(Widget centerWidget) {
        gtk_h.gtk_action_bar_set_center_widget(handle(), centerWidget.handle());
    }
    
    /**
     * Reveals or conceals the content of the action bar.
     * 
     * Note: this does not show or hide @action_bar in the
     * {@link [property@Gtk.Widget:visible] (ref=property)} sense, so revealing has
     * no effect if the action bar is hidden.
     */
    public void setRevealed(boolean revealed) {
        gtk_h.gtk_action_bar_set_revealed(handle(), revealed ? 1 : 0);
    }
    
}
