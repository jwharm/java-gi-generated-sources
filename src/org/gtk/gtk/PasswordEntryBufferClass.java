package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PasswordEntryBufferClass extends io.github.jwharm.javagi.ResourceBase {

    public PasswordEntryBufferClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PasswordEntryBufferClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkPasswordEntryBufferClass.allocate(Interop.getAllocator()).address()));
    }
    
}
