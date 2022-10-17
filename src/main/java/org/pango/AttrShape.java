package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrShape} structure is used to represent attributes which
 * impose shape restrictions.
 */
public class AttrShape extends io.github.jwharm.javagi.ResourceBase {

    public AttrShape(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_attr_shape_new = Interop.downcallHandle(
        "pango_attr_shape_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new shape attribute.
     * <p>
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a {@code PangoLayout}.
     */
    public static @NotNull Attribute new_(@NotNull Rectangle inkRect, @NotNull Rectangle logicalRect) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_shape_new.invokeExact(inkRect.handle(), logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_shape_new_with_data = Interop.downcallHandle(
        "pango_attr_shape_new_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new shape attribute.
     * <p>
     * Like {@link Pango#AttrShape}, but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     */
    public static @NotNull Attribute newWithData(@NotNull Rectangle inkRect, @NotNull Rectangle logicalRect, @Nullable AttrDataCopyFunc copyFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_shape_new_with_data.invokeExact(inkRect.handle(), logicalRect.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(copyFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.class, "__cbAttrDataCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
}
