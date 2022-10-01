package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>CSS nodes</h1>
 * <p>
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
    
    private static Refcounted constructNew(java.lang.String str) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_editable_label_new(Interop.allocateNativeString(str).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEditableLabel} widget.
     */
    public EditableLabel(java.lang.String str) {
        super(constructNew(str));
    }
    
    /**
     * Returns whether the label is currently in “editing mode”.
     */
    public boolean getEditing() {
        var RESULT = gtk_h.gtk_editable_label_get_editing(handle());
        return RESULT != 0;
    }
    
    /**
     * Switches the label into “editing mode”.
     */
    public void startEditing() {
        gtk_h.gtk_editable_label_start_editing(handle());
    }
    
    /**
     * Switches the label out of “editing mode”.
     * <p>
     * If {@code commit} is {@code true}, the resulting text is kept as the
     * {@code Gtk.Editable:text} property value, otherwise the
     * resulting text is discarded and the label will keep its
     * previous {@code Gtk.Editable:text} property value.
     */
    public void stopEditing(boolean commit) {
        gtk_h.gtk_editable_label_stop_editing(handle(), commit ? 1 : 0);
    }
    
}
