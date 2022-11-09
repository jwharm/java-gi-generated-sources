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
 * <p>
 * <strong>Named and texture cursors</strong><br/>
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
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkCursor";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Cursor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Cursor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Cursor if its GType is a (or inherits from) "GdkCursor".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Cursor" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkCursor", a ClassCastException will be thrown.
     */
    public static Cursor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkCursor"))) {
            return new Cursor(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkCursor");
        }
    }
    
    private static Addressable constructNewFromName(@NotNull java.lang.String name, @Nullable org.gtk.gdk.Cursor fallback) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cursor_new_from_name.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (fallback == null ? MemoryAddress.NULL : fallback.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * | "none" | <img src="./doc-files/default_cursor.png" alt=""> "default" | <img src="./doc-files/help_cursor.png" alt=""> "help" | <img src="./doc-files/pointer_cursor.png" alt=""> "pointer" |
     * | <img src="./doc-files/context_menu_cursor.png" alt=""> "context-menu" | <img src="./doc-files/progress_cursor.png" alt=""> "progress" | <img src="./doc-files/wait_cursor.png" alt=""> "wait" | <img src="./doc-files/cell_cursor.png" alt=""> "cell" |
     * | <img src="./doc-files/crosshair_cursor.png" alt=""> "crosshair" | <img src="./doc-files/text_cursor.png" alt=""> "text" | <img src="./doc-files/vertical_text_cursor.png" alt=""> "vertical-text" | <img src="./doc-files/alias_cursor.png" alt=""> "alias" |
     * | <img src="./doc-files/copy_cursor.png" alt=""> "copy" | <img src="./doc-files/no_drop_cursor.png" alt=""> "no-drop" | <img src="./doc-files/move_cursor.png" alt=""> "move" | <img src="./doc-files/not_allowed_cursor.png" alt=""> "not-allowed" |
     * | <img src="./doc-files/grab_cursor.png" alt=""> "grab" | <img src="./doc-files/grabbing_cursor.png" alt=""> "grabbing" | <img src="./doc-files/all_scroll_cursor.png" alt=""> "all-scroll" | <img src="./doc-files/col_resize_cursor.png" alt=""> "col-resize" |
     * | <img src="./doc-files/row_resize_cursor.png" alt=""> "row-resize" | <img src="./doc-files/n_resize_cursor.png" alt=""> "n-resize" | <img src="./doc-files/e_resize_cursor.png" alt=""> "e-resize" | <img src="./doc-files/s_resize_cursor.png" alt=""> "s-resize" |
     * | <img src="./doc-files/w_resize_cursor.png" alt=""> "w-resize" | <img src="./doc-files/ne_resize_cursor.png" alt=""> "ne-resize" | <img src="./doc-files/nw_resize_cursor.png" alt=""> "nw-resize" | <img src="./doc-files/sw_resize_cursor.png" alt=""> "sw-resize" |
     * | <img src="./doc-files/se_resize_cursor.png" alt=""> "se-resize" | <img src="./doc-files/ew_resize_cursor.png" alt=""> "ew-resize" | <img src="./doc-files/ns_resize_cursor.png" alt=""> "ns-resize" | <img src="./doc-files/nesw_resize_cursor.png" alt=""> "nesw-resize" |
     * | <img src="./doc-files/nwse_resize_cursor.png" alt=""> "nwse-resize" | <img src="./doc-files/zoom_in_cursor.png" alt=""> "zoom-in" | <img src="./doc-files/zoom_out_cursor.png" alt=""> "zoom-out" | |
     * @param name the name of the cursor
     * @param fallback {@code null} or the {@code GdkCursor} to fall back to when
     *   this one cannot be supported
     * @return a new {@code GdkCursor}, or {@code null} if there is no
     *   cursor with the given name
     */
    public static Cursor newFromName(@NotNull java.lang.String name, @Nullable org.gtk.gdk.Cursor fallback) {
        return new Cursor(constructNewFromName(name, fallback), Ownership.FULL);
    }
    
    private static Addressable constructNewFromTexture(@NotNull org.gtk.gdk.Texture texture, int hotspotX, int hotspotY, @Nullable org.gtk.gdk.Cursor fallback) {
        java.util.Objects.requireNonNull(texture, "Parameter 'texture' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cursor_new_from_texture.invokeExact(
                    texture.handle(),
                    hotspotX,
                    hotspotY,
                    (Addressable) (fallback == null ? MemoryAddress.NULL : fallback.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new cursor from a {@code GdkTexture}.
     * @param texture the texture providing the pixel data
     * @param hotspotX the horizontal offset of the “hotspot” of the cursor
     * @param hotspotY the vertical offset of the “hotspot” of the cursor
     * @param fallback the {@code GdkCursor} to fall back to when
     *   this one cannot be supported
     * @return a new {@code GdkCursor}
     */
    public static Cursor newFromTexture(@NotNull org.gtk.gdk.Texture texture, int hotspotX, int hotspotY, @Nullable org.gtk.gdk.Cursor fallback) {
        return new Cursor(constructNewFromTexture(texture, hotspotX, hotspotY, fallback), Ownership.FULL);
    }
    
    /**
     * Returns the fallback for this {@code cursor}.
     * <p>
     * The fallback will be used if this cursor is not available on a given
     * {@code GdkDisplay}. For named cursors, this can happen when using nonstandard
     * names or when using an incomplete cursor theme. For textured cursors,
     * this can happen when the texture is too large or when the {@code GdkDisplay}
     * it is used on does not support textured cursors.
     * @return the fallback of the cursor or {@code null}
     *   to use the default cursor as fallback
     */
    public @Nullable org.gtk.gdk.Cursor getFallback() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cursor_get_fallback.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Cursor(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the horizontal offset of the hotspot.
     * <p>
     * The hotspot indicates the pixel that will be directly above the cursor.
     * <p>
     * Note that named cursors may have a nonzero hotspot, but this function
     * will only return the hotspot position for cursors created with
     * {@link Cursor#newFromTexture}.
     * @return the horizontal offset of the hotspot or 0 for named cursors
     */
    public int getHotspotX() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_cursor_get_hotspot_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the vertical offset of the hotspot or 0 for named cursors
     */
    public int getHotspotY() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_cursor_get_hotspot_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the name of the cursor.
     * <p>
     * If the cursor is not a named cursor, {@code null} will be returned.
     * @return the name of the cursor or {@code null}
     *   if it is not a named cursor
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cursor_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the texture for the cursor.
     * <p>
     * If the cursor is a named cursor, {@code null} will be returned.
     * @return the texture for cursor or {@code null}
     *   if it is a named cursor
     */
    public @Nullable org.gtk.gdk.Texture getTexture() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cursor_get_texture.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Texture(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_cursor_new_from_name = Interop.downcallHandle(
            "gdk_cursor_new_from_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_new_from_texture = Interop.downcallHandle(
            "gdk_cursor_new_from_texture",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_fallback = Interop.downcallHandle(
            "gdk_cursor_get_fallback",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_hotspot_x = Interop.downcallHandle(
            "gdk_cursor_get_hotspot_x",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_hotspot_y = Interop.downcallHandle(
            "gdk_cursor_get_hotspot_y",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_name = Interop.downcallHandle(
            "gdk_cursor_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_texture = Interop.downcallHandle(
            "gdk_cursor_get_texture",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
