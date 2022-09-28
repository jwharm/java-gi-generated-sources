package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PictureClass extends io.github.jwharm.javagi.ResourceBase {

    public PictureClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PictureClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkPictureClass.allocate(Interop.getAllocator()).address()));
    }
    
}
