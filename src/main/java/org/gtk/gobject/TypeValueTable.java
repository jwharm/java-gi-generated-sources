package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TypeValueTable} provides the functions required by the {@link Value}
 * implementation, to serve as a container for values of a type.
 */
public class TypeValueTable extends io.github.jwharm.javagi.ResourceBase {

    public TypeValueTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
        "g_type_value_table_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     */
    public static @NotNull TypeValueTable peek(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_value_table_peek.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeValueTable(Refcounted.get(RESULT, false));
    }
    
}
