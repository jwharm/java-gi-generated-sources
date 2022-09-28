package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class StringListClass extends io.github.jwharm.javagi.ResourceBase {

    public StringListClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public StringListClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkStringListClass.allocate(Interop.getAllocator()).address()));
    }
    
}
