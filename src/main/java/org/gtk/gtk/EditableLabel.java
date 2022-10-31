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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public EditableLabel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to EditableLabel if its GType is a (or inherits from) "GtkEditableLabel".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "EditableLabel" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEditableLabel", a ClassCastException will be thrown.
     */
    public static EditableLabel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkEditableLabel"))) {
            return new EditableLabel(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEditableLabel");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_editable_label_new.invokeExact(
                    Interop.allocateNativeString(str)), false);
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
        super(constructNew(str));
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_editable_label_new = Interop.downcallHandle(
            "gtk_editable_label_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_editable_label_get_editing = Interop.downcallHandle(
            "gtk_editable_label_get_editing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_editable_label_start_editing = Interop.downcallHandle(
            "gtk_editable_label_start_editing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_editable_label_stop_editing = Interop.downcallHandle(
            "gtk_editable_label_stop_editing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
