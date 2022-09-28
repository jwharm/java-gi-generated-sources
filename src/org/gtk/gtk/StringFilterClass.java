package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class StringFilterClass extends io.github.jwharm.javagi.ResourceBase {

    public StringFilterClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public StringFilterClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkStringFilterClass.allocate(Interop.getAllocator()).address()));
    }
    
}
