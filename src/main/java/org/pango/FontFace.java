package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFontFace} is used to represent a group of fonts with
 * the same family, slant, weight, and width, but varying sizes.
 */
public class FontFace extends org.gtk.gobject.Object {

    public FontFace(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontFace */
    public static FontFace castFrom(org.gtk.gobject.Object gobject) {
        return new FontFace(gobject.refcounted());
    }
    
    static final MethodHandle pango_font_face_describe = Interop.downcallHandle(
        "pango_font_face_describe",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a font description that matches the face.
     * <p>
     * The resulting font description will have the family, style,
     * variant, weight and stretch of the face, but its size field
     * will be unset.
     */
    public FontDescription describe() {
        try {
            var RESULT = (MemoryAddress) pango_font_face_describe.invokeExact(handle());
            return new FontDescription(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_face_get_face_name = Interop.downcallHandle(
        "pango_font_face_get_face_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a name representing the style of this face.
     * <p>
     * Note that a font family may contain multiple faces
     * with the same name (e.g. a variable and a non-variable
     * face for the same style).
     */
    public java.lang.String getFaceName() {
        try {
            var RESULT = (MemoryAddress) pango_font_face_get_face_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_face_get_family = Interop.downcallHandle(
        "pango_font_face_get_family",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoFontFamily} that {@code face} belongs to.
     */
    public FontFamily getFamily() {
        try {
            var RESULT = (MemoryAddress) pango_font_face_get_family.invokeExact(handle());
            return new FontFamily(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_face_is_synthesized = Interop.downcallHandle(
        "pango_font_face_is_synthesized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether a {@code PangoFontFace} is synthesized.
     * <p>
     * This will be the case if the underlying font rendering engine
     * creates this face from another face, by shearing, emboldening,
     * lightening or modifying it in some other way.
     */
    public boolean isSynthesized() {
        try {
            var RESULT = (int) pango_font_face_is_synthesized.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_face_list_sizes = Interop.downcallHandle(
        "pango_font_face_list_sizes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * List the available sizes for a font.
     * <p>
     * This is only applicable to bitmap fonts. For scalable fonts, stores
     * {@code null} at the location pointed to by {@code sizes} and 0 at the location pointed
     * to by {@code n_sizes}. The sizes returned are in Pango units and are sorted
     * in ascending order.
     */
    public void listSizes(int[] sizes, PointerInteger nSizes) {
        try {
            pango_font_face_list_sizes.invokeExact(handle(), Interop.allocateNativeArray(sizes).handle(), nSizes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
