package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAssistantPage} is an auxiliary object used by `GtkAssistant.
 */
public class AssistantPage extends org.gtk.gobject.Object {

    public AssistantPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AssistantPage */
    public static AssistantPage castFrom(org.gtk.gobject.Object gobject) {
        return new AssistantPage(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_assistant_page_get_child = Interop.downcallHandle(
        "gtk_assistant_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the child to which {@code page} belongs.
     */
    public @NotNull Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_assistant_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
}
