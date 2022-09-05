package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GZlibDecompressor is an implementation of #GConverter that
 * decompresses data compressed with zlib.
 */
public class ZlibDecompressor extends org.gtk.gobject.Object implements Converter {

    public ZlibDecompressor(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ZlibDecompressor */
    public static ZlibDecompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibDecompressor(gobject.getProxy());
    }
    
    /**
     * Creates a new #GZlibDecompressor.
     */
    public ZlibDecompressor(ZlibCompressorFormat format) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_zlib_decompressor_new(format.getValue()), true));
    }
    
    /**
     * Retrieves the #GFileInfo constructed from the GZIP header data
     * of compressed data processed by @compressor, or %NULL if @decompressor's
     * #GZlibDecompressor:format property is not %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
     * or the header data was not fully processed yet, or it not present in the
     * data stream at all.
     */
    public FileInfo getFileInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_zlib_decompressor_get_file_info(HANDLE());
        return new FileInfo(ProxyFactory.getProxy(RESULT, false));
    }
    
}
