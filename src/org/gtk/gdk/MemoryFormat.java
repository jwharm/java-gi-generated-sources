package org.gtk.gdk;

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
public class MemoryFormat {

    /**
     * 4 bytes; for blue, green, red, alpha.
     *   The color values are premultiplied with the alpha value.
     */
    public static final MemoryFormat B8G8R8A8_PREMULTIPLIED = new MemoryFormat(0);
    
    /**
     * 4 bytes; for alpha, red, green, blue.
     *   The color values are premultiplied with the alpha value.
     */
    public static final MemoryFormat A8R8G8B8_PREMULTIPLIED = new MemoryFormat(1);
    
    /**
     * 4 bytes; for red, green, blue, alpha
     *   The color values are premultiplied with the alpha value.
     */
    public static final MemoryFormat R8G8B8A8_PREMULTIPLIED = new MemoryFormat(2);
    
    /**
     * 4 bytes; for blue, green, red, alpha.
     */
    public static final MemoryFormat B8G8R8A8 = new MemoryFormat(3);
    
    /**
     * 4 bytes; for alpha, red, green, blue.
     */
    public static final MemoryFormat A8R8G8B8 = new MemoryFormat(4);
    
    /**
     * 4 bytes; for red, green, blue, alpha.
     */
    public static final MemoryFormat R8G8B8A8 = new MemoryFormat(5);
    
    /**
     * 4 bytes; for alpha, blue, green, red.
     */
    public static final MemoryFormat A8B8G8R8 = new MemoryFormat(6);
    
    /**
     * 3 bytes; for red, green, blue. The data is opaque.
     */
    public static final MemoryFormat R8G8B8 = new MemoryFormat(7);
    
    /**
     * 3 bytes; for blue, green, red. The data is opaque.
     */
    public static final MemoryFormat B8G8R8 = new MemoryFormat(8);
    
    /**
     * 3 guint16 values; for red, green, blue. Since: 4.6
     */
    public static final MemoryFormat R16G16B16 = new MemoryFormat(9);
    
    /**
     * 4 guint16 values; for red, green,
     *   blue, alpha. The color values are premultiplied with the alpha value.
     *  Since: 4.6
     */
    public static final MemoryFormat R16G16B16A16_PREMULTIPLIED = new MemoryFormat(10);
    
    /**
     * 4 guint16 values; for red, green, blue, alpha.
     *  Since: 4.6
     */
    public static final MemoryFormat R16G16B16A16 = new MemoryFormat(11);
    
    /**
     * 3 half-float values; for red, green, blue.
     *   The data is opaque. Since: 4.6
     */
    public static final MemoryFormat R16G16B16_FLOAT = new MemoryFormat(12);
    
    /**
     * 4 half-float values; for
     *   red, green, blue and alpha. The color values are premultiplied with
     *   the alpha value. Since: 4.6
     */
    public static final MemoryFormat R16G16B16A16_FLOAT_PREMULTIPLIED = new MemoryFormat(13);
    
    /**
     * 4 half-float values; for red, green,
     *   blue and alpha. Since: 4.6
     */
    public static final MemoryFormat R16G16B16A16_FLOAT = new MemoryFormat(14);
    
    public static final MemoryFormat R32G32B32_FLOAT = new MemoryFormat(15);
    
    /**
     * 4 float values; for
     *   red, green, blue and alpha. The color values are premultiplied with
     *   the alpha value. Since: 4.6
     */
    public static final MemoryFormat R32G32B32A32_FLOAT_PREMULTIPLIED = new MemoryFormat(16);
    
    /**
     * 4 float values; for red, green, blue and
     *   alpha. Since: 4.6
     */
    public static final MemoryFormat R32G32B32A32_FLOAT = new MemoryFormat(17);
    
    /**
     * The number of formats. This value will change as
     *   more formats get added, so do not rely on its concrete integer.
     */
    public static final MemoryFormat N_FORMATS = new MemoryFormat(18);
    
    private int value;
    
    public MemoryFormat(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MemoryFormat[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
