package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Toast} behavior when another toast is already displayed.
 * @version 1.0
 */
public class ToastPriority extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
