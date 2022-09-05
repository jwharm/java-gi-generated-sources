package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GIcon is a very minimal interface for icons. It provides functions
 * for checking the equality of two icons, hashing of icons and
 * serializing an icon to and from strings.
 * 
 * #GIcon does not provide the actual pixmap for the icon as this is out
 * of GIO's scope, however implementations of #GIcon may contain the name
 * of an icon (see #GThemedIcon), or the path to an icon (see #GLoadableIcon).
 * 
 * To obtain a hash of a #GIcon, see g_icon_hash().
 * 
 * To check if two #GIcons are equal, see g_icon_equal().
 * 
 * For serializing a #GIcon, use g_icon_serialize() and
 * g_icon_deserialize().
 * 
 * If you want to consume #GIcon (for example, in a toolkit) you must
 * be prepared to handle at least the three following cases:
 * #GLoadableIcon, #GThemedIcon and #GEmblemedIcon.  It may also make
 * sense to have fast-paths for other cases (like handling #GdkPixbuf
 * directly, for example) but all compliant #GIcon implementations
 * outside of GIO must implement #GLoadableIcon.
 * 
 * If your application or library provides one or more #GIcon
 * implementations you need to ensure that your new implementation also
 * implements #GLoadableIcon.  Additionally, you must provide an
 * implementation of g_icon_serialize() that gives a result that is
 * understood by g_icon_deserialize(), yielding one of the built-in icon
 * types.
 */
public interface Icon extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Checks if two icons are equal.
     */
    public default boolean equal(Icon icon2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_icon_equal(HANDLE(), icon2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Serializes a #GIcon into a #GVariant. An equivalent #GIcon can be retrieved
     * back by calling g_icon_deserialize() on the returned value.
     * As serialization will avoid using raw icon data when possible, it only
     * makes sense to transfer the #GVariant between processes on the same machine,
     * (as opposed to over the network), and within the same file system namespace.
     */
    public default org.gtk.glib.Variant serialize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_icon_serialize(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Generates a textual representation of @icon that can be used for
     * serialization such as when passing @icon to a different process or
     * saving it to persistent storage. Use g_icon_new_for_string() to
     * get @icon back from the returned string.
     * 
     * The encoding of the returned string is proprietary to #GIcon except
     * in the following two cases
     * 
     * - If @icon is a #GFileIcon, the returned string is a native path
     *   (such as `/path/to/my icon.png`) without escaping
     *   if the #GFile for @icon is a native file.  If the file is not
     *   native, the returned string is the result of g_file_get_uri()
     *   (such as `sftp://path/to/my%20icon.png`).
     * 
     * - If @icon is a #GThemedIcon with exactly one name and no fallbacks,
     *   the encoding is simply the name (such as `network-server`).
     */
    public default java.lang.String toString_() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_icon_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    class IconImpl extends org.gtk.gobject.Object implements Icon {
        public IconImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
