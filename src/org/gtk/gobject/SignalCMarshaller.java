package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is the signature of marshaller functions, required to marshall
 * arrays of parameter values to signal emissions into C language callback
 * invocations.
 * 
 * It is merely an alias to #GClosureMarshal since the #GClosure mechanism
 * takes over responsibility of actual function invocation for the signal
 * system.
 */
public class SignalCMarshaller {

    private final ClosureMarshal value;
    
    public SignalCMarshaller(ClosureMarshal value) {
        this.value = value;
    }
    
    public ClosureMarshal getValue() {
        return this.value;
    }
    
}
