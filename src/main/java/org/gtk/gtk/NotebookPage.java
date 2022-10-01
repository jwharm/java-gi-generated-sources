package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkNotebookPage} is an auxiliary object used by {@code GtkNotebook}.
 */
public class NotebookPage extends org.gtk.gobject.Object {

    public NotebookPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NotebookPage */
    public static NotebookPage castFrom(org.gtk.gobject.Object gobject) {
        return new NotebookPage(gobject.refcounted());
    }
    
    /**
     * Returns the notebook child to which {@code page} belongs.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_notebook_page_get_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
}
