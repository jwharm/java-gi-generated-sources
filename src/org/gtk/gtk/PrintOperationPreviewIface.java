package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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
