package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SimplePermission} is a trivial implementation of {@link Permission} that
 * represents a permission that is either always or never allowed.  The
 * value is given at construction and doesn't change.
 * <p>
 * Calling request or release will result in errors.
 */
public class SimplePermission extends Permission {

    public SimplePermission(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SimplePermission */
    public static SimplePermission castFrom(org.gtk.gobject.Object gobject) {
        return new SimplePermission(gobject.refcounted());
    }
    
    private static final MethodHandle g_simple_permission_new = Interop.downcallHandle(
        "g_simple_permission_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull boolean allowed) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_simple_permission_new.invokeExact(allowed ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Permission} instance that represents an action that is
     * either always or never allowed.
     */
    public SimplePermission(@NotNull boolean allowed) {
        super(constructNew(allowed));
    }
    
}
