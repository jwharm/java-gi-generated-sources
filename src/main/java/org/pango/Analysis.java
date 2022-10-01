package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAnalysis} structure stores information about
 * the properties of a segment of text.
 */
public class Analysis extends io.github.jwharm.javagi.ResourceBase {

    public Analysis(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Analysis() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAnalysis.allocate(Interop.getAllocator()).address()));
    }
    
}
