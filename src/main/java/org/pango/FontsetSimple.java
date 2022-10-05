package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code PangoFontsetSimple} is a implementation of the abstract
 * {@code PangoFontset} base class as an array of fonts.
 * <p>
 * When creating a {@code PangoFontsetSimple}, you have to provide
 * the array of fonts that make up the fontset.
 */
public class FontsetSimple extends Fontset {

    public FontsetSimple(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontsetSimple */
    public static FontsetSimple castFrom(org.gtk.gobject.Object gobject) {
        return new FontsetSimple(gobject.refcounted());
    }
    
    static final MethodHandle pango_fontset_simple_new = Interop.downcallHandle(
        "pango_fontset_simple_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Language language) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_fontset_simple_new.invokeExact(language.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code PangoFontsetSimple} for the given language.
     */
    public FontsetSimple(Language language) {
        super(constructNew(language));
    }
    
    static final MethodHandle pango_fontset_simple_append = Interop.downcallHandle(
        "pango_fontset_simple_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a font to the fontset.
     * <p>
     * The fontset takes ownership of {@code font}.
     */
    public void append(Font font) {
        try {
            pango_fontset_simple_append.invokeExact(handle(), font.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_fontset_simple_size = Interop.downcallHandle(
        "pango_fontset_simple_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of fonts in the fontset.
     */
    public int size() {
        try {
            var RESULT = (int) pango_fontset_simple_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}