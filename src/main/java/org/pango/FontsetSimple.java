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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoFontsetSimple"))) {
            return new FontsetSimple(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoFontsetSimple");
        }
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_fontset_simple_new = Interop.downcallHandle(
            "pango_fontset_simple_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_simple_append = Interop.downcallHandle(
            "pango_fontset_simple_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_simple_size = Interop.downcallHandle(
            "pango_fontset_simple_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
