package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFileFilter` filters files by name or mime type.
 * 
 * `GtkFileFilter` can be used to restrict the files being shown in a
 * `GtkFileChooser`. Files can be filtered based on their name (with
 * [method@Gtk.FileFilter.add_pattern] or [method@Gtk.FileFilter.add_suffix])
 * or on their mime type (with [method@Gtk.FileFilter.add_mime_type]).
 * 
 * Filtering by mime types handles aliasing and subclassing of mime
 * types; e.g. a filter for text/plain also matches a file with mime
 * type application/rtf, since application/rtf is a subclass of
 * text/plain. Note that `GtkFileFilter` allows wildcards for the
 * subtype of a mime type, so you can e.g. filter for image/\\*.
 * 
 * Normally, file filters are used by adding them to a `GtkFileChooser`
 * (see [method@Gtk.FileChooser.add_filter]), but it is also possible to
 * manually use a file filter on any [class@Gtk.FilterListModel] containing
 * `GFileInfo` objects.
 * 
 * # GtkFileFilter as GtkBuildable
 * 
 * The `GtkFileFilter` implementation of the `GtkBuildable` interface
 * supports adding rules using the `<mime-types>` and `<patterns>` and
 * `<suffixes>` elements and listing the rules within. Specifying a
 * `<mime-type>` or `<pattern>` or `<suffix>` has the same effect as
 * as calling
 * [method@Gtk.FileFilter.add_mime_type] or
 * [method@Gtk.FileFilter.add_pattern] or
 * [method@Gtk.FileFilter.add_suffix].
 * 
 * An example of a UI definition fragment specifying `GtkFileFilter`
 * rules:
 * ```xml
 * <object class="GtkFileFilter">
 *   <property name="name" translatable="yes">Text and Images</property>
 *   <mime-types>
 *     <mime-type>text/plain</mime-type>
 *     <mime-type>image/ *</mime-type>
 *   </mime-types>
 *   <patterns>
 *     <pattern>*.txt</pattern>
 *   </patterns>
 *   <suffixes>
 *     <suffix>png</suffix>
 *   </suffixes>
 * </object>
 * ```
 */
public class FileFilter extends Filter implements Buildable {

    public FileFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileFilter */
    public static FileFilter castFrom(org.gtk.gobject.Object gobject) {
        return new FileFilter(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_file_filter_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkFileFilter` with no rules added to it.
     * 
     * Such a filter doesn’t accept any files, so is not
     * particularly useful until you add rules with
     * [method@Gtk.FileFilter.add_mime_type],
     * [method@Gtk.FileFilter.add_pattern],
     * [method@Gtk.FileFilter.add_suffix] or
     * [method@Gtk.FileFilter.add_pixbuf_formats].
     * 
     * To create a filter that accepts any file, use:
     * ```c
     * GtkFileFilter *filter = gtk_file_filter_new ();
     * gtk_file_filter_add_pattern (filter, "*");
     * ```
     */
    public FileFilter() {
        super(constructNew());
    }
    
    private static Reference constructNewFromGvariant(org.gtk.glib.Variant variant) {
        Reference RESULT = References.get(gtk_h.gtk_file_filter_new_from_gvariant(variant.handle()), true);
        return RESULT;
    }
    
    /**
     * Deserialize a file filter from a `GVariant`.
     * 
     * The variant must be in the format produced by
     * [method@Gtk.FileFilter.to_gvariant].
     */
    public static FileFilter newFromGvariant(org.gtk.glib.Variant variant) {
        return new FileFilter(constructNewFromGvariant(variant));
    }
    
    /**
     * Adds a rule allowing a given mime type to @filter.
     */
    public void addMimeType(java.lang.String mimeType) {
        gtk_h.gtk_file_filter_add_mime_type(handle(), Interop.allocateNativeString(mimeType).handle());
    }
    
    /**
     * Adds a rule allowing a shell style glob to a filter.
     * 
     * Note that it depends on the platform whether pattern
     * matching ignores case or not. On Windows, it does, on
     * other platforms, it doesn't.
     */
    public void addPattern(java.lang.String pattern) {
        gtk_h.gtk_file_filter_add_pattern(handle(), Interop.allocateNativeString(pattern).handle());
    }
    
    /**
     * Adds a rule allowing image files in the formats supported
     * by GdkPixbuf.
     * 
     * This is equivalent to calling [method@Gtk.FileFilter.add_mime_type]
     * for all the supported mime types.
     */
    public void addPixbufFormats() {
        gtk_h.gtk_file_filter_add_pixbuf_formats(handle());
    }
    
    /**
     * Adds a suffix match rule to a filter.
     * 
     * This is similar to adding a match for the pattern
     * "*.@suffix".
     * 
     * In contrast to pattern matches, suffix matches
     * are *always* case-insensitive.
     */
    public void addSuffix(java.lang.String suffix) {
        gtk_h.gtk_file_filter_add_suffix(handle(), Interop.allocateNativeString(suffix).handle());
    }
    
    /**
     * Gets the human-readable name for the filter.
     * 
     * See [method@Gtk.FileFilter.set_name].
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_file_filter_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets a human-readable name of the filter.
     * 
     * This is the string that will be displayed in the file chooser
     * if there is a selectable list of filters.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_file_filter_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Serialize a file filter to an `a{sv}` variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = gtk_h.gtk_file_filter_to_gvariant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
}
