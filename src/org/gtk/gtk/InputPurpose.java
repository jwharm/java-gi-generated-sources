package org.gtk.gtk;

/**
 * Describes primary purpose of the input widget.
 * 
 * This information is useful for on-screen keyboards and similar input
 * methods to decide which keys should be presented to the user.
 * 
 * Note that the purpose is not meant to impose a totally strict rule
 * about allowed characters, and does not replace input validation.
 * It is fine for an on-screen keyboard to let the user override the
 * character set restriction that is expressed by the purpose. The
 * application is expected to validate the entry contents, even if
 * it specified a purpose.
 * 
 * The difference between {@link org.gtk.gtk.InputPurpose<code>#DIGITS</code>  and
 * {@link org.gtk.gtk.InputPurpose<code>#NUMBER</code>  is that the former accepts only digits
 * while the latter also some punctuation (like commas or points, plus,
 * minus) and &<code>#8220</code> e&<code>#8221</code>  or &<code>#8220</code> E&<code>#8221</code>  as in 3.14E+000.
 * 
 * This enumeration may be extended in the future; input methods should
 * interpret unknown values as &<code>#8220</code> free form&<code>#8221</code> .
 */
public enum InputPurpose {

    /**
     * Allow any character
     */
    FREE_FORM,
    
    /**
     * Allow only alphabetic characters
     */
    ALPHA,
    
    /**
     * Allow only digits
     */
    DIGITS,
    
    /**
     * Edited field expects numbers
     */
    NUMBER,
    
    /**
     * Edited field expects phone number
     */
    PHONE,
    
    /**
     * Edited field expects URL
     */
    URL,
    
    /**
     * Edited field expects email address
     */
    EMAIL,
    
    /**
     * Edited field expects the name of a person
     */
    NAME,
    
    /**
     * Like {@link org.gtk.gtk.InputPurpose<code>#FREE_FORM</code>   but characters are hidden
     */
    PASSWORD,
    
    /**
     * Like {@link org.gtk.gtk.InputPurpose<code>#DIGITS</code>   but characters are hidden
     */
    PIN,
    
    /**
     * Allow any character, in addition to control codes
     */
    TERMINAL;
    
    public static InputPurpose fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FREE_FORM -> 0;
            case ALPHA -> 1;
            case DIGITS -> 2;
            case NUMBER -> 3;
            case PHONE -> 4;
            case URL -> 5;
            case EMAIL -> 6;
            case NAME -> 7;
            case PASSWORD -> 8;
            case PIN -> 9;
            case TERMINAL -> 10;
        };
    }

}
