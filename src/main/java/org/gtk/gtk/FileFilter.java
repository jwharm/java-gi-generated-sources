package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h1>GtkFileFilter as GtkBuildable</h1>
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

    public FileFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileFilter */
    public static FileFilter castFrom(org.gtk.gobject.Object gobject) {
        return new FileFilter(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_file_filter_new = Interop.downcallHandle(
        "gtk_file_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_file_filter_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    private static final MethodHandle gtk_file_filter_new_from_gvariant = Interop.downcallHandle(
        "gtk_file_filter_new_from_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_file_filter_new_from_gvariant.invokeExact(variant.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deserialize a file filter from a {@code GVariant}.
     * <p>
     * The variant must be in the format produced by
     * {@link FileFilter#toGvariant}.
     */
    public static FileFilter newFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        return new FileFilter(constructNewFromGvariant(variant));
    }
    
    private static final MethodHandle gtk_file_filter_add_mime_type = Interop.downcallHandle(
        "gtk_file_filter_add_mime_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rule allowing a given mime type to {@code filter}.
     */
    public @NotNull void addMimeType(@NotNull java.lang.String mimeType) {
        try {
            gtk_file_filter_add_mime_type.invokeExact(handle(), Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_file_filter_add_pattern = Interop.downcallHandle(
        "gtk_file_filter_add_pattern",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rule allowing a shell style glob to a filter.
     * <p>
     * Note that it depends on the platform whether pattern
     * matching ignores case or not. On Windows, it does, on
     * other platforms, it doesn't.
     */
    public @NotNull void addPattern(@NotNull java.lang.String pattern) {
        try {
            gtk_file_filter_add_pattern.invokeExact(handle(), Interop.allocateNativeString(pattern));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_file_filter_add_pixbuf_formats = Interop.downcallHandle(
        "gtk_file_filter_add_pixbuf_formats",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rule allowing image files in the formats supported
     * by GdkPixbuf.
     * <p>
     * This is equivalent to calling {@link FileFilter#addMimeType}
     * for all the supported mime types.
     */
    public @NotNull void addPixbufFormats() {
        try {
            gtk_file_filter_add_pixbuf_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_file_filter_add_suffix = Interop.downcallHandle(
        "gtk_file_filter_add_suffix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a suffix match rule to a filter.
     * <p>
     * This is similar to adding a match for the pattern
     * "*.{@code suffix}".
     * <p>
     * In contrast to pattern matches, suffix matches
     * are <strong>always</strong> case-insensitive.
     */
    public @NotNull void addSuffix(@NotNull java.lang.String suffix) {
        try {
            gtk_file_filter_add_suffix.invokeExact(handle(), Interop.allocateNativeString(suffix));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_file_filter_get_attributes = Interop.downcallHandle(
        "gtk_file_filter_get_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attributes that need to be filled in for the {@code GFileInfo}
     * passed to this filter.
     * <p>
     * This function will not typically be used by applications;
     * it is intended principally for use in the implementation
     * of {@code GtkFileChooser}.
     */
    public PointerString getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_file_filter_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_file_filter_get_name = Interop.downcallHandle(
        "gtk_file_filter_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the human-readable name for the filter.
     * <p>
     * See {@link FileFilter#setName}.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_file_filter_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_file_filter_set_name = Interop.downcallHandle(
        "gtk_file_filter_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a human-readable name of the filter.
     * <p>
     * This is the string that will be displayed in the file chooser
     * if there is a selectable list of filters.
     */
    public @NotNull void setName(@Nullable java.lang.String name) {
        try {
            gtk_file_filter_set_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_file_filter_to_gvariant = Interop.downcallHandle(
        "gtk_file_filter_to_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serialize a file filter to an {@code a{sv}} variant.
     */
    public @NotNull org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_file_filter_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
}
