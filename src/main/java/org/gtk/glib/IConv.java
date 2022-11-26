package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GIConv struct wraps an iconv() conversion descriptor. It contains
 * private data and should only be accessed using the following functions.
 */
public class IConv extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIConv";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IConv}
     * @return A new, uninitialized @{link IConv}
     */
    public static IConv allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IConv newInstance = new IConv(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IConv proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IConv(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
     * @param inbuf bytes to convert
     * @param inbytesLeft inout parameter, bytes remaining to convert in {@code inbuf}
     * @param outbuf converted output bytes
     * @param outbytesLeft inout parameter, bytes available to fill in {@code outbuf}
     * @return count of non-reversible conversions, or -1 on error
     */
    public long gIconv(@NotNull PointerString inbuf, Out<Long> inbytesLeft, @NotNull PointerString outbuf, Out<Long> outbytesLeft) {
        java.util.Objects.requireNonNull(inbuf, "Parameter 'inbuf' must not be null");
        java.util.Objects.requireNonNull(inbytesLeft, "Parameter 'inbytesLeft' must not be null");
        MemorySegment inbytesLeftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(outbuf, "Parameter 'outbuf' must not be null");
        java.util.Objects.requireNonNull(outbytesLeft, "Parameter 'outbytesLeft' must not be null");
        MemorySegment outbytesLeftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_iconv.invokeExact(
                    handle(),
                    inbuf.handle(),
                    (Addressable) inbytesLeftPOINTER.address(),
                    outbuf.handle(),
                    (Addressable) outbytesLeftPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inbytesLeft.set(inbytesLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
        outbytesLeft.set(outbytesLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
    
    /**
     * Same as the standard UNIX routine iconv_close(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation. Should be called to clean up
     * the conversion descriptor from g_iconv_open() when
     * you are done converting things.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     * @return -1 on error, 0 on success
     */
    public int close() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_iconv_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Same as the standard UNIX routine iconv_open(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     * @param toCodeset destination codeset
     * @param fromCodeset source codeset
     * @return a "conversion descriptor", or (GIConv)-1 if
     *  opening the converter failed.
     */
    public static @NotNull org.gtk.glib.IConv open(@NotNull java.lang.String toCodeset, @NotNull java.lang.String fromCodeset) {
        java.util.Objects.requireNonNull(toCodeset, "Parameter 'toCodeset' must not be null");
        java.util.Objects.requireNonNull(fromCodeset, "Parameter 'fromCodeset' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_iconv_open.invokeExact(
                    Interop.allocateNativeString(toCodeset),
                    Interop.allocateNativeString(fromCodeset));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.IConv(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_iconv = Interop.downcallHandle(
            "g_iconv",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_iconv_close = Interop.downcallHandle(
            "g_iconv_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_iconv_open = Interop.downcallHandle(
            "g_iconv_open",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private IConv struct;
        
         /**
         * A {@link IConv.Build} object constructs a {@link IConv} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = IConv.allocate();
        }
        
         /**
         * Finish building the {@link IConv} struct.
         * @return A new instance of {@code IConv} with the fields 
         *         that were set in the Build object.
         */
        public IConv construct() {
            return struct;
        }
    }
}
