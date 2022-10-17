package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Glyph draw callbacks.
 * <p>
 * {@link draw_move_to_func_t}, {@link draw_line_to_func_t} and
 * {@link draw_cubic_to_func_t} calls are necessary to be defined but we translate
 * {@link draw_quadratic_to_func_t} calls to {@link draw_cubic_to_func_t} if the
 * callback isn't defined.
 */
public class DrawFuncsT extends io.github.jwharm.javagi.ResourceBase {

    public DrawFuncsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
