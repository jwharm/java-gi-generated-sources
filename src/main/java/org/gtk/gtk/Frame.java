package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>GtkFrame as GtkBuildable</strong><br/>
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
 * <strong>CSS nodes</strong><br/>
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
public class Frame extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName("GtkFrame");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Frame(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Frame */
    public static Frame castFrom(org.gtk.gobject.Object gobject) {
        return new Frame(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String label) {
        java.util.Objects.requireNonNullElse(label, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_frame_new.invokeExact(Interop.allocateNativeString(label)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFrame}, with optional label {@code label}.
     * <p>
     * If {@code label} is {@code null}, the label is omitted.
     * @param label the text to use as the label of the frame
     */
    public Frame(@Nullable java.lang.String label) {
        super(constructNew(label));
    }
    
    /**
     * Gets the child widget of {@code frame}.
     * @return the child widget of {@code frame}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the frame labels text.
     * <p>
     * If the frame's label widget is not a {@code GtkLabel}, {@code null}
     * is returned.
     * @return the text in the label, or {@code null} if there
     *    was no label widget or the label widget was not a {@code GtkLabel}.
     *    This string is owned by GTK and must not be modified or freed.
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the X alignment of the frame’s label.
     * @return the frames X alignment
     */
    public float getLabelAlign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_frame_get_label_align.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the label widget for the frame.
     * @return the label widget
     */
    public @Nullable org.gtk.gtk.Widget getLabelWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_get_label_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of {@code frame}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNullElse(child, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_frame_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkLabel} with the {@code label} and sets it as the frame's
     * label widget.
     * @param label the text to use as the label of the frame
     */
    public void setLabel(@Nullable java.lang.String label) {
        java.util.Objects.requireNonNullElse(label, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_frame_set_label.invokeExact(handle(), Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the X alignment of the frame widget’s label.
     * <p>
     * The default value for a newly created frame is 0.0.
     * @param xalign The position of the label along the top edge
     *   of the widget. A value of 0.0 represents left alignment;
     *   1.0 represents right alignment.
     */
    public void setLabelAlign(float xalign) {
        try {
            DowncallHandles.gtk_frame_set_label_align.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the label widget for the frame.
     * <p>
     * This is the widget that will appear embedded in the top edge
     * of the frame as a title.
     * @param labelWidget the new label widget
     */
    public void setLabelWidget(@Nullable org.gtk.gtk.Widget labelWidget) {
        java.util.Objects.requireNonNullElse(labelWidget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_frame_set_label_widget.invokeExact(handle(), labelWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_frame_new = Interop.downcallHandle(
            "gtk_frame_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_get_child = Interop.downcallHandle(
            "gtk_frame_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_get_label = Interop.downcallHandle(
            "gtk_frame_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_get_label_align = Interop.downcallHandle(
            "gtk_frame_get_label_align",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_get_label_widget = Interop.downcallHandle(
            "gtk_frame_get_label_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_set_child = Interop.downcallHandle(
            "gtk_frame_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_set_label = Interop.downcallHandle(
            "gtk_frame_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_frame_set_label_align = Interop.downcallHandle(
            "gtk_frame_set_label_align",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gtk_frame_set_label_widget = Interop.downcallHandle(
            "gtk_frame_set_label_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
