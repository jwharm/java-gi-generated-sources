package org.gtk.gobject;

/**
 * The signal flags are used to specify a signal's behaviour.
 */
public class SignalFlags {

    /**
     * Invoke the object method handler in the first emission stage.
     */
    public static final SignalFlags RUN_FIRST = new SignalFlags(1);
    
    /**
     * Invoke the object method handler in the third emission stage.
     */
    public static final SignalFlags RUN_LAST = new SignalFlags(2);
    
    /**
     * Invoke the object method handler in the last emission stage.
     */
    public static final SignalFlags RUN_CLEANUP = new SignalFlags(4);
    
    /**
     * Signals being emitted for an object while currently being in
     *  emission for this very object will not be emitted recursively,
     *  but instead cause the first emission to be restarted.
     */
    public static final SignalFlags NO_RECURSE = new SignalFlags(8);
    
    /**
     * This signal supports "::detail" appendices to the signal name
     *  upon handler connections and emissions.
     */
    public static final SignalFlags DETAILED = new SignalFlags(16);
    
    /**
     * Action signals are signals that may freely be emitted on alive
     *  objects from user code via g_signal_emit() and friends, without
     *  the need of being embedded into extra code that performs pre or
     *  post emission adjustments on the object. They can also be thought
     *  of as object methods which can be called generically by
     *  third-party code.
     */
    public static final SignalFlags ACTION = new SignalFlags(32);
    
    /**
     * No emissions hooks are supported for this signal.
     */
    public static final SignalFlags NO_HOOKS = new SignalFlags(64);
    
    /**
     * Varargs signal emission will always collect the
     *   arguments, even if there are no signal handlers connected.  Since 2.30.
     */
    public static final SignalFlags MUST_COLLECT = new SignalFlags(128);
    
    /**
     * The signal is deprecated and will be removed
     *   in a future version. A warning will be generated if it is connected while
     *   running with G_ENABLE_DIAGNOSTIC=1.  Since 2.32.
     */
    public static final SignalFlags DEPRECATED = new SignalFlags(256);
    
    /**
     * Only used in {@link SignalAccumulator} accumulator
     *   functions for the {@link SignalInvocationHint}::run_type field to mark the first
     *   call to the accumulator function for a signal emission.  Since 2.68.
     */
    public static final SignalFlags ACCUMULATOR_FIRST_RUN = new SignalFlags(131072);
    
    private int value;
    
    public SignalFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SignalFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public SignalFlags combined(SignalFlags mask) {
        return new SignalFlags(this.getValue() | mask.getValue());
    }
    
    public static SignalFlags combined(SignalFlags mask, SignalFlags... masks) {
        int value = mask.getValue();
        for (SignalFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SignalFlags(value);
    }
    
}
