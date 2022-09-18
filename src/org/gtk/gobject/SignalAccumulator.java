package org.gtk.gobject;

/**
 * The signal accumulator is a special callback function that can be used
 * to collect return values of the various callbacks that are called
 * during a signal emission.
 * 
 * The signal accumulator is specified at signal creation time, if it is
 * left <code>null</code>  no accumulation of callback return values is performed.
 * The return value of signal emissions is then the value returned by the
 * last callback.
 */
@FunctionalInterface
public interface SignalAccumulator {
        boolean onSignalAccumulator(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn);
}
