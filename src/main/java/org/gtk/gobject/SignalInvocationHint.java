package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link SignalInvocationHint} structure is used to pass on additional information
 * to callbacks during a signal emission.
 */
public class SignalInvocationHint extends io.github.jwharm.javagi.ResourceBase {

    public SignalInvocationHint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public SignalInvocationHint() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GSignalInvocationHint.allocate(Interop.getAllocator()).address()));
    }
    
}
