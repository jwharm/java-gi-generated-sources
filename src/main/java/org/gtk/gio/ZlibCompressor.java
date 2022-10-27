package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ZlibCompressor} is an implementation of {@link Converter} that
 * compresses data using zlib.
 */
public class ZlibCompressor extends org.gtk.gobject.Object implements org.gtk.gio.Converter {
    
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
    
    public ZlibCompressor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ZlibCompressor */
    public static ZlibCompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibCompressor(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.ZlibCompressorFormat format, int level) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_zlib_compressor_new.invokeExact(format.getValue(), level), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ZlibCompressor}.
     * @param format The format to use for the compressed data
     * @param level compression level (0-9), -1 for default
     */
    public ZlibCompressor(@NotNull org.gtk.gio.ZlibCompressorFormat format, int level) {
        super(constructNew(format, level));
    }
    
    /**
     * Returns the {@link ZlibCompressor}:file-info property.
     * @return a {@link FileInfo}, or {@code null}
     */
    public @Nullable org.gtk.gio.FileInfo getFileInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_compressor_get_file_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets {@code file_info} in {@code compressor}. If non-{@code null}, and {@code compressor}'s
     * {@link ZlibCompressor}:format property is {@link ZlibCompressorFormat#GZIP},
     * it will be used to set the file name and modification time in
     * the GZIP header of the compressed data.
     * <p>
     * Note: it is an error to call this function while a compression is in
     * progress; it may only be called immediately after creation of {@code compressor},
     * or after resetting it with g_converter_reset().
     * @param fileInfo a {@link FileInfo}
     */
    public void setFileInfo(@Nullable org.gtk.gio.FileInfo fileInfo) {
        java.util.Objects.requireNonNullElse(fileInfo, MemoryAddress.NULL);
        try {
            DowncallHandles.g_zlib_compressor_set_file_info.invokeExact(handle(), fileInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_zlib_compressor_new = Interop.downcallHandle(
            "g_zlib_compressor_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_zlib_compressor_get_file_info = Interop.downcallHandle(
            "g_zlib_compressor_get_file_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_zlib_compressor_set_file_info = Interop.downcallHandle(
            "g_zlib_compressor_set_file_info",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
