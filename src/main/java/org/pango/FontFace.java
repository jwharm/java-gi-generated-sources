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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a FontFace proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontFace(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FontFace if its GType is a (or inherits from) "PangoFontFace".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontFace} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontFace", a ClassCastException will be thrown.
     */
    public static FontFace castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FontFace.getType())) {
            return new FontFace(gobject.handle(), gobject.yieldOwnership());
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
        return new org.pango.FontDescription(RESULT, Ownership.FULL);
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
        return new org.pango.FontFamily(RESULT, Ownership.NONE);
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
    public void listSizes(@Nullable Out<int[]> sizes, Out<Integer> nSizes) {
        MemorySegment sizesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(nSizes, "Parameter 'nSizes' must not be null");
        MemorySegment nSizesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_font_face_list_sizes.invokeExact(
                    handle(),
                    (Addressable) (sizes == null ? MemoryAddress.NULL : (Addressable) sizesPOINTER.address()),
                    (Addressable) nSizesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nSizes.set(nSizesPOINTER.get(Interop.valueLayout.C_INT, 0));
        sizes.set(MemorySegment.ofAddress(sizesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nSizes.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_font_face_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link FontFace.Build} object constructs a {@link FontFace} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FontFace} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontFace} using {@link FontFace#castFrom}.
         * @return A new instance of {@code FontFace} with the properties 
         *         that were set in the Build object.
         */
        public FontFace construct() {
            return FontFace.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FontFace.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_face_describe = Interop.downcallHandle(
            "pango_font_face_describe",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_face_get_face_name = Interop.downcallHandle(
            "pango_font_face_get_face_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_face_get_family = Interop.downcallHandle(
            "pango_font_face_get_family",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_face_is_synthesized = Interop.downcallHandle(
            "pango_font_face_is_synthesized",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_face_list_sizes = Interop.downcallHandle(
            "pango_font_face_list_sizes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_face_get_type = Interop.downcallHandle(
            "pango_font_face_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
