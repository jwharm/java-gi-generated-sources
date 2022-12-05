package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different methods to handle text in {@link Inscription} when it doesn't
 * fit the available space.
 * @version 4.8
 */
public enum InscriptionOverflow implements io.github.jwharm.javagi.Enumeration {
    /**
     * Clip the remaining text
     */
    CLIP(0),
    /**
     * Omit characters at the start of the text
     */
    ELLIPSIZE_START(1),
    /**
     * Omit characters at the middle of the text
     */
    ELLIPSIZE_MIDDLE(2),
    /**
     * Omit characters at the end of the text
     */
    ELLIPSIZE_END(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkInscriptionOverflow";
    
    private final int value;
    InscriptionOverflow(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static InscriptionOverflow of(int value) {
        return switch (value) {
            case 0 -> CLIP;
            case 1 -> ELLIPSIZE_START;
            case 2 -> ELLIPSIZE_MIDDLE;
            case 3 -> ELLIPSIZE_END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
