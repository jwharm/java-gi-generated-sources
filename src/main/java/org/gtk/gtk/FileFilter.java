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
 * {@link FileFilter#addPattern} or {@link FileFilter#addSuffix})
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
 * <strong>GtkFileFilter as GtkBuildable</strong><br/>
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
public class FileFilter extends org.gtk.gtk.Filter implements org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FileFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FileFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FileFilter if its GType is a (or inherits from) "GtkFileFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FileFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFileFilter", a ClassCastException will be thrown.
     */
    public static FileFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFileFilter"))) {
            return new FileFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFileFilter");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_new_from_gvariant.invokeExact(
                    variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Deserialize a file filter from a {@code GVariant}.
     * <p>
     * The variant must be in the format produced by
     * {@link FileFilter#toGvariant}.
     * @param variant an {@code a{sv}} {@code GVariant}
     * @return a new {@code GtkFileFilter} object
     */
    public static FileFilter newFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        return new FileFilter(constructNewFromGvariant(variant), Ownership.FULL);
    }
    
    /**
     * Adds a rule allowing a given mime type to {@code filter}.
     * @param mimeType name of a MIME type
     */
    public void addMimeType(@NotNull java.lang.String mimeType) {
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        try {
            DowncallHandles.gtk_file_filter_add_mime_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rule allowing a shell style glob to a filter.
     * <p>
     * Note that it depends on the platform whether pattern
     * matching ignores case or not. On Windows, it does, on
     * other platforms, it doesn't.
     * @param pattern a shell style glob
     */
    public void addPattern(@NotNull java.lang.String pattern) {
        java.util.Objects.requireNonNull(pattern, "Parameter 'pattern' must not be null");
        try {
            DowncallHandles.gtk_file_filter_add_pattern.invokeExact(
                    handle(),
                    Interop.allocateNativeString(pattern));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rule allowing image files in the formats supported
     * by GdkPixbuf.
     * <p>
     * This is equivalent to calling {@link FileFilter#addMimeType}
     * for all the supported mime types.
     */
    public void addPixbufFormats() {
        try {
            DowncallHandles.gtk_file_filter_add_pixbuf_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a suffix match rule to a filter.
     * <p>
     * This is similar to adding a match for the pattern
     * "*.{@code suffix}".
     * <p>
     * In contrast to pattern matches, suffix matches
     * are <em>always</em> case-insensitive.
     * @param suffix filename suffix to match
     */
    public void addSuffix(@NotNull java.lang.String suffix) {
        java.util.Objects.requireNonNull(suffix, "Parameter 'suffix' must not be null");
        try {
            DowncallHandles.gtk_file_filter_add_suffix.invokeExact(
                    handle(),
                    Interop.allocateNativeString(suffix));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the attributes that need to be filled in for the {@code GFileInfo}
     * passed to this filter.
     * <p>
     * This function will not typically be used by applications;
     * it is intended principally for use in the implementation
     * of {@code GtkFileChooser}.
     * @return the attributes
     */
    public @NotNull PointerString getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the human-readable name for the filter.
     * <p>
     * See {@link FileFilter#setName}.
     * @return The human-readable name of the filter
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets a human-readable name of the filter.
     * <p>
     * This is the string that will be displayed in the file chooser
     * if there is a selectable list of filters.
     * @param name the human-readable-name for the filter, or {@code null}
     *   to remove any existing name.
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gtk_file_filter_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serialize a file filter to an {@code a{sv}} variant.
     * @return a new, floating, {@code GVariant}
     */
    public @NotNull org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_to_gvariant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_filter_new = Interop.downcallHandle(
            "gtk_file_filter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_new_from_gvariant = Interop.downcallHandle(
            "gtk_file_filter_new_from_gvariant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_add_mime_type = Interop.downcallHandle(
            "gtk_file_filter_add_mime_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_add_pattern = Interop.downcallHandle(
            "gtk_file_filter_add_pattern",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_add_pixbuf_formats = Interop.downcallHandle(
            "gtk_file_filter_add_pixbuf_formats",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_add_suffix = Interop.downcallHandle(
            "gtk_file_filter_add_suffix",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_get_attributes = Interop.downcallHandle(
            "gtk_file_filter_get_attributes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_get_name = Interop.downcallHandle(
            "gtk_file_filter_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_set_name = Interop.downcallHandle(
            "gtk_file_filter_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_file_filter_to_gvariant = Interop.downcallHandle(
            "gtk_file_filter_to_gvariant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
