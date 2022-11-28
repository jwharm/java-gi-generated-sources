package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The probability of the typefind function. Higher values have more certainty
 * in doing a reliable typefind.
 */
public class TypeFindProbability extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTypeFindProbability";
    
    /**
     * type undetected.
     */
    public static final TypeFindProbability NONE = new TypeFindProbability(0);
    
    /**
     * unlikely typefind.
     */
    public static final TypeFindProbability MINIMUM = new TypeFindProbability(1);
    
    /**
     * possible type detected.
     */
    public static final TypeFindProbability POSSIBLE = new TypeFindProbability(50);
    
    /**
     * likely a type was detected.
     */
    public static final TypeFindProbability LIKELY = new TypeFindProbability(80);
    
    /**
     * nearly certain that a type was detected.
     */
    public static final TypeFindProbability NEARLY_CERTAIN = new TypeFindProbability(99);
    
    /**
     * very certain a type was detected.
     */
    public static final TypeFindProbability MAXIMUM = new TypeFindProbability(100);
    
    public TypeFindProbability(int value) {
        super(value);
    }
}
