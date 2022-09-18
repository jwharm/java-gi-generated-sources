package org.gtk.gdkpixbuf;

/**
 * Control the alpha channel for drawables.
 * 
 * These values can be passed to gdk_pixbuf_xlib_render_to_drawable_alpha()
 * in gdk-pixbuf-xlib to control how the alpha channel of an image should
 * be handled.
 * 
 * This function can create a bilevel clipping mask (black and white) and use
 * it while painting the image.
 * 
 * In the future, when the X Window System gets an alpha channel extension,
 * it will be possible to do full alpha compositing onto arbitrary drawables.
 * For now both cases fall back to a bilevel clipping mask.
 */
public enum PixbufAlphaMode {

    /**
     * A bilevel clipping mask (black and white)
     *  will be created and used to draw the image.  Pixels below 0.5 opacity
     *  will be considered fully transparent, and all others will be
     *  considered fully opaque.
     */
    BILEVEL,
    
    /**
     * For now falls back to <code>#GDK_PIXBUF_ALPHA_BILEVEL</code> 
     *  In the future it will do full alpha compositing.
     */
    FULL;
    
    public static PixbufAlphaMode fromValue(int value) {
        return switch(value) {
            case 0 -> BILEVEL;
            case 1 -> FULL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BILEVEL -> 0;
            case FULL -> 1;
        };
    }

}
