package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.ZlibDecompressor} is an implementation of {@link org.gtk.gio.Converter} that
 * decompresses data compressed with zlib.
 */
public class ZlibDecompressor extends org.gtk.gobject.Object implements Converter {

    public ZlibDecompressor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ZlibDecompressor */
    public static ZlibDecompressor castFrom(org.gtk.gobject.Object gobject) {
        return new ZlibDecompressor(gobject.getReference());
    }
    
    private static Reference constructNew(ZlibCompressorFormat format) {
        Reference RESULT = References.get(gtk_h.g_zlib_decompressor_new(format.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.ZlibDecompressor}
     */
    public ZlibDecompressor(ZlibCompressorFormat format) {
        super(constructNew(format));
    }
    
    /**
     * Retrieves the {@link org.gtk.gio.FileInfo} constructed from the GZIP header data
     * of compressed data processed by @compressor, or <code>null</code> if @decompressor&<code>#39</code> s
     * {@link org.gtk.gio.ZlibDecompressor} format property is not {@link org.gtk.gio.ZlibCompressorFormat<code>#GZIP</code>  
     * or the header data was not fully processed yet, or it not present in the
     * data stream at all.
     */
    public FileInfo getFileInfo() {
        var RESULT = gtk_h.g_zlib_decompressor_get_file_info(handle());
        return new FileInfo(References.get(RESULT, false));
    }
    
}
