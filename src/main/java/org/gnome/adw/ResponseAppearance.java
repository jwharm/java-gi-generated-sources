package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible styles of {@link MessageDialog} response buttons.
 * <p>
 * See {@code MessageDialog#setResponseAppearance}.
 * @version 1.2
 */
public enum ResponseAppearance implements io.github.jwharm.javagi.Enumeration {
    /**
     * the default appearance.
     */
    DEFAULT(0),
    /**
     * used to denote important responses such as the
     *     affirmative action.
     */
    SUGGESTED(1),
    /**
     * used to draw attention to the potentially damaging
     *     consequences of using the response. This appearance acts as a warning to
     *     the user.
     */
    DESTRUCTIVE(2);
    
    private static final java.lang.String C_TYPE_NAME = "AdwResponseAppearance";
    
    private final int value;
    ResponseAppearance(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ResponseAppearance of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> SUGGESTED;
            case 2 -> DESTRUCTIVE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
