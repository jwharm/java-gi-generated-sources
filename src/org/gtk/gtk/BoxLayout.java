package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBoxLayout` is a layout manager that arranges children in a single
 * row or column.
 * 
 * Whether it is a row or column depends on the value of its
 * [property@Gtk.Orientable:orientation] property. Within the other dimension
 * all children all allocated the same size. The `GtkBoxLayout` will respect
 * the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties of each child widget.
 * 
 * If you want all children to be assigned the same size, you can use
 * the [property@Gtk.BoxLayout:homogeneous] property.
 * 
 * If you want to specify the amount of space placed between each child,
 * you can use the [property@Gtk.BoxLayout:spacing] property.
 */
public class BoxLayout extends LayoutManager implements Orientable {

    public BoxLayout(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BoxLayout */
    public static BoxLayout castFrom(org.gtk.gobject.Object gobject) {
        return new BoxLayout(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkBoxLayout`.
     */
    public BoxLayout(Orientation orientation) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_new(orientation.getValue()), true));
    }
    
    /**
     * Gets the value set by gtk_box_layout_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_get_baseline_position(HANDLE());
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Returns whether the layout is set to be homogeneous.
     */
    public boolean getHomogeneous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_get_homogeneous(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the space that @box_layout puts between children.
     */
    public int getSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_get_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the baseline position of a box layout.
     * 
     * The baseline position affects only horizontal boxes with at least one
     * baseline aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then the
     * given @position is used to allocate the baseline within the extra
     * space available.
     */
    public void setBaselinePosition(BaselinePosition position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_set_baseline_position(HANDLE(), position.getValue());
    }
    
    /**
     * Sets whether the box layout will allocate the same
     * size to all children.
     */
    public void setHomogeneous(boolean homogeneous) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_set_homogeneous(HANDLE(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets how much spacing to put between children.
     */
    public void setSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_layout_set_spacing(HANDLE(), spacing);
    }
    
}
