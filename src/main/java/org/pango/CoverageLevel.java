package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoCoverageLevel} is used to indicate how well a font can
 * represent a particular Unicode character for a particular script.
 * <p>
 * Since 1.44, only {@link CoverageLevel#NONE} and {@link CoverageLevel#EXACT}
 * will be returned.
 */
public class CoverageLevel extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The character is not representable with
     *   the font.
     */
    public static final CoverageLevel NONE = new CoverageLevel(0);
    
    /**
     * The character is represented in a
     *   way that may be comprehensible but is not the correct
     *   graphical form. For instance, a Hangul character represented
     *   as a a sequence of Jamos, or a Latin transliteration of a
     *   Cyrillic word.
     */
    public static final CoverageLevel FALLBACK = new CoverageLevel(1);
    
    /**
     * The character is represented as
     *   basically the correct graphical form, but with a stylistic
     *   variant inappropriate for the current script.
     */
    public static final CoverageLevel APPROXIMATE = new CoverageLevel(2);
    
    /**
     * The character is represented as the
     *   correct graphical form.
     */
    public static final CoverageLevel EXACT = new CoverageLevel(3);
    
    public CoverageLevel(int value) {
        super(value);
    }
}
