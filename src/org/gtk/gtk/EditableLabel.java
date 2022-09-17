package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkEditableLabel</code> is a label that allows users to
 * edit the text by switching to an &#8220;edit mode&#8221;.
 * <p>
 * !{@link [An example GtkEditableLabel]}(editable-label.png)
 * <p><code>GtkEditableLabel</code> does not have API of its own, but it
 * implements the {@link [iface@Gtk.Editable] (ref=iface)} interface.
 * <p>
 * The default bindings for activating the edit mode is
 * to click or press the Enter key. The default bindings
 * for leaving the edit mode are the Enter key (to save
 * the results) or the Escape key (to cancel the editing).
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * editablelabel{@link [.editing]}
 * &#9584;&#9472;&#9472; stack
 *     &#9500;&#9472;&#9472; label
 *     &#9584;&#9472;&#9472; text
 * </pre>
 * <p><code>GtkEditableLabel</code> has a main node with the name editablelabel.
 * When the entry is in editing mode, it gets the .editing style
 * class.
 * 
 * For all the subnodes added to the text node in various situations,
 * see {@link org.gtk.gtk.Text}.
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
     * Creates a new <code>GtkEditableLabel</code> widget.
     */
    public EditableLabel(java.lang.String str) {
        super(constructNew(str));
    }
    
    /**
     * Returns whether the label is currently in &#8220;editing mode&#8221;.
     */
    public boolean getEditing() {
        var RESULT = gtk_h.gtk_editable_label_get_editing(handle());
        return (RESULT != 0);
    }
    
    /**
     * Switches the label into &#8220;editing mode&#8221;.
     */
    public void startEditing() {
        gtk_h.gtk_editable_label_start_editing(handle());
    }
    
    /**
     * Switches the label out of &#8220;editing mode&#8221;.
     * 
     * If @commit is <code>TRUE,</code> the resulting text is kept as the
     * {@link [property@Gtk.Editable:text] (ref=property)} property value, otherwise the
     * resulting text is discarded and the label will keep its
     * previous {@link [property@Gtk.Editable:text] (ref=property)} property value.
     */
    public void stopEditing(boolean commit) {
        gtk_h.gtk_editable_label_stop_editing(handle(), commit ? 1 : 0);
    }
    
}
