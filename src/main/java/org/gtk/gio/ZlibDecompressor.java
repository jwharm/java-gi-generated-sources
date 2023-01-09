package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ZlibDecompressor} is an implementation of {@link Converter} that
 * decompresses data compressed with zlib.
 */
public class ZlibDecompressor extends org.gtk.gobject.GObject implements org.gtk.gio.Converter {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GZlibDecompressor";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ZlibDecompressor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ZlibDecompressor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ZlibDecompressor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ZlibDecompressor(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.ZlibCompressorFormat format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_decompressor_new.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ZlibDecompressor}.
     * @param format The format to use for the compressed data
     */
    public ZlibDecompressor(org.gtk.gio.ZlibCompressorFormat format) {
        super(constructNew(format));
        this.takeOwnership();
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
        return (org.gtk.gio.FileInfo) Interop.register(RESULT, org.gtk.gio.FileInfo.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_zlib_decompressor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ZlibDecompressor.Builder} object constructs a {@link ZlibDecompressor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ZlibDecompressor.Builder#build()}. 
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
         * Finish building the {@link ZlibDecompressor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ZlibDecompressor}.
         * @return A new instance of {@code ZlibDecompressor} with the properties 
         *         that were set in the Builder object.
         */
        public ZlibDecompressor build() {
            return (ZlibDecompressor) org.gtk.gobject.GObject.newWithProperties(
                ZlibDecompressor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A {@link FileInfo} containing the information found in the GZIP header
         * of the data stream processed, or {@code null} if the header was not yet
         * fully processed, is not present at all, or the compressor's
         * {@link ZlibDecompressor}:format property is not {@link ZlibCompressorFormat#GZIP}.
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
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_zlib_decompressor_new = Interop.downcallHandle(
                "g_zlib_decompressor_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_zlib_decompressor_get_file_info = Interop.downcallHandle(
                "g_zlib_decompressor_get_file_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_zlib_decompressor_get_type = Interop.downcallHandle(
                "g_zlib_decompressor_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_zlib_decompressor_get_type != null;
    }
}
