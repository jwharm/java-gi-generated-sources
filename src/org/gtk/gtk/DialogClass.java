package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class DialogClass extends io.github.jwharm.javagi.ResourceBase {

    public DialogClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DialogClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkDialogClass.allocate(Interop.getAllocator()).address()));
    }
    
}
