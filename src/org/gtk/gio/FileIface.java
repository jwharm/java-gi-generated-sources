package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An interface for writing VFS file handles.
 */
public class FileIface extends io.github.jwharm.javagi.ResourceBase {

    public FileIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileIface.allocate(Interop.getAllocator()).address()));
    }
    
}
