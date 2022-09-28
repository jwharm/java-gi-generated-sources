package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFileFilter} filters files by name or mime type.
 * <p>
 * {@code GtkFileFilter} can be used to restrict the files being shown in a
 * {@code GtkFileChooser}. Files can be filtered based on their name (with
 * {@code Gtk.FileFilter.add_suffix})
 * or on their mime type (with {@link FileFilter#addMimeType}).
 * <p>
 * Filtering by mime types handles aliasing and subclassing of mime
 * types; e.g. a filter for text/plain also matches a file with mime
 * type application/rtf, since application/rtf is a subclass of
 * text/plain. Note that {@code GtkFileFilter} allows wildcards for the
 * subtype of a mime type, so you can e.g. filter for image/\\*.
 * <p>
 * Normally, file filters are used by adding them to a {@code GtkFileChooser}
 * (see {@link FileChooser#addFilter}), but it is also possible to
 * manually use a file filter on any {@link FilterListModel} containing
 * {@code GFileInfo} objects.
 * <p>
 * <h1>GtkFileFilter as GtkBuildable</h1>
 * <p>
 * The {@code GtkFileFilter} implementation of the {@code GtkBuildable} interface
 * supports adding rules using the {@code <mime-types>} and {@code <patterns>} and
 * {@code <suffixes>} elements and listing the rules within. Specifying a
 * {@code <mime-type>} or {@code <pattern>} or {@code <suffix>} has the same effect as
 * as calling
 * {@link FileFilter#addMimeType} or
 * {@link FileFilter#addPattern} or
 * {@link FileFilter#addSuffix}.
 * <p>
 * An example of a UI definition fragment specifying {@code GtkFileFilter}
 * rules:
 * <pre>{@code xml
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
 * }</pre>
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
     * Creates a new {@code GtkFileFilter} with no rules added to it.
     * <p>
     * Such a filter doesn’t accept any files, so is not
     * particularly useful until you add rules with
     * {@link FileFilter#addMimeType},
     * {@link FileFilter#addPattern},
     * {@link FileFilter#addSuffix} or
     * {@link FileFilter#addPixbufFormats}.
     * <p>
     * To create a filter that accepts any file, use:
     * <pre>{@code c
     * GtkFileFilter *filter = gtk_file_filter_new ();
     * gtk_file_filter_add_pattern (filter, "*");
     * }</pre>
     */
    public FileFilter() {
        super(constructNew());
    }
    
    private static Reference constructNewFromGvariant(org.gtk.glib.Variant variant) {
        Reference RESULT = References.get(gtk_h.gtk_file_filter_new_from_gvariant(variant.handle()), true);
        return RESULT;
    }
    
    /**
     * Deserialize a file filter from a {@code GVariant}.
     * <p>
     * The variant must be in the format produced by
     * {@link FileFilter#toGvariant}.
     */
    public static FileFilter newFromGvariant(org.gtk.glib.Variant variant) {
        return new FileFilter(constructNewFromGvariant(variant));
    }
    
    /**
     * Adds a rule allowing a given mime type to {@code filter}.
     */
    public void addMimeType(java.lang.String mimeType) {
        gtk_h.gtk_file_filter_add_mime_type(handle(), Interop.allocateNativeString(mimeType).handle());
    }
    
    /**
     * Adds a rule allowing a shell style glob to a filter.
     * <p>
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
     * <p>
     * This is equivalent to calling {@link FileFilter#addMimeType}
     * for all the supported mime types.
     */
    public void addPixbufFormats() {
        gtk_h.gtk_file_filter_add_pixbuf_formats(handle());
    }
    
    /**
     * Adds a suffix match rule to a filter.
     * <p>
     * This is similar to adding a match for the pattern
     * "*.{@code suffix}".
     * <p>
     * In contrast to pattern matches, suffix matches
     * are <strong>always</strong> case-insensitive.
     */
    public void addSuffix(java.lang.String suffix) {
        gtk_h.gtk_file_filter_add_suffix(handle(), Interop.allocateNativeString(suffix).handle());
    }
    
    /**
     * Gets the attributes that need to be filled in for the {@code GFileInfo}
     * passed to this filter.
     * <p>
     * This function will not typically be used by applications;
     * it is intended principally for use in the implementation
     * of {@code GtkFileChooser}.
     */
    public PointerIterator<java.lang.String> getAttributes() {
        var RESULT = gtk_h.gtk_file_filter_get_attributes(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Gets the human-readable name for the filter.
     * <p>
     * See {@link FileFilter#setName}.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_file_filter_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets a human-readable name of the filter.
     * <p>
     * This is the string that will be displayed in the file chooser
     * if there is a selectable list of filters.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_file_filter_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Serialize a file filter to an {@code a{sv}} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = gtk_h.gtk_file_filter_to_gvariant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
}
