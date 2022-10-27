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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public MemoryTexture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MemoryTexture */
    public static MemoryTexture castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryTexture(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int width, int height, @NotNull org.gtk.gdk.MemoryFormat format, @NotNull org.gtk.glib.Bytes bytes, long stride) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_memory_texture_new.invokeExact(width, height, format.getValue(), bytes.handle(), stride), true);
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
        super(constructNew(width, height, format, bytes, stride));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_memory_texture_new = Interop.downcallHandle(
            "gdk_memory_texture_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
