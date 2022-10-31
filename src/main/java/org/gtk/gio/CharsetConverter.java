package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link CharsetConverter} is an implementation of {@link Converter} based on
 * GIConv.
 */
public class CharsetConverter extends org.gtk.gobject.Object implements org.gtk.gio.Converter, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCharsetConverter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CharsetConverter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CharsetConverter if its GType is a (or inherits from) "GCharsetConverter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CharsetConverter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GCharsetConverter", a ClassCastException will be thrown.
     */
    public static CharsetConverter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GCharsetConverter"))) {
            return new CharsetConverter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GCharsetConverter");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String toCharset, @NotNull java.lang.String fromCharset) throws GErrorException {
        java.util.Objects.requireNonNull(toCharset, "Parameter 'toCharset' must not be null");
        java.util.Objects.requireNonNull(fromCharset, "Parameter 'fromCharset' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_charset_converter_new.invokeExact(
                    Interop.allocateNativeString(toCharset),
                    Interop.allocateNativeString(fromCharset), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CharsetConverter}.
     * @param toCharset destination charset
     * @param fromCharset source charset
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public CharsetConverter(@NotNull java.lang.String toCharset, @NotNull java.lang.String fromCharset) throws GErrorException {
        super(constructNew(toCharset, fromCharset));
    }
    
    /**
     * Gets the number of fallbacks that {@code converter} has applied so far.
     * @return the number of fallbacks that {@code converter} has applied
     */
    public int getNumFallbacks() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_charset_converter_get_num_fallbacks.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link CharsetConverter}:use-fallback property.
     * @return {@code true} if fallbacks are used by {@code converter}
     */
    public boolean getUseFallback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_charset_converter_get_use_fallback.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the {@link CharsetConverter}:use-fallback property.
     * @param useFallback {@code true} to use fallbacks
     */
    public void setUseFallback(boolean useFallback) {
        try {
            DowncallHandles.g_charset_converter_set_use_fallback.invokeExact(
                    handle(),
                    useFallback ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_charset_converter_new = Interop.downcallHandle(
            "g_charset_converter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_charset_converter_get_num_fallbacks = Interop.downcallHandle(
            "g_charset_converter_get_num_fallbacks",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_charset_converter_get_use_fallback = Interop.downcallHandle(
            "g_charset_converter_get_use_fallback",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_charset_converter_set_use_fallback = Interop.downcallHandle(
            "g_charset_converter_set_use_fallback",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
