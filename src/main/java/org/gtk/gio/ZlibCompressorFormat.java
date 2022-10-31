package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to select the type of data format to use for {@link ZlibDecompressor}
 * and {@link ZlibCompressor}.
 * @version 2.24
 */
public class ZlibCompressorFormat extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GZlibCompressorFormat";
    
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
