package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ZlibCompressor} is an implementation of {@link Converter} that
 * compresses data using zlib.
 */
public class ZlibCompressor extends org.gtk.gobject.GObject implements org.gtk.gio.Converter {
    
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
     */
    protected ZlibCompressor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ZlibCompressor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ZlibCompressor(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.ZlibCompressorFormat format, int level) {
        MemoryAddress RESULT;
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
    public ZlibCompressor(org.gtk.gio.ZlibCompressorFormat format, int level) {
        super(constructNew(format, level));
        this.takeOwnership();
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
        return (org.gtk.gio.FileInfo) Interop.register(RESULT, org.gtk.gio.FileInfo.fromAddress).marshal(RESULT, null);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_zlib_compressor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ZlibCompressor.Builder} object constructs a {@link ZlibCompressor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ZlibCompressor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ZlibCompressor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ZlibCompressor}.
         * @return A new instance of {@code ZlibCompressor} with the properties 
         *         that were set in the Builder object.
         */
        public ZlibCompressor build() {
            return (ZlibCompressor) org.gtk.gobject.GObject.newWithProperties(
                ZlibCompressor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If set to a non-{@code null} {@link FileInfo} object, and {@link ZlibCompressor}:format is
         * {@link ZlibCompressorFormat#GZIP}, the compressor will write the file name
         * and modification time from the file info to the GZIP header.
         * @param fileInfo The value for the {@code file-info} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFileInfo(org.gtk.gio.FileInfo fileInfo) {
            names.add("file-info");
            values.add(org.gtk.gobject.Value.create(fileInfo));
            return this;
        }
        
        public Builder setFormat(org.gtk.gio.ZlibCompressorFormat format) {
            names.add("format");
            values.add(org.gtk.gobject.Value.create(format));
            return this;
        }
        
        public Builder setLevel(int level) {
            names.add("level");
            values.add(org.gtk.gobject.Value.create(level));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_zlib_compressor_new = Interop.downcallHandle(
                "g_zlib_compressor_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_zlib_compressor_get_file_info = Interop.downcallHandle(
                "g_zlib_compressor_get_file_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_zlib_compressor_set_file_info = Interop.downcallHandle(
                "g_zlib_compressor_set_file_info",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_zlib_compressor_get_type = Interop.downcallHandle(
                "g_zlib_compressor_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_zlib_compressor_get_type != null;
    }
}
