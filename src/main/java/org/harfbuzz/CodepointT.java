package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding Unicode codepoints. Also
 * used to hold glyph IDs.
 */
public class CodepointT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public CodepointT(int value) {
        super(value);
    }
}
