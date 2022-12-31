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
    
    private static final java.lang.String C_TYPE_NAME = "GtkFrame";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Frame proxy instance for the provided memory address.
     * <p>
     * Because Frame is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Frame(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Frame> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Frame(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String label) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_new.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)));
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
        super(constructNew(label), Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code frame}.
     * @return the child widget of {@code frame}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_get_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the X alignment of the frame’s label.
     * @return the frames X alignment
     */
    public float getLabelAlign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_frame_get_label_align.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_frame_get_label_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the child widget of {@code frame}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_frame_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
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
        try {
            DowncallHandles.gtk_frame_set_label.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)));
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
            DowncallHandles.gtk_frame_set_label_align.invokeExact(
                    handle(),
                    xalign);
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
        try {
            DowncallHandles.gtk_frame_set_label_widget.invokeExact(
                    handle(),
                    (Addressable) (labelWidget == null ? MemoryAddress.NULL : labelWidget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_frame_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Frame.Builder} object constructs a {@link Frame} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Frame.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Frame} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Frame}.
         * @return A new instance of {@code Frame} with the properties 
         *         that were set in the Builder object.
         */
        public Frame build() {
            return (Frame) org.gtk.gobject.GObject.newWithProperties(
                Frame.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Text of the frame's label.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * Widget to display in place of the usual frame label.
         * @param labelWidget The value for the {@code label-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabelWidget(org.gtk.gtk.Widget labelWidget) {
            names.add("label-widget");
            values.add(org.gtk.gobject.Value.create(labelWidget));
            return this;
        }
        
        /**
         * The horizontal alignment of the label.
         * @param labelXalign The value for the {@code label-xalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabelXalign(float labelXalign) {
            names.add("label-xalign");
            values.add(org.gtk.gobject.Value.create(labelXalign));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_frame_new = Interop.downcallHandle(
            "gtk_frame_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_get_child = Interop.downcallHandle(
            "gtk_frame_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_get_label = Interop.downcallHandle(
            "gtk_frame_get_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_get_label_align = Interop.downcallHandle(
            "gtk_frame_get_label_align",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_get_label_widget = Interop.downcallHandle(
            "gtk_frame_get_label_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_set_child = Interop.downcallHandle(
            "gtk_frame_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_set_label = Interop.downcallHandle(
            "gtk_frame_set_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_set_label_align = Interop.downcallHandle(
            "gtk_frame_set_label_align",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_frame_set_label_widget = Interop.downcallHandle(
            "gtk_frame_set_label_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_frame_get_type = Interop.downcallHandle(
            "gtk_frame_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
