package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ComboBoxClass extends io.github.jwharm.javagi.ResourceBase {

    public ComboBoxClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ComboBoxClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkComboBoxClass.allocate(Interop.getAllocator()).address()));
    }
    
}
