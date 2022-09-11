package org.gtk.gobject;

@FunctionalInterface
public interface SignalEmissionHook {

        void onSignalEmissionHook(SignalInvocationHint ihint, int nParamValues, Value[] paramValues);
}
