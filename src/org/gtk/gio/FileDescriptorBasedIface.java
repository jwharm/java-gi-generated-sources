package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An interface for file descriptor based io objects.
 */
public class FileDescriptorBasedIface extends io.github.jwharm.javagi.ResourceBase {

    public FileDescriptorBasedIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileDescriptorBasedIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileDescriptorBasedIface.allocate(Interop.getAllocator()).address()));
    }
    
}
