package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class WidgetPaintableClass extends io.github.jwharm.javagi.ResourceBase {

    public WidgetPaintableClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public WidgetPaintableClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkWidgetPaintableClass.allocate(Interop.getAllocator()).address()));
    }
    
}
