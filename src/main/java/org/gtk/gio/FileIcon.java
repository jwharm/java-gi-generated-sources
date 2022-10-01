package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link FileIcon} specifies an icon by pointing to an image file
 * to be used as icon.
 */
public class FileIcon extends org.gtk.gobject.Object implements Icon, LoadableIcon {

    public FileIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileIcon */
    public static FileIcon castFrom(org.gtk.gobject.Object gobject) {
        return new FileIcon(gobject.refcounted());
    }
    
    private static Refcounted constructNew(File file) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_file_icon_new(file.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new icon for a file.
     */
    public FileIcon(File file) {
        super(constructNew(file));
    }
    
    /**
     * Gets the {@link File} associated with the given {@code icon}.
     */
    public File getFile() {
        var RESULT = gtk_h.g_file_icon_get_file(handle());
        return new File.FileImpl(Refcounted.get(RESULT, false));
    }
    
}
