package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GZlibCompressor is an implementation of #GConverter that
 * compresses data using zlib.
 */
public class ZlibCompressor extends org.gtk.gobject.Object implements Converter {

    public ZlibCompressor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ZlibCompressor */
    public static ZlibCompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibCompressor(gobject.getReference());
    }
    
    private static Reference constructNew(ZlibCompressorFormat format, int level) {
        Reference RESULT = References.get(gtk_h.g_zlib_compressor_new(format.getValue(), level), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GZlibCompressor.
     */
    public ZlibCompressor(ZlibCompressorFormat format, int level) {
        super(constructNew(format, level));
    }
    
    /**
     * Returns the #GZlibCompressor:file-info property.
     */
    public FileInfo getFileInfo() {
        var RESULT = gtk_h.g_zlib_compressor_get_file_info(handle());
        return new FileInfo(References.get(RESULT, false));
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
        gtk_h.g_zlib_compressor_set_file_info(handle(), fileInfo.handle());
    }
    
}
