package org.gtk.gtk;

import org.gtk.gobject.*;
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
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_new(), true));
    }
    
    /**
     * Returns the baseline position of the layout.
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_get_baseline_position(HANDLE());
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Returns the center widget of the layout.
     */
    public Widget getCenterWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_get_center_widget(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the end widget of the layout.
     */
    public Widget getEndWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_get_end_widget(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current orienration of the layout manager.
     */
    public Orientation getOrientation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_get_orientation(HANDLE());
        return Orientation.fromValue(RESULT);
    }
    
    /**
     * Returns the start widget fo the layout.
     */
    public Widget getStartWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_get_start_widget(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the new baseline position of @self
     */
    public void setBaselinePosition(BaselinePosition baselinePosition) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_set_baseline_position(HANDLE(), baselinePosition.getValue());
    }
    
    /**
     * Sets the new center widget of @self.
     * 
     * To remove the existing center widget, pass %NULL.
     */
    public void setCenterWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_set_center_widget(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Sets the new end widget of @self.
     * 
     * To remove the existing center widget, pass %NULL.
     */
    public void setEndWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_set_end_widget(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Sets the orientation of @self.
     */
    public void setOrientation(Orientation orientation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_set_orientation(HANDLE(), orientation.getValue());
    }
    
    /**
     * Sets the new start widget of @self.
     * 
     * To remove the existing start widget, pass %NULL.
     */
    public void setStartWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_center_layout_set_start_widget(HANDLE(), widget.HANDLE());
    }
    
}
