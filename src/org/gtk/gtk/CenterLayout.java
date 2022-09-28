package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkCenterLayout} is a layout manager that manages up to three children.
 * <p>
 * The start widget is allocated at the start of the layout (left in
 * left-to-right locales and right in right-to-left ones), and the end
 * widget at the end.
 * <p>
 * The center widget is centered regarding the full width of the layout's.
 */
public class CenterLayout extends LayoutManager {

    public CenterLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CenterLayout */
    public static CenterLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CenterLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_center_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCenterLayout}.
     */
    public CenterLayout() {
        super(constructNew());
    }
    
    /**
     * Returns the baseline position of the layout.
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_center_layout_get_baseline_position(handle());
        return new BaselinePosition(RESULT);
    }
    
    /**
     * Returns the center widget of the layout.
     */
    public Widget getCenterWidget() {
        var RESULT = gtk_h.gtk_center_layout_get_center_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the end widget of the layout.
     */
    public Widget getEndWidget() {
        var RESULT = gtk_h.gtk_center_layout_get_end_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current orienration of the layout manager.
     */
    public Orientation getOrientation() {
        var RESULT = gtk_h.gtk_center_layout_get_orientation(handle());
        return new Orientation(RESULT);
    }
    
    /**
     * Returns the start widget fo the layout.
     */
    public Widget getStartWidget() {
        var RESULT = gtk_h.gtk_center_layout_get_start_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the new baseline position of {@code self}
     */
    public void setBaselinePosition(BaselinePosition baselinePosition) {
        gtk_h.gtk_center_layout_set_baseline_position(handle(), baselinePosition.getValue());
    }
    
    /**
     * Sets the new center widget of {@code self}.
     * <p>
     * To remove the existing center widget, pass {@code null}.
     */
    public void setCenterWidget(Widget widget) {
        gtk_h.gtk_center_layout_set_center_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the new end widget of {@code self}.
     * <p>
     * To remove the existing center widget, pass {@code null}.
     */
    public void setEndWidget(Widget widget) {
        gtk_h.gtk_center_layout_set_end_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the orientation of {@code self}.
     */
    public void setOrientation(Orientation orientation) {
        gtk_h.gtk_center_layout_set_orientation(handle(), orientation.getValue());
    }
    
    /**
     * Sets the new start widget of {@code self}.
     * <p>
     * To remove the existing start widget, pass {@code null}.
     */
    public void setStartWidget(Widget widget) {
        gtk_h.gtk_center_layout_set_start_widget(handle(), widget.handle());
    }
    
}
