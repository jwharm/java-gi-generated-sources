package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkNotebookPage} is an auxiliary object used by {@code GtkNotebook}.
 */
public class NotebookPage extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNotebookPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public NotebookPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NotebookPage if its GType is a (or inherits from) "GtkNotebookPage".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NotebookPage" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNotebookPage", a ClassCastException will be thrown.
     */
    public static NotebookPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkNotebookPage"))) {
            return new NotebookPage(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNotebookPage");
        }
    }
    
    /**
     * Returns the notebook child to which {@code page} belongs.
     * @return the child to which {@code page} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_notebook_page_get_child = Interop.downcallHandle(
            "gtk_notebook_page_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
