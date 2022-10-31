package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values for the {@link AccessibleState#INVALID}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleInvalidState#FALSE} and
 * {@link AccessibleInvalidState#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public class AccessibleInvalidState extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleInvalidState";
    
    /**
     * There are no detected errors in the value
     */
    public static final AccessibleInvalidState FALSE = new AccessibleInvalidState(0);
    
    /**
     * The value entered by the user has failed validation
     */
    public static final AccessibleInvalidState TRUE = new AccessibleInvalidState(1);
    
    /**
     * A grammatical error was detected
     */
    public static final AccessibleInvalidState GRAMMAR = new AccessibleInvalidState(2);
    
    /**
     * A spelling error was detected
     */
    public static final AccessibleInvalidState SPELLING = new AccessibleInvalidState(3);
    
    public AccessibleInvalidState(int value) {
        super(value);
    }
}
