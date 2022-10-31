package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontFace} is used to represent a group of fonts with
 * the same family, slant, weight, and width, but varying sizes.
 */
public class FontFace extends org.gtk.gobject.Object {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFace";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public FontFace(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FontFace if its GType is a (or inherits from) "PangoFontFace".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FontFace" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontFace", a ClassCastException will be thrown.
     */
    public static FontFace castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoFontFace"))) {
            return new FontFace(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoFontFace");
        }
    }
    
    /**
     * Returns a font description that matches the face.
     * <p>
     * The resulting font description will have the family, style,
     * variant, weight and stretch of the face, but its size field
     * will be unset.
     * @return a newly-created {@code PangoFontDescription} structure
     *   holding the description of the face. Use {@link FontDescription#free}
     *   to free the result.
     */
    public @NotNull org.pango.FontDescription describe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_face_describe.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a name representing the style of this face.
     * <p>
     * Note that a font family may contain multiple faces
     * with the same name (e.g. a variable and a non-variable
     * face for the same style).
     * @return the face name for the face. This string is
     *   owned by the face object and must not be modified or freed.
     */
    public @NotNull java.lang.String getFaceName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_face_get_face_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the {@code PangoFontFamily} that {@code face} belongs to.
     * @return the {@code PangoFontFamily}
     */
    public @NotNull org.pango.FontFamily getFamily() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_face_get_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFamily(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether a {@code PangoFontFace} is synthesized.
     * <p>
     * This will be the case if the underlying font rendering engine
     * creates this face from another face, by shearing, emboldening,
     * lightening or modifying it in some other way.
     * @return whether {@code face} is synthesized
     */
    public boolean isSynthesized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_face_is_synthesized.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * List the available sizes for a font.
     * <p>
     * This is only applicable to bitmap fonts. For scalable fonts, stores
     * {@code null} at the location pointed to by {@code sizes} and 0 at the location pointed
     * to by {@code n_sizes}. The sizes returned are in Pango units and are sorted
     * in ascending order.
     * @param sizes location to store a pointer to an array of int. This array
     *   should be freed with g_free().
     * @param nSizes location to store the number of elements in {@code sizes}
     */
    public void listSizes(Out<int[]> sizes, Out<Integer> nSizes) {
        java.util.Objects.requireNonNull(nSizes, "Parameter 'nSizes' must not be null");
        MemorySegment sizesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nSizesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_font_face_list_sizes.invokeExact(
                    handle(),
                    (Addressable) (sizes == null ? MemoryAddress.NULL : (Addressable) sizesPOINTER.address()),
                    (Addressable) nSizesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nSizes.set(nSizesPOINTER.get(ValueLayout.JAVA_INT, 0));
        sizes.set(MemorySegment.ofAddress(sizesPOINTER.get(ValueLayout.ADDRESS, 0), nSizes.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_face_describe = Interop.downcallHandle(
            "pango_font_face_describe",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_face_get_face_name = Interop.downcallHandle(
            "pango_font_face_get_face_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_face_get_family = Interop.downcallHandle(
            "pango_font_face_get_family",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_face_is_synthesized = Interop.downcallHandle(
            "pango_font_face_is_synthesized",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_face_list_sizes = Interop.downcallHandle(
            "pango_font_face_list_sizes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
