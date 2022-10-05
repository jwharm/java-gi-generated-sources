package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link TypeValueTable} provides the functions required by the {@link Value}
 * implementation, to serve as a container for values of a type.
 */
public class TypeValueTable extends io.github.jwharm.javagi.ResourceBase {

    public TypeValueTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
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
    public static TypeValueTable peek(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_value_table_peek.invokeExact(type.getValue());
            return new TypeValueTable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
