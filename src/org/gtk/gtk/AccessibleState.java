package org.gtk.gtk;

/**
 * The possible accessible states of a {@link [iface@Accessible] (ref=iface)}.
 */
public enum AccessibleState {

    /**
     * A &<code>#8220</code> busy&<code>#8221</code>  state. This state has boolean values
     */
    BUSY,
    
    /**
     * A &<code>#8220</code> checked&<code>#8221</code>  state; indicates the current
     *   state of a {@link [class@CheckButton]}. Value type: {@link [enum@AccessibleTristate] (ref=enum)}
     */
    CHECKED,
    
    /**
     * A &<code>#8220</code> disabled&<code>#8221</code>  state; corresponds to the
     *   {@link [property@Widget:sensitive] (ref=property)} property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    DISABLED,
    
    /**
     * An &<code>#8220</code> expanded&<code>#8221</code>  state; corresponds to the
     *   {@link [property@Expander:expanded] (ref=property)} property. Value type: boolean
     *   or undefined
     */
    EXPANDED,
    
    /**
     * A &<code>#8220</code> hidden&<code>#8221</code>  state; corresponds to the
     *   {@link [property@Widget:visible] (ref=property)} property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: 
     *       
     *       
     *         A &<code>#8220</code> hidden&<code>#8221</code>  state; corresponds to the
     *   {@link [property@Widget:visible] (ref=property)} property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: %GTK_ACCESSIBLE_STATE_DISABLED
     */
    HIDDEN,
    
    /**
     * An &<code>#8220</code> invalid&<code>#8221</code>  state; set when a widget
     *   is showing an error. Value type: {@link [enum@AccessibleInvalidState] (ref=enum)}
     */
    INVALID,
    
    /**
     * A &<code>#8220</code> pressed&<code>#8221</code>  state; indicates the current
     *   state of a {@link [class@ToggleButton]}. Value type: {@link [enum@AccessibleTristate] (ref=enum)}
     *   enumeration
     */
    PRESSED,
    
    /**
     * A &<code>#8220</code> selected&<code>#8221</code>  state; set when a widget
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
