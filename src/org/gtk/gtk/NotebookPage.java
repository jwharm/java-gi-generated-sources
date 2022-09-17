package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkNotebookPage</code> is an auxiliary object used by <code>GtkNotebook</code>.
 */
public class NotebookPage extends org.gtk.gobject.Object {

    public NotebookPage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NotebookPage */
    public static NotebookPage castFrom(org.gtk.gobject.Object gobject) {
        return new NotebookPage(gobject.getReference());
    }
    
    /**
     * Returns the notebook child to which @page belongs.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_notebook_page_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
}
