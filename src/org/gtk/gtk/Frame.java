package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFrame` is a widget that surrounds its child with a decorative
 * frame and an optional label.
 * 
 * ![An example GtkFrame](frame.png)
 * 
 * If present, the label is drawn inside the top edge of the frame.
 * The horizontal position of the label can be controlled with
 * [method@Gtk.Frame.set_label_align].
 * 
 * `GtkFrame` clips its child. You can use this to add rounded corners
 * to widgets, but be aware that it also cuts off shadows.
 * 
 * # GtkFrame as GtkBuildable
 * 
 * The `GtkFrame` implementation of the `GtkBuildable` interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a <child> element. A normal content child can
 * be specified without specifying a <child> type attribute.
 * 
 * An example of a UI definition fragment with GtkFrame:
 * ```xml
 * <object class="GtkFrame">
 *   <child type="label">
 *     <object class="GtkLabel" id="frame_label"/>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="frame_content"/>
 *   </child>
 * </object>
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * frame
 * ├── <label widget>
 * ╰── <child>
 * ```
 * 
 * `GtkFrame` has a main CSS node with name “frame”, which is used to draw the
 * visible border. You can set the appearance of the border using CSS properties
 * like “border-style” on this node.
 */
public class Frame extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Frame(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Frame */
    public static Frame castFrom(org.gtk.gobject.Object gobject) {
        return new Frame(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkFrame`, with optional label @label.
     * 
     * If @label is %NULL, the label is omitted.
     */
    public Frame(java.lang.String label) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_new(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Gets the child widget of @frame.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_get_child(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the frame labels text.
     * 
     * If the frame's label widget is not a `GtkLabel`, %NULL
     * is returned.
     */
    public java.lang.String getLabel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_get_label(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the X alignment of the frame’s label.
     */
    public float getLabelAlign() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_get_label_align(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the label widget for the frame.
     */
    public Widget getLabelWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_get_label_widget(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of @frame.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Creates a new `GtkLabel` with the @label and sets it as the frame's
     * label widget.
     */
    public void setLabel(java.lang.String label) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_set_label(HANDLE(), Interop.getAllocator().allocateUtf8String(label));
    }
    
    /**
     * Sets the X alignment of the frame widget’s label.
     * 
     * The default value for a newly created frame is 0.0.
     */
    public void setLabelAlign(float xalign) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_set_label_align(HANDLE(), xalign);
    }
    
    /**
     * Sets the label widget for the frame.
     * 
     * This is the widget that will appear embedded in the top edge
     * of the frame as a title.
     */
    public void setLabelWidget(Widget labelWidget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_frame_set_label_widget(HANDLE(), labelWidget.HANDLE());
    }
    
}
