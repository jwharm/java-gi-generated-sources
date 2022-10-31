package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsInteractionResult} is returned by various functions in {@link TlsInteraction}
 * when finishing an interaction request.
 * @version 2.30
 */
public class TlsInteractionResult extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsInteractionResult";
    
    /**
     * The interaction was unhandled (i.e. not
     *     implemented).
     */
    public static final TlsInteractionResult UNHANDLED = new TlsInteractionResult(0);
    
    /**
     * The interaction completed, and resulting data
     *     is available.
     */
    public static final TlsInteractionResult HANDLED = new TlsInteractionResult(1);
    
    /**
     * The interaction has failed, or was cancelled.
     *     and the operation should be aborted.
     */
    public static final TlsInteractionResult FAILED = new TlsInteractionResult(2);
    
    public TlsInteractionResult(int value) {
        super(value);
    }
}
