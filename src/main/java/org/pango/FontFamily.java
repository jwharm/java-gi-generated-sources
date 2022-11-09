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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FontFamily" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontFamily", a ClassCastException will be thrown.
     */
    public static FontFamily castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoFontFamily"))) {
            return new FontFamily(gobject.handle(), gobject.refcounted().getOwnership());
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
        java.util.Objects.requireNonNull(nFaces, "Parameter 'nFaces' must not be null");
        MemorySegment facesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nFacesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_font_family_list_faces.invokeExact(
                    handle(),
                    (Addressable) facesPOINTER.address(),
                    (Addressable) nFacesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nFaces.set(nFacesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.pango.FontFace[] facesARRAY = new org.pango.FontFace[nFaces.get().intValue()];
        for (int I = 0; I < nFaces.get().intValue(); I++) {
            var OBJ = facesPOINTER.get(ValueLayout.ADDRESS, I);
            facesARRAY[I] = new org.pango.FontFace(OBJ, Ownership.CONTAINER);
        }
        faces.set(facesARRAY);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_family_get_face = Interop.downcallHandle(
            "pango_font_family_get_face",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_get_name = Interop.downcallHandle(
            "pango_font_family_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_is_monospace = Interop.downcallHandle(
            "pango_font_family_is_monospace",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_is_variable = Interop.downcallHandle(
            "pango_font_family_is_variable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_family_list_faces = Interop.downcallHandle(
            "pango_font_family_list_faces",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
