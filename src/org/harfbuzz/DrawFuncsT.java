package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Glyph draw callbacks.
 * <p>
 * {@link draw_move_to_func_t}, {@link draw_line_to_func_t} and
 * {@link draw_cubic_to_func_t} calls are necessary to be defined but we translate
 * {@link draw_quadratic_to_func_t} calls to {@link draw_cubic_to_func_t} if the
 * callback isn't defined.
 */
public class DrawFuncsT extends io.github.jwharm.javagi.ResourceBase {

    public DrawFuncsT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
