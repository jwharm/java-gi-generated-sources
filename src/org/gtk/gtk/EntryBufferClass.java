package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class EntryBufferClass extends io.github.jwharm.javagi.ResourceBase {

    public EntryBufferClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public EntryBufferClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkEntryBufferClass.allocate(Interop.getAllocator()).address()));
    }
    
}
