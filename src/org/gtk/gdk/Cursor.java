package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GdkCursor</code> is used to create and destroy cursors.
 * 
 * Cursors are immutable objects, so once you created them, there is no way
 * to modify them later. You should create a new cursor when you want to change
 * something about it.
 * 
 * Cursors by themselves are not very interesting: they must be bound to a
 * window for users to see them. This is done with {@link org.gtk.gdk.Surface#setCursor}
 * or {@link org.gtk.gdk.Surface#setDeviceCursor}. Applications will typically
 * use higher-level GTK functions such as {@link org.gtk.gtk.Widget#setCursor} instead.
 * 
 * Cursors are not bound to a given {@link org.gtk.gdk.Display}, so they can be shared.
 * However, the appearance of cursors may vary when used on different
 * platforms.
 * 
 * ## Named and texture cursors
 * 
 * There are multiple ways to create cursors. The platform&#39;s own cursors
 * can be created with {@link [ctor@Gdk.Cursor.new_from_name] (ref=ctor)}. That function lists
 * the commonly available names that are shared with the CSS specification.
 * Other names may be available, depending on the platform in use. On some
 * platforms, what images are used for named cursors may be influenced by
 * the cursor theme.
 * 
 * Another option to create a cursor is to use {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}
 * and provide an image to use for the cursor.
 * 
 * To ease work with unsupported cursors, a fallback cursor can be provided.
 * If a {@link org.gtk.gdk.Surface} cannot use a cursor because of the reasons mentioned
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
     * Creates a new cursor by looking up @name in the current cursor
     * theme.
     * 
     * A recommended set of cursor names that will work across different
     * platforms can be found in the CSS specification:
     * 
     * | | | | |
     * | --- | --- | ---- | --- |
     * | &#34;none&#34; | !{@link []}(default_cursor.png) &#34;default&#34; | !{@link []}(help_cursor.png) &#34;help&#34; | !{@link []}(pointer_cursor.png) &#34;pointer&#34; |
     * | !{@link []}(context_menu_cursor.png) &#34;context-menu&#34; | !{@link []}(progress_cursor.png) &#34;progress&#34; | !{@link []}(wait_cursor.png) &#34;wait&#34; | !{@link []}(cell_cursor.png) &#34;cell&#34; |
     * | !{@link []}(crosshair_cursor.png) &#34;crosshair&#34; | !{@link []}(text_cursor.png) &#34;text&#34; | !{@link []}(vertical_text_cursor.png) &#34;vertical-text&#34; | !{@link []}(alias_cursor.png) &#34;alias&#34; |
     * | !{@link []}(copy_cursor.png) &#34;copy&#34; | !{@link []}(no_drop_cursor.png) &#34;no-drop&#34; | !{@link []}(move_cursor.png) &#34;move&#34; | !{@link []}(not_allowed_cursor.png) &#34;not-allowed&#34; |
     * | !{@link []}(grab_cursor.png) &#34;grab&#34; | !{@link []}(grabbing_cursor.png) &#34;grabbing&#34; | !{@link []}(all_scroll_cursor.png) &#34;all-scroll&#34; | !{@link []}(col_resize_cursor.png) &#34;col-resize&#34; |
     * | !{@link []}(row_resize_cursor.png) &#34;row-resize&#34; | !{@link []}(n_resize_cursor.png) &#34;n-resize&#34; | !{@link []}(e_resize_cursor.png) &#34;e-resize&#34; | !{@link []}(s_resize_cursor.png) &#34;s-resize&#34; |
     * | !{@link []}(w_resize_cursor.png) &#34;w-resize&#34; | !{@link []}(ne_resize_cursor.png) &#34;ne-resize&#34; | !{@link []}(nw_resize_cursor.png) &#34;nw-resize&#34; | !{@link []}(sw_resize_cursor.png) &#34;sw-resize&#34; |
     * | !{@link []}(se_resize_cursor.png) &#34;se-resize&#34; | !{@link []}(ew_resize_cursor.png) &#34;ew-resize&#34; | !{@link []}(ns_resize_cursor.png) &#34;ns-resize&#34; | !{@link []}(nesw_resize_cursor.png) &#34;nesw-resize&#34; |
     * | !{@link []}(nwse_resize_cursor.png) &#34;nwse-resize&#34; | !{@link []}(zoom_in_cursor.png) &#34;zoom-in&#34; | !{@link []}(zoom_out_cursor.png) &#34;zoom-out&#34; | |
     */
    public static Cursor newFromName(java.lang.String name, Cursor fallback) {
        return new Cursor(constructNewFromName(name, fallback));
    }
    
    private static Reference constructNewFromTexture(Texture texture, int hotspotX, int hotspotY, Cursor fallback) {
        Reference RESULT = References.get(gtk_h.gdk_cursor_new_from_texture(texture.handle(), hotspotX, hotspotY, fallback.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new cursor from a <code>GdkTexture</code>.
     */
    public static Cursor newFromTexture(Texture texture, int hotspotX, int hotspotY, Cursor fallback) {
        return new Cursor(constructNewFromTexture(texture, hotspotX, hotspotY, fallback));
    }
    
    /**
     * Returns the fallback for this @cursor.
     * <p>
     * The fallback will be used if this cursor is not available on a given<code>GdkDisplay</code>. For named cursors, this can happen when using nonstandard
     * names or when using an incomplete cursor theme. For textured cursors,
     * this can happen when the texture is too large or when the <code>GdkDisplay</code>
     * it is used on does not support textured cursors.
     */
    public Cursor getFallback() {
        var RESULT = gtk_h.gdk_cursor_get_fallback(handle());
        return new Cursor(References.get(RESULT, false));
    }
    
    /**
     * Returns the horizontal offset of the hotspot.
     * 
     * The hotspot indicates the pixel that will be directly above the cursor.
     * 
     * Note that named cursors may have a nonzero hotspot, but this function
     * will only return the hotspot position for cursors created with
     * {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}.
     */
    public int getHotspotX() {
        var RESULT = gtk_h.gdk_cursor_get_hotspot_x(handle());
        return RESULT;
    }
    
    /**
     * Returns the vertical offset of the hotspot.
     * 
     * The hotspot indicates the pixel that will be directly above the cursor.
     * 
     * Note that named cursors may have a nonzero hotspot, but this function
     * will only return the hotspot position for cursors created with
     * {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}.
     */
    public int getHotspotY() {
        var RESULT = gtk_h.gdk_cursor_get_hotspot_y(handle());
        return RESULT;
    }
    
    /**
     * Returns the name of the cursor.
     * 
     * If the cursor is not a named cursor, <code>null</code> will be returned.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gdk_cursor_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the texture for the cursor.
     * 
     * If the cursor is a named cursor, <code>null</code> will be returned.
     */
    public Texture getTexture() {
        var RESULT = gtk_h.gdk_cursor_get_texture(handle());
        return new Texture(References.get(RESULT, false));
    }
    
}
