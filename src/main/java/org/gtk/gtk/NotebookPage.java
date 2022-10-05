package org.gtk.gtk;

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
    
    static final MethodHandle gtk_notebook_page_get_child = Interop.downcallHandle(
        "gtk_notebook_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the notebook child to which {@code page} belongs.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_notebook_page_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
