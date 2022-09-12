package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public EditableLabel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EditableLabel */
    public static EditableLabel castFrom(org.gtk.gobject.Object gobject) {
        return new EditableLabel(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String str) {
        Reference RESULT = References.get(gtk_h.gtk_editable_label_new(Interop.allocateNativeString(str).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkEditableLabel` widget.
     */
    public EditableLabel(java.lang.String str) {
        super(constructNew(str));
    }
    
    /**
     * Returns whether the label is currently in “editing mode”.
     */
    public boolean getEditing() {
        var RESULT = gtk_h.gtk_editable_label_get_editing(handle());
        return (RESULT != 0);
    }
    
    /**
     * Switches the label into “editing mode”.
     */
    public void startEditing() {
        gtk_h.gtk_editable_label_start_editing(handle());
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
        gtk_h.gtk_editable_label_stop_editing(handle(), commit ? 1 : 0);
    }
    
}
