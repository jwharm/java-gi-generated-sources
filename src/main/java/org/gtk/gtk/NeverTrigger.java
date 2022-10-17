package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that never triggers.
 */
public class NeverTrigger extends ShortcutTrigger {

    public NeverTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NeverTrigger */
    public static NeverTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new NeverTrigger(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_never_trigger_get = Interop.downcallHandle(
        "gtk_never_trigger_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the never trigger.
     * <p>
     * This is a singleton for a trigger that never triggers.
     * Use this trigger instead of {@code null} because it implements
     * all virtual functions.
     */
    public static @NotNull NeverTrigger get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_never_trigger_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NeverTrigger(Refcounted.get(RESULT, false));
    }
    
}
