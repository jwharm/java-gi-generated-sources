package org.gtk.gobject;

@FunctionalInterface
public interface SignalEmissionHook {

    /**
     * A simple function pointer to get invoked when the signal is emitted.
     * 
     * Emission hooks allow you to tie a hook to the signal type, so that it will
     * trap all emissions of that signal, from any object.
     * 
     * You may not attach these to signals created with the %G_SIGNAL_NO_HOOKS flag.
     */
    public boolean onSignalEmissionHook(SignalInvocationHint ihint, int nParamValues, Value[] paramValues, jdk.incubator.foreign.MemoryAddress data);
}
