package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrLanguage} structure is used to represent attributes that
 * are languages.
 */
public class AttrLanguage extends io.github.jwharm.javagi.ResourceBase {

    public AttrLanguage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_attr_language_new = Interop.downcallHandle(
        "pango_attr_language_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new language tag attribute.
     */
    public static @NotNull Attribute new_(@NotNull Language language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_language_new.invokeExact(language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
}
