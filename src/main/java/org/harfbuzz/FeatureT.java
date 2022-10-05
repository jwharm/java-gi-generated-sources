package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link feature_t} is the structure that holds information about requested
 * feature application. The feature will be applied with the given value to all
 * glyphs which are in clusters between {@code start} (inclusive) and {@code end} (exclusive).
 * Setting start to {@code HB_FEATURE_GLOBAL_START} and end to {@code HB_FEATURE_GLOBAL_END}
 * specifies that the feature always applies to the entire buffer.
 */
public class FeatureT extends io.github.jwharm.javagi.ResourceBase {

    public FeatureT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle hb_feature_to_string = Interop.downcallHandle(
        "hb_feature_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a {@link feature_t} into a {@code null}-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public void String(java.lang.String[] buf, int size) {
        try {
            hb_feature_to_string.invokeExact(handle(), Interop.allocateNativeArray(buf).handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
