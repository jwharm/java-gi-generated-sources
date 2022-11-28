package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoFontsetSimple} is a implementation of the abstract
 * {@code PangoFontset} base class as an array of fonts.
 * <p>
 * When creating a {@code PangoFontsetSimple}, you have to provide
 * the array of fonts that make up the fontset.
 */
public class FontsetSimple extends org.pango.Fontset {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontsetSimple";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FontsetSimple proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontsetSimple(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FontsetSimple if its GType is a (or inherits from) "PangoFontsetSimple".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontsetSimple} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontsetSimple", a ClassCastException will be thrown.
     */
    public static FontsetSimple castFrom(org.gtk.gobject.Object gobject) {
            return new FontsetSimple(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.pango.Language language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_fontset_simple_new.invokeExact(
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code PangoFontsetSimple} for the given language.
     * @param language a {@code PangoLanguage} tag
     */
    public FontsetSimple(@NotNull org.pango.Language language) {
        super(constructNew(language), Ownership.FULL);
    }
    
    /**
     * Adds a font to the fontset.
     * <p>
     * The fontset takes ownership of {@code font}.
     * @param font a {@code PangoFont}.
     */
    public void append(@NotNull org.pango.Font font) {
        java.util.Objects.requireNonNull(font, "Parameter 'font' must not be null");
        try {
            DowncallHandles.pango_fontset_simple_append.invokeExact(
                    handle(),
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        font.yieldOwnership();
    }
    
    /**
     * Returns the number of fonts in the fontset.
     * @return the size of {@code fontset}
     */
    public int size() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_fontset_simple_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_fontset_simple_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.pango.Fontset.Build {
        
         /**
         * A {@link FontsetSimple.Build} object constructs a {@link FontsetSimple} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FontsetSimple} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontsetSimple} using {@link FontsetSimple#castFrom}.
         * @return A new instance of {@code FontsetSimple} with the properties 
         *         that were set in the Build object.
         */
        public FontsetSimple construct() {
            return FontsetSimple.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FontsetSimple.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_fontset_simple_new = Interop.downcallHandle(
            "pango_fontset_simple_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_simple_append = Interop.downcallHandle(
            "pango_fontset_simple_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_simple_size = Interop.downcallHandle(
            "pango_fontset_simple_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_simple_get_type = Interop.downcallHandle(
            "pango_fontset_simple_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
