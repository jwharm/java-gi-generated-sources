package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrSize} structure is used to represent attributes which
 * set font size.
 */
public class AttrSize extends io.github.jwharm.javagi.ResourceBase {

    public AttrSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_attr_size_new = Interop.downcallHandle(
        "pango_attr_size_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font-size attribute in fractional points.
     */
    public static @NotNull Attribute new_(@NotNull int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_size_new.invokeExact(size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_size_new_absolute = Interop.downcallHandle(
        "pango_attr_size_new_absolute",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font-size attribute in device units.
     */
    public static @NotNull Attribute newAbsolute(@NotNull int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_size_new_absolute.invokeExact(size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
}
