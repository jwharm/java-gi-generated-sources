package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FontFaceClass extends io.github.jwharm.javagi.ResourceBase {

    public FontFaceClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontFaceClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoFontFaceClass.allocate(Interop.getAllocator()).address()));
    }
    
}
