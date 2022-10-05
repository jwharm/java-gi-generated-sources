package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GIConv struct wraps an iconv() conversion descriptor. It contains
 * private data and should only be accessed using the following functions.
 */
public class IConv extends io.github.jwharm.javagi.ResourceBase {

    public IConv(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_iconv = Interop.downcallHandle(
        "g_iconv",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Same as the standard UNIX routine iconv(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     * <p>
     * Note that the behaviour of iconv() for characters which are valid in the
     * input character set, but which have no representation in the output character
     * set, is implementation defined. This function may return success (with a
     * positive number of non-reversible conversions as replacement characters were
     * used), or it may return -1 and set an error such as {@code EILSEQ}, in such a
     * situation.
     */
    public long gIconv(java.lang.String[] inbuf, PointerLong inbytesLeft, java.lang.String[] outbuf, PointerLong outbytesLeft) {
        try {
            var RESULT = (long) g_iconv.invokeExact(handle(), Interop.allocateNativeArray(inbuf).handle(), inbytesLeft.handle(), Interop.allocateNativeArray(outbuf).handle(), outbytesLeft.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_iconv_close = Interop.downcallHandle(
        "g_iconv_close",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Same as the standard UNIX routine iconv_close(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation. Should be called to clean up
     * the conversion descriptor from g_iconv_open() when
     * you are done converting things.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public int close() {
        try {
            var RESULT = (int) g_iconv_close.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_iconv_open = Interop.downcallHandle(
        "g_iconv_open",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Same as the standard UNIX routine iconv_open(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public static IConv open(java.lang.String toCodeset, java.lang.String fromCodeset) {
        try {
            var RESULT = (MemoryAddress) g_iconv_open.invokeExact(Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle());
            return new IConv(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
