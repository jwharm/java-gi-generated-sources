package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SimpleActionGroup} is a hash table filled with {@link Action} objects,
 * implementing the {@link ActionGroup} and {@link ActionMap} interfaces.
 */
public class SimpleActionGroup extends org.gtk.gobject.Object implements ActionGroup, ActionMap {

    public SimpleActionGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SimpleActionGroup */
    public static SimpleActionGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleActionGroup(gobject.refcounted());
    }
    
    private static final MethodHandle g_simple_action_group_new = Interop.downcallHandle(
        "g_simple_action_group_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_simple_action_group_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new, empty, {@link SimpleActionGroup}.
     */
    public SimpleActionGroup() {
        super(constructNew());
    }
    
}
