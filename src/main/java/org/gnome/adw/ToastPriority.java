package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Toast} behavior when another toast is already displayed.
 * @version 1.0
 */
public enum ToastPriority implements io.github.jwharm.javagi.Enumeration {
    /**
     * the toast will be queued if another toast is
     *   already displayed.
     */
    NORMAL(0),
    /**
     * the toast will be displayed immediately, pushing
     *   the previous toast into the queue instead.
     */
    HIGH(1);
    
    private static final java.lang.String C_TYPE_NAME = "AdwToastPriority";
    
    private final int value;
    ToastPriority(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ToastPriority of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> HIGH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
