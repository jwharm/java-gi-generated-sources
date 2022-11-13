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
    
    private static final java.lang.String C_TYPE_NAME = "GZlibCompressor";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ZlibCompressor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ZlibCompressor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ZlibCompressor if its GType is a (or inherits from) "GZlibCompressor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ZlibCompressor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GZlibCompressor", a ClassCastException will be thrown.
     */
    public static ZlibCompressor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GZlibCompressor"))) {
            return new ZlibCompressor(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GZlibCompressor");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.ZlibCompressorFormat format, int level) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_compressor_new.invokeExact(
                    format.getValue(),
                    level);
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
        super(constructNew(format, level), Ownership.FULL);
    }
    
    /**
     * Returns the {@link ZlibCompressor}:file-info property.
     * @return a {@link FileInfo}, or {@code null}
     */
    public @Nullable org.gtk.gio.FileInfo getFileInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_compressor_get_file_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileInfo(RESULT, Ownership.NONE);
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
        try {
            DowncallHandles.g_zlib_compressor_set_file_info.invokeExact(
                    handle(),
                    (Addressable) (fileInfo == null ? MemoryAddress.NULL : fileInfo.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_zlib_compressor_new = Interop.downcallHandle(
            "g_zlib_compressor_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_zlib_compressor_get_file_info = Interop.downcallHandle(
            "g_zlib_compressor_get_file_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_zlib_compressor_set_file_info = Interop.downcallHandle(
            "g_zlib_compressor_set_file_info",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
