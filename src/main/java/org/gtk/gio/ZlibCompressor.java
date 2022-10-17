package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ZlibCompressor} is an implementation of {@link Converter} that
 * compresses data using zlib.
 */
public class ZlibCompressor extends org.gtk.gobject.Object implements Converter {

    public ZlibCompressor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ZlibCompressor */
    public static ZlibCompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibCompressor(gobject.refcounted());
    }
    
    private static final MethodHandle g_zlib_compressor_new = Interop.downcallHandle(
        "g_zlib_compressor_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull ZlibCompressorFormat format, @NotNull int level) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_zlib_compressor_new.invokeExact(format.getValue(), level), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ZlibCompressor}.
     */
    public ZlibCompressor(@NotNull ZlibCompressorFormat format, @NotNull int level) {
        super(constructNew(format, level));
    }
    
    private static final MethodHandle g_zlib_compressor_get_file_info = Interop.downcallHandle(
        "g_zlib_compressor_get_file_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link ZlibCompressor}:file-info property.
     */
    public @Nullable FileInfo getFileInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_zlib_compressor_get_file_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FileInfo(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_zlib_compressor_set_file_info = Interop.downcallHandle(
        "g_zlib_compressor_set_file_info",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code file_info} in {@code compressor}. If non-{@code null}, and {@code compressor}'s
     * {@link ZlibCompressor}:format property is {@link ZlibCompressorFormat#GZIP},
     * it will be used to set the file name and modification time in
     * the GZIP header of the compressed data.
     * <p>
     * Note: it is an error to call this function while a compression is in
     * progress; it may only be called immediately after creation of {@code compressor},
     * or after resetting it with g_converter_reset().
     */
    public @NotNull void setFileInfo(@Nullable FileInfo fileInfo) {
        try {
            g_zlib_compressor_set_file_info.invokeExact(handle(), fileInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
