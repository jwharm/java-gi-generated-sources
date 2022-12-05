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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a Fontset proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Fontset(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Fontset if its GType is a (or inherits from) "PangoFontset".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Fontset} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoFontset", a ClassCastException will be thrown.
     */
    public static Fontset castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Fontset.getType())) {
            return new Fontset(gobject.handle(), gobject.yieldOwnership());
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
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
        return new org.pango.Font(RESULT, Ownership.FULL);
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
        return new org.pango.FontMetrics(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_fontset_get_type.invokeExact();
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
         * A {@link Fontset.Build} object constructs a {@link Fontset} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Fontset} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Fontset} using {@link Fontset#castFrom}.
         * @return A new instance of {@code Fontset} with the properties 
         *         that were set in the Build object.
         */
        public Fontset construct() {
            return Fontset.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Fontset.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
