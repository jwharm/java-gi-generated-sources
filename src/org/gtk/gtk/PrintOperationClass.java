package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PrintOperationClass extends io.github.jwharm.javagi.ResourceBase {

    public PrintOperationClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PrintOperationClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkPrintOperationClass.allocate(Interop.getAllocator()).address()));
    }
    
}
