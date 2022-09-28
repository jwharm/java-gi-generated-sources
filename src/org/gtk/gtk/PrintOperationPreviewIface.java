package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PrintOperationPreviewIface extends io.github.jwharm.javagi.ResourceBase {

    public PrintOperationPreviewIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PrintOperationPreviewIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkPrintOperationPreviewIface.allocate(Interop.getAllocator()).address()));
    }
    
}
