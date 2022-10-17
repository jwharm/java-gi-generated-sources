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
 * 
 * <h1>CSS nodes</h1>
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
public class EditableLabel extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public EditableLabel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EditableLabel */
    public static EditableLabel castFrom(org.gtk.gobject.Object gobject) {
        return new EditableLabel(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_editable_label_new = Interop.downcallHandle(
        "gtk_editable_label_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String str) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_editable_label_new.invokeExact(Interop.allocateNativeString(str)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkEditableLabel} widget.
     */
    public EditableLabel(@NotNull java.lang.String str) {
        super(constructNew(str));
    }
    
    private static final MethodHandle gtk_editable_label_get_editing = Interop.downcallHandle(
        "gtk_editable_label_get_editing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the label is currently in “editing mode”.
     */
    public boolean getEditing() {
        int RESULT;
        try {
            RESULT = (int) gtk_editable_label_get_editing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_editable_label_start_editing = Interop.downcallHandle(
        "gtk_editable_label_start_editing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Switches the label into “editing mode”.
     */
    public @NotNull void startEditing() {
        try {
            gtk_editable_label_start_editing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_editable_label_stop_editing = Interop.downcallHandle(
        "gtk_editable_label_stop_editing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Switches the label out of “editing mode”.
     * <p>
     * If {@code commit} is {@code true}, the resulting text is kept as the
     * {@code Gtk.Editable:text} property value, otherwise the
     * resulting text is discarded and the label will keep its
     * previous {@code Gtk.Editable:text} property value.
     */
    public @NotNull void stopEditing(@NotNull boolean commit) {
        try {
            gtk_editable_label_stop_editing.invokeExact(handle(), commit ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
