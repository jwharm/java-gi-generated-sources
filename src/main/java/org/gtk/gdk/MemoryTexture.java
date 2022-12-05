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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MemoryTexture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MemoryTexture if its GType is a (or inherits from) "GdkMemoryTexture".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MemoryTexture} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkMemoryTexture", a ClassCastException will be thrown.
     */
    public static MemoryTexture castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), MemoryTexture.getType())) {
            return new MemoryTexture(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkMemoryTexture");
        }
    }
    
    private static Addressable constructNew(int width, int height, @NotNull org.gtk.gdk.MemoryFormat format, @NotNull org.gtk.glib.Bytes bytes, long stride) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Addressable RESULT;
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
    public MemoryTexture(int width, int height, @NotNull org.gtk.gdk.MemoryFormat format, @NotNull org.gtk.glib.Bytes bytes, long stride) {
        super(constructNew(width, height, format, bytes, stride), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_memory_texture_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.Texture.Build {
        
         /**
         * A {@link MemoryTexture.Build} object constructs a {@link MemoryTexture} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MemoryTexture} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MemoryTexture} using {@link MemoryTexture#castFrom}.
         * @return A new instance of {@code MemoryTexture} with the properties 
         *         that were set in the Build object.
         */
        public MemoryTexture construct() {
            return MemoryTexture.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MemoryTexture.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
