package org.gtk.gobject;

/**
 * A simple function pointer to get invoked when the signal is emitted.
 * 
 * Emission hooks allow you to tie a hook to the signal type, so that it will
 * trap all emissions of that signal, from any object.
 * 
 * You may not attach these to signals created with the {@link org.gtk.gobject.SignalFlags<code>#NO_HOOKS</code>  flag.
 */
@FunctionalInterface
public interface SignalEmissionHook {
        boolean onSignalEmissionHook(SignalInvocationHint ihint, int nParamValues, Value[] paramValues);
}
