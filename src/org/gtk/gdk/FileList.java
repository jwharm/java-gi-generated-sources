package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque type representing a list of files.
 */
public class FileList extends io.github.jwharm.javagi.ResourceBase {

    public FileList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Retrieves the list of files inside a {@code GdkFileList}.
     * <p>
     * This function is meant for language bindings.
     */
    public org.gtk.glib.SList getFiles() {
        var RESULT = gtk_h.gdk_file_list_get_files(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
}
