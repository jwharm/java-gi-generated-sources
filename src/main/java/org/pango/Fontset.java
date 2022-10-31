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
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontset";
    
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
    public Fontset(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Fontset if its GType is a (or inherits from) "PangoFontset".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Fontset" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontset", a ClassCastException will be thrown.
     */
    public static Fontset castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoFontset"))) {
            return new Fontset(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoFontset");
        }
    }
    
    /**
     * Iterates through all the fonts in a fontset, calling {@code func} for
     * each one.
     * <p>
     * If {@code func} returns {@code true}, that stops the iteration.
     * @param func Callback function
     */
    public void foreach(@NotNull org.pango.FontsetForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.pango_fontset_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.Callbacks.class, "cbFontsetForeachFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the font in the fontset that contains the best
     * glyph for a Unicode character.
     * @param wc a Unicode character
     * @return a {@code PangoFont}
     */
    public @NotNull org.pango.Font getFont(int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_fontset_get_font.invokeExact(
                    handle(),
                    wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Font(Refcounted.get(RESULT, true));
    }
    
    /**
     * Get overall metric information for the fonts in the fontset.
     * @return a {@code PangoFontMetrics} object
     */
    public @NotNull org.pango.FontMetrics getMetrics() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_fontset_get_metrics.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMetrics(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_fontset_foreach = Interop.downcallHandle(
            "pango_fontset_foreach",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_fontset_get_font = Interop.downcallHandle(
            "pango_fontset_get_font",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_fontset_get_metrics = Interop.downcallHandle(
            "pango_fontset_get_metrics",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
