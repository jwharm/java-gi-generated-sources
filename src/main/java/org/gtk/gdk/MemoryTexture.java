package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkTexture} representing image data in memory.
 */
public class MemoryTexture extends org.gtk.gdk.Texture implements org.gtk.gdk.Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkMemoryTexture";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MemoryTexture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MemoryTexture(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryTexture> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MemoryTexture(input);
    
    private static MemoryAddress constructNew(int width, int height, org.gtk.gdk.MemoryFormat format, org.gtk.glib.Bytes bytes, long stride) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_memory_texture_new.invokeExact(
                    width,
                    height,
                    format.getValue(),
                    bytes.handle(),
                    stride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new texture for a blob of image data.
     * <p>
     * The {@code GBytes} must contain {@code stride} × {@code height} pixels
     * in the given format.
     * @param width the width of the texture
     * @param height the height of the texture
     * @param format the format of the data
     * @param bytes the {@code GBytes} containing the pixel data
     * @param stride rowstride for the data
     */
    public MemoryTexture(int width, int height, org.gtk.gdk.MemoryFormat format, org.gtk.glib.Bytes bytes, long stride) {
        super(constructNew(width, height, format, bytes, stride));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_memory_texture_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MemoryTexture.Builder} object constructs a {@link MemoryTexture} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MemoryTexture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gdk.Texture.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MemoryTexture} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MemoryTexture}.
         * @return A new instance of {@code MemoryTexture} with the properties 
         *         that were set in the Builder object.
         */
        public MemoryTexture build() {
            return (MemoryTexture) org.gtk.gobject.GObject.newWithProperties(
                MemoryTexture.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_memory_texture_new = Interop.downcallHandle(
                "gdk_memory_texture_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gdk_memory_texture_get_type = Interop.downcallHandle(
                "gdk_memory_texture_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_memory_texture_get_type != null;
    }
}
