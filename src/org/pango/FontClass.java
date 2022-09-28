package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FontClass extends io.github.jwharm.javagi.ResourceBase {

    public FontClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoFontClass.allocate(Interop.getAllocator()).address()));
    }
    
}
