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
public class InputPurpose extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkInputPurpose";
    
    /**
     * Allow any character
     */
    public static final InputPurpose FREE_FORM = new InputPurpose(0);
    
    /**
     * Allow only alphabetic characters
     */
    public static final InputPurpose ALPHA = new InputPurpose(1);
    
    /**
     * Allow only digits
     */
    public static final InputPurpose DIGITS = new InputPurpose(2);
    
    /**
     * Edited field expects numbers
     */
    public static final InputPurpose NUMBER = new InputPurpose(3);
    
    /**
     * Edited field expects phone number
     */
    public static final InputPurpose PHONE = new InputPurpose(4);
    
    /**
     * Edited field expects URL
     */
    public static final InputPurpose URL = new InputPurpose(5);
    
    /**
     * Edited field expects email address
     */
    public static final InputPurpose EMAIL = new InputPurpose(6);
    
    /**
     * Edited field expects the name of a person
     */
    public static final InputPurpose NAME = new InputPurpose(7);
    
    /**
     * Like {@link InputPurpose#FREE_FORM}, but characters are hidden
     */
    public static final InputPurpose PASSWORD = new InputPurpose(8);
    
    /**
     * Like {@link InputPurpose#DIGITS}, but characters are hidden
     */
    public static final InputPurpose PIN = new InputPurpose(9);
    
    /**
     * Allow any character, in addition to control codes
     */
    public static final InputPurpose TERMINAL = new InputPurpose(10);
    
    public InputPurpose(int value) {
        super(value);
    }
}
