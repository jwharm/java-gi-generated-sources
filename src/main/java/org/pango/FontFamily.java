package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontFamily} is used to represent a family of related
 * font faces.
 * <p>
 * The font faces in a family share a common design, but differ in
 * slant, weight, width or other aspects.
 */
public class FontFamily extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFamily";
    
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
     * Create a FontFamily proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FontFamily(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontFamily> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontFamily(input, ownership);
    
    /**
     * Gets the {@code PangoFontFace} of {@code family} with the given name.
     * @param name the name of a face. If the name is {@code null},
     *   the family's default face (fontconfig calls it "Regular")
     *   will be returned.
     * @return the {@code PangoFontFace},
     *   or {@code null} if no face with the given name exists.
     */
    public @Nullable org.pango.FontFace getFace(@Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_family_get_face.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontFace) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.FontFace.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the name of the family.
     * <p>
     * The name is unique among all fonts for the font backend and can
     * be used in a {@code PangoFontDescription} to specify that a face from
     * this family is desired.
     * @return the name of the family. This string is owned
     *   by the family object and must not be modified or freed.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_family_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * A monospace font is a font designed for text display where the the
     * characters form a regular grid.
     * <p>
     * For Western languages this would
     * mean that the advance width of all characters are the same, but
     * this categorization also includes Asian fonts which include
     * double-width characters: characters that occupy two grid cells.
     * g_unichar_iswide() returns a result that indicates whether a
     * character is typically double-width in a monospace font.
     * <p>
     * The best way to find out the grid-cell size is to call
     * {@link FontMetrics#getApproximateDigitWidth}, since the
     * results of {@link FontMetrics#getApproximateCharWidth} may
     * be affected by double-width characters.
     * @return {@code true} if the family is monospace.
     */
    public boolean isMonospace() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_family_is_monospace.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A variable font is a font which has axes that can be modified to
     * produce different faces.
     * <p>
     * Such axes are also known as _variations_; see
     * {@link FontDescription#setVariations} for more information.
     * @return {@code true} if the family is variable
     */
    public boolean isVariable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_family_is_variable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Lists the different font faces that make up {@code family}.
     * <p>
     * The faces in a family share a common design, but differ in slant, weight,
     * width and other aspects.
     * <p>
     * Note that the returned faces are not in any particular order, and
     * multiple faces may have the same name or characteristics.
     * <p>
     * {@code PangoFontFamily} also implemented the {@code Gio.ListModel} interface
     * for enumerating faces.
     * @param faces location to store an array of pointers to {@code PangoFontFace} objects,
     *   or {@code null}. This array should be freed with g_free() when it is no
     *   longer needed.
     * @param nFaces location to store number of elements in {@code faces}.
     */
    public void listFaces(@Nullable Out<org.pango.FontFace[]> faces, Out<Integer> nFaces) {
        MemorySegment facesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment nFacesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_font_family_list_faces.invokeExact(
                    handle(),
                    (Addressable) (faces == null ? MemoryAddress.NULL : (Addressable) facesPOINTER.address()),
                    (Addressable) nFacesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nFaces.set(nFacesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.pango.FontFace[] facesARRAY = new org.pango.FontFace[nFaces.get().intValue()];
        for (int I = 0; I < nFaces.get().intValue(); I++) {
            var OBJ = facesPOINTER.get(Interop.valueLayout.ADDRESS, I);
            facesARRAY[I] = (org.pango.FontFace) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(OBJ)), org.pango.FontFace.fromAddress).marshal(OBJ, Ownership.CONTAINER);
        }
        faces.set(facesARRAY);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_font_family_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FontFamily.Builder} object constructs a {@link FontFamily} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FontFamily.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FontFamily} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontFamily}.
         * @return A new instance of {@code FontFamily} with the properties 
         *         that were set in the Builder object.
         */
        public FontFamily build() {
            return (FontFamily) org.gtk.gobject.GObject.newWithProperties(
                FontFamily.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The type of items contained in this list.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The number of items contained in this list.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_family_get_face = Interop.downcallHandle(
            "pango_font_family_get_face",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_get_name = Interop.downcallHandle(
            "pango_font_family_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_is_monospace = Interop.downcallHandle(
            "pango_font_family_is_monospace",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_is_variable = Interop.downcallHandle(
            "pango_font_family_is_variable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_list_faces = Interop.downcallHandle(
            "pango_font_family_list_faces",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_get_type = Interop.downcallHandle(
            "pango_font_family_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
