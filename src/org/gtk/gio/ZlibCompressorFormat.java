package org.gtk.gio;

/**
 * Used to select the type of data format to use for {@link ZlibDecompressor}
 * and {@link ZlibCompressor}.
 */
public class ZlibCompressorFormat extends io.github.jwharm.javagi.Enumeration {

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
    
    public ZlibCompressorFormat(int value) {
        super(value);
    }
    
}
