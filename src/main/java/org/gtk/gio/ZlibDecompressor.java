package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ZlibDecompressor} is an implementation of {@link Converter} that
 * decompresses data compressed with zlib.
 */
public class ZlibDecompressor extends org.gtk.gobject.Object implements org.gtk.gio.Converter {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ZlibDecompressor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ZlibDecompressor */
    public static ZlibDecompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibDecompressor(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.ZlibCompressorFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_zlib_decompressor_new.invokeExact(format.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ZlibDecompressor}.
     * @param format The format to use for the compressed data
     */
    public ZlibDecompressor(@NotNull org.gtk.gio.ZlibCompressorFormat format) {
        super(constructNew(format));
    }
    
    /**
     * Retrieves the {@link FileInfo} constructed from the GZIP header data
     * of compressed data processed by {@code compressor}, or {@code null} if {@code decompressor}'s
     * {@link ZlibDecompressor}:format property is not {@link ZlibCompressorFormat#GZIP},
     * or the header data was not fully processed yet, or it not present in the
     * data stream at all.
     * @return a {@link FileInfo}, or {@code null}
     */
    public @Nullable org.gtk.gio.FileInfo getFileInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_decompressor_get_file_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_zlib_decompressor_new = Interop.downcallHandle(
            "g_zlib_decompressor_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_zlib_decompressor_get_file_info = Interop.downcallHandle(
            "g_zlib_decompressor_get_file_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
