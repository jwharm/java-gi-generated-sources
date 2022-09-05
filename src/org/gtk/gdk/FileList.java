package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque type representing a list of files.
 */
public class FileList extends io.github.jwharm.javagi.interop.ResourceBase {

    public FileList(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Retrieves the list of files inside a `GdkFileList`.
     * 
     * This function is meant for language bindings.
     */
    public org.gtk.glib.SList getFiles() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_file_list_get_files(HANDLE());
        return new org.gtk.glib.SList(ProxyFactory.getProxy(RESULT, false));
    }
    
}