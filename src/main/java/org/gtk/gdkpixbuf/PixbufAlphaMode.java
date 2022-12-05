package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Control the alpha channel for drawables.
 * <p>
 * These values can be passed to gdk_pixbuf_xlib_render_to_drawable_alpha()
 * in gdk-pixbuf-xlib to control how the alpha channel of an image should
 * be handled.
 * <p>
 * This function can create a bilevel clipping mask (black and white) and use
 * it while painting the image.
 * <p>
 * In the future, when the X Window System gets an alpha channel extension,
 * it will be possible to do full alpha compositing onto arbitrary drawables.
 * For now both cases fall back to a bilevel clipping mask.
 */
public enum PixbufAlphaMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * A bilevel clipping mask (black and white)
     *  will be created and used to draw the image.  Pixels below 0.5 opacity
     *  will be considered fully transparent, and all others will be
     *  considered fully opaque.
     */
    BILEVEL(0),
    /**
     * For now falls back to {@code GDK_PIXBUF_ALPHA_BILEVEL}.
     *  In the future it will do full alpha compositing.
     */
    FULL(1);
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAlphaMode";
    
    private final int value;
    PixbufAlphaMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PixbufAlphaMode of(int value) {
        return switch (value) {
            case 0 -> BILEVEL;
            case 1 -> FULL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
