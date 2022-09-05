package org.gtk.gtk;

/**
 * Built-in icon sizes.
 * 
 * Icon sizes default to being inherited. Where they cannot be
 * inherited, text size is the default.
 * 
 * All widgets which use `GtkIconSize` set the normal-icons or
 * large-icons style classes correspondingly, and let themes
 * determine the actual size to be used with the
 * `-gtk-icon-size` CSS property.
 */
public enum IconSize {

    /**
     * Keep the size of the parent element
     */
    INHERIT,
    
    /**
     * Size similar to text size
     */
    NORMAL,
    
    /**
     * Large size, for example in an icon view
     */
    LARGE;
    
    public static IconSize fromValue(int value) {
        return switch(value) {
            case 0 -> INHERIT;
            case 1 -> NORMAL;
            case 2 -> LARGE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INHERIT -> 0;
            case NORMAL -> 1;
            case LARGE -> 2;
        };
    }

}
