package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FontChooserIface extends io.github.jwharm.javagi.ResourceBase {

    public FontChooserIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontChooserIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkFontChooserIface.allocate(Interop.getAllocator()).address()));
    }
    
}
