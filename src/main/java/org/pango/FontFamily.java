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
public class FontFamily extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFamily";
    
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
     * Create a FontFamily proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontFamily(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FontFamily if its GType is a (or inherits from) "PangoFontFamily".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontFamily} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontFamily", a ClassCastException will be thrown.
     */
    public static FontFamily castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FontFamily.getType())) {
            return new FontFamily(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoFontFamily");
        }
    }
    
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
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFace(RESULT, Ownership.NONE);
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
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_family_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
        return RESULT != 0;
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
        return RESULT != 0;
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
    public void listFaces(@NotNull Out<org.pango.FontFace[]> faces, Out<Integer> nFaces) {
        java.util.Objects.requireNonNull(faces, "Parameter 'faces' must not be null");
        MemorySegment facesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(nFaces, "Parameter 'nFaces' must not be null");
        MemorySegment nFacesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_font_family_list_faces.invokeExact(
                    handle(),
                    (Addressable) facesPOINTER.address(),
                    (Addressable) nFacesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nFaces.set(nFacesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.pango.FontFace[] facesARRAY = new org.pango.FontFace[nFaces.get().intValue()];
        for (int I = 0; I < nFaces.get().intValue(); I++) {
            var OBJ = facesPOINTER.get(Interop.valueLayout.ADDRESS, I);
            facesARRAY[I] = new org.pango.FontFace(OBJ, Ownership.CONTAINER);
        }
        faces.set(facesARRAY);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_font_family_get_type.invokeExact();
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
         * A {@link FontFamily.Build} object constructs a {@link FontFamily} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FontFamily} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontFamily} using {@link FontFamily#castFrom}.
         * @return A new instance of {@code FontFamily} with the properties 
         *         that were set in the Build object.
         */
        public FontFamily construct() {
            return FontFamily.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FontFamily.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The type of items contained in this list.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The number of items contained in this list.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
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
