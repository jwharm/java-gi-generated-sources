package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding color values. Colors are eight bits per
 * channel RGB plus alpha transparency.
 */
public class ColorT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public ColorT(int value) {
        super(value);
    }
}
