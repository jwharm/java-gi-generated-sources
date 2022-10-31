package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that describe the properties of color palette.
 * @version 2.1.0
 */
public class OtColorPaletteFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_color_palette_flags_t";
    
    /**
     * Default indicating that there is nothing special
     *   to note about a color palette.
     */
    public static final OtColorPaletteFlagsT DEFAULT = new OtColorPaletteFlagsT(0);
    
    /**
     * Flag indicating that the color
     *   palette is appropriate to use when displaying the font on a light background such as white.
     */
    public static final OtColorPaletteFlagsT USABLE_WITH_LIGHT_BACKGROUND = new OtColorPaletteFlagsT(1);
    
    /**
     * Flag indicating that the color
     *   palette is appropriate to use when displaying the font on a dark background such as black.
     */
    public static final OtColorPaletteFlagsT USABLE_WITH_DARK_BACKGROUND = new OtColorPaletteFlagsT(2);
    
    public OtColorPaletteFlagsT(int value) {
        super(value);
    }
}
