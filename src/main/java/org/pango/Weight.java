package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the weight (boldness) of a font.
 * <p>
 * Weight is specified as a numeric value ranging from 100 to 1000.
 * This enumeration simply provides some common, predefined values.
 */
public class Weight extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoWeight";
    
    /**
     * the thin weight (= 100) Since: 1.24
     */
    public static final Weight THIN = new Weight(100);
    
    /**
     * the ultralight weight (= 200)
     */
    public static final Weight ULTRALIGHT = new Weight(200);
    
    /**
     * the light weight (= 300)
     */
    public static final Weight LIGHT = new Weight(300);
    
    /**
     * the semilight weight (= 350) Since: 1.36.7
     */
    public static final Weight SEMILIGHT = new Weight(350);
    
    /**
     * the book weight (= 380) Since: 1.24)
     */
    public static final Weight BOOK = new Weight(380);
    
    /**
     * the default weight (= 400)
     */
    public static final Weight NORMAL = new Weight(400);
    
    /**
     * the medium weight (= 500) Since: 1.24
     */
    public static final Weight MEDIUM = new Weight(500);
    
    /**
     * the semibold weight (= 600)
     */
    public static final Weight SEMIBOLD = new Weight(600);
    
    /**
     * the bold weight (= 700)
     */
    public static final Weight BOLD = new Weight(700);
    
    /**
     * the ultrabold weight (= 800)
     */
    public static final Weight ULTRABOLD = new Weight(800);
    
    /**
     * the heavy weight (= 900)
     */
    public static final Weight HEAVY = new Weight(900);
    
    /**
     * the ultraheavy weight (= 1000) Since: 1.24
     */
    public static final Weight ULTRAHEAVY = new Weight(1000);
    
    public Weight(int value) {
        super(value);
    }
}
