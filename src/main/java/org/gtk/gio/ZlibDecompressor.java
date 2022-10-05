package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ZlibDecompressor} is an implementation of {@link Converter} that
 * decompresses data compressed with zlib.
 */
public class ZlibDecompressor extends org.gtk.gobject.Object implements Converter {

    public ZlibDecompressor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ZlibDecompressor */
    public static ZlibDecompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibDecompressor(gobject.refcounted());
    }
    
    static final MethodHandle g_zlib_decompressor_new = Interop.downcallHandle(
        "g_zlib_decompressor_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(ZlibCompressorFormat format) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_zlib_decompressor_new.invokeExact(format.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ZlibDecompressor}.
     */
    public ZlibDecompressor(ZlibCompressorFormat format) {
        super(constructNew(format));
    }
    
    static final MethodHandle g_zlib_decompressor_get_file_info = Interop.downcallHandle(
        "g_zlib_decompressor_get_file_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@link FileInfo} constructed from the GZIP header data
     * of compressed data processed by {@code compressor}, or {@code null} if {@code decompressor}'s
     * {@link ZlibDecompressor}:format property is not {@link ZlibCompressorFormat#GZIP},
     * or the header data was not fully processed yet, or it not present in the
     * data stream at all.
     */
    public FileInfo getFileInfo() {
        try {
            var RESULT = (MemoryAddress) g_zlib_decompressor_get_file_info.invokeExact(handle());
            return new FileInfo(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
