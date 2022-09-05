package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkActionBar` is designed to present contextual actions.
 * 
 * ![An example GtkActionBar](action-bar.png)
 * 
 * It is expected to be displayed below the content and expand
 * horizontally to fill the area.
 * 
 * It allows placing children at the start or the end. In addition, it
 * contains an internal centered box which is centered with respect to
 * the full width of the box, even if the children at either side take
 * up different amounts of space.
 * 
 * # CSS nodes
 * 
 * ```
 * actionbar
 * ╰── revealer
 *     ╰── box
 *         ├── box.start
 *         │   ╰── [start children]
 *         ├── [center widget]
 *         ╰── box.end
 *             ╰── [end children]
 * ```
 * 
 * A `GtkActionBar`'s CSS node is called `actionbar`. It contains a `revealer`
 * subnode, which contains a `box` subnode, which contains two `box` subnodes at
 * the start and end of the action bar, with `start` and `end style classes
 * respectively, as well as a center node that represents the center child.
 * 
 * Each of the boxes contains children packed for that side.
 */
public class ActionBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ActionBar(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ActionBar */
    public static ActionBar castFrom(org.gtk.gobject.Object gobject) {
        return new ActionBar(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkActionBar` widget.
     */
    public ActionBar() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_new(), false));
    }
    
    /**
     * Retrieves the center bar widget of the bar.
     */
    public Widget getCenterWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_get_center_widget(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets whether the contents of the action bar are revealed.
     */
    public boolean getRevealed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_get_revealed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Adds @child to @action_bar, packed with reference to the
     * end of the @action_bar.
     */
    public void packEnd(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_pack_end(HANDLE(), child.HANDLE());
    }
    
    /**
     * Adds @child to @action_bar, packed with reference to the
     * start of the @action_bar.
     */
    public void packStart(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_pack_start(HANDLE(), child.HANDLE());
    }
    
    /**
     * Removes a child from @action_bar.
     */
    public void remove(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_remove(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets the center widget for the `GtkActionBar`.
     */
    public void setCenterWidget(Widget centerWidget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_set_center_widget(HANDLE(), centerWidget.HANDLE());
    }
    
    /**
     * Reveals or conceals the content of the action bar.
     * 
     * Note: this does not show or hide @action_bar in the
     * [property@Gtk.Widget:visible] sense, so revealing has
     * no effect if the action bar is hidden.
     */
    public void setRevealed(boolean revealed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_action_bar_set_revealed(HANDLE(), revealed ? 1 : 0);
    }
    
}
