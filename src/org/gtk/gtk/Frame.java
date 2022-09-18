package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFrame</code> is a widget that surrounds its child with a decorative
 * frame and an optional label.
 * <p>
 * !{@link [An example GtkFrame]}(frame.png)
 * <p>
 * If present, the label is drawn inside the top edge of the frame.
 * The horizontal position of the label can be controlled with
 * {@link org.gtk.gtk.Frame<code>#setLabelAlign</code> .
 * <p><code>GtkFrame</code> clips its child. You can use this to add rounded corners
 * to widgets, but be aware that it also cuts off shadows.
 * <p>
 * <h1>GtkFrame as GtkBuildable</h1>
 * <p>
 * The <code>GtkFrame</code> implementation of the <code>GtkBuildable</code> interface supports
 * placing a child in the label position by specifying &<code>#8220</code> label&<code>#8221</code>  as the
 * &<code>#8220</code> type&<code>#8221</code>  attribute of a &<code>#60</code> child&<code>#62</code>  element. A normal content child can
 * be specified without specifying a &<code>#60</code> child&<code>#62</code>  type attribute.
 * <p>
 * An example of a UI definition fragment with GtkFrame:<pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkFrame&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> child type=&<code>#34</code> label&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkLabel&<code>#34</code>  id=&<code>#34</code> frame_label&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /child&<code>#62</code> 
 *   &<code>#60</code> child&<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkEntry&<code>#34</code>  id=&<code>#34</code> frame_content&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /child&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * frame
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  &<code>#60</code> label widget&<code>#62</code> 
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  &<code>#60</code> child&<code>#62</code> 
 * </pre>
 * <p><code>GtkFrame</code> has a main CSS node with name &<code>#8220</code> frame&<code>#8221</code> , which is used to draw the
 * visible border. You can set the appearance of the border using CSS properties
 * like &<code>#8220</code> border-style&<code>#8221</code>  on this node.
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
     * Creates a new <code>GtkFrame</code>, with optional label @label.
     * 
     * If @label is <code>null</code>  the label is omitted.
     */
    public Frame(java.lang.String label) {
        super(constructNew(label));
    }
    
    /**
     * Gets the child widget of @frame.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_frame_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the frame labels text.
     * <p>
     * If the frame&<code>#39</code> s label widget is not a <code>GtkLabel</code>, <code>null</code> is returned.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_frame_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the X alignment of the frame&<code>#8217</code> s label.
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
     * Sets the child widget of @frame.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_frame_set_child(handle(), child.handle());
    }
    
    /**
     * Creates a new <code>GtkLabel</code> with the @label and sets it as the frame&<code>#39</code> s
     * label widget.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_frame_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets the X alignment of the frame widget&<code>#8217</code> s label.
     * 
     * The default value for a newly created frame is 0.0.
     */
    public void setLabelAlign(float xalign) {
        gtk_h.gtk_frame_set_label_align(handle(), xalign);
    }
    
    /**
     * Sets the label widget for the frame.
     * 
     * This is the widget that will appear embedded in the top edge
     * of the frame as a title.
     */
    public void setLabelWidget(Widget labelWidget) {
        gtk_h.gtk_frame_set_label_widget(handle(), labelWidget.handle());
    }
    
}
