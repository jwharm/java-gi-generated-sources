package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class DirectoryListClass extends io.github.jwharm.javagi.ResourceBase {

    public DirectoryListClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DirectoryListClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkDirectoryListClass.allocate(Interop.getAllocator()).address()));
    }
    
}
