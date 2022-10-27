package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to determine the layout of pages on a sheet when printing
 * multiple pages per sheet.
 */
public class NumberUpLayout extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * <img src="./doc-files/layout-lrtb.png" alt="">
     */
    public static final NumberUpLayout LRTB = new NumberUpLayout(0);
    
    /**
     * <img src="./doc-files/layout-lrbt.png" alt="">
     */
    public static final NumberUpLayout LRBT = new NumberUpLayout(1);
    
    /**
     * <img src="./doc-files/layout-rltb.png" alt="">
     */
    public static final NumberUpLayout RLTB = new NumberUpLayout(2);
    
    /**
     * <img src="./doc-files/layout-rlbt.png" alt="">
     */
    public static final NumberUpLayout RLBT = new NumberUpLayout(3);
    
    /**
     * <img src="./doc-files/layout-tblr.png" alt="">
     */
    public static final NumberUpLayout TBLR = new NumberUpLayout(4);
    
    /**
     * <img src="./doc-files/layout-tbrl.png" alt="">
     */
    public static final NumberUpLayout TBRL = new NumberUpLayout(5);
    
    /**
     * <img src="./doc-files/layout-btlr.png" alt="">
     */
    public static final NumberUpLayout BTLR = new NumberUpLayout(6);
    
    /**
     * <img src="./doc-files/layout-btrl.png" alt="">
     */
    public static final NumberUpLayout BTRL = new NumberUpLayout(7);
    
    public NumberUpLayout(int value) {
        super(value);
    }
}
