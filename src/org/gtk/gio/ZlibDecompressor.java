package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ZlibDecompressor} is an implementation of {@link Converter} that
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
     * Creates a new {@link ZlibDecompressor}.
     */
    public ZlibDecompressor(ZlibCompressorFormat format) {
        super(constructNew(format));
    }
    
    /**
     * Retrieves the {@link FileInfo} constructed from the GZIP header data
     * of compressed data processed by {@code compressor}, or {@code null} if {@code decompressor}'s
     * {@link ZlibDecompressor}:format property is not {@link ZlibCompressorFormat#GZIP},
     * or the header data was not fully processed yet, or it not present in the
     * data stream at all.
     */
    public FileInfo getFileInfo() {
        var RESULT = gtk_h.g_zlib_decompressor_get_file_info(handle());
        return new FileInfo(References.get(RESULT, false));
    }
    
}
