package org.gtk.gobject;

/**
 * The signal flags are used to specify a signal&#39;s behaviour.
 */
public class SignalFlags {

    /**
     * Invoke the object method handler in the first emission stage.
     */
    public static final int RUN_FIRST = 1;
    
    /**
     * Invoke the object method handler in the third emission stage.
     */
    public static final int RUN_LAST = 2;
    
    /**
     * Invoke the object method handler in the last emission stage.
     */
    public static final int RUN_CLEANUP = 4;
    
    /**
     * Signals being emitted for an object while currently being in
     *  emission for this very object will not be emitted recursively,
     *  but instead cause the first emission to be restarted.
     */
    public static final int NO_RECURSE = 8;
    
    /**
     * This signal supports &#34;::detail&#34; appendices to the signal name
     *  upon handler connections and emissions.
     */
    public static final int DETAILED = 16;
    
    /**
     * Action signals are signals that may freely be emitted on alive
     *  objects from user code via g_signal_emit() and friends, without
     *  the need of being embedded into extra code that performs pre or
     *  post emission adjustments on the object. They can also be thought
     *  of as object methods which can be called generically by
     *  third-party code.
     */
    public static final int ACTION = 32;
    
    /**
     * No emissions hooks are supported for this signal.
     */
    public static final int NO_HOOKS = 64;
    
    /**
     * Varargs signal emission will always collect the
     *   arguments, even if there are no signal handlers connected.  Since 2.30.
     */
    public static final int MUST_COLLECT = 128;
    
    /**
     * The signal is deprecated and will be removed
     *   in a future version. A warning will be generated if it is connected while
     *   running with G_ENABLE_DIAGNOSTIC=1.  Since 2.32.
     */
    public static final int DEPRECATED = 256;
    
    /**
     * Only used in #GSignalAccumulator accumulator
     *   functions for the #GSignalInvocationHint::run_type field to mark the first
     *   call to the accumulator function for a signal emission.  Since 2.68.
     */
    public static final int ACCUMULATOR_FIRST_RUN = 131072;
    
}
