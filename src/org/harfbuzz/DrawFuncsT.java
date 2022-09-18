package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Glyph draw callbacks.
 * 
 * {@link org.harfbuzz.draw_move_to_func_t}  {@link org.harfbuzz.draw_line_to_func_t} and
 * {@link org.harfbuzz.draw_cubic_to_func_t} calls are necessary to be defined but we translate
 * {@link org.harfbuzz.draw_quadratic_to_func_t} calls to {@link org.harfbuzz.draw_cubic_to_func_t} if the
 * callback isn&<code>#39</code> t defined.
 */
public class DrawFuncsT extends io.github.jwharm.javagi.ResourceBase {

    public DrawFuncsT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
