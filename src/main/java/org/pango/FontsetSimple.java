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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public FontsetSimple(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontsetSimple */
    public static FontsetSimple castFrom(org.gtk.gobject.Object gobject) {
        return new FontsetSimple(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.pango.Language language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.pango_fontset_simple_new.invokeExact(language.handle()), true);
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
        super(constructNew(language));
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
            DowncallHandles.pango_fontset_simple_append.invokeExact(handle(), font.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the number of fonts in the fontset.
     * @return the size of {@code fontset}
     */
    public int size() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_fontset_simple_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_fontset_simple_new = Interop.downcallHandle(
            "pango_fontset_simple_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_fontset_simple_append = Interop.downcallHandle(
            "pango_fontset_simple_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_fontset_simple_size = Interop.downcallHandle(
            "pango_fontset_simple_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
