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
     */
    protected FileFilter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileFilter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileFilter(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromGvariant(org.gtk.glib.Variant variant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_new_from_gvariant.invokeExact(variant.handle());
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
    public static FileFilter newFromGvariant(org.gtk.glib.Variant variant) {
        var RESULT = constructNewFromGvariant(variant);
        var OBJECT = (org.gtk.gtk.FileFilter) Interop.register(RESULT, org.gtk.gtk.FileFilter.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds a rule allowing a given mime type to {@code filter}.
     * @param mimeType name of a MIME type
     */
    public void addMimeType(java.lang.String mimeType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_filter_add_mime_type.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(mimeType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void addPattern(java.lang.String pattern) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_filter_add_pattern.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(pattern, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
            DowncallHandles.gtk_file_filter_add_pixbuf_formats.invokeExact(handle());
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
    public void addSuffix(java.lang.String suffix) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_filter_add_suffix.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(suffix, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public PointerString getAttributes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_get_attributes.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_filter_set_name.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Serialize a file filter to an {@code a{sv}} variant.
     * @return a new, floating, {@code GVariant}
     */
    public org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_filter_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_file_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileFilter.Builder} object constructs a {@link FileFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Filter.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileFilter}.
         * @return A new instance of {@code FileFilter} with the properties 
         *         that were set in the Builder object.
         */
        public FileFilter build() {
            return (FileFilter) org.gtk.gobject.GObject.newWithProperties(
                FileFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The human-readable name of the filter.
         * <p>
         * This is the string that will be displayed in the file chooser
         * user interface if there is a selectable list of filters.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_filter_new = Interop.downcallHandle(
                "gtk_file_filter_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_new_from_gvariant = Interop.downcallHandle(
                "gtk_file_filter_new_from_gvariant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_add_mime_type = Interop.downcallHandle(
                "gtk_file_filter_add_mime_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_add_pattern = Interop.downcallHandle(
                "gtk_file_filter_add_pattern",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_add_pixbuf_formats = Interop.downcallHandle(
                "gtk_file_filter_add_pixbuf_formats",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_add_suffix = Interop.downcallHandle(
                "gtk_file_filter_add_suffix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_get_attributes = Interop.downcallHandle(
                "gtk_file_filter_get_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_get_name = Interop.downcallHandle(
                "gtk_file_filter_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_set_name = Interop.downcallHandle(
                "gtk_file_filter_set_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_to_gvariant = Interop.downcallHandle(
                "gtk_file_filter_to_gvariant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_filter_get_type = Interop.downcallHandle(
                "gtk_file_filter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_file_filter_get_type != null;
    }
}
