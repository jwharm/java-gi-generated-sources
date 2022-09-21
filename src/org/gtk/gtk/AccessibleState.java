package org.gtk.gtk;

/**
 * The possible accessible states of a {@code Accessible}.
 */
public enum AccessibleState {

    /**
     * A “busy” state. This state has boolean values
     */
    BUSY,
    
    /**
     * A “checked” state; indicates the current
     *   state of a {@code AccessibleTristate}
     */
    CHECKED,
    
    /**
     * A “disabled” state; corresponds to the
     *   {@code Widget:sensitive} property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    DISABLED,
    
    /**
     * An “expanded” state; corresponds to the
     *   {@code Expander:expanded} property. Value type: boolean
     *   or undefined
     */
    EXPANDED,
    
    /**
     * A “hidden” state; corresponds to the
     *   {@code Widget:visible} property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: {@link AccessibleState#DISABLED}
     */
    HIDDEN,
    
    /**
     * An “invalid” state; set when a widget
     *   is showing an error. Value type: {@code AccessibleInvalidState}
     */
    INVALID,
    
    /**
     * A “pressed” state; indicates the current
     *   state of a {@code AccessibleTristate}
     *   enumeration
     */
    PRESSED,
    
    /**
     * A “selected” state; set when a widget
     *   is selected. Value type: boolean or undefined
     */
    SELECTED;
    
    public static AccessibleState fromValue(int value) {
        return switch(value) {
            case 0 -> BUSY;
            case 1 -> CHECKED;
            case 2 -> DISABLED;
            case 3 -> EXPANDED;
            case 4 -> HIDDEN;
            case 5 -> INVALID;
            case 6 -> PRESSED;
            case 7 -> SELECTED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BUSY -> 0;
            case CHECKED -> 1;
            case DISABLED -> 2;
            case EXPANDED -> 3;
            case HIDDEN -> 4;
            case INVALID -> 5;
            case PRESSED -> 6;
            case SELECTED -> 7;
        };
    }

}
