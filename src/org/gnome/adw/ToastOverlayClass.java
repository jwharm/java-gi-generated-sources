package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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
