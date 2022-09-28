package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ShortcutClass extends io.github.jwharm.javagi.ResourceBase {

    public ShortcutClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ShortcutClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkShortcutClass.allocate(Interop.getAllocator()).address()));
    }
    
}
