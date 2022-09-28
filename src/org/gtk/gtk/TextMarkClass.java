package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TextMarkClass extends io.github.jwharm.javagi.ResourceBase {

    public TextMarkClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TextMarkClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTextMarkClass.allocate(Interop.getAllocator()).address()));
    }
    
}
