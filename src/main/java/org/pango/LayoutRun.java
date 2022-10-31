package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoLayoutRun} represents a single run within a {@code PangoLayoutLine}.
 * <p>
 * It is simply an alternate name for {@code Pango.GlyphItem}.
 * See the {@code Pango.GlyphItem} docs for details on the fields.
 */
public class LayoutRun extends org.pango.GlyphItem {

    
    @ApiStatus.Internal
    public LayoutRun(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to LayoutRun if its GType is a (or inherits from) "PangoLayoutRun".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "LayoutRun" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoLayoutRun", a ClassCastException will be thrown.
     */
    public static LayoutRun castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoLayoutRun"))) {
            return new LayoutRun(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoLayoutRun");
        }
    }
}
