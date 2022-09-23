package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FileOutputStreamClass extends io.github.jwharm.javagi.ResourceBase {

    public FileOutputStreamClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileOutputStreamClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileOutputStreamClass.allocate(Interop.getAllocator()).address()));
    }
    
}
