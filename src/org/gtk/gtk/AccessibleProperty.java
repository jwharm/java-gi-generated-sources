package org.gtk.gtk;

/**
 * The possible accessible properties of a {@link [iface@Accessible] (ref=iface)}.
 */
public enum AccessibleProperty {

    /**
     * Indicates whether inputting text
     *    could trigger display of one or more predictions of the user&#39;s intended
     *    value for a combobox, searchbox, or textbox and specifies how predictions
     *    would be presented if they were made. Value type: {@link [enum@AccessibleAutocomplete] (ref=enum)}
     */
    AUTOCOMPLETE,
    
    /**
     * Defines a string value that describes
     *    or annotates the current element. Value type: string
     */
    DESCRIPTION,
    
    /**
     * Indicates the availability and type of
     *    interactive popup element, such as menu or dialog, that can be triggered
     *    by an element.
     */
    HAS_POPUP,
    
    /**
     * Indicates keyboard shortcuts that an
     *    author has implemented to activate or give focus to an element. Value type:
     *    string
     */
    KEY_SHORTCUTS,
    
    /**
     * Defines a string value that labels the current
     *    element. Value type: string
     */
    LABEL,
    
    /**
     * Defines the hierarchical level of an element
     *    within a structure. Value type: integer
     */
    LEVEL,
    
    /**
     * Indicates whether an element is modal when
     *    displayed. Value type: boolean
     */
    MODAL,
    
    /**
     * Indicates whether a text box accepts
     *    multiple lines of input or only a single line. Value type: boolean
     */
    MULTI_LINE,
    
    /**
     * Indicates that the user may select
     *    more than one item from the current selectable descendants. Value type:
     *    boolean
     */
    MULTI_SELECTABLE,
    
    /**
     * Indicates whether the element&#39;s
     *    orientation is horizontal, vertical, or unknown/ambiguous. Value type:
     *    {@link [enum@Orientation] (ref=enum)}
     */
    ORIENTATION,
    
    /**
     * Defines a short hint (a word or short
     *    phrase) intended to aid the user with data entry when the control has no
     *    value. A hint could be a sample value or a brief description of the expected
     *    format. Value type: string
     */
    PLACEHOLDER,
    
    /**
     * Indicates that the element is not editable,
     *    but is otherwise operable. Value type: boolean
     */
    READ_ONLY,
    
    /**
     * Indicates that user input is required on
     *    the element before a form may be submitted. Value type: boolean
     */
    REQUIRED,
    
    /**
     * Defines a human-readable,
     *    author-localized description for the role of an element. Value type: string
     */
    ROLE_DESCRIPTION,
    
    /**
     * Indicates if items in a table or grid are
     *    sorted in ascending or descending order. Value type: {@link [enum@AccessibleSort] (ref=enum)}
     */
    SORT,
    
    /**
     * Defines the maximum allowed value for a
     *    range widget. Value type: double
     */
    VALUE_MAX,
    
    /**
     * Defines the minimum allowed value for a
     *    range widget. Value type: double
     */
    VALUE_MIN,
    
    /**
     * Defines the current value for a range widget.
     *    Value type: double
     */
    VALUE_NOW,
    
    /**
     * Defines the human readable text alternative
     *    of aria-valuenow for a range widget. Value type: string
     */
    VALUE_TEXT;
    
    public static AccessibleProperty fromValue(int value) {
        return switch(value) {
            case 0 -> AUTOCOMPLETE;
            case 1 -> DESCRIPTION;
            case 2 -> HAS_POPUP;
            case 3 -> KEY_SHORTCUTS;
            case 4 -> LABEL;
            case 5 -> LEVEL;
            case 6 -> MODAL;
            case 7 -> MULTI_LINE;
            case 8 -> MULTI_SELECTABLE;
            case 9 -> ORIENTATION;
            case 10 -> PLACEHOLDER;
            case 11 -> READ_ONLY;
            case 12 -> REQUIRED;
            case 13 -> ROLE_DESCRIPTION;
            case 14 -> SORT;
            case 15 -> VALUE_MAX;
            case 16 -> VALUE_MIN;
            case 17 -> VALUE_NOW;
            case 18 -> VALUE_TEXT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case AUTOCOMPLETE -> 0;
            case DESCRIPTION -> 1;
            case HAS_POPUP -> 2;
            case KEY_SHORTCUTS -> 3;
            case LABEL -> 4;
            case LEVEL -> 5;
            case MODAL -> 6;
            case MULTI_LINE -> 7;
            case MULTI_SELECTABLE -> 8;
            case ORIENTATION -> 9;
            case PLACEHOLDER -> 10;
            case READ_ONLY -> 11;
            case REQUIRED -> 12;
            case ROLE_DESCRIPTION -> 13;
            case SORT -> 14;
            case VALUE_MAX -> 15;
            case VALUE_MIN -> 16;
            case VALUE_NOW -> 17;
            case VALUE_TEXT -> 18;
        };
    }

}
