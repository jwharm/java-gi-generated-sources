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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ZlibDecompressor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ZlibDecompressor if its GType is a (or inherits from) "GZlibDecompressor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ZlibDecompressor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GZlibDecompressor", a ClassCastException will be thrown.
     */
    public static ZlibDecompressor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ZlibDecompressor.getType())) {
            return new ZlibDecompressor(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GZlibDecompressor");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.ZlibCompressorFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_decompressor_new.invokeExact(
                    format.getValue());
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
        super(constructNew(format), Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.g_zlib_decompressor_get_file_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_zlib_decompressor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ZlibDecompressor.Build} object constructs a {@link ZlibDecompressor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ZlibDecompressor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ZlibDecompressor} using {@link ZlibDecompressor#castFrom}.
         * @return A new instance of {@code ZlibDecompressor} with the properties 
         *         that were set in the Build object.
         */
        public ZlibDecompressor construct() {
            return ZlibDecompressor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ZlibDecompressor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setFileInfo(org.gtk.gio.FileInfo fileInfo) {
            names.add("file-info");
            values.add(org.gtk.gobject.Value.create(fileInfo));
            return this;
        }
        
        public Build setFormat(org.gtk.gio.ZlibCompressorFormat format) {
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
}
