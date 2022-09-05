package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Glyph draw callbacks.
 * 
 * #hb_draw_move_to_func_t, #hb_draw_line_to_func_t and
 * #hb_draw_cubic_to_func_t calls are necessary to be defined but we translate
 * #hb_draw_quadratic_to_func_t calls to #hb_draw_cubic_to_func_t if the
 * callback isn't defined.
 */
public class DrawFuncsT extends io.github.jwharm.javagi.interop.ResourceBase {

    public DrawFuncsT(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
}