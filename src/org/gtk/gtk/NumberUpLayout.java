package org.gtk.gtk;

/**
 * Used to determine the layout of pages on a sheet when printing
 * multiple pages per sheet.
 */
public enum NumberUpLayout {

    /**
     * ![](layout-lrtb.png)
     */
    LRTB,
    
    /**
     * ![](layout-lrbt.png)
     */
    LRBT,
    
    /**
     * ![](layout-rltb.png)
     */
    RLTB,
    
    /**
     * ![](layout-rlbt.png)
     */
    RLBT,
    
    /**
     * ![](layout-tblr.png)
     */
    TBLR,
    
    /**
     * ![](layout-tbrl.png)
     */
    TBRL,
    
    /**
     * ![](layout-btlr.png)
     */
    BTLR,
    
    /**
     * ![](layout-btrl.png)
     */
    BTRL;
    
    public static NumberUpLayout fromValue(int value) {
        return switch(value) {
            case 0 -> LRTB;
            case 1 -> LRBT;
            case 2 -> RLTB;
            case 3 -> RLBT;
            case 4 -> TBLR;
            case 5 -> TBRL;
            case 6 -> BTLR;
            case 7 -> BTRL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LRTB -> 0;
            case LRBT -> 1;
            case RLTB -> 2;
            case RLBT -> 3;
            case TBLR -> 4;
            case TBRL -> 5;
            case BTLR -> 6;
            case BTRL -> 7;
        };
    }

}
