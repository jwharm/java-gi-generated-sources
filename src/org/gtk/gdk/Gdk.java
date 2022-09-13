package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Gdk {
    
    /**
     * Adds the given rectangle to the current path of @cr.
     */
    public static void cairoRectangle(org.cairographics.Context cr, Rectangle rectangle) {
        gtk_h.gdk_cairo_rectangle(cr.handle(), rectangle.handle());
    }
    
    /**
     * Adds the given region to the current path of @cr.
     */
    public static void cairoRegion(org.cairographics.Context cr, org.cairographics.Region region) {
        gtk_h.gdk_cairo_region(cr.handle(), region.handle());
    }
    
    /**
     * Creates region that covers the area where the given
     * @surface is more than 50% opaque.
     * 
     * This function takes into account device offsets that might be
     * set with cairo_surface_set_device_offset().
     */
    public static org.cairographics.Region cairoRegionCreateFromSurface(org.cairographics.Surface surface) {
        var RESULT = gtk_h.gdk_cairo_region_create_from_surface(surface.handle());
        return new org.cairographics.Region(References.get(RESULT, true));
    }
    
    /**
     * Sets the given pixbuf as the source pattern for @cr.
     * 
     * The pattern has an extend mode of %CAIRO_EXTEND_NONE and is aligned
     * so that the origin of @pixbuf is @pixbuf_x, @pixbuf_y.
     */
    public static void cairoSetSourcePixbuf(org.cairographics.Context cr, org.gtk.gdkpixbuf.Pixbuf pixbuf, double pixbufX, double pixbufY) {
        gtk_h.gdk_cairo_set_source_pixbuf(cr.handle(), pixbuf.handle(), pixbufX, pixbufY);
    }
    
    /**
     * Sets the specified `GdkRGBA` as the source color of @cr.
     */
    public static void cairoSetSourceRgba(org.cairographics.Context cr, RGBA rgba) {
        gtk_h.gdk_cairo_set_source_rgba(cr.handle(), rgba.handle());
    }
    
    /**
     * Read content from the given input stream and deserialize it, asynchronously.
     * 
     * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower numbers
     * indicate a higher priority.
     * 
     * When the operation is finished, @callback will be called. You must then
     * call [func@Gdk.content_deserialize_finish] to get the result of the operation.
     */
    public static void contentDeserializeAsync(org.gtk.gio.InputStream stream, java.lang.String mimeType, Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_content_deserialize_async(stream.handle(), Interop.allocateNativeString(mimeType).handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a content deserialization operation.
     */
    public static boolean contentDeserializeFinish(org.gtk.gio.AsyncResult result, org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_deserialize_finish(result.handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses the given @string into `GdkContentFormats` and
     * returns the formats.
     * 
     * Strings printed via [method@Gdk.ContentFormats.to_string]
     * can be read in again successfully using this function.
     * 
     * If @string does not describe valid content formats, %NULL
     * is returned.
     */
    public static ContentFormats contentFormatsParse(java.lang.String string) {
        var RESULT = gtk_h.gdk_content_formats_parse(Interop.allocateNativeString(string).handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Registers a function to deserialize object of a given type.
     */
    public static void contentRegisterDeserializer(java.lang.String mimeType, Type type, ContentDeserializeFunc deserialize) {
        try {
            gtk_h.gdk_content_register_deserializer(Interop.allocateNativeString(mimeType).handle(), type.getValue(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbContentDeserializeFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(deserialize.hashCode(), deserialize)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Registers a function to serialize objects of a given type.
     */
    public static void contentRegisterSerializer(Type type, java.lang.String mimeType, ContentSerializeFunc serialize) {
        try {
            gtk_h.gdk_content_register_serializer(type.getValue(), Interop.allocateNativeString(mimeType).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbContentSerializeFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(serialize.hashCode(), serialize)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Serialize content and write it to the given output stream, asynchronously.
     * 
     * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower numbers
     * indicate a higher priority.
     * 
     * When the operation is finished, @callback will be called. You must then
     * call [func@Gdk.content_serialize_finish] to get the result of the operation.
     */
    public static void contentSerializeAsync(org.gtk.gio.OutputStream stream, java.lang.String mimeType, org.gtk.gobject.Value value, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_content_serialize_async(stream.handle(), Interop.allocateNativeString(mimeType).handle(), value.handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a content serialization operation.
     */
    public static boolean contentSerializeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_serialize_finish(result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks if @action represents a single action or includes
     * multiple actions.
     * 
     * When @action is 0 - ie no action was given, %TRUE
     * is returned.
     */
    public static boolean dragActionIsUnique(int action) {
        var RESULT = gtk_h.gdk_drag_action_is_unique(action);
        return (RESULT != 0);
    }
    
    public static org.gtk.glib.Quark glErrorQuark() {
        var RESULT = gtk_h.gdk_gl_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Canonicalizes the given mime type and interns the result.
     * 
     * If @string is not a valid mime type, %NULL is returned instead.
     * See RFC 2048 for the syntax if mime types.
     */
    public static java.lang.String internMimeType(java.lang.String string) {
        var RESULT = gtk_h.gdk_intern_mime_type(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a key name to a key value.
     * 
     * The names are the same as those in the
     * `gdk/gdkkeysyms.h` header file
     * but without the leading “GDK_KEY_”.
     */
    public static int keyvalFromName(java.lang.String keyvalName) {
        var RESULT = gtk_h.gdk_keyval_from_name(Interop.allocateNativeString(keyvalName).handle());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if the given key value is in lower case.
     */
    public static boolean keyvalIsLower(int keyval) {
        var RESULT = gtk_h.gdk_keyval_is_lower(keyval);
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if the given key value is in upper case.
     */
    public static boolean keyvalIsUpper(int keyval) {
        var RESULT = gtk_h.gdk_keyval_is_upper(keyval);
        return (RESULT != 0);
    }
    
    /**
     * Converts a key value into a symbolic name.
     * 
     * The names are the same as those in the
     * `gdk/gdkkeysyms.h` header file
     * but without the leading “GDK_KEY_”.
     */
    public static java.lang.String keyvalName(int keyval) {
        var RESULT = gtk_h.gdk_keyval_name(keyval);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a key value to lower case, if applicable.
     */
    public static int keyvalToLower(int keyval) {
        var RESULT = gtk_h.gdk_keyval_to_lower(keyval);
        return RESULT;
    }
    
    /**
     * Convert from a GDK key symbol to the corresponding Unicode
     * character.
     * 
     * Note that the conversion does not take the current locale
     * into consideration, which might be expected for particular
     * keyvals, such as %GDK_KEY_KP_Decimal.
     */
    public static int keyvalToUnicode(int keyval) {
        var RESULT = gtk_h.gdk_keyval_to_unicode(keyval);
        return RESULT;
    }
    
    /**
     * Converts a key value to upper case, if applicable.
     */
    public static int keyvalToUpper(int keyval) {
        var RESULT = gtk_h.gdk_keyval_to_upper(keyval);
        return RESULT;
    }
    
    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     * 
     * This is often useful for implementing the
     * [vfunc@Gdk.Paintable.get_current_image] virtual function
     * when the paintable is in an incomplete state (like a
     * [class@Gtk.MediaStream] before receiving the first frame).
     */
    public static Paintable paintableNewEmpty(int intrinsicWidth, int intrinsicHeight) {
        var RESULT = gtk_h.gdk_paintable_new_empty(intrinsicWidth, intrinsicHeight);
        return new Paintable.PaintableImpl(References.get(RESULT, true));
    }
    
    /**
     * Obtains a clip region which contains the areas where the given
     * ranges of text would be drawn.
     * 
     * @x_origin and @y_origin are the top left position of the layout.
     * @index_ranges should contain ranges of bytes in the layout’s text.
     * The clip region will include space to the left or right of the line
     * (to the layout bounding box) if you have indexes above or below the
     * indexes contained inside the line. This is to draw the selection all
     * the way to the side of the layout. However, the clip region is in line
     * coordinates, not layout coordinates.
     * 
     * Note that the regions returned correspond to logical extents of the text
     * ranges, not ink extents. So the drawn line may in fact touch areas out of
     * the clip region.  The clip region is mainly useful for highlightling parts
     * of text, such as when text is selected.
     */
    public static org.cairographics.Region pangoLayoutLineGetClipRegion(org.pango.LayoutLine line, int xOrigin, int yOrigin, int[] indexRanges, int nRanges) {
        var RESULT = gtk_h.gdk_pango_layout_line_get_clip_region(line.handle(), xOrigin, yOrigin, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, indexRanges)).handle(), nRanges);
        return new org.cairographics.Region(References.get(RESULT, true));
    }
    
    /**
     * Transfers image data from a `cairo_surface_t` and converts it
     * to a `GdkPixbuf`.
     * 
     * This allows you to efficiently read individual pixels from cairo surfaces.
     * 
     * This function will create an RGB pixbuf with 8 bits per channel.
     * The pixbuf will contain an alpha channel if the @surface contains one.
     */
    public static org.gtk.gdkpixbuf.Pixbuf pixbufGetFromSurface(org.cairographics.Surface surface, int srcX, int srcY, int width, int height) {
        var RESULT = gtk_h.gdk_pixbuf_get_from_surface(surface.handle(), srcX, srcY, width, height);
        return new org.gtk.gdkpixbuf.Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Creates a new pixbuf from @texture.
     * 
     * This should generally not be used in newly written code as later
     * stages will almost certainly convert the pixbuf back into a texture
     * to draw it on screen.
     */
    public static org.gtk.gdkpixbuf.Pixbuf pixbufGetFromTexture(Texture texture) {
        var RESULT = gtk_h.gdk_pixbuf_get_from_texture(texture.handle());
        return new org.gtk.gdkpixbuf.Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Sets a list of backends that GDK should try to use.
     * 
     * This can be useful if your application does not
     * work with certain GDK backends.
     * 
     * By default, GDK tries all included backends.
     * 
     * For example:
     * 
     * ```c
     * gdk_set_allowed_backends ("wayland,macos,*");
     * ```
     * 
     * instructs GDK to try the Wayland backend first, followed by the
     * MacOs backend, and then all others.
     * 
     * If the `GDK_BACKEND` environment variable is set, it determines
     * what backends are tried in what order, while still respecting the
     * set of allowed backends that are specified by this function.
     * 
     * The possible backend names are:
     * 
     *   - `broadway`
     *   - `macos`
     *   - `wayland`.
     *   - `win32`
     *   - `x11`
     * 
     * You can also include a `*` in the list to try all remaining backends.
     * 
     * This call must happen prior to functions that open a display, such
     * as [func@Gdk.Display.open], `gtk_init()`, or `gtk_init_check()`
     * in order to take effect.
     */
    public static void setAllowedBackends(java.lang.String backends) {
        gtk_h.gdk_set_allowed_backends(Interop.allocateNativeString(backends).handle());
    }
    
    public static org.gtk.glib.Quark textureErrorQuark() {
        var RESULT = gtk_h.gdk_texture_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static org.gtk.gobject.Type toplevelSizeGetType() {
        var RESULT = gtk_h.gdk_toplevel_size_get_type();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Convert from a Unicode character to a key symbol.
     */
    public static int unicodeToKeyval(int wc) {
        var RESULT = gtk_h.gdk_unicode_to_keyval(wc);
        return RESULT;
    }
    
    public static org.gtk.glib.Quark vulkanErrorQuark() {
        var RESULT = gtk_h.gdk_vulkan_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
}
