package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkEditableLabel` is a label that allows users to
 * edit the text by switching to an “edit mode”.
 * 
 * ![An example GtkEditableLabel](editable-label.png)
 * 
 * `GtkEditableLabel` does not have API of its own, but it
 * implements the [iface@Gtk.Editable] interface.
 * 
 * The default bindings for activating the edit mode is
 * to click or press the Enter key. The default bindings
 * for leaving the edit mode are the Enter key (to save
 * the results) or the Escape key (to cancel the editing).
 * 
 * # CSS nodes
 * 
 * ```
 * editablelabel[.editing]
 * ╰── stack
 *     ├── label
 *     ╰── text
 * ```
 * 
 * `GtkEditableLabel` has a main node with the name editablelabel.
 * When the entry is in editing mode, it gets the .editing style
 * class.
 * 
 * For all the subnodes added to the text node in various situations,
 * see [class@Gtk.Text].
 */
public class EditableLabel extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public EditableLabel(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EditableLabel */
    public static EditableLabel castFrom(org.gtk.gobject.Object gobject) {
        return new EditableLabel(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkEditableLabel` widget.
     */
    public EditableLabel(java.lang.String str) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_editable_label_new(Interop.allocateNativeString(str).HANDLE()), false));
    }
    
    /**
     * Returns whether the label is currently in “editing mode”.
     */
    public boolean getEditing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_editable_label_get_editing(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Switches the label into “editing mode”.
     */
    public void startEditing() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_editable_label_start_editing(HANDLE());
    }
    
    /**
     * Switches the label out of “editing mode”.
     * 
     * If @commit is %TRUE, the resulting text is kept as the
     * [property@Gtk.Editable:text] property value, otherwise the
     * resulting text is discarded and the label will keep its
     * previous [property@Gtk.Editable:text] property value.
     */
    public void stopEditing(boolean commit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_editable_label_stop_editing(HANDLE(), commit ? 1 : 0);
    }
    
}
