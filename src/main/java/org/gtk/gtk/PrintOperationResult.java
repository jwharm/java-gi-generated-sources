package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of a print operation.
 * <p>
 * A value of this type is returned by {@link PrintOperation#run}.
 */
public class PrintOperationResult extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * An error has occurred.
     */
    public static final PrintOperationResult ERROR = new PrintOperationResult(0);
    
    /**
     * The print settings should be stored.
     */
    public static final PrintOperationResult APPLY = new PrintOperationResult(1);
    
    /**
     * The print operation has been canceled,
     *   the print settings should not be stored.
     */
    public static final PrintOperationResult CANCEL = new PrintOperationResult(2);
    
    /**
     * The print operation is not complete
     *   yet. This value will only be returned when running asynchronously.
     */
    public static final PrintOperationResult IN_PROGRESS = new PrintOperationResult(3);
    
    public PrintOperationResult(int value) {
        super(value);
    }
}
