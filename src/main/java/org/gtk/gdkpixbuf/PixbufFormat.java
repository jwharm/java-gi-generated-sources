package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkPixbufFormat} contains information about the image format accepted
 * by a module.
 * <p>
 * Only modules should access the fields directly, applications should
 * use the {@code gdk_pixbuf_format_*} family of functions.
 */
public class PixbufFormat extends io.github.jwharm.javagi.ResourceBase {

    public PixbufFormat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public PixbufFormat() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GdkPixbufFormat.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Creates a copy of {@code format}.
     */
    public PixbufFormat copy() {
        var RESULT = gtk_h.gdk_pixbuf_format_copy(handle());
        return new PixbufFormat(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees the resources allocated when copying a {@code GdkPixbufFormat}
     * using gdk_pixbuf_format_copy()
     */
    public void free() {
        gtk_h.gdk_pixbuf_format_free(handle());
    }
    
    /**
     * Returns a description of the format.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.gdk_pixbuf_format_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the filename extensions typically used for files in the
     * given format.
     */
    public PointerIterator<java.lang.String> getExtensions() {
        var RESULT = gtk_h.gdk_pixbuf_format_get_extensions(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Returns information about the license of the image loader for the format.
     * <p>
     * The returned string should be a shorthand for a well known license, e.g.
     * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other license.
     */
    public java.lang.String getLicense() {
        var RESULT = gtk_h.gdk_pixbuf_format_get_license(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the mime types supported by the format.
     */
    public PointerIterator<java.lang.String> getMimeTypes() {
        var RESULT = gtk_h.gdk_pixbuf_format_get_mime_types(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Returns the name of the format.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gdk_pixbuf_format_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether this image format is disabled.
     * <p>
     * See gdk_pixbuf_format_set_disabled().
     */
    public boolean isDisabled() {
        var RESULT = gtk_h.gdk_pixbuf_format_is_disabled(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns {@code TRUE} if the save option specified by {@code option_key} is supported when
     * saving a pixbuf using the module implementing {@code format}.
     * <p>
     * See gdk_pixbuf_save() for more information about option keys.
     */
    public boolean isSaveOptionSupported(java.lang.String optionKey) {
        var RESULT = gtk_h.gdk_pixbuf_format_is_save_option_supported(handle(), Interop.allocateNativeString(optionKey).handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether this image format is scalable.
     * <p>
     * If a file is in a scalable format, it is preferable to load it at
     * the desired size, rather than loading it at the default size and
     * scaling the resulting pixbuf to the desired size.
     */
    public boolean isScalable() {
        var RESULT = gtk_h.gdk_pixbuf_format_is_scalable(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether pixbufs can be saved in the given format.
     */
    public boolean isWritable() {
        var RESULT = gtk_h.gdk_pixbuf_format_is_writable(handle());
        return RESULT != 0;
    }
    
    /**
     * Disables or enables an image format.
     * <p>
     * If a format is disabled, GdkPixbuf won't use the image loader for
     * this format to load images.
     * <p>
     * Applications can use this to avoid using image loaders with an
     * inappropriate license, see gdk_pixbuf_format_get_license().
     */
    public void setDisabled(boolean disabled) {
        gtk_h.gdk_pixbuf_format_set_disabled(handle(), disabled ? 1 : 0);
    }
    
}
