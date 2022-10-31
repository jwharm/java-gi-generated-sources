package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontMap} represents the set of fonts available for a
 * particular rendering system.
 * <p>
 * This is a virtual object with implementations being specific to
 * particular rendering systems.
 */
public class FontMap extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontMap";
    
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
    public FontMap(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FontMap if its GType is a (or inherits from) "PangoFontMap".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FontMap" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontMap", a ClassCastException will be thrown.
     */
    public static FontMap castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoFontMap"))) {
            return new FontMap(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoFontMap");
        }
    }
    
    /**
     * Forces a change in the context, which will cause any {@code PangoContext}
     * using this fontmap to change.
     * <p>
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the
     * context and such data is changed.
     */
    public void changed() {
        try {
            DowncallHandles.pango_font_map_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code PangoContext} connected to {@code fontmap}.
     * <p>
     * This is equivalent to {@link Context#Context} followed by
     * {@link Context#setFontMap}.
     * <p>
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a {@code PangoContext}.
     * For instance, the GTK toolkit has, among others,
     * gtk_widget_get_pango_context(). Use those instead.
     * @return the newly allocated {@code PangoContext},
     *   which should be freed with g_object_unref().
     */
    public @NotNull org.pango.Context createContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_map_create_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Context(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a font family by name.
     * @param name a family name
     * @return the {@code PangoFontFamily}
     */
    public @NotNull org.pango.FontFamily getFamily(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_map_get_family.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFamily(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the current serial number of {@code fontmap}.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new fontmap is created and is increased whenever the fontmap
     * is changed. It may wrap, but will never have the value 0. Since it can
     * wrap, never compare it with "less than", always use "not equals".
     * <p>
     * The fontmap can only be changed using backend-specific API, like changing
     * fontmap resolution.
     * <p>
     * This can be used to automatically detect changes to a {@code PangoFontMap},
     * like in {@code PangoContext}.
     * @return The current serial number of {@code fontmap}.
     */
    public int getSerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_map_get_serial.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * List all families for a fontmap.
     * <p>
     * Note that the returned families are not in any particular order.
     * <p>
     * {@code PangoFontMap} also implemented the {@code Gio.ListModel} interface
     * for enumerating families.
     * @param families location to
     *   store a pointer to an array of {@code PangoFontFamily} *.
     *   This array should be freed with g_free().
     * @param nFamilies location to store the number of elements in {@code families}
     */
    public void listFamilies(Out<org.pango.FontFamily[]> families, Out<Integer> nFamilies) {
        java.util.Objects.requireNonNull(families, "Parameter 'families' must not be null");
        java.util.Objects.requireNonNull(nFamilies, "Parameter 'nFamilies' must not be null");
        MemorySegment familiesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nFamiliesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_font_map_list_families.invokeExact(
                    handle(),
                    (Addressable) familiesPOINTER.address(),
                    (Addressable) nFamiliesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nFamilies.set(nFamiliesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.pango.FontFamily[] familiesARRAY = new org.pango.FontFamily[nFamilies.get().intValue()];
        for (int I = 0; I < nFamilies.get().intValue(); I++) {
            var OBJ = familiesPOINTER.get(ValueLayout.ADDRESS, I);
            familiesARRAY[I] = new org.pango.FontFamily(Refcounted.get(OBJ, false));
        }
        families.set(familiesARRAY);
    }
    
    /**
     * Load the font in the fontmap that is the closest match for {@code desc}.
     * @param context the {@code PangoContext} the font will be used with
     * @param desc a {@code PangoFontDescription} describing the font to load
     * @return the newly allocated {@code PangoFont}
     *   loaded, or {@code null} if no font matched.
     */
    public @Nullable org.pango.Font loadFont(@NotNull org.pango.Context context, @NotNull org.pango.FontDescription desc) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_map_load_font.invokeExact(
                    handle(),
                    context.handle(),
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Font(Refcounted.get(RESULT, true));
    }
    
    /**
     * Load a set of fonts in the fontmap that can be used to render
     * a font matching {@code desc}.
     * @param context the {@code PangoContext} the font will be used with
     * @param desc a {@code PangoFontDescription} describing the font to load
     * @param language a {@code PangoLanguage} the fonts will be used for
     * @return the newly allocated
     *   {@code PangoFontset} loaded, or {@code null} if no font matched.
     */
    public @Nullable org.pango.Fontset loadFontset(@NotNull org.pango.Context context, @NotNull org.pango.FontDescription desc, @NotNull org.pango.Language language) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_map_load_fontset.invokeExact(
                    handle(),
                    context.handle(),
                    desc.handle(),
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Fontset(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_map_changed = Interop.downcallHandle(
            "pango_font_map_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_map_create_context = Interop.downcallHandle(
            "pango_font_map_create_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_map_get_family = Interop.downcallHandle(
            "pango_font_map_get_family",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_map_get_serial = Interop.downcallHandle(
            "pango_font_map_get_serial",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_map_list_families = Interop.downcallHandle(
            "pango_font_map_list_families",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_map_load_font = Interop.downcallHandle(
            "pango_font_map_load_font",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_map_load_fontset = Interop.downcallHandle(
            "pango_font_map_load_fontset",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
