package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding variation data. Registered OpenType
 * variation-axis tags are listed in
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg">OpenType Axis Tag Registry</a>.
 */
public class VariationT extends io.github.jwharm.javagi.ResourceBase {

    public VariationT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle hb_variation_to_string = Interop.downcallHandle(
        "hb_variation_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link variation_t} into a {@code null}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public @NotNull void String(@NotNull Out<java.lang.String[]> buf, @NotNull Out<Integer> size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_variation_to_string.invokeExact(handle(), (Addressable) bufPOINTER.address(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] bufARRAY = new java.lang.String[size.get().intValue()];
        for (int I = 0; I < size.get().intValue(); I++) {
            var OBJ = bufPOINTER.get(ValueLayout.ADDRESS, I);
            bufARRAY[I] = OBJ.getUtf8String(0);
        }
        buf.set(bufARRAY);
    }
    
}
