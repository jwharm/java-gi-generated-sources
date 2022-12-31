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
    protected FontsetSimple(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontsetSimple> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontsetSimple(input, ownership);
    
    private static MemoryAddress constructNew(org.pango.Language language) {
        MemoryAddress RESULT;
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
    public FontsetSimple(org.pango.Language language) {
        super(constructNew(language), Ownership.FULL);
    }
    
    /**
     * Adds a font to the fontset.
     * <p>
     * The fontset takes ownership of {@code font}.
     * @param font a {@code PangoFont}.
     */
    public void append(org.pango.Font font) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_fontset_simple_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FontsetSimple.Builder} object constructs a {@link FontsetSimple} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FontsetSimple.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.pango.Fontset.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FontsetSimple} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontsetSimple}.
         * @return A new instance of {@code FontsetSimple} with the properties 
         *         that were set in the Builder object.
         */
        public FontsetSimple build() {
            return (FontsetSimple) org.gtk.gobject.GObject.newWithProperties(
                FontsetSimple.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
