package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FileEnumeratorClass extends io.github.jwharm.javagi.ResourceBase {

    public FileEnumeratorClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileEnumeratorClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileEnumeratorClass.allocate(Interop.getAllocator()).address()));
    }
    
}
