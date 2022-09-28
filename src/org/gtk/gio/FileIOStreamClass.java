package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FileIOStreamClass extends io.github.jwharm.javagi.ResourceBase {

    public FileIOStreamClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileIOStreamClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileIOStreamClass.allocate(Interop.getAllocator()).address()));
    }
    
}
