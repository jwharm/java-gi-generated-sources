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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ZlibCompressor.getType())) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_zlib_compressor_get_type.invokeExact();
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
         * A {@link ZlibCompressor.Build} object constructs a {@link ZlibCompressor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ZlibCompressor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ZlibCompressor} using {@link ZlibCompressor#castFrom}.
         * @return A new instance of {@code ZlibCompressor} with the properties 
         *         that were set in the Build object.
         */
        public ZlibCompressor construct() {
            return ZlibCompressor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ZlibCompressor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If set to a non-{@code null} {@link FileInfo} object, and {@link ZlibCompressor}:format is
         * {@link ZlibCompressorFormat#GZIP}, the compressor will write the file name
         * and modification time from the file info to the GZIP header.
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
        
        public Build setLevel(int level) {
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
}
