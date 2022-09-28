package org.harfbuzz;

/**
 * Baseline tags from <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/baselinetags">Baseline Tags</a> registry.
 */
public class OtLayoutBaselineTagT {

    /**
     * The baseline used by alphabetic scripts such as Latin, Cyrillic and Greek.
     * In vertical writing mode, the alphabetic baseline for characters rotated 90 degrees clockwise.
     * (This would not apply to alphabetic characters that remain upright in vertical writing mode, since these
     * characters are not rotated.)
     */
    public static final OtLayoutBaselineTagT ROMAN = new OtLayoutBaselineTagT(1919905134);
    
    /**
     * The hanging baseline. In horizontal direction, this is the horizontal
     * line from which syllables seem, to hang in Tibetan and other similar scripts. In vertical writing mode,
     * for Tibetan (or some other similar script) characters rotated 90 degrees clockwise.
     */
    public static final OtLayoutBaselineTagT HANGING = new OtLayoutBaselineTagT(1751215719);
    
    /**
     * Ideographic character face bottom or left edge,
     * if the direction is horizontal or vertical, respectively.
     */
    public static final OtLayoutBaselineTagT IDEO_FACE_BOTTOM_OR_LEFT = new OtLayoutBaselineTagT(1768121954);
    
    /**
     * Ideographic character face top or right edge,
     * if the direction is horizontal or vertical, respectively.
     */
    public static final OtLayoutBaselineTagT IDEO_FACE_TOP_OR_RIGHT = new OtLayoutBaselineTagT(1768121972);
    
    /**
     * The center of the ideographic character face. Since: 4.0.0
     */
    public static final OtLayoutBaselineTagT IDEO_FACE_CENTRAL = new OtLayoutBaselineTagT(1231251043);
    
    /**
     * Ideographic em-box bottom or left edge,
     * if the direction is horizontal or vertical, respectively.
     */
    public static final OtLayoutBaselineTagT IDEO_EMBOX_BOTTOM_OR_LEFT = new OtLayoutBaselineTagT(1768187247);
    
    /**
     * Ideographic em-box top or right edge baseline,
     */
    public static final OtLayoutBaselineTagT IDEO_EMBOX_TOP_OR_RIGHT = new OtLayoutBaselineTagT(1768191088);
    
    /**
     * The center of the ideographic em-box. Since: 4.0.0
     * if the direction is horizontal or vertical, respectively.
     */
    public static final OtLayoutBaselineTagT IDEO_EMBOX_CENTRAL = new OtLayoutBaselineTagT(1231315813);
    
    /**
     * The baseline about which mathematical characters are centered.
     * In vertical writing mode when mathematical characters rotated 90 degrees clockwise, are centered.
     */
    public static final OtLayoutBaselineTagT MATH = new OtLayoutBaselineTagT(1835103336);
    
    private int value;
    
    public OtLayoutBaselineTagT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtLayoutBaselineTagT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
