package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkMemoryFormat} describes formats that image data can have in memory.
 * <p>
 * It describes formats by listing the contents of the memory passed to it.
 * So GDK_MEMORY_A8R8G8B8 will be 1 byte (8 bits) of alpha, followed by a
 * byte each of red, green and blue. It is not endian-dependent, so
 * CAIRO_FORMAT_ARGB32 is represented by different {@code GdkMemoryFormats}
 * on architectures with different endiannesses.
 * <p>
 * Its naming is modelled after
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/html/vkspec.html#VkFormat">VkFormat</a>
 * for details).
 */
public enum MemoryFormat implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * 4 bytes; for blue, green, red, alpha.
     *   The color values are premultiplied with the alpha value.
     */
    B8G8R8A8_PREMULTIPLIED(0),
    
    /**
     * 4 bytes; for alpha, red, green, blue.
     *   The color values are premultiplied with the alpha value.
     */
    A8R8G8B8_PREMULTIPLIED(1),
    
    /**
     * 4 bytes; for red, green, blue, alpha
     *   The color values are premultiplied with the alpha value.
     */
    R8G8B8A8_PREMULTIPLIED(2),
    
    /**
     * 4 bytes; for blue, green, red, alpha.
     */
    B8G8R8A8(3),
    
    /**
     * 4 bytes; for alpha, red, green, blue.
     */
    A8R8G8B8(4),
    
    /**
     * 4 bytes; for red, green, blue, alpha.
     */
    R8G8B8A8(5),
    
    /**
     * 4 bytes; for alpha, blue, green, red.
     */
    A8B8G8R8(6),
    
    /**
     * 3 bytes; for red, green, blue. The data is opaque.
     */
    R8G8B8(7),
    
    /**
     * 3 bytes; for blue, green, red. The data is opaque.
     */
    B8G8R8(8),
    
    /**
     * 3 guint16 values; for red, green, blue. Since: 4.6
     */
    R16G16B16(9),
    
    /**
     * 4 guint16 values; for red, green,
     *   blue, alpha. The color values are premultiplied with the alpha value.
     *  Since: 4.6
     */
    R16G16B16A16_PREMULTIPLIED(10),
    
    /**
     * 4 guint16 values; for red, green, blue, alpha.
     *  Since: 4.6
     */
    R16G16B16A16(11),
    
    /**
     * 3 half-float values; for red, green, blue.
     *   The data is opaque. Since: 4.6
     */
    R16G16B16_FLOAT(12),
    
    /**
     * 4 half-float values; for
     *   red, green, blue and alpha. The color values are premultiplied with
     *   the alpha value. Since: 4.6
     */
    R16G16B16A16_FLOAT_PREMULTIPLIED(13),
    
    /**
     * 4 half-float values; for red, green,
     *   blue and alpha. Since: 4.6
     */
    R16G16B16A16_FLOAT(14),
    
    R32G32B32_FLOAT(15),
    
    /**
     * 4 float values; for
     *   red, green, blue and alpha. The color values are premultiplied with
     *   the alpha value. Since: 4.6
     */
    R32G32B32A32_FLOAT_PREMULTIPLIED(16),
    
    /**
     * 4 float values; for red, green, blue and
     *   alpha. Since: 4.6
     */
    R32G32B32A32_FLOAT(17),
    
    /**
     * The number of formats. This value will change as
     *   more formats get added, so do not rely on its concrete integer.
     */
    N_FORMATS(18);
    
    private static final java.lang.String C_TYPE_NAME = "GdkMemoryFormat";
    
    private final int value;
    
    /**
     * Create a new MemoryFormat for the provided value
     * @param numeric value the enum value
     */
    MemoryFormat(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new MemoryFormat for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MemoryFormat of(int value) {
        return switch (value) {
            case 0 -> B8G8R8A8_PREMULTIPLIED;
            case 1 -> A8R8G8B8_PREMULTIPLIED;
            case 2 -> R8G8B8A8_PREMULTIPLIED;
            case 3 -> B8G8R8A8;
            case 4 -> A8R8G8B8;
            case 5 -> R8G8B8A8;
            case 6 -> A8B8G8R8;
            case 7 -> R8G8B8;
            case 8 -> B8G8R8;
            case 9 -> R16G16B16;
            case 10 -> R16G16B16A16_PREMULTIPLIED;
            case 11 -> R16G16B16A16;
            case 12 -> R16G16B16_FLOAT;
            case 13 -> R16G16B16A16_FLOAT_PREMULTIPLIED;
            case 14 -> R16G16B16A16_FLOAT;
            case 15 -> R32G32B32_FLOAT;
            case 16 -> R32G32B32A32_FLOAT_PREMULTIPLIED;
            case 17 -> R32G32B32A32_FLOAT;
            case 18 -> N_FORMATS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
