package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for converting data from one type
 * to another type. The conversion can be stateful
 * and may fail at any place.
 */
public class ConverterIface extends io.github.jwharm.javagi.ResourceBase {

    public ConverterIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ConverterIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GConverterIface.allocate(Interop.getAllocator()).address()));
    }
    
}
