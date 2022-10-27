package org.gtk.gobject;

/**
 * This is the signature of marshaller functions, required to marshall
 * arrays of parameter values to signal emissions into C language callback
 * invocations.
 * <p>
 * It is merely an alias to {@link ClosureMarshal} since the {@link Closure} mechanism
 * takes over responsibility of actual function invocation for the signal
 * system.
 */
public interface SignalCMarshaller extends org.gtk.gobject.ClosureMarshal {
}
