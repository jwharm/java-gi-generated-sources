package org.harfbuzz;

/**
 * Baseline tags from {@link [Baseline Tags]}(https://docs.microsoft.com/en-us/typography/opentype/spec/baselinetags) registry.
 */
public enum OtLayoutBaselineTagT {

    /**
     * The baseline used by alphabetic scripts such as Latin, Cyrillic and Greek.
     * In vertical writing mode, the alphabetic baseline for characters rotated 90 degrees clockwise.
     * (This would not apply to alphabetic characters that remain upright in vertical writing mode, since these
     * characters are not rotated.)
     */
    ROMAN,
    
    /**
     * The hanging baseline. In horizontal direction, this is the horizontal
     * line from which syllables seem, to hang in Tibetan and other similar scripts. In vertical writing mode,
     * for Tibetan (or some other similar script) characters rotated 90 degrees clockwise.
     */
    HANGING,
    
    /**
     * Ideographic character face bottom or left edge,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_FACE_BOTTOM_OR_LEFT,
    
    /**
     * Ideographic character face top or right edge,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_FACE_TOP_OR_RIGHT,
    
    /**
     * The center of the ideographic character face. Since: 4.0.0
     */
    IDEO_FACE_CENTRAL,
    
    /**
     * Ideographic em-box bottom or left edge,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_EMBOX_BOTTOM_OR_LEFT,
    
    /**
     * Ideographic em-box top or right edge baseline,
     */
    IDEO_EMBOX_TOP_OR_RIGHT,
    
    /**
     * The center of the ideographic em-box. Since: 4.0.0
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_EMBOX_CENTRAL,
    
    /**
     * The baseline about which mathematical characters are centered.
     * In vertical writing mode when mathematical characters rotated 90 degrees clockwise, are centered.
     */
    MATH;
    
    public static OtLayoutBaselineTagT fromValue(int value) {
        return switch(value) {
            case 1919905134 -> ROMAN;
            case 1751215719 -> HANGING;
            case 1768121954 -> IDEO_FACE_BOTTOM_OR_LEFT;
            case 1768121972 -> IDEO_FACE_TOP_OR_RIGHT;
            case 1231251043 -> IDEO_FACE_CENTRAL;
            case 1768187247 -> IDEO_EMBOX_BOTTOM_OR_LEFT;
            case 1768191088 -> IDEO_EMBOX_TOP_OR_RIGHT;
            case 1231315813 -> IDEO_EMBOX_CENTRAL;
            case 1835103336 -> MATH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ROMAN -> 1919905134;
            case HANGING -> 1751215719;
            case IDEO_FACE_BOTTOM_OR_LEFT -> 1768121954;
            case IDEO_FACE_TOP_OR_RIGHT -> 1768121972;
            case IDEO_FACE_CENTRAL -> 1231251043;
            case IDEO_EMBOX_BOTTOM_OR_LEFT -> 1768187247;
            case IDEO_EMBOX_TOP_OR_RIGHT -> 1768191088;
            case IDEO_EMBOX_CENTRAL -> 1231315813;
            case MATH -> 1835103336;
        };
    }

}
