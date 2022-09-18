package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkCenterBox</code> arranges three children in a row, keeping the middle child
 * centered as well as possible.
 * <p>
 * !{@link [An example GtkCenterBox]}(centerbox.png)
 * <p>
 * To add children to <code>GtkCenterBox</code>, use {@link org.gtk.gtk.CenterBox<code>#setStartWidget</code> ,
 * {@link org.gtk.gtk.CenterBox<code>#setCenterWidget</code>  and
 * {@link org.gtk.gtk.CenterBox<code>#setEndWidget</code> .
 * <p>
 * The sizing and positioning of children can be influenced with the
 * align and expand properties of the children.
 * <p>
 * <h1>GtkCenterBox as GtkBuildable</h1>
 * <p>
 * The <code>GtkCenterBox</code> implementation of the <code>GtkBuildable</code> interface
 * supports placing children in the 3 positions by specifying &<code>#8220</code> start&<code>#8221</code> , &<code>#8220</code> center&<code>#8221</code> 
 * or &<code>#8220</code> end&<code>#8221</code>  as the &<code>#8220</code> type&<code>#8221</code>  attribute of a &<code>#60</code> child&<code>#62</code>  element.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkCenterBox</code> uses a single CSS node with the name &<code>#8220</code> box&<code>#8221</code> ,
 * <p>
 * The first child of the <code>GtkCenterBox</code> will be allocated depending on the
 * text direction, i.e. in left-to-right layouts it will be allocated on the
 * left and in right-to-left layouts on the right.
 * <p>
 * In vertical orientation, the nodes of the children are arranged from top to
 * bottom.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkCenterBox</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#GROUP</code>  role.
 */
public class CenterBox extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public CenterBox(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CenterBox */
    public static CenterBox castFrom(org.gtk.gobject.Object gobject) {
        return new CenterBox(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_center_box_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCenterBox</code>.
     */
    public CenterBox() {
        super(constructNew());
    }
    
    /**
     * Gets the value set by gtk_center_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_center_box_get_baseline_position(handle());
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Gets the center widget, or <code>null</code> if there is none.
     */
    public Widget getCenterWidget() {
        var RESULT = gtk_h.gtk_center_box_get_center_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the end widget, or <code>null</code> if there is none.
     */
    public Widget getEndWidget() {
        var RESULT = gtk_h.gtk_center_box_get_end_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the start widget, or <code>null</code> if there is none.
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
     * To remove the existing center widget, pas <code>null</code>
     */
    public void setCenterWidget(Widget child) {
        gtk_h.gtk_center_box_set_center_widget(handle(), child.handle());
    }
    
    /**
     * Sets the end widget.
     * 
     * To remove the existing end widget, pass <code>null</code>
     */
    public void setEndWidget(Widget child) {
        gtk_h.gtk_center_box_set_end_widget(handle(), child.handle());
    }
    
    /**
     * Sets the start widget.
     * 
     * To remove the existing start widget, pass <code>null</code>
     */
    public void setStartWidget(Widget child) {
        gtk_h.gtk_center_box_set_start_widget(handle(), child.handle());
    }
    
}
