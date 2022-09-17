package org.pango;

/**
 * <code>PangoBidiType</code> represents the bidirectional character
 * type of a Unicode character.
 * 
 * The values in this enumeration are specified by the
 * {@link [Unicode bidirectional algorithm]}(http://www.unicode.org/reports/tr9/).
 */
public enum BidiType {

    /**
     * Left-to-Right
     */
    L,
    
    /**
     * Left-to-Right Embedding
     */
    LRE,
    
    /**
     * Left-to-Right Override
     */
    LRO,
    
    /**
     * Right-to-Left
     */
    R,
    
    /**
     * Right-to-Left Arabic
     */
    AL,
    
    /**
     * Right-to-Left Embedding
     */
    RLE,
    
    /**
     * Right-to-Left Override
     */
    RLO,
    
    /**
     * Pop Directional Format
     */
    PDF,
    
    /**
     * European Number
     */
    EN,
    
    /**
     * European Number Separator
     */
    ES,
    
    /**
     * European Number Terminator
     */
    ET,
    
    /**
     * Arabic Number
     */
    AN,
    
    /**
     * Common Number Separator
     */
    CS,
    
    /**
     * Nonspacing Mark
     */
    NSM,
    
    /**
     * Boundary Neutral
     */
    BN,
    
    /**
     * Paragraph Separator
     */
    B,
    
    /**
     * Segment Separator
     */
    S,
    
    /**
     * Whitespace
     */
    WS,
    
    /**
     * Other Neutrals
     */
    ON,
    
    /**
     * Left-to-Right isolate. Since 1.48.6
     */
    LRI,
    
    /**
     * Right-to-Left isolate. Since 1.48.6
     */
    RLI,
    
    /**
     * First strong isolate. Since 1.48.6
     */
    FSI,
    
    /**
     * Pop directional isolate. Since 1.48.6
     */
    PDI;
    
    public static BidiType fromValue(int value) {
        return switch(value) {
            case 0 -> L;
            case 1 -> LRE;
            case 2 -> LRO;
            case 3 -> R;
            case 4 -> AL;
            case 5 -> RLE;
            case 6 -> RLO;
            case 7 -> PDF;
            case 8 -> EN;
            case 9 -> ES;
            case 10 -> ET;
            case 11 -> AN;
            case 12 -> CS;
            case 13 -> NSM;
            case 14 -> BN;
            case 15 -> B;
            case 16 -> S;
            case 17 -> WS;
            case 18 -> ON;
            case 19 -> LRI;
            case 20 -> RLI;
            case 21 -> FSI;
            case 22 -> PDI;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case L -> 0;
            case LRE -> 1;
            case LRO -> 2;
            case R -> 3;
            case AL -> 4;
            case RLE -> 5;
            case RLO -> 6;
            case PDF -> 7;
            case EN -> 8;
            case ES -> 9;
            case ET -> 10;
            case AN -> 11;
            case CS -> 12;
            case NSM -> 13;
            case BN -> 14;
            case B -> 15;
            case S -> 16;
            case WS -> 17;
            case ON -> 18;
            case LRI -> 19;
            case RLI -> 20;
            case FSI -> 21;
            case PDI -> 22;
        };
    }

}
