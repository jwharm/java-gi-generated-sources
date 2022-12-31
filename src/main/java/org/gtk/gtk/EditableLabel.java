package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkEditableLabel} is a label that allows users to
 * edit the text by switching to an “edit mode”.
 * <p>
 * <img src="./doc-files/editable-label.png" alt="An example GtkEditableLabel">
 * <p>
 * {@code GtkEditableLabel} does not have API of its own, but it
 * implements the {@code Gtk.Editable} interface.
 * <p>
 * The default bindings for activating the edit mode is
 * to click or press the Enter key. The default bindings
 * for leaving the edit mode are the Enter key (to save
 * the results) or the Escape key (to cancel the editing).
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * editablelabel[.editing]
 * ╰── stack
 *     ├── label
 *     ╰── text
 * }</pre>
 * <p>
 * {@code GtkEditableLabel} has a main node with the name editablelabel.
 * When the entry is in editing mode, it gets the .editing style
 * class.
 * <p>
 * For all the subnodes added to the text node in various situations,
 * see {@link Text}.
 */
public class EditableLabel extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEditableLabel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EditableLabel proxy instance for the provided memory address.
     * <p>
     * Because EditableLabel is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EditableLabel(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, EditableLabel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EditableLabel(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String str) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_editable_label_new.invokeExact(
                    Marshal.stringToAddress.marshal(str, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEditableLabel} widget.
     * @param str the text for the label
     */
    public EditableLabel(java.lang.String str) {
        super(constructNew(str), Ownership.NONE);
    }
    
    /**
     * Returns whether the label is currently in “editing mode”.
     * @return {@code true} if {@code self} is currently in editing mode
     */
    public boolean getEditing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_label_get_editing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Switches the label into “editing mode”.
     */
    public void startEditing() {
        try {
            DowncallHandles.gtk_editable_label_start_editing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Switches the label out of “editing mode”.
     * <p>
     * If {@code commit} is {@code true}, the resulting text is kept as the
     * {@code Gtk.Editable:text} property value, otherwise the
     * resulting text is discarded and the label will keep its
     * previous {@code Gtk.Editable:text} property value.
     * @param commit whether to set the edited text on the label
     */
    public void stopEditing(boolean commit) {
        try {
            DowncallHandles.gtk_editable_label_stop_editing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(commit, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_editable_label_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EditableLabel.Builder} object constructs a {@link EditableLabel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EditableLabel.Builder#build()}. 
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
         * Finish building the {@link EditableLabel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EditableLabel}.
         * @return A new instance of {@code EditableLabel} with the properties 
         *         that were set in the Builder object.
         */
        public EditableLabel build() {
            return (EditableLabel) org.gtk.gobject.GObject.newWithProperties(
                EditableLabel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * This property is {@code true} while the widget is in edit mode.
         * @param editing The value for the {@code editing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEditing(boolean editing) {
            names.add("editing");
            values.add(org.gtk.gobject.Value.create(editing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_editable_label_new = Interop.downcallHandle(
            "gtk_editable_label_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_editable_label_get_editing = Interop.downcallHandle(
            "gtk_editable_label_get_editing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_editable_label_start_editing = Interop.downcallHandle(
            "gtk_editable_label_start_editing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_editable_label_stop_editing = Interop.downcallHandle(
            "gtk_editable_label_stop_editing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_editable_label_get_type = Interop.downcallHandle(
            "gtk_editable_label_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
