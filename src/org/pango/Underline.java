package org.pango;

/**
 * The <code>PangoUnderline</code> enumeration is used to specify whether text
 * should be underlined, and if so, the type of underlining.
 */
public enum Underline {

    /**
     * no underline should be drawn
     */
    NONE,
    
    /**
     * a single underline should be drawn
     */
    SINGLE,
    
    /**
     * a double underline should be drawn
     */
    DOUBLE,
    
    /**
     * a single underline should be drawn at a
     *   position beneath the ink extents of the text being
     *   underlined. This should be used only for underlining
     *   single characters, such as for keyboard accelerators.
     *   {@link org.pango.Underline#SINGLE} should be used for extended
     *   portions of text.
     */
    LOW,
    
    /**
     * an underline indicating an error should
     *   be drawn below. The exact style of rendering is up to the
     *   <code>PangoRenderer</code> in use, but typical styles include wavy
     *   or dotted lines.
     *   This underline is typically used to indicate an error such
     *   as a possible mispelling; in some cases a contrasting color
     *   may automatically be used. This type of underlining is
     *   available since Pango 1.4.
     */
    ERROR,
    
    /**
     * Like @PANGO_UNDERLINE_SINGLE, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    SINGLE_LINE,
    
    /**
     * Like @PANGO_UNDERLINE_DOUBLE, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    DOUBLE_LINE,
    
    /**
     * Like @PANGO_UNDERLINE_ERROR, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    ERROR_LINE;
    
    public static Underline fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> SINGLE;
            case 2 -> DOUBLE;
            case 3 -> LOW;
            case 4 -> ERROR;
            case 5 -> SINGLE_LINE;
            case 6 -> DOUBLE_LINE;
            case 7 -> ERROR_LINE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case SINGLE -> 1;
            case DOUBLE -> 2;
            case LOW -> 3;
            case ERROR -> 4;
            case SINGLE_LINE -> 5;
            case DOUBLE_LINE -> 6;
            case ERROR_LINE -> 7;
        };
    }

}
