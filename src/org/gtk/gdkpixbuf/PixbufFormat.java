package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkPixbufFormat` contains information about the image format accepted
 * by a module.
 * 
 * Only modules should access the fields directly, applications should
 * use the `gdk_pixbuf_format_*` family of functions.
 */
public class PixbufFormat extends io.github.jwharm.javagi.interop.ResourceBase {

    public PixbufFormat(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a copy of `format`.
     */
    public PixbufFormat copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_copy(HANDLE());
        return new PixbufFormat(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Frees the resources allocated when copying a `GdkPixbufFormat`
     * using gdk_pixbuf_format_copy()
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_free(HANDLE());
    }
    
    /**
     * Returns a description of the format.
     */
    public java.lang.String getDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_get_description(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns information about the license of the image loader for the format.
     * 
     * The returned string should be a shorthand for a well known license, e.g.
     * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other license.
     */
    public java.lang.String getLicense() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_get_license(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the name of the format.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether this image format is disabled.
     * 
     * See gdk_pixbuf_format_set_disabled().
     */
    public boolean isDisabled() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_is_disabled(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns `TRUE` if the save option specified by @option_key is supported when
     * saving a pixbuf using the module implementing @format.
     * 
     * See gdk_pixbuf_save() for more information about option keys.
     */
    public boolean isSaveOptionSupported(java.lang.String optionKey) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_is_save_option_supported(HANDLE(), Interop.getAllocator().allocateUtf8String(optionKey));
        return (RESULT != 0);
    }
    
    /**
     * Returns whether this image format is scalable.
     * 
     * If a file is in a scalable format, it is preferable to load it at
     * the desired size, rather than loading it at the default size and
     * scaling the resulting pixbuf to the desired size.
     */
    public boolean isScalable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_is_scalable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether pixbufs can be saved in the given format.
     */
    public boolean isWritable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_is_writable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Disables or enables an image format.
     * 
     * If a format is disabled, GdkPixbuf won't use the image loader for
     * this format to load images.
     * 
     * Applications can use this to avoid using image loaders with an
     * inappropriate license, see gdk_pixbuf_format_get_license().
     */
    public void setDisabled(boolean disabled) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_format_set_disabled(HANDLE(), disabled ? 1 : 0);
    }
    
}
