package org.gtk.gobject;

/**
 * A simple function pointer to get invoked when the signal is emitted.
 * <p>
 * Emission hooks allow you to tie a hook to the signal type, so that it will
 * trap all emissions of that signal, from any object.
 * <p>
 * You may not attach these to signals created with the {@link SignalFlags#NO_HOOKS} flag.
 */
@FunctionalInterface
public interface SignalEmissionHook {
        boolean onSignalEmissionHook(SignalInvocationHint ihint, int nParamValues, Value[] paramValues);
}
