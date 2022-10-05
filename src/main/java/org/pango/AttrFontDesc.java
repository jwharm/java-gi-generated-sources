package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrFontDesc} structure is used to store an attribute that
 * sets all aspects of the font description at once.
 */
public class AttrFontDesc extends io.github.jwharm.javagi.ResourceBase {

    public AttrFontDesc(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_attr_font_desc_new = Interop.downcallHandle(
        "pango_attr_font_desc_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new font description attribute.
     * <p>
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     */
    public static Attribute new_(FontDescription desc) {
        try {
            var RESULT = (MemoryAddress) pango_attr_font_desc_new.invokeExact(desc.handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
