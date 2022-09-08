package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GBytesIcon specifies an image held in memory in a common format (usually
 * png) to be used as icon.
 */
public class BytesIcon extends org.gtk.gobject.Object implements Icon, LoadableIcon {

    public BytesIcon(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BytesIcon */
    public static BytesIcon castFrom(org.gtk.gobject.Object gobject) {
        return new BytesIcon(gobject.getReference());
    }
    
    /**
     * Creates a new icon for a bytes.
     * 
     * This cannot fail, but loading and interpreting the bytes may fail later on
     * (for example, if g_loadable_icon_load() is called) if the image is invalid.
     */
    public BytesIcon(org.gtk.glib.Bytes bytes) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_bytes_icon_new(bytes.HANDLE()), true));
    }
    
    /**
     * Gets the #GBytes associated with the given @icon.
     */
    public org.gtk.glib.Bytes getBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bytes_icon_get_bytes(HANDLE());
        return new org.gtk.glib.Bytes(References.get(RESULT, false));
    }
    
}
