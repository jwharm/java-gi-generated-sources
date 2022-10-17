package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for languages. Each {@link language_t} corresponds to a BCP 47
 * language tag.
 */
public class LanguageT extends io.github.jwharm.javagi.ResourceBase {

    public LanguageT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle hb_language_to_string = Interop.downcallHandle(
        "hb_language_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link language_t} to a string.
     */
    public @NotNull java.lang.String String() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_language_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
