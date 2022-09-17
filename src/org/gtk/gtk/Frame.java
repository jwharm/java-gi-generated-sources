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
 * {@link org.gtk.gtk.Frame#setLabelAlign}.
 * <p><code>GtkFrame</code> clips its child. You can use this to add rounded corners
 * to widgets, but be aware that it also cuts off shadows.
 * <p>
 * <h1>tkFrame as GtkBuildable</h1>
 * <p>
 * The <code>GtkFrame</code> implementation of the <code>GtkBuildable</code> interface supports
 * placing a child in the label position by specifying &#8220;label&#8221; as the
 * &#8220;type&#8221; attribute of a &#60;child&#62; element. A normal content child can
 * be specified without specifying a &#60;child&#62; type attribute.
 * <p>
 * An example of a UI definition fragment with GtkFrame:<pre>xml
 * &#60;object class=&#34;GtkFrame&#34;&#62;
 *   &#60;child type=&#34;label&#34;&#62;
 *     &#60;object class=&#34;GtkLabel&#34; id=&#34;frame_label&#34;/&#62;
 *   &#60;/child&#62;
 *   &#60;child&#62;
 *     &#60;object class=&#34;GtkEntry&#34; id=&#34;frame_content&#34;/&#62;
 *   &#60;/child&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * frame
 * &#9500;&#9472;&#9472; &#60;label widget&#62;
 * &#9584;&#9472;&#9472; &#60;child&#62;
 * </pre>
 * <p><code>GtkFrame</code> has a main CSS node with name &#8220;frame&#8221;, which is used to draw the
 * visible border. You can set the appearance of the border using CSS properties
 * like &#8220;border-style&#8221; on this node.
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
     * If @label is <code>NULL,</code> the label is omitted.
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
     * If the frame&#39;s label widget is not a <code>GtkLabel</code>, <code>NULL
     * is</code> returned.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_frame_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the X alignment of the frame&#8217;s label.
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
     * Creates a new <code>GtkLabel</code> with the @label and sets it as the frame&#39;s
     * label widget.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_frame_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets the X alignment of the frame widget&#8217;s label.
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
