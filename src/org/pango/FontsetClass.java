package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoFontsetClass} structure holds the virtual functions for
 * a particular {@code PangoFontset} implementation.
 */
public class FontsetClass extends io.github.jwharm.javagi.ResourceBase {

    public FontsetClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontsetClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoFontsetClass.allocate(Interop.getAllocator()).address()));
    }
    
}
