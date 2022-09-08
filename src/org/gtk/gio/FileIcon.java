package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GFileIcon specifies an icon by pointing to an image file
 * to be used as icon.
 */
public class FileIcon extends org.gtk.gobject.Object implements Icon, LoadableIcon {

    public FileIcon(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileIcon */
    public static FileIcon castFrom(org.gtk.gobject.Object gobject) {
        return new FileIcon(gobject.getReference());
    }
    
    /**
     * Creates a new icon for a file.
     */
    public FileIcon(File file) {
        super(References.get(gtk_h.g_file_icon_new(file.handle()), true));
    }
    
    /**
     * Gets the #GFile associated with the given @icon.
     */
    public File getFile() {
        var RESULT = gtk_h.g_file_icon_get_file(handle());
        return new File.FileImpl(References.get(RESULT, false));
    }
    
}
