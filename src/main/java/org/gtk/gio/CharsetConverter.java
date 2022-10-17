package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle g_charset_converter_new = Interop.downcallHandle(
        "g_charset_converter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String toCharset, @NotNull java.lang.String fromCharset) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_charset_converter_new.invokeExact(Interop.allocateNativeString(toCharset), Interop.allocateNativeString(fromCharset), (Addressable) GERROR), true);
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
    public CharsetConverter(@NotNull java.lang.String toCharset, @NotNull java.lang.String fromCharset) throws GErrorException {
        super(constructNew(toCharset, fromCharset));
    }
    
    private static final MethodHandle g_charset_converter_get_num_fallbacks = Interop.downcallHandle(
        "g_charset_converter_get_num_fallbacks",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of fallbacks that {@code converter} has applied so far.
     */
    public int getNumFallbacks() {
        int RESULT;
        try {
            RESULT = (int) g_charset_converter_get_num_fallbacks.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_charset_converter_get_use_fallback = Interop.downcallHandle(
        "g_charset_converter_get_use_fallback",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link CharsetConverter}:use-fallback property.
     */
    public boolean getUseFallback() {
        int RESULT;
        try {
            RESULT = (int) g_charset_converter_get_use_fallback.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_charset_converter_set_use_fallback = Interop.downcallHandle(
        "g_charset_converter_set_use_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link CharsetConverter}:use-fallback property.
     */
    public @NotNull void setUseFallback(@NotNull boolean useFallback) {
        try {
            g_charset_converter_set_use_fallback.invokeExact(handle(), useFallback ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
