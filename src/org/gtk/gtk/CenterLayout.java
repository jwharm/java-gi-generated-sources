package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCenterLayout` is a layout manager that manages up to three children.
 * 
 * The start widget is allocated at the start of the layout (left in
 * left-to-right locales and right in right-to-left ones), and the end
 * widget at the end.
 * 
 * The center widget is centered regarding the full width of the layout's.
 */
public class CenterLayout extends LayoutManager {

    public CenterLayout(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CenterLayout */
    public static CenterLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CenterLayout(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkCenterLayout`.
     */
    public CenterLayout() {
        super(References.get(gtk_h.gtk_center_layout_new(), true));
    }
    
    /**
     * Returns the baseline position of the layout.
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_center_layout_get_baseline_position(handle());
        return BaselinePosition.fromValue(RESULT);
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
        return Orientation.fromValue(RESULT);
    }
    
    /**
     * Returns the start widget fo the layout.
     */
    public Widget getStartWidget() {
        var RESULT = gtk_h.gtk_center_layout_get_start_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the new baseline position of @self
     */
    public void setBaselinePosition(BaselinePosition baselinePosition) {
        gtk_h.gtk_center_layout_set_baseline_position(handle(), baselinePosition.getValue());
    }
    
    /**
     * Sets the new center widget of @self.
     * 
     * To remove the existing center widget, pass %NULL.
     */
    public void setCenterWidget(Widget widget) {
        gtk_h.gtk_center_layout_set_center_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the new end widget of @self.
     * 
     * To remove the existing center widget, pass %NULL.
     */
    public void setEndWidget(Widget widget) {
        gtk_h.gtk_center_layout_set_end_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the orientation of @self.
     */
    public void setOrientation(Orientation orientation) {
        gtk_h.gtk_center_layout_set_orientation(handle(), orientation.getValue());
    }
    
    /**
     * Sets the new start widget of @self.
     * 
     * To remove the existing start widget, pass %NULL.
     */
    public void setStartWidget(Widget widget) {
        gtk_h.gtk_center_layout_set_start_widget(handle(), widget.handle());
    }
    
}
