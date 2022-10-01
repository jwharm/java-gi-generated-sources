package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Specifies the {@link Scanner} parser configuration. Most settings can
 * be changed during the parsing phase and will affect the lexical
 * parsing of the next unpeeked token.
 */
public class ScannerConfig extends io.github.jwharm.javagi.ResourceBase {

    public ScannerConfig(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public ScannerConfig() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GScannerConfig.allocate(Interop.getAllocator()).address()));
    }
    
}
