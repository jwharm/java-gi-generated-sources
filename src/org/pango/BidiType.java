package org.pango;

/**
 * {@code PangoBidiType} represents the bidirectional character
 * type of a Unicode character.
 * <p>
 * The values in this enumeration are specified by the
 * <a href="http://www.unicode.org/reports/tr9/">Unicode bidirectional algorithm</a>.
 */
public class BidiType {

    /**
     * Left-to-Right
     */
    public static final BidiType L = new BidiType(0);
    
    /**
     * Left-to-Right Embedding
     */
    public static final BidiType LRE = new BidiType(1);
    
    /**
     * Left-to-Right Override
     */
    public static final BidiType LRO = new BidiType(2);
    
    /**
     * Right-to-Left
     */
    public static final BidiType R = new BidiType(3);
    
    /**
     * Right-to-Left Arabic
     */
    public static final BidiType AL = new BidiType(4);
    
    /**
     * Right-to-Left Embedding
     */
    public static final BidiType RLE = new BidiType(5);
    
    /**
     * Right-to-Left Override
     */
    public static final BidiType RLO = new BidiType(6);
    
    /**
     * Pop Directional Format
     */
    public static final BidiType PDF = new BidiType(7);
    
    /**
     * European Number
     */
    public static final BidiType EN = new BidiType(8);
    
    /**
     * European Number Separator
     */
    public static final BidiType ES = new BidiType(9);
    
    /**
     * European Number Terminator
     */
    public static final BidiType ET = new BidiType(10);
    
    /**
     * Arabic Number
     */
    public static final BidiType AN = new BidiType(11);
    
    /**
     * Common Number Separator
     */
    public static final BidiType CS = new BidiType(12);
    
    /**
     * Nonspacing Mark
     */
    public static final BidiType NSM = new BidiType(13);
    
    /**
     * Boundary Neutral
     */
    public static final BidiType BN = new BidiType(14);
    
    /**
     * Paragraph Separator
     */
    public static final BidiType B = new BidiType(15);
    
    /**
     * Segment Separator
     */
    public static final BidiType S = new BidiType(16);
    
    /**
     * Whitespace
     */
    public static final BidiType WS = new BidiType(17);
    
    /**
     * Other Neutrals
     */
    public static final BidiType ON = new BidiType(18);
    
    /**
     * Left-to-Right isolate. Since 1.48.6
     */
    public static final BidiType LRI = new BidiType(19);
    
    /**
     * Right-to-Left isolate. Since 1.48.6
     */
    public static final BidiType RLI = new BidiType(20);
    
    /**
     * First strong isolate. Since 1.48.6
     */
    public static final BidiType FSI = new BidiType(21);
    
    /**
     * Pop directional isolate. Since 1.48.6
     */
    public static final BidiType PDI = new BidiType(22);
    
    private int value;
    
    public BidiType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BidiType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
