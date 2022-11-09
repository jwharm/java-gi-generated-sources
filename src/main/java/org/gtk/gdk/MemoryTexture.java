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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "MemoryTexture" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkMemoryTexture", a ClassCastException will be thrown.
     */
    public static MemoryTexture castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkMemoryTexture"))) {
            return new MemoryTexture(gobject.handle(), gobject.refcounted().getOwnership());
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_memory_texture_new = Interop.downcallHandle(
            "gdk_memory_texture_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
    }
}
