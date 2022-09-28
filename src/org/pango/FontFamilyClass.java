package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FontFamilyClass extends io.github.jwharm.javagi.ResourceBase {

    public FontFamilyClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontFamilyClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoFontFamilyClass.allocate(Interop.getAllocator()).address()));
    }
    
}
