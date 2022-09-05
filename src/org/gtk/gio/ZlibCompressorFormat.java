package org.gtk.gio;

/**
 * Used to select the type of data format to use for #GZlibDecompressor
 * and #GZlibCompressor.
 */
public enum ZlibCompressorFormat {

    /**
     * deflate compression with zlib header
     */
    ZLIB,
    
    /**
     * gzip file format
     */
    GZIP,
    
    /**
     * deflate compression with no header
     */
    RAW;
    
    public static ZlibCompressorFormat fromValue(int value) {
        return switch(value) {
            case 0 -> ZLIB;
            case 1 -> GZIP;
            case 2 -> RAW;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ZLIB -> 0;
            case GZIP -> 1;
            case RAW -> 2;
        };
    }

}
