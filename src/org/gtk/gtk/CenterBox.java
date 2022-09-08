package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCenterBox` arranges three children in a row, keeping the middle child
 * centered as well as possible.
 * 
 * ![An example GtkCenterBox](centerbox.png)
 * 
 * To add children to `GtkCenterBox`, use [method@Gtk.CenterBox.set_start_widget],
 * [method@Gtk.CenterBox.set_center_widget] and
 * [method@Gtk.CenterBox.set_end_widget].
 * 
 * The sizing and positioning of children can be influenced with the
 * align and expand properties of the children.
 * 
 * # GtkCenterBox as GtkBuildable
 * 
 * The `GtkCenterBox` implementation of the `GtkBuildable` interface
 * supports placing children in the 3 positions by specifying “start”, “center”
 * or “end” as the “type” attribute of a <child> element.
 * 
 * # CSS nodes
 * 
 * `GtkCenterBox` uses a single CSS node with the name “box”,
 * 
 * The first child of the `GtkCenterBox` will be allocated depending on the
 * text direction, i.e. in left-to-right layouts it will be allocated on the
 * left and in right-to-left layouts on the right.
 * 
 * In vertical orientation, the nodes of the children are arranged from top to
 * bottom.
 * 
 * # Accessibility
 * 
 * `GtkCenterBox` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public class CenterBox extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public CenterBox(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CenterBox */
    public static CenterBox castFrom(org.gtk.gobject.Object gobject) {
        return new CenterBox(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkCenterBox`.
     */
    public CenterBox() {
        super(References.get(gtk_h.gtk_center_box_new(), false));
    }
    
    /**
     * Gets the value set by gtk_center_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_center_box_get_baseline_position(handle());
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Gets the center widget, or %NULL if there is none.
     */
    public Widget getCenterWidget() {
        var RESULT = gtk_h.gtk_center_box_get_center_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the end widget, or %NULL if there is none.
     */
    public Widget getEndWidget() {
        var RESULT = gtk_h.gtk_center_box_get_end_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the start widget, or %NULL if there is none.
     */
    public Widget getStartWidget() {
        var RESULT = gtk_h.gtk_center_box_get_start_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the baseline position of a center box.
     * 
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * @position is used to allocate the baseline wrt. the extra space
     * available.
     */
    public void setBaselinePosition(BaselinePosition position) {
        gtk_h.gtk_center_box_set_baseline_position(handle(), position.getValue());
    }
    
    /**
     * Sets the center widget.
     * 
     * To remove the existing center widget, pas %NULL.
     */
    public void setCenterWidget(Widget child) {
        gtk_h.gtk_center_box_set_center_widget(handle(), child.handle());
    }
    
    /**
     * Sets the end widget.
     * 
     * To remove the existing end widget, pass %NULL.
     */
    public void setEndWidget(Widget child) {
        gtk_h.gtk_center_box_set_end_widget(handle(), child.handle());
    }
    
    /**
     * Sets the start widget.
     * 
     * To remove the existing start widget, pass %NULL.
     */
    public void setStartWidget(Widget child) {
        gtk_h.gtk_center_box_set_start_widget(handle(), child.handle());
    }
    
}
