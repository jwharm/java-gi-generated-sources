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
public class FontMap extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontMap";
    
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
     * Create a FontMap proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontMap(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontMap> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontMap(input);
    
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
            DowncallHandles.pango_font_map_changed.invokeExact(handle());
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
    public org.pango.Context createContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_map_create_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.Context) Interop.register(RESULT, org.pango.Context.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets a font family by name.
     * @param name a family name
     * @return the {@code PangoFontFamily}
     */
    public org.pango.FontFamily getFamily(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.pango_font_map_get_family.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.pango.FontFamily) Interop.register(RESULT, org.pango.FontFamily.fromAddress).marshal(RESULT, null);
        }
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
            RESULT = (int) DowncallHandles.pango_font_map_get_serial.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment familiesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nFamiliesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_font_map_list_families.invokeExact(
                        handle(),
                        (Addressable) familiesPOINTER.address(),
                        (Addressable) nFamiliesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nFamilies.set(nFamiliesPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.pango.FontFamily[] familiesARRAY = new org.pango.FontFamily[nFamilies.get().intValue()];
            for (int I = 0; I < nFamilies.get().intValue(); I++) {
                var OBJ = familiesPOINTER.get(Interop.valueLayout.ADDRESS, I);
                familiesARRAY[I] = (org.pango.FontFamily) Interop.register(OBJ, org.pango.FontFamily.fromAddress).marshal(OBJ, null);
                }
            families.set(familiesARRAY);
        }
    }
    
    /**
     * Load the font in the fontmap that is the closest match for {@code desc}.
     * @param context the {@code PangoContext} the font will be used with
     * @param desc a {@code PangoFontDescription} describing the font to load
     * @return the newly allocated {@code PangoFont}
     *   loaded, or {@code null} if no font matched.
     */
    public @Nullable org.pango.Font loadFont(org.pango.Context context, org.pango.FontDescription desc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_map_load_font.invokeExact(
                    handle(),
                    context.handle(),
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.Font) Interop.register(RESULT, org.pango.Font.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public @Nullable org.pango.Fontset loadFontset(org.pango.Context context, org.pango.FontDescription desc, org.pango.Language language) {
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
        var OBJECT = (org.pango.Fontset) Interop.register(RESULT, org.pango.Fontset.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_font_map_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FontMap.Builder} object constructs a {@link FontMap} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FontMap.Builder#build()}. 
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
         * Finish building the {@link FontMap} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontMap}.
         * @return A new instance of {@code FontMap} with the properties 
         *         that were set in the Builder object.
         */
        public FontMap build() {
            return (FontMap) org.gtk.gobject.GObject.newWithProperties(
                FontMap.getType(),
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
        
        private static final MethodHandle pango_font_map_changed = Interop.downcallHandle(
                "pango_font_map_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_create_context = Interop.downcallHandle(
                "pango_font_map_create_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_get_family = Interop.downcallHandle(
                "pango_font_map_get_family",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_get_serial = Interop.downcallHandle(
                "pango_font_map_get_serial",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_list_families = Interop.downcallHandle(
                "pango_font_map_list_families",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_load_font = Interop.downcallHandle(
                "pango_font_map_load_font",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_load_fontset = Interop.downcallHandle(
                "pango_font_map_load_fontset",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_font_map_get_type = Interop.downcallHandle(
                "pango_font_map_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_font_map_get_type != null;
    }
}
