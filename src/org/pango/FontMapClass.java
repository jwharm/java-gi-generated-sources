package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoFontMapClass} structure holds the virtual functions for
 * a particular {@code PangoFontMap} implementation.
 */
public class FontMapClass extends io.github.jwharm.javagi.ResourceBase {

    public FontMapClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontMapClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoFontMapClass.allocate(Interop.getAllocator()).address()));
    }
    
}
