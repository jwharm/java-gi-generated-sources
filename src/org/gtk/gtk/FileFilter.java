package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFileFilter</code> filters files by name or mime type.
 * <p><code>GtkFileFilter</code> can be used to restrict the files being shown in a<code>GtkFileChooser</code>. Files can be filtered based on their name (with
 * {@link org.gtk.gtk.FileFilter#addPattern} or {@link org.gtk.gtk.FileFilter#addSuffix})
 * or on their mime type (with {@link org.gtk.gtk.FileFilter#addMimeType}).
 * <p>
 * Filtering by mime types handles aliasing and subclassing of mime
 * types; e.g. a filter for text/plain also matches a file with mime
 * type application/rtf, since application/rtf is a subclass of
 * text/plain. Note that <code>GtkFileFilter</code> allows wildcards for the
 * subtype of a mime type, so you can e.g. filter for image/\\*.
 * <p>
 * Normally, file filters are used by adding them to a <code>GtkFileChooser</code>
 * (see {@link org.gtk.gtk.FileChooser#addFilter}), but it is also possible to
 * manually use a file filter on any {@link org.gtk.gtk.FilterListModel} containing<code>GFileInfo</code> objects.
 * <p>
 * <h1>tkFileFilter as GtkBuildable</h1>
 * <p>
 * The <code>GtkFileFilter</code> implementation of the <code>GtkBuildable</code> interface
 * supports adding rules using the <code>&#60;mime-types&#62;</code> and <code>&#60;patterns&#62;</code> and<code>&#60;suffixes&#62;</code> elements and listing the rules within. Specifying a<code>&#60;mime-type&#62;</code> or <code>&#60;pattern&#62;</code> or <code>&#60;suffix&#62;</code> has the same effect as
 * as calling
 * {@link org.gtk.gtk.FileFilter#addMimeType} or
 * {@link org.gtk.gtk.FileFilter#addPattern} or
 * {@link org.gtk.gtk.FileFilter#addSuffix}.
 * <p>
 * An example of a UI definition fragment specifying <code>GtkFileFilter</code>
 * rules:<pre>xml
 * &#60;object class=&#34;GtkFileFilter&#34;&#62;
 *   &#60;property name=&#34;name&#34; translatable=&#34;yes&#34;&#62;Text and Images&#60;/property&#62;
 *   &#60;mime-types&#62;
 *     &#60;mime-type&#62;text/plain&#60;/mime-type&#62;
 *     &#60;mime-type&#62;image/ *&#60;/mime-type&#62;
 *   &#60;/mime-types&#62;
 *   &#60;patterns&#62;
 *     &#60;pattern&#62;*.txt&#60;/pattern&#62;
 *   &#60;/patterns&#62;
 *   &#60;suffixes&#62;
 *     &#60;suffix&#62;png&#60;/suffix&#62;
 *   &#60;/suffixes&#62;
 * &#60;/object&#62;
 * </pre>
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
     * Creates a new <code>GtkFileFilter</code> with no rules added to it.
     * <p>
     * Such a filter doesn&#8217;t accept any files, so is not
     * particularly useful until you add rules with
     * {@link org.gtk.gtk.FileFilter#addMimeType},
     * {@link org.gtk.gtk.FileFilter#addPattern},
     * {@link org.gtk.gtk.FileFilter#addSuffix} or
     * {@link org.gtk.gtk.FileFilter#addPixbufFormats}.
     * <p>
     * To create a filter that accepts any file, use:<pre>c
     * GtkFileFilter *filter = gtk_file_filter_new ();
     * gtk_file_filter_add_pattern (filter, &#34;*&#34;);
     * </pre>
     */
    public FileFilter() {
        super(constructNew());
    }
    
    private static Reference constructNewFromGvariant(org.gtk.glib.Variant variant) {
        Reference RESULT = References.get(gtk_h.gtk_file_filter_new_from_gvariant(variant.handle()), true);
        return RESULT;
    }
    
    /**
     * Deserialize a file filter from a <code>GVariant</code>.
     * 
     * The variant must be in the format produced by
     * {@link org.gtk.gtk.FileFilter#toGvariant}.
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
     * other platforms, it doesn&#39;t.
     */
    public void addPattern(java.lang.String pattern) {
        gtk_h.gtk_file_filter_add_pattern(handle(), Interop.allocateNativeString(pattern).handle());
    }
    
    /**
     * Adds a rule allowing image files in the formats supported
     * by GdkPixbuf.
     * 
     * This is equivalent to calling {@link org.gtk.gtk.FileFilter#addMimeType}
     * for all the supported mime types.
     */
    public void addPixbufFormats() {
        gtk_h.gtk_file_filter_add_pixbuf_formats(handle());
    }
    
    /**
     * Adds a suffix match rule to a filter.
     * 
     * This is similar to adding a match for the pattern
     * &#34;*.@suffix&#34;.
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
     * See {@link org.gtk.gtk.FileFilter#setName}.
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
     * Serialize a file filter to an <code>a{sv}</code> variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = gtk_h.gtk_file_filter_to_gvariant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
}
