package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontFace} is used to represent a group of fonts with
 * the same family, slant, weight, and width, but varying sizes.
 */
public class FontFace extends org.gtk.gobject.GObject {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFace";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FontFace proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontFace(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontFace> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontFace(input);
    
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
    public org.pango.FontDescription describe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_face_describe.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.FontDescription.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public java.lang.String getFaceName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_face_get_face_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code PangoFontFamily} that {@code face} belongs to.
     * @return the {@code PangoFontFamily}
     */
    public org.pango.FontFamily getFamily() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_face_get_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontFamily) Interop.register(RESULT, org.pango.FontFamily.fromAddress).marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.pango_font_face_is_synthesized.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment sizesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nSizesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_font_face_list_sizes.invokeExact(
                        handle(),
                        (Addressable) (sizes == null ? MemoryAddress.NULL : (Addressable) sizesPOINTER.address()),
                        (Addressable) nSizesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nSizes.set(nSizesPOINTER.get(Interop.valueLayout.C_INT, 0));
            sizes.set(MemorySegment.ofAddress(sizesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nSizes.get().intValue() * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_font_face_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FontFace.Builder} object constructs a {@link FontFace} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FontFace.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FontFace} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontFace}.
         * @return A new instance of {@code FontFace} with the properties 
         *         that were set in the Builder object.
         */
        public FontFace build() {
            return (FontFace) org.gtk.gobject.GObject.newWithProperties(
                FontFace.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_font_face_get_type != null;
    }
}
