package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkCursor} is used to create and destroy cursors.
 * <p>
 * Cursors are immutable objects, so once you created them, there is no way
 * to modify them later. You should create a new cursor when you want to change
 * something about it.
 * <p>
 * Cursors by themselves are not very interesting: they must be bound to a
 * window for users to see them. This is done with {@link Surface#setCursor}
 * or {@link Surface#setDeviceCursor}. Applications will typically
 * use higher-level GTK functions such as {@link org.gtk.gtk.Widget#setCursor} instead.
 * <p>
 * Cursors are not bound to a given {@link Display}, so they can be shared.
 * However, the appearance of cursors may vary when used on different
 * platforms.
 * <p>
 * <h2>Named and texture cursors</h2>
 * <p>
 * There are multiple ways to create cursors. The platform's own cursors
 * can be created with {@link Cursor#newFromName}. That function lists
 * the commonly available names that are shared with the CSS specification.
 * Other names may be available, depending on the platform in use. On some
 * platforms, what images are used for named cursors may be influenced by
 * the cursor theme.
 * <p>
 * Another option to create a cursor is to use {@link Cursor#newFromTexture}
 * and provide an image to use for the cursor.
 * <p>
 * To ease work with unsupported cursors, a fallback cursor can be provided.
 * If a {@link Surface} cannot use a cursor because of the reasons mentioned
 * above, it will try the fallback cursor. Fallback cursors can themselves have
 * fallback cursors again, so it is possible to provide a chain of progressively
 * easier to support cursors. If none of the provided cursors can be supported,
 * the default cursor will be the ultimate fallback.
 */
public class Cursor extends org.gtk.gobject.Object {

    public Cursor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Cursor */
    public static Cursor castFrom(org.gtk.gobject.Object gobject) {
        return new Cursor(gobject.getReference());
    }
    
    private static Reference constructNewFromName(java.lang.String name, Cursor fallback) {
        Reference RESULT = References.get(gtk_h.gdk_cursor_new_from_name(Interop.allocateNativeString(name).handle(), fallback.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new cursor by looking up {@code name} in the current cursor
     * theme.
     * <p>
     * A recommended set of cursor names that will work across different
     * platforms can be found in the CSS specification:
     * <p>
     * | | | | |
     * | --- | --- | ---- | --- |
     * | "none" | <img src="./doc-files/pointer_cursor.png" alt="](default_cursor.png) \\"default\\" | ![](help_cursor.png) \\"help\\" | !["> "pointer" |
     * | <img src="./doc-files/cell_cursor.png" alt="](context_menu_cursor.png) \\"context-menu\\" | ![](progress_cursor.png) \\"progress\\" | ![](wait_cursor.png) \\"wait\\" | !["> "cell" |
     * | <img src="./doc-files/alias_cursor.png" alt="](crosshair_cursor.png) \\"crosshair\\" | ![](text_cursor.png) \\"text\\" | ![](vertical_text_cursor.png) \\"vertical-text\\" | !["> "alias" |
     * | <img src="./doc-files/not_allowed_cursor.png" alt="](copy_cursor.png) \\"copy\\" | ![](no_drop_cursor.png) \\"no-drop\\" | ![](move_cursor.png) \\"move\\" | !["> "not-allowed" |
     * | <img src="./doc-files/col_resize_cursor.png" alt="](grab_cursor.png) \\"grab\\" | ![](grabbing_cursor.png) \\"grabbing\\" | ![](all_scroll_cursor.png) \\"all-scroll\\" | !["> "col-resize" |
     * | <img src="./doc-files/s_resize_cursor.png" alt="](row_resize_cursor.png) \\"row-resize\\" | ![](n_resize_cursor.png) \\"n-resize\\" | ![](e_resize_cursor.png) \\"e-resize\\" | !["> "s-resize" |
     * | <img src="./doc-files/sw_resize_cursor.png" alt="](w_resize_cursor.png) \\"w-resize\\" | ![](ne_resize_cursor.png) \\"ne-resize\\" | ![](nw_resize_cursor.png) \\"nw-resize\\" | !["> "sw-resize" |
     * | <img src="./doc-files/nesw_resize_cursor.png" alt="](se_resize_cursor.png) \\"se-resize\\" | ![](ew_resize_cursor.png) \\"ew-resize\\" | ![](ns_resize_cursor.png) \\"ns-resize\\" | !["> "nesw-resize" |
     * | <img src="./doc-files/zoom_out_cursor.png" alt="](nwse_resize_cursor.png) \\"nwse-resize\\" | ![](zoom_in_cursor.png) \\"zoom-in\\" | !["> "zoom-out" | |
     */
    public static Cursor newFromName(java.lang.String name, Cursor fallback) {
        return new Cursor(constructNewFromName(name, fallback));
    }
    
    private static Reference constructNewFromTexture(Texture texture, int hotspotX, int hotspotY, Cursor fallback) {
        Reference RESULT = References.get(gtk_h.gdk_cursor_new_from_texture(texture.handle(), hotspotX, hotspotY, fallback.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new cursor from a {@code GdkTexture}.
     */
    public static Cursor newFromTexture(Texture texture, int hotspotX, int hotspotY, Cursor fallback) {
        return new Cursor(constructNewFromTexture(texture, hotspotX, hotspotY, fallback));
    }
    
    /**
     * Returns the fallback for this {@code cursor}.
     * <p>
     * The fallback will be used if this cursor is not available on a given
     * {@code GdkDisplay}. For named cursors, this can happen when using nonstandard
     * names or when using an incomplete cursor theme. For textured cursors,
     * this can happen when the texture is too large or when the {@code GdkDisplay}
     * it is used on does not support textured cursors.
     */
    public Cursor getFallback() {
        var RESULT = gtk_h.gdk_cursor_get_fallback(handle());
        return new Cursor(References.get(RESULT, false));
    }
    
    /**
     * Returns the horizontal offset of the hotspot.
     * <p>
     * The hotspot indicates the pixel that will be directly above the cursor.
     * <p>
     * Note that named cursors may have a nonzero hotspot, but this function
     * will only return the hotspot position for cursors created with
     * {@link Cursor#newFromTexture}.
     */
    public int getHotspotX() {
        var RESULT = gtk_h.gdk_cursor_get_hotspot_x(handle());
        return RESULT;
    }
    
    /**
     * Returns the vertical offset of the hotspot.
     * <p>
     * The hotspot indicates the pixel that will be directly above the cursor.
     * <p>
     * Note that named cursors may have a nonzero hotspot, but this function
     * will only return the hotspot position for cursors created with
     * {@link Cursor#newFromTexture}.
     */
    public int getHotspotY() {
        var RESULT = gtk_h.gdk_cursor_get_hotspot_y(handle());
        return RESULT;
    }
    
    /**
     * Returns the name of the cursor.
     * <p>
     * If the cursor is not a named cursor, <code>null</code> will be returned.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gdk_cursor_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the texture for the cursor.
     * <p>
     * If the cursor is a named cursor, <code>null</code> will be returned.
     */
    public Texture getTexture() {
        var RESULT = gtk_h.gdk_cursor_get_texture(handle());
        return new Texture(References.get(RESULT, false));
    }
    
}
