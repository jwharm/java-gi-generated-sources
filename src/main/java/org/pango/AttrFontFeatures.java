package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrFontFeatures} structure is used to represent OpenType
 * font features as an attribute.
 */
public class AttrFontFeatures extends io.github.jwharm.javagi.ResourceBase {

    public AttrFontFeatures(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_attr_font_features_new = Interop.downcallHandle(
        "pango_attr_font_features_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new font features tag attribute.
     * <p>
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     */
    public static Attribute new_(java.lang.String features) {
        try {
            var RESULT = (MemoryAddress) pango_attr_font_features_new.invokeExact(Interop.allocateNativeString(features).handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
