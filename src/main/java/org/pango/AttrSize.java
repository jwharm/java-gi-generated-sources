package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrSize} structure is used to represent attributes which
 * set font size.
 */
public class AttrSize extends io.github.jwharm.javagi.ResourceBase {

    public AttrSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_attr_size_new = Interop.downcallHandle(
        "pango_attr_size_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font-size attribute in fractional points.
     */
    public static Attribute new_(int size) {
        try {
            var RESULT = (MemoryAddress) pango_attr_size_new.invokeExact(size);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_size_new_absolute = Interop.downcallHandle(
        "pango_attr_size_new_absolute",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font-size attribute in device units.
     */
    public static Attribute newAbsolute(int size) {
        try {
            var RESULT = (MemoryAddress) pango_attr_size_new_absolute.invokeExact(size);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
