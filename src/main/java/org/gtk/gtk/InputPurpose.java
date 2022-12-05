package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes primary purpose of the input widget.
 * <p>
 * This information is useful for on-screen keyboards and similar input
 * methods to decide which keys should be presented to the user.
 * <p>
 * Note that the purpose is not meant to impose a totally strict rule
 * about allowed characters, and does not replace input validation.
 * It is fine for an on-screen keyboard to let the user override the
 * character set restriction that is expressed by the purpose. The
 * application is expected to validate the entry contents, even if
 * it specified a purpose.
 * <p>
 * The difference between {@link InputPurpose#DIGITS} and
 * {@link InputPurpose#NUMBER} is that the former accepts only digits
 * while the latter also some punctuation (like commas or points, plus,
 * minus) and “e” or “E” as in 3.14E+000.
 * <p>
 * This enumeration may be extended in the future; input methods should
 * interpret unknown values as “free form”.
 */
public enum InputPurpose implements io.github.jwharm.javagi.Enumeration {
    /**
     * Allow any character
     */
    FREE_FORM(0),
    /**
     * Allow only alphabetic characters
     */
    ALPHA(1),
    /**
     * Allow only digits
     */
    DIGITS(2),
    /**
     * Edited field expects numbers
     */
    NUMBER(3),
    /**
     * Edited field expects phone number
     */
    PHONE(4),
    /**
     * Edited field expects URL
     */
    URL(5),
    /**
     * Edited field expects email address
     */
    EMAIL(6),
    /**
     * Edited field expects the name of a person
     */
    NAME(7),
    /**
     * Like {@link InputPurpose#FREE_FORM}, but characters are hidden
     */
    PASSWORD(8),
    /**
     * Like {@link InputPurpose#DIGITS}, but characters are hidden
     */
    PIN(9),
    /**
     * Allow any character, in addition to control codes
     */
    TERMINAL(10);
    
    private static final java.lang.String C_TYPE_NAME = "GtkInputPurpose";
    
    private final int value;
    InputPurpose(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static InputPurpose of(int value) {
        return switch (value) {
            case 0 -> FREE_FORM;
            case 1 -> ALPHA;
            case 2 -> DIGITS;
            case 3 -> NUMBER;
            case 4 -> PHONE;
            case 5 -> URL;
            case 6 -> EMAIL;
            case 7 -> NAME;
            case 8 -> PASSWORD;
            case 9 -> PIN;
            case 10 -> TERMINAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
