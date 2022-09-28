package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class EditableInterface extends io.github.jwharm.javagi.ResourceBase {

    public EditableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public EditableInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkEditableInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
