package org.gtk.gio;

/**
 * Used to select the type of data format to use for {@link ZlibDecompressor}
 * and {@link ZlibCompressor}.
 */
public class ZlibCompressorFormat {

    /**
     * deflate compression with zlib header
     */
    public static final ZlibCompressorFormat ZLIB = new ZlibCompressorFormat(0);
    
    /**
     * gzip file format
     */
    public static final ZlibCompressorFormat GZIP = new ZlibCompressorFormat(1);
    
    /**
     * deflate compression with no header
     */
    public static final ZlibCompressorFormat RAW = new ZlibCompressorFormat(2);
    
    private int value;
    
    public ZlibCompressorFormat(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ZlibCompressorFormat[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
