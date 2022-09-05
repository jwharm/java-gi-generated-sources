package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GZlibCompressor is an implementation of #GConverter that
 * compresses data using zlib.
 */
public class ZlibCompressor extends org.gtk.gobject.Object implements Converter {

    public ZlibCompressor(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ZlibCompressor */
    public static ZlibCompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibCompressor(gobject.getProxy());
    }
    
    /**
     * Creates a new #GZlibCompressor.
     */
    public ZlibCompressor(ZlibCompressorFormat format, int level) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_zlib_compressor_new(format.getValue(), level), true));
    }
    
    /**
     * Returns the #GZlibCompressor:file-info property.
     */
    public FileInfo getFileInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_zlib_compressor_get_file_info(HANDLE());
        return new FileInfo(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets @file_info in @compressor. If non-%NULL, and @compressor's
     * #GZlibCompressor:format property is %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
     * it will be used to set the file name and modification time in
     * the GZIP header of the compressed data.
     * 
     * Note: it is an error to call this function while a compression is in
     * progress; it may only be called immediately after creation of @compressor,
     * or after resetting it with g_converter_reset().
     */
    public void setFileInfo(FileInfo fileInfo) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_zlib_compressor_set_file_info(HANDLE(), fileInfo.HANDLE());
    }
    
}
