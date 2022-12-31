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
public class Cursor extends org.gtk.gobject.GObject {
    
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
    protected Cursor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Cursor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Cursor(input, ownership);
    
    private static MemoryAddress constructNewFromName(java.lang.String name, @Nullable org.gtk.gdk.Cursor fallback) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_cursor_new_from_name.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
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
    public static Cursor newFromName(java.lang.String name, @Nullable org.gtk.gdk.Cursor fallback) {
        var RESULT = constructNewFromName(name, fallback);
        return (org.gtk.gdk.Cursor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Cursor.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromTexture(org.gtk.gdk.Texture texture, int hotspotX, int hotspotY, @Nullable org.gtk.gdk.Cursor fallback) {
        MemoryAddress RESULT;
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
    public static Cursor newFromTexture(org.gtk.gdk.Texture texture, int hotspotX, int hotspotY, @Nullable org.gtk.gdk.Cursor fallback) {
        var RESULT = constructNewFromTexture(texture, hotspotX, hotspotY, fallback);
        return (org.gtk.gdk.Cursor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Cursor.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return (org.gtk.gdk.Cursor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Cursor.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return (org.gtk.gdk.Texture) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Texture.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_cursor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Cursor.Builder} object constructs a {@link Cursor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Cursor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Cursor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Cursor}.
         * @return A new instance of {@code Cursor} with the properties 
         *         that were set in the Builder object.
         */
        public Cursor build() {
            return (Cursor) org.gtk.gobject.GObject.newWithProperties(
                Cursor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Cursor to fall back to if this cursor cannot be displayed.
         * @param fallback The value for the {@code fallback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFallback(org.gtk.gdk.Cursor fallback) {
            names.add("fallback");
            values.add(org.gtk.gobject.Value.create(fallback));
            return this;
        }
        
        /**
         * X position of the cursor hotspot in the cursor image.
         * @param hotspotX The value for the {@code hotspot-x} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHotspotX(int hotspotX) {
            names.add("hotspot-x");
            values.add(org.gtk.gobject.Value.create(hotspotX));
            return this;
        }
        
        /**
         * Y position of the cursor hotspot in the cursor image.
         * @param hotspotY The value for the {@code hotspot-y} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHotspotY(int hotspotY) {
            names.add("hotspot-y");
            values.add(org.gtk.gobject.Value.create(hotspotY));
            return this;
        }
        
        /**
         * Name of this this cursor.
         * <p>
         * The name will be {@code null} if the cursor was created from a texture.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The texture displayed by this cursor.
         * <p>
         * The texture will be {@code null} if the cursor was created from a name.
         * @param texture The value for the {@code texture} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTexture(org.gtk.gdk.Texture texture) {
            names.add("texture");
            values.add(org.gtk.gobject.Value.create(texture));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_cursor_new_from_name = Interop.downcallHandle(
            "gdk_cursor_new_from_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_new_from_texture = Interop.downcallHandle(
            "gdk_cursor_new_from_texture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_fallback = Interop.downcallHandle(
            "gdk_cursor_get_fallback",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_hotspot_x = Interop.downcallHandle(
            "gdk_cursor_get_hotspot_x",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_hotspot_y = Interop.downcallHandle(
            "gdk_cursor_get_hotspot_y",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_name = Interop.downcallHandle(
            "gdk_cursor_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_texture = Interop.downcallHandle(
            "gdk_cursor_get_texture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_cursor_get_type = Interop.downcallHandle(
            "gdk_cursor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
