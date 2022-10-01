package org.gnome.adw;

/**
 * {@link Toast} behavior when another toast is already displayed.
 */
public class ToastPriority extends io.github.jwharm.javagi.Enumeration {

    /**
     * the toast will be queued if another toast is
     *   already displayed.
     */
    public static final ToastPriority NORMAL = new ToastPriority(0);
    
    /**
     * the toast will be displayed immediately, pushing
     *   the previous toast into the queue instead.
     */
    public static final ToastPriority HIGH = new ToastPriority(1);
    
    public ToastPriority(int value) {
        super(value);
    }
    
}
