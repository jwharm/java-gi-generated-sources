package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkCenterBox} arranges three children in a row, keeping the middle child
 * centered as well as possible.
 * <p>
 * <img src="./doc-files/centerbox.png" alt="An example GtkCenterBox">
 * <p>
 * To add children to {@code GtkCenterBox}, use {@link CenterBox#setStartWidget},
 * {@link CenterBox#setCenterWidget} and
 * {@link CenterBox#setEndWidget}.
 * <p>
 * The sizing and positioning of children can be influenced with the
 * align and expand properties of the children.
 * <p>
 * <h1>GtkCenterBox as GtkBuildable</h1>
 * <p>
 * The {@code GtkCenterBox} implementation of the {@code GtkBuildable} interface
 * supports placing children in the 3 positions by specifying “start”, “center”
 * or “end” as the “type” attribute of a &lt;child&gt; element.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkCenterBox} uses a single CSS node with the name “box”,
 * <p>
 * The first child of the {@code GtkCenterBox} will be allocated depending on the
 * text direction, i.e. in left-to-right layouts it will be allocated on the
 * left and in right-to-left layouts on the right.
 * <p>
 * In vertical orientation, the nodes of the children are arranged from top to
 * bottom.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkCenterBox} uses the {@link AccessibleRole#GROUP} role.
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
     * Creates a new {@code GtkCenterBox}.
     */
    public CenterBox() {
        super(constructNew());
    }
    
    /**
     * Gets the value set by gtk_center_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_center_box_get_baseline_position(handle());
        return new BaselinePosition(RESULT);
    }
    
    /**
     * Gets the center widget, or {@code null} if there is none.
     */
    public Widget getCenterWidget() {
        var RESULT = gtk_h.gtk_center_box_get_center_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the end widget, or {@code null} if there is none.
     */
    public Widget getEndWidget() {
        var RESULT = gtk_h.gtk_center_box_get_end_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the start widget, or {@code null} if there is none.
     */
    public Widget getStartWidget() {
        var RESULT = gtk_h.gtk_center_box_get_start_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the baseline position of a center box.
     * <p>
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * {@code position} is used to allocate the baseline wrt. the extra space
     * available.
     */
    public void setBaselinePosition(BaselinePosition position) {
        gtk_h.gtk_center_box_set_baseline_position(handle(), position.getValue());
    }
    
    /**
     * Sets the center widget.
     * <p>
     * To remove the existing center widget, pas {@code null}.
     */
    public void setCenterWidget(Widget child) {
        gtk_h.gtk_center_box_set_center_widget(handle(), child.handle());
    }
    
    /**
     * Sets the end widget.
     * <p>
     * To remove the existing end widget, pass {@code null}.
     */
    public void setEndWidget(Widget child) {
        gtk_h.gtk_center_box_set_end_widget(handle(), child.handle());
    }
    
    /**
     * Sets the start widget.
     * <p>
     * To remove the existing start widget, pass {@code null}.
     */
    public void setStartWidget(Widget child) {
        gtk_h.gtk_center_box_set_start_widget(handle(), child.handle());
    }
    
}
