package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is the signature of marshaller functions, required to marshall
 * arrays of parameter values to signal emissions into C language callback
 * invocations.
 * 
 * It is merely an alias to {@link org.gtk.gobject.ClosureMarshal} since the {@link org.gtk.gobject.Closure} mechanism
 * takes over responsibility of actual function invocation for the signal
 * system.
 */
public interface SignalCMarshaller extends ClosureMarshal {

}
