package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h2>Named and texture cursors</h2>
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

    public Cursor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Cursor */
    public static Cursor castFrom(org.gtk.gobject.Object gobject) {
        return new Cursor(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_cursor_new_from_name = Interop.downcallHandle(
        "gdk_cursor_new_from_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromName(@NotNull java.lang.String name, @Nullable Cursor fallback) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_cursor_new_from_name.invokeExact(Interop.allocateNativeString(name), fallback.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static Cursor newFromName(@NotNull java.lang.String name, @Nullable Cursor fallback) {
        return new Cursor(constructNewFromName(name, fallback));
    }
    
    private static final MethodHandle gdk_cursor_new_from_texture = Interop.downcallHandle(
        "gdk_cursor_new_from_texture",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromTexture(@NotNull Texture texture, @NotNull int hotspotX, @NotNull int hotspotY, @Nullable Cursor fallback) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_cursor_new_from_texture.invokeExact(texture.handle(), hotspotX, hotspotY, fallback.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new cursor from a {@code GdkTexture}.
     */
    public static Cursor newFromTexture(@NotNull Texture texture, @NotNull int hotspotX, @NotNull int hotspotY, @Nullable Cursor fallback) {
        return new Cursor(constructNewFromTexture(texture, hotspotX, hotspotY, fallback));
    }
    
    private static final MethodHandle gdk_cursor_get_fallback = Interop.downcallHandle(
        "gdk_cursor_get_fallback",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the fallback for this {@code cursor}.
     * <p>
     * The fallback will be used if this cursor is not available on a given
     * {@code GdkDisplay}. For named cursors, this can happen when using nonstandard
     * names or when using an incomplete cursor theme. For textured cursors,
     * this can happen when the texture is too large or when the {@code GdkDisplay}
     * it is used on does not support textured cursors.
     */
    public @Nullable Cursor getFallback() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_cursor_get_fallback.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Cursor(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_cursor_get_hotspot_x = Interop.downcallHandle(
        "gdk_cursor_get_hotspot_x",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) gdk_cursor_get_hotspot_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_cursor_get_hotspot_y = Interop.downcallHandle(
        "gdk_cursor_get_hotspot_y",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) gdk_cursor_get_hotspot_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_cursor_get_name = Interop.downcallHandle(
        "gdk_cursor_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the cursor.
     * <p>
     * If the cursor is not a named cursor, {@code null} will be returned.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_cursor_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_cursor_get_texture = Interop.downcallHandle(
        "gdk_cursor_get_texture",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the texture for the cursor.
     * <p>
     * If the cursor is a named cursor, {@code null} will be returned.
     */
    public @Nullable Texture getTexture() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_cursor_get_texture.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Texture(Refcounted.get(RESULT, false));
    }
    
}
