package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontset} represents a set of {@code PangoFont} to use when rendering text.
 * <p>
 * A {@code PangoFontset} is the result of resolving a {@code PangoFontDescription}
 * against a particular {@code PangoContext}. It has operations for finding the
 * component font for a particular Unicode character, and for finding a
 * composite set of metrics for the entire fontset.
 */
public class Fontset extends org.gtk.gobject.Object {

    public Fontset(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Fontset */
    public static Fontset castFrom(org.gtk.gobject.Object gobject) {
        return new Fontset(gobject.refcounted());
    }
    
    private static final MethodHandle pango_fontset_foreach = Interop.downcallHandle(
        "pango_fontset_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Iterates through all the fonts in a fontset, calling {@code func} for
     * each one.
     * <p>
     * If {@code func} returns {@code true}, that stops the iteration.
     */
    public @NotNull void foreach(@NotNull FontsetForeachFunc func) {
        try {
            pango_fontset_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.class, "__cbFontsetForeachFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_fontset_get_font = Interop.downcallHandle(
        "pango_fontset_get_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the font in the fontset that contains the best
     * glyph for a Unicode character.
     */
    public @NotNull Font getFont(@NotNull int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_fontset_get_font.invokeExact(handle(), wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Font(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_fontset_get_metrics = Interop.downcallHandle(
        "pango_fontset_get_metrics",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get overall metric information for the fonts in the fontset.
     */
    public @NotNull FontMetrics getMetrics() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_fontset_get_metrics.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontMetrics(Refcounted.get(RESULT, true));
    }
    
}
