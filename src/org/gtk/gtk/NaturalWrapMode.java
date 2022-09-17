package org.gtk.gtk;

/**
 * Options for selecting a different wrap mode for natural size
 * requests.
 * 
 * See for example the {@link [property@Gtk.Label:natural-wrap-mode] (ref=property)} property.
 */
public enum NaturalWrapMode {

    /**
     * Inherit the minimum size request.
     *   In particular, this should be used with 
     *       
     *         Inherit the minimum size request.
     *   In particular, this should be used with %PANGO_WRAP_CHAR.
     */
    INHERIT,
    
    /**
     * Try not to wrap the text. This mode is the
     *   closest to GTK3&#39;s behavior but can lead to a wide label leaving
     *   lots of empty space below the text.
     */
    NONE,
    
    /**
     * Attempt to wrap at word boundaries. This
     *   is useful in particular when using {@link org.pango.WrapMode#WORD_CHAR} as the
     *   wrap mode.
     */
    WORD;
    
    public static NaturalWrapMode fromValue(int value) {
        return switch(value) {
            case 0 -> INHERIT;
            case 1 -> NONE;
            case 2 -> WORD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INHERIT -> 0;
            case NONE -> 1;
            case WORD -> 2;
        };
    }

}
