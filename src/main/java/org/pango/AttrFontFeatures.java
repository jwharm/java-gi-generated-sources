package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrFontFeatures} structure is used to represent OpenType
 * font features as an attribute.
 */
public class AttrFontFeatures extends io.github.jwharm.javagi.ResourceBase {

    public AttrFontFeatures(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_attr_font_features_new = Interop.downcallHandle(
        "pango_attr_font_features_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new font features tag attribute.
     * <p>
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     */
    public static @NotNull Attribute new_(@NotNull java.lang.String features) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_font_features_new.invokeExact(Interop.allocateNativeString(features));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
}
