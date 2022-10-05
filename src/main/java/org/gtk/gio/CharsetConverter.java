package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link CharsetConverter} is an implementation of {@link Converter} based on
 * GIConv.
 */
public class CharsetConverter extends org.gtk.gobject.Object implements Converter, Initable {

    public CharsetConverter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CharsetConverter */
    public static CharsetConverter castFrom(org.gtk.gobject.Object gobject) {
        return new CharsetConverter(gobject.refcounted());
    }
    
    static final MethodHandle g_charset_converter_new = Interop.downcallHandle(
        "g_charset_converter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String toCharset, java.lang.String fromCharset) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_charset_converter_new.invokeExact(Interop.allocateNativeString(toCharset).handle(), Interop.allocateNativeString(fromCharset).handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link CharsetConverter}.
     */
    public CharsetConverter(java.lang.String toCharset, java.lang.String fromCharset) throws GErrorException {
        super(constructNew(toCharset, fromCharset));
    }
    
    static final MethodHandle g_charset_converter_get_num_fallbacks = Interop.downcallHandle(
        "g_charset_converter_get_num_fallbacks",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of fallbacks that {@code converter} has applied so far.
     */
    public int getNumFallbacks() {
        try {
            var RESULT = (int) g_charset_converter_get_num_fallbacks.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_charset_converter_get_use_fallback = Interop.downcallHandle(
        "g_charset_converter_get_use_fallback",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link CharsetConverter}:use-fallback property.
     */
    public boolean getUseFallback() {
        try {
            var RESULT = (int) g_charset_converter_get_use_fallback.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_charset_converter_set_use_fallback = Interop.downcallHandle(
        "g_charset_converter_set_use_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link CharsetConverter}:use-fallback property.
     */
    public void setUseFallback(boolean useFallback) {
        try {
            g_charset_converter_set_use_fallback.invokeExact(handle(), useFallback ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
