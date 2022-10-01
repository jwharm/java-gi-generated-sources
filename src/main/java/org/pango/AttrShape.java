package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrShape} structure is used to represent attributes which
 * impose shape restrictions.
 */
public class AttrShape extends io.github.jwharm.javagi.ResourceBase {

    public AttrShape(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AttrShape() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoAttrShape.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Create a new shape attribute.
     * <p>
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a {@code PangoLayout}.
     */
    public static Attribute new_(Rectangle inkRect, Rectangle logicalRect) {
        var RESULT = gtk_h.pango_attr_shape_new(inkRect.handle(), logicalRect.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Creates a new shape attribute.
     * <p>
     * Like {@link Pango#AttrShape}, but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     */
    public static Attribute newWithData(Rectangle inkRect, Rectangle logicalRect, AttrDataCopyFunc copyFunc) {
        try {
            var RESULT = gtk_h.pango_attr_shape_new_with_data(inkRect.handle(), logicalRect.handle(), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(copyFunc.hashCode(), copyFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.class, "__cbAttrDataCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol());
            return new Attribute(References.get(RESULT, true));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
}
