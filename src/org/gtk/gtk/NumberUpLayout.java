package org.gtk.gtk;

/**
 * Used to determine the layout of pages on a sheet when printing
 * multiple pages per sheet.
 */
public class NumberUpLayout extends io.github.jwharm.javagi.Enumeration {

    /**
     * ![](layout-lrtb.png)
     */
    public static final NumberUpLayout LRTB = new NumberUpLayout(0);
    
    /**
     * ![](layout-lrbt.png)
     */
    public static final NumberUpLayout LRBT = new NumberUpLayout(1);
    
    /**
     * ![](layout-rltb.png)
     */
    public static final NumberUpLayout RLTB = new NumberUpLayout(2);
    
    /**
     * ![](layout-rlbt.png)
     */
    public static final NumberUpLayout RLBT = new NumberUpLayout(3);
    
    /**
     * ![](layout-tblr.png)
     */
    public static final NumberUpLayout TBLR = new NumberUpLayout(4);
    
    /**
     * ![](layout-tbrl.png)
     */
    public static final NumberUpLayout TBRL = new NumberUpLayout(5);
    
    /**
     * ![](layout-btlr.png)
     */
    public static final NumberUpLayout BTLR = new NumberUpLayout(6);
    
    /**
     * ![](layout-btrl.png)
     */
    public static final NumberUpLayout BTRL = new NumberUpLayout(7);
    
    public NumberUpLayout(int value) {
        super(value);
    }
    
}
