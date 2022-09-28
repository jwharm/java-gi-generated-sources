package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ToastOverlayClass extends io.github.jwharm.javagi.ResourceBase {

    public ToastOverlayClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ToastOverlayClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwToastOverlayClass.allocate(Interop.getAllocator()).address()));
    }
    
}
