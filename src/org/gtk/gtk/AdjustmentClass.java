package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class AdjustmentClass extends io.github.jwharm.javagi.ResourceBase {

    public AdjustmentClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AdjustmentClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkAdjustmentClass.allocate(Interop.getAllocator()).address()));
    }
    
}
