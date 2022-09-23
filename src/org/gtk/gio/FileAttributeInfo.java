package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a specific attribute.
 */
public class FileAttributeInfo extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileAttributeInfo() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileAttributeInfo.allocate(Interop.getAllocator()).address()));
    }
    
}
