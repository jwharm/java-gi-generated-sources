package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Icon} is a very minimal interface for icons. It provides functions
 * for checking the equality of two icons, hashing of icons and
 * serializing an icon to and from strings.
 * <p>
 * {@link Icon} does not provide the actual pixmap for the icon as this is out
 * of GIO's scope, however implementations of {@link Icon} may contain the name
 * of an icon (see {@link ThemedIcon}), or the path to an icon (see {@link LoadableIcon}).
 * <p>
 * To obtain a hash of a {@link Icon}, see g_icon_hash().
 * <p>
 * To check if two {@code GIcons} are equal, see g_icon_equal().
 * <p>
 * For serializing a {@link Icon}, use g_icon_serialize() and
 * g_icon_deserialize().
 * <p>
 * If you want to consume {@link Icon} (for example, in a toolkit) you must
 * be prepared to handle at least the three following cases:
 * {@link LoadableIcon}, {@link ThemedIcon} and {@link EmblemedIcon}.  It may also make
 * sense to have fast-paths for other cases (like handling {@link org.gtk.gdkpixbuf.Pixbuf}
 * directly, for example) but all compliant {@link Icon} implementations
 * outside of GIO must implement {@link LoadableIcon}.
 * <p>
 * If your application or library provides one or more {@link Icon}
 * implementations you need to ensure that your new implementation also
 * implements {@link LoadableIcon}.  Additionally, you must provide an
 * implementation of g_icon_serialize() that gives a result that is
 * understood by g_icon_deserialize(), yielding one of the built-in icon
 * types.
 */
public interface Icon extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Checks if two icons are equal.
     */
    public default boolean equal(Icon icon2) {
        var RESULT = gtk_h.g_icon_equal(handle(), icon2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Serializes a {@link Icon} into a {@link org.gtk.glib.Variant}. An equivalent {@link Icon} can be retrieved
     * back by calling g_icon_deserialize() on the returned value.
     * As serialization will avoid using raw icon data when possible, it only
     * makes sense to transfer the {@link org.gtk.glib.Variant} between processes on the same machine,
     * (as opposed to over the network), and within the same file system namespace.
     */
    public default org.gtk.glib.Variant serialize() {
        var RESULT = gtk_h.g_icon_serialize(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Generates a textual representation of {@code icon} that can be used for
     * serialization such as when passing {@code icon} to a different process or
     * saving it to persistent storage. Use g_icon_new_for_string() to
     * get {@code icon} back from the returned string.
     * <p>
     * The encoding of the returned string is proprietary to {@link Icon} except
     * in the following two cases
     * <p>
     * <ul>
     * <li>If {@code icon} is a {@link FileIcon}, the returned string is a native path
     *   (such as {@code /path/to/my icon.png}) without escaping
     *   if the {@link File} for {@code icon} is a native file.  If the file is not
     *   native, the returned string is the result of g_file_get_uri()
     *   (such as {@code sftp://path/to/my%20icon.png}).
     * </ul>
     * <p>
     * <ul>
     * <li>If {@code icon} is a {@link ThemedIcon} with exactly one name and no fallbacks,
     *   the encoding is simply the name (such as {@code network-server}).
     */
    public default java.lang.String toString_() {
        var RESULT = gtk_h.g_icon_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Deserializes a {@link Icon} previously serialized using g_icon_serialize().
     */
    public static Icon deserialize(org.gtk.glib.Variant value) {
        var RESULT = gtk_h.g_icon_deserialize(value.handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a hash for an icon.
     */
    public static int hash(jdk.incubator.foreign.MemoryAddress icon) {
        var RESULT = gtk_h.g_icon_hash(icon);
        return RESULT;
    }
    
    /**
     * Generate a {@link Icon} instance from {@code str}. This function can fail if
     * {@code str} is not valid - see g_icon_to_string() for discussion.
     * <p>
     * If your application or library provides one or more {@link Icon}
     * implementations you need to ensure that each {@link org.gtk.glib.Type} is registered
     * with the type system prior to calling g_icon_new_for_string().
     */
    public static Icon newForString(java.lang.String str) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_icon_new_for_string(Interop.allocateNativeString(str).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    class IconImpl extends org.gtk.gobject.Object implements Icon {
        public IconImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
