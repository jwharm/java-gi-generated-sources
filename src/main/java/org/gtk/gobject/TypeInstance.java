package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used as the base of all type instances.
 */
public class TypeInstance extends io.github.jwharm.javagi.ResourceBase {

    public TypeInstance(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_type_instance_get_private = Interop.downcallHandle(
        "g_type_instance_get_private",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public @Nullable java.lang.foreign.MemoryAddress getPrivate(@NotNull org.gtk.gobject.Type privateType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_instance_get_private.invokeExact(handle(), privateType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
