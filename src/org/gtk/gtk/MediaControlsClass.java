package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class MediaControlsClass extends io.github.jwharm.javagi.ResourceBase {

    public MediaControlsClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public MediaControlsClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkMediaControlsClass.allocate(Interop.getAllocator()).address()));
    }
    
}
