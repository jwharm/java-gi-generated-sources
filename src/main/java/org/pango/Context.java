package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoContext} stores global information used to control the
 * itemization process.
 * <p>
 * The information stored by {@code PangoContext} includes the fontmap used
 * to look up fonts, and default values such as the default language,
 * default gravity, or default font.
 * <p>
 * To obtain a {@code PangoContext}, use {@link FontMap#createContext}.
 */
public class Context extends org.gtk.gobject.Object {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Context proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Context(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Context if its GType is a (or inherits from) "PangoContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Context} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoContext", a ClassCastException will be thrown.
     */
    public static Context castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Context.getType())) {
            return new Context(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoContext");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code PangoContext} initialized to default values.
     * <p>
     * This function is not particularly useful as it should always
     * be followed by a {@link Context#setFontMap} call, and the
     * function {@link FontMap#createContext} does these two steps
     * together and hence users are recommended to use that.
     * <p>
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a {@code PangoContext}.
     * For instance, the GTK toolkit has, among others,
     * {@code gtk_widget_get_pango_context()}. Use those instead.
     */
    public Context() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Forces a change in the context, which will cause any {@code PangoLayout}
     * using this context to re-layout.
     * <p>
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the context
     * and such data is changed.
     */
    public void changed() {
        try {
            DowncallHandles.pango_context_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the base direction for the context.
     * <p>
     * See {@link Context#setBaseDir}.
     * @return the base direction for the context.
     */
    public @NotNull org.pango.Direction getBaseDir() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_context_get_base_dir.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Direction.of(RESULT);
    }
    
    /**
     * Retrieves the base gravity for the context.
     * <p>
     * See {@link Context#setBaseGravity}.
     * @return the base gravity for the context.
     */
    public @NotNull org.pango.Gravity getBaseGravity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_context_get_base_gravity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Retrieve the default font description for the context.
     * @return a pointer to the context's default font
     *   description. This value must not be modified or freed.
     */
    public @Nullable org.pango.FontDescription getFontDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_get_font_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code PangoFontMap} used to look up fonts for this context.
     * @return the font map for the.
     *   {@code PangoContext} This value is owned by Pango and should not be
     *   unreferenced.
     */
    public @Nullable org.pango.FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_get_font_map.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the gravity for the context.
     * <p>
     * This is similar to {@link Context#getBaseGravity},
     * except for when the base gravity is {@link Gravity#AUTO} for
     * which {@link Gravity#getForMatrix} is used to return the
     * gravity from the current context matrix.
     * @return the resolved gravity for the context.
     */
    public @NotNull org.pango.Gravity getGravity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_context_get_gravity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Retrieves the gravity hint for the context.
     * <p>
     * See {@link Context#setGravityHint} for details.
     * @return the gravity hint for the context.
     */
    public @NotNull org.pango.GravityHint getGravityHint() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_context_get_gravity_hint.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.GravityHint.of(RESULT);
    }
    
    /**
     * Retrieves the global language tag for the context.
     * @return the global language tag.
     */
    public @NotNull org.pango.Language getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_get_language.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering with this context.
     * <p>
     * See {@link Context#setMatrix}.
     * @return the matrix, or {@code null} if no
     *   matrix has been set (which is the same as the identity matrix).
     *   The returned matrix is owned by Pango and must not be modified
     *   or freed.
     */
    public @Nullable org.pango.Matrix getMatrix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_get_matrix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Matrix(RESULT, Ownership.NONE);
    }
    
    /**
     * Get overall metric information for a particular font description.
     * <p>
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * <p>
     * The {@code PangoFontDescription} is interpreted in the same way as by {@link Pango#itemize},
     * and the family name may be a comma separated list of names. If characters
     * from multiple of these families would be used to render the string, then
     * the returned fonts would be a composite of the metrics for the fonts loaded
     * for the individual families.
     * @param desc a {@code PangoFontDescription} structure. {@code null} means that the
     *   font description from the context will be used.
     * @param language language tag used to determine which script to get
     *   the metrics for. {@code null} means that the language tag from the context
     *   will be used. If no language tag is set on the context, metrics
     *   for the default language (as determined by {@link Language#getDefault}
     *   will be returned.
     * @return a {@code PangoFontMetrics} object. The caller must call
     *   {@link FontMetrics#unref} when finished using the object.
     */
    public @NotNull org.pango.FontMetrics getMetrics(@Nullable org.pango.FontDescription desc, @Nullable org.pango.Language language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_get_metrics.invokeExact(
                    handle(),
                    (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()),
                    (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMetrics(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns whether font rendering with this context should
     * round glyph positions and widths.
     */
    public boolean getRoundGlyphPositions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_context_get_round_glyph_positions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the current serial number of {@code context}.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new context is created and is increased whenever the context
     * is changed using any of the setter functions, or the {@code PangoFontMap} it
     * uses to find fonts has changed. The serial may wrap, but will never
     * have the value 0. Since it can wrap, never compare it with "less than",
     * always use "not equals".
     * <p>
     * This can be used to automatically detect changes to a {@code PangoContext},
     * and is only useful when implementing objects that need update when their
     * {@code PangoContext} changes, like {@code PangoLayout}.
     * @return The current serial number of {@code context}.
     */
    public int getSerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_context_get_serial.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * List all families for a context.
     * @param families location
     *   to store a pointer to an array of {@code PangoFontFamily}. This array should
     *   be freed with g_free().
     * @param nFamilies location to store the number of elements in {@code descs}
     */
    public void listFamilies(@NotNull Out<org.pango.FontFamily[]> families, Out<Integer> nFamilies) {
        java.util.Objects.requireNonNull(families, "Parameter 'families' must not be null");
        MemorySegment familiesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(nFamilies, "Parameter 'nFamilies' must not be null");
        MemorySegment nFamiliesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_context_list_families.invokeExact(
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
            familiesARRAY[I] = new org.pango.FontFamily(OBJ, Ownership.CONTAINER);
        }
        families.set(familiesARRAY);
    }
    
    /**
     * Loads the font in one of the fontmaps in the context
     * that is the closest match for {@code desc}.
     * @param desc a {@code PangoFontDescription} describing the font to load
     * @return the newly allocated {@code PangoFont}
     *   that was loaded, or {@code null} if no font matched.
     */
    public @Nullable org.pango.Font loadFont(@NotNull org.pango.FontDescription desc) {
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_load_font.invokeExact(
                    handle(),
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Font(RESULT, Ownership.FULL);
    }
    
    /**
     * Load a set of fonts in the context that can be used to render
     * a font matching {@code desc}.
     * @param desc a {@code PangoFontDescription} describing the fonts to load
     * @param language a {@code PangoLanguage} the fonts will be used for
     * @return the newly allocated
     *   {@code PangoFontset} loaded, or {@code null} if no font matched.
     */
    public @Nullable org.pango.Fontset loadFontset(@NotNull org.pango.FontDescription desc, @NotNull org.pango.Language language) {
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_context_load_fontset.invokeExact(
                    handle(),
                    desc.handle(),
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Fontset(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the base direction for the context.
     * <p>
     * The base direction is used in applying the Unicode bidirectional
     * algorithm; if the {@code direction} is {@link Direction#LTR} or
     * {@link Direction#RTL}, then the value will be used as the paragraph
     * direction in the Unicode bidirectional algorithm. A value of
     * {@link Direction#WEAK_LTR} or {@link Direction#WEAK_RTL} is used only
     * for paragraphs that do not contain any strong characters themselves.
     * @param direction the new base direction
     */
    public void setBaseDir(@NotNull org.pango.Direction direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        try {
            DowncallHandles.pango_context_set_base_dir.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the base gravity for the context.
     * <p>
     * The base gravity is used in laying vertical text out.
     * @param gravity the new base gravity
     */
    public void setBaseGravity(@NotNull org.pango.Gravity gravity) {
        java.util.Objects.requireNonNull(gravity, "Parameter 'gravity' must not be null");
        try {
            DowncallHandles.pango_context_set_base_gravity.invokeExact(
                    handle(),
                    gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the default font description for the context
     * @param desc the new pango font description
     */
    public void setFontDescription(@Nullable org.pango.FontDescription desc) {
        try {
            DowncallHandles.pango_context_set_font_description.invokeExact(
                    handle(),
                    (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the font map to be searched when fonts are looked-up
     * in this context.
     * <p>
     * This is only for internal use by Pango backends, a {@code PangoContext}
     * obtained via one of the recommended methods should already have a
     * suitable font map.
     * @param fontMap the {@code PangoFontMap} to set.
     */
    public void setFontMap(@Nullable org.pango.FontMap fontMap) {
        try {
            DowncallHandles.pango_context_set_font_map.invokeExact(
                    handle(),
                    (Addressable) (fontMap == null ? MemoryAddress.NULL : fontMap.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the gravity hint for the context.
     * <p>
     * The gravity hint is used in laying vertical text out, and
     * is only relevant if gravity of the context as returned by
     * {@link Context#getGravity} is set to {@link Gravity#EAST}
     * or {@link Gravity#WEST}.
     * @param hint the new gravity hint
     */
    public void setGravityHint(@NotNull org.pango.GravityHint hint) {
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        try {
            DowncallHandles.pango_context_set_gravity_hint.invokeExact(
                    handle(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the global language tag for the context.
     * <p>
     * The default language for the locale of the running process
     * can be found using {@link Language#getDefault}.
     * @param language the new language tag.
     */
    public void setLanguage(@Nullable org.pango.Language language) {
        try {
            DowncallHandles.pango_context_set_language.invokeExact(
                    handle(),
                    (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transformation matrix that will be applied when rendering
     * with this context.
     * <p>
     * Note that reported metrics are in the user space coordinates before
     * the application of the matrix, not device-space coordinates after the
     * application of the matrix. So, they don't scale with the matrix, though
     * they may change slightly for different matrices, depending on how the
     * text is fit to the pixel grid.
     * @param matrix a {@code PangoMatrix}, or {@code null} to unset any existing
     * matrix. (No matrix set is the same as setting the identity matrix.)
     */
    public void setMatrix(@Nullable org.pango.Matrix matrix) {
        try {
            DowncallHandles.pango_context_set_matrix.invokeExact(
                    handle(),
                    (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether font rendering with this context should
     * round glyph positions and widths to integral positions,
     * in device units.
     * <p>
     * This is useful when the renderer can't handle subpixel
     * positioning of glyphs.
     * <p>
     * The default value is to round glyph positions, to remain
     * compatible with previous Pango behavior.
     * @param roundPositions whether to round glyph positions
     */
    public void setRoundGlyphPositions(boolean roundPositions) {
        try {
            DowncallHandles.pango_context_set_round_glyph_positions.invokeExact(
                    handle(),
                    roundPositions ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_context_get_type.invokeExact();
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
         * A {@link Context.Build} object constructs a {@link Context} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Context} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Context} using {@link Context#castFrom}.
         * @return A new instance of {@code Context} with the properties 
         *         that were set in the Build object.
         */
        public Context construct() {
            return Context.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Context.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_context_new = Interop.downcallHandle(
            "pango_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_changed = Interop.downcallHandle(
            "pango_context_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_base_dir = Interop.downcallHandle(
            "pango_context_get_base_dir",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_base_gravity = Interop.downcallHandle(
            "pango_context_get_base_gravity",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_font_description = Interop.downcallHandle(
            "pango_context_get_font_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_font_map = Interop.downcallHandle(
            "pango_context_get_font_map",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_gravity = Interop.downcallHandle(
            "pango_context_get_gravity",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_gravity_hint = Interop.downcallHandle(
            "pango_context_get_gravity_hint",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_language = Interop.downcallHandle(
            "pango_context_get_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_matrix = Interop.downcallHandle(
            "pango_context_get_matrix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_metrics = Interop.downcallHandle(
            "pango_context_get_metrics",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_round_glyph_positions = Interop.downcallHandle(
            "pango_context_get_round_glyph_positions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_get_serial = Interop.downcallHandle(
            "pango_context_get_serial",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_list_families = Interop.downcallHandle(
            "pango_context_list_families",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_load_font = Interop.downcallHandle(
            "pango_context_load_font",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_load_fontset = Interop.downcallHandle(
            "pango_context_load_fontset",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_set_base_dir = Interop.downcallHandle(
            "pango_context_set_base_dir",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_context_set_base_gravity = Interop.downcallHandle(
            "pango_context_set_base_gravity",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_context_set_font_description = Interop.downcallHandle(
            "pango_context_set_font_description",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_set_font_map = Interop.downcallHandle(
            "pango_context_set_font_map",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_set_gravity_hint = Interop.downcallHandle(
            "pango_context_set_gravity_hint",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_context_set_language = Interop.downcallHandle(
            "pango_context_set_language",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_set_matrix = Interop.downcallHandle(
            "pango_context_set_matrix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_context_set_round_glyph_positions = Interop.downcallHandle(
            "pango_context_set_round_glyph_positions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_context_get_type = Interop.downcallHandle(
            "pango_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
