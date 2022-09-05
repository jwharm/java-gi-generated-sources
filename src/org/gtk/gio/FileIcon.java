package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GFileIcon specifies an icon by pointing to an image file
 * to be used as icon.
 */
public class FileIcon extends org.gtk.gobject.Object implements Icon, LoadableIcon {

    public FileIcon(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FileIcon */
    public static FileIcon castFrom(org.gtk.gobject.Object gobject) {
        return new FileIcon(gobject.getProxy());
    }
    
    /**
     * Creates a new icon for a file.
     */
    public FileIcon(File file) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_icon_new(file.HANDLE()), true));
    }
    
    /**
     * Gets the #GFile associated with the given @icon.
     */
    public File getFile() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_icon_get_file(HANDLE());
        return new File.FileImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
}
