package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFrame} is a widget that surrounds its child with a decorative
 * frame and an optional label.
 * <p>
 * <img src="./doc-files/frame.png" alt="An example GtkFrame">
 * <p>
 * If present, the label is drawn inside the top edge of the frame.
 * The horizontal position of the label can be controlled with
 * {@link Frame#setLabelAlign}.
 * <p>
 * {@code GtkFrame} clips its child. You can use this to add rounded corners
 * to widgets, but be aware that it also cuts off shadows.
 * <p>
 * <h1>GtkFrame as GtkBuildable</h1>
 * <p>
 * The {@code GtkFrame} implementation of the {@code GtkBuildable} interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a &lt;child&gt; element. A normal content child can
 * be specified without specifying a &lt;child&gt; type attribute.
 * <p>
 * An example of a UI definition fragment with GtkFrame:
 * <pre>{@code xml
 * <object class="GtkFrame">
 *   <child type="label">
 *     <object class="GtkLabel" id="frame_label"/>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="frame_content"/>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * frame
 * ├── <label widget>
 * ╰── <child>
 * }</pre>
 * <p>
 * {@code GtkFrame} has a main CSS node with name “frame”, which is used to draw the
 * visible border. You can set the appearance of the border using CSS properties
 * like “border-style” on this node.
 */
public class Frame extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Frame(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Frame */
    public static Frame castFrom(org.gtk.gobject.Object gobject) {
        return new Frame(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_frame_new(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFrame}, with optional label {@code label}.
     * <p>
     * If {@code label} is <code>null</code>, the label is omitted.
     */
    public Frame(java.lang.String label) {
        super(constructNew(label));
    }
    
    /**
     * Gets the child widget of {@code frame}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_frame_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the frame labels text.
     * <p>
     * If the frame's label widget is not a {@code GtkLabel}, <code>null</code>
     * is returned.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_frame_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the X alignment of the frame’s label.
     */
    public float getLabelAlign() {
        var RESULT = gtk_h.gtk_frame_get_label_align(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the label widget for the frame.
     */
    public Widget getLabelWidget() {
        var RESULT = gtk_h.gtk_frame_get_label_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of {@code frame}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_frame_set_child(handle(), child.handle());
    }
    
    /**
     * Creates a new {@code GtkLabel} with the {@code label} and sets it as the frame's
     * label widget.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_frame_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets the X alignment of the frame widget’s label.
     * <p>
     * The default value for a newly created frame is 0.0.
     */
    public void setLabelAlign(float xalign) {
        gtk_h.gtk_frame_set_label_align(handle(), xalign);
    }
    
    /**
     * Sets the label widget for the frame.
     * <p>
     * This is the widget that will appear embedded in the top edge
     * of the frame as a title.
     */
    public void setLabelWidget(Widget labelWidget) {
        gtk_h.gtk_frame_set_label_widget(handle(), labelWidget.handle());
    }
    
}
