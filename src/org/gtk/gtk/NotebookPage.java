package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkNotebookPage` is an auxiliary object used by `GtkNotebook`.
 */
public class NotebookPage extends org.gtk.gobject.Object {

    public NotebookPage(io.github.jwharm.javagi.interop.Reference reference) {
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_notebook_page_get_child(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
}
