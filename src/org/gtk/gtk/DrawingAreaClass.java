package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class DrawingAreaClass extends io.github.jwharm.javagi.ResourceBase {

    public DrawingAreaClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DrawingAreaClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkDrawingAreaClass.allocate(Interop.getAllocator()).address()));
    }
    
}
