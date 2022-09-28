package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FileChooserNativeClass extends io.github.jwharm.javagi.ResourceBase {

    public FileChooserNativeClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileChooserNativeClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkFileChooserNativeClass.allocate(Interop.getAllocator()).address()));
    }
    
}
