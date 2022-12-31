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
public class Fontset extends org.gtk.gobject.GObject {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontset";
    
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
     * Create a Fontset proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Fontset(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Fontset> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Fontset(input, ownership);
    
    /**
     * Iterates through all the fonts in a fontset, calling {@code func} for
     * each one.
     * <p>
     * If {@code func} returns {@code true}, that stops the iteration.
     * @param func Callback function
     */
    public void foreach(org.pango.FontsetForeachFunc func) {
        try {
            DowncallHandles.pango_fontset_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public org.pango.Font getFont(int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_fontset_get_font.invokeExact(
                    handle(),
                    wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Font.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get overall metric information for the fonts in the fontset.
     * @return a {@code PangoFontMetrics} object
     */
    public org.pango.FontMetrics getMetrics() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_fontset_get_metrics.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.FontMetrics.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_fontset_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Fontset.Builder} object constructs a {@link Fontset} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Fontset.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Fontset} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Fontset}.
         * @return A new instance of {@code Fontset} with the properties 
         *         that were set in the Builder object.
         */
        public Fontset build() {
            return (Fontset) org.gtk.gobject.GObject.newWithProperties(
                Fontset.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_fontset_foreach = Interop.downcallHandle(
            "pango_fontset_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_get_font = Interop.downcallHandle(
            "pango_fontset_get_font",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_fontset_get_metrics = Interop.downcallHandle(
            "pango_fontset_get_metrics",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_fontset_get_type = Interop.downcallHandle(
            "pango_fontset_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
