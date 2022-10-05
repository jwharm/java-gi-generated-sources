package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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

    public Frame(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Frame */
    public static Frame castFrom(org.gtk.gobject.Object gobject) {
        return new Frame(gobject.refcounted());
    }
    
    static final MethodHandle gtk_frame_new = Interop.downcallHandle(
        "gtk_frame_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_frame_new.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkFrame}, with optional label {@code label}.
     * <p>
     * If {@code label} is {@code null}, the label is omitted.
     */
    public Frame(java.lang.String label) {
        super(constructNew(label));
    }
    
    static final MethodHandle gtk_frame_get_child = Interop.downcallHandle(
        "gtk_frame_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code frame}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_frame_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_get_label = Interop.downcallHandle(
        "gtk_frame_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the frame labels text.
     * <p>
     * If the frame's label widget is not a {@code GtkLabel}, {@code null}
     * is returned.
     */
    public java.lang.String getLabel() {
        try {
            var RESULT = (MemoryAddress) gtk_frame_get_label.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_get_label_align = Interop.downcallHandle(
        "gtk_frame_get_label_align",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the X alignment of the frame’s label.
     */
    public float getLabelAlign() {
        try {
            var RESULT = (float) gtk_frame_get_label_align.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_get_label_widget = Interop.downcallHandle(
        "gtk_frame_get_label_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the label widget for the frame.
     */
    public Widget getLabelWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_frame_get_label_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_set_child = Interop.downcallHandle(
        "gtk_frame_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code frame}.
     */
    public void setChild(Widget child) {
        try {
            gtk_frame_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_set_label = Interop.downcallHandle(
        "gtk_frame_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GtkLabel} with the {@code label} and sets it as the frame's
     * label widget.
     */
    public void setLabel(java.lang.String label) {
        try {
            gtk_frame_set_label.invokeExact(handle(), Interop.allocateNativeString(label).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_set_label_align = Interop.downcallHandle(
        "gtk_frame_set_label_align",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the X alignment of the frame widget’s label.
     * <p>
     * The default value for a newly created frame is 0.0.
     */
    public void setLabelAlign(float xalign) {
        try {
            gtk_frame_set_label_align.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_frame_set_label_widget = Interop.downcallHandle(
        "gtk_frame_set_label_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label widget for the frame.
     * <p>
     * This is the widget that will appear embedded in the top edge
     * of the frame as a title.
     */
    public void setLabelWidget(Widget labelWidget) {
        try {
            gtk_frame_set_label_widget.invokeExact(handle(), labelWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}