package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TextTagClass extends io.github.jwharm.javagi.ResourceBase {

    public TextTagClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TextTagClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTextTagClass.allocate(Interop.getAllocator()).address()));
    }
    
}
