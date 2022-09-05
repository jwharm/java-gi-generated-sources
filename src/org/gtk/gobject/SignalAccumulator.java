package org.gtk.gobject;

@FunctionalInterface
public interface SignalAccumulator {

    /**
     * The signal accumulator is a special callback function that can be used
     * to collect return values of the various callbacks that are called
     * during a signal emission.
     * 
     * The signal accumulator is specified at signal creation time, if it is
     * left %NULL, no accumulation of callback return values is performed.
     * The return value of signal emissions is then the value returned by the
     * last callback.
     */
    public boolean onSignalAccumulator(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, jdk.incubator.foreign.MemoryAddress data);
}
