package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Metric tags corresponding to [MVAR Value
 * Tags](https://docs.microsoft.com/en-us/typography/opentype/spec/mvar{@code value}-tags)
 * @version 2.6.0
 */
public class OtMetricsTagT extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * horizontal ascender.
     */
    public static final OtMetricsTagT HORIZONTAL_ASCENDER = new OtMetricsTagT(1751216995);
    
    /**
     * horizontal descender.
     */
    public static final OtMetricsTagT HORIZONTAL_DESCENDER = new OtMetricsTagT(1751413603);
    
    /**
     * horizontal line gap.
     */
    public static final OtMetricsTagT HORIZONTAL_LINE_GAP = new OtMetricsTagT(1751934832);
    
    /**
     * horizontal clipping ascent.
     */
    public static final OtMetricsTagT HORIZONTAL_CLIPPING_ASCENT = new OtMetricsTagT(1751346273);
    
    /**
     * horizontal clipping descent.
     */
    public static final OtMetricsTagT HORIZONTAL_CLIPPING_DESCENT = new OtMetricsTagT(1751346276);
    
    /**
     * vertical ascender.
     */
    public static final OtMetricsTagT VERTICAL_ASCENDER = new OtMetricsTagT(1986098019);
    
    /**
     * vertical descender.
     */
    public static final OtMetricsTagT VERTICAL_DESCENDER = new OtMetricsTagT(1986294627);
    
    /**
     * vertical line gap.
     */
    public static final OtMetricsTagT VERTICAL_LINE_GAP = new OtMetricsTagT(1986815856);
    
    /**
     * horizontal caret rise.
     */
    public static final OtMetricsTagT HORIZONTAL_CARET_RISE = new OtMetricsTagT(1751347827);
    
    /**
     * horizontal caret run.
     */
    public static final OtMetricsTagT HORIZONTAL_CARET_RUN = new OtMetricsTagT(1751347822);
    
    /**
     * horizontal caret offset.
     */
    public static final OtMetricsTagT HORIZONTAL_CARET_OFFSET = new OtMetricsTagT(1751347046);
    
    /**
     * vertical caret rise.
     */
    public static final OtMetricsTagT VERTICAL_CARET_RISE = new OtMetricsTagT(1986228851);
    
    /**
     * vertical caret run.
     */
    public static final OtMetricsTagT VERTICAL_CARET_RUN = new OtMetricsTagT(1986228846);
    
    /**
     * vertical caret offset.
     */
    public static final OtMetricsTagT VERTICAL_CARET_OFFSET = new OtMetricsTagT(1986228070);
    
    /**
     * x height.
     */
    public static final OtMetricsTagT X_HEIGHT = new OtMetricsTagT(2020108148);
    
    /**
     * cap height.
     */
    public static final OtMetricsTagT CAP_HEIGHT = new OtMetricsTagT(1668311156);
    
    /**
     * subscript em x size.
     */
    public static final OtMetricsTagT SUBSCRIPT_EM_X_SIZE = new OtMetricsTagT(1935833203);
    
    /**
     * subscript em y size.
     */
    public static final OtMetricsTagT SUBSCRIPT_EM_Y_SIZE = new OtMetricsTagT(1935833459);
    
    /**
     * subscript em x offset.
     */
    public static final OtMetricsTagT SUBSCRIPT_EM_X_OFFSET = new OtMetricsTagT(1935833199);
    
    /**
     * subscript em y offset.
     */
    public static final OtMetricsTagT SUBSCRIPT_EM_Y_OFFSET = new OtMetricsTagT(1935833455);
    
    /**
     * superscript em x size.
     */
    public static final OtMetricsTagT SUPERSCRIPT_EM_X_SIZE = new OtMetricsTagT(1936750707);
    
    /**
     * superscript em y size.
     */
    public static final OtMetricsTagT SUPERSCRIPT_EM_Y_SIZE = new OtMetricsTagT(1936750963);
    
    /**
     * superscript em x offset.
     */
    public static final OtMetricsTagT SUPERSCRIPT_EM_X_OFFSET = new OtMetricsTagT(1936750703);
    
    /**
     * superscript em y offset.
     */
    public static final OtMetricsTagT SUPERSCRIPT_EM_Y_OFFSET = new OtMetricsTagT(1936750959);
    
    /**
     * strikeout size.
     */
    public static final OtMetricsTagT STRIKEOUT_SIZE = new OtMetricsTagT(1937011315);
    
    /**
     * strikeout offset.
     */
    public static final OtMetricsTagT STRIKEOUT_OFFSET = new OtMetricsTagT(1937011311);
    
    /**
     * underline size.
     */
    public static final OtMetricsTagT UNDERLINE_SIZE = new OtMetricsTagT(1970168947);
    
    /**
     * underline offset.
     */
    public static final OtMetricsTagT UNDERLINE_OFFSET = new OtMetricsTagT(1970168943);
    
    public OtMetricsTagT(int value) {
        super(value);
    }
}
