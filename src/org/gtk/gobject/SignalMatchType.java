package org.gtk.gobject;

/**
 * The match types specify what g_signal_handlers_block_matched(),
 * g_signal_handlers_unblock_matched() and g_signal_handlers_disconnect_matched()
 * match signals by.
 */
public class SignalMatchType {

    /**
     * The signal id must be equal.
     */
    public static final SignalMatchType ID = new SignalMatchType(1);
    
    /**
     * The signal detail must be equal.
     */
    public static final SignalMatchType DETAIL = new SignalMatchType(2);
    
    /**
     * The closure must be the same.
     */
    public static final SignalMatchType CLOSURE = new SignalMatchType(4);
    
    /**
     * The C closure callback must be the same.
     */
    public static final SignalMatchType FUNC = new SignalMatchType(8);
    
    /**
     * The closure data must be the same.
     */
    public static final SignalMatchType DATA = new SignalMatchType(16);
    
    /**
     * Only unblocked signals may be matched.
     */
    public static final SignalMatchType UNBLOCKED = new SignalMatchType(32);
    
    private int value;
    
    public SignalMatchType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SignalMatchType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public SignalMatchType combined(SignalMatchType mask) {
        return new SignalMatchType(this.getValue() | mask.getValue());
    }
    
    public static SignalMatchType combined(SignalMatchType mask, SignalMatchType... masks) {
        int value = mask.getValue();
        for (SignalMatchType arg : masks) {
            value |= arg.getValue();
        }
        return new SignalMatchType(value);
    }
    
}
