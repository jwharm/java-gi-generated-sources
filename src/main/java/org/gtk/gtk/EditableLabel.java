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
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EditableLabel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EditableLabel if its GType is a (or inherits from) "GtkEditableLabel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EditableLabel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEditableLabel", a ClassCastException will be thrown.
     */
    public static EditableLabel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), EditableLabel.getType())) {
            return new EditableLabel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEditableLabel");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_editable_label_new.invokeExact(
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEditableLabel} widget.
     * @param str the text for the label
     */
    public EditableLabel(@NotNull java.lang.String str) {
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
        return RESULT != 0;
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
                    commit ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_editable_label_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link EditableLabel.Build} object constructs a {@link EditableLabel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EditableLabel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EditableLabel} using {@link EditableLabel#castFrom}.
         * @return A new instance of {@code EditableLabel} with the properties 
         *         that were set in the Build object.
         */
        public EditableLabel construct() {
            return EditableLabel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EditableLabel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * This property is {@code true} while the widget is in edit mode.
         * @param editing The value for the {@code editing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEditing(boolean editing) {
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
