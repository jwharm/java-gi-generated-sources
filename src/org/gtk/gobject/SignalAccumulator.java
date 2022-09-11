package org.gtk.gobject;

@FunctionalInterface
public interface SignalAccumulator {

        void onSignalAccumulator(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn);
}
