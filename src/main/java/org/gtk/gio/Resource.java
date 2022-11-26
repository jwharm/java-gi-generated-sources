package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Applications and libraries often contain binary or textual data that is
 * really part of the application, rather than user data. For instance
 * {@link org.gtk.gtk.Builder} .ui files, splashscreen images, GMenu markup XML, CSS files,
 * icons, etc. These are often shipped as files in {@code $datadir/appname}, or
 * manually included as literal strings in the code.
 * <p>
 * The {@link Resource} API and the [glib-compile-resources][glib-compile-resources] program
 * provide a convenient and efficient alternative to this which has some nice properties. You
 * maintain the files as normal files, so its easy to edit them, but during the build the files
 * are combined into a binary bundle that is linked into the executable. This means that loading
 * the resource files are efficient (as they are already in memory, shared with other instances) and
 * simple (no need to check for things like I/O errors or locate the files in the filesystem). It
 * also makes it easier to create relocatable applications.
 * <p>
 * Resource files can also be marked as compressed. Such files will be included in the resource bundle
 * in a compressed form, but will be automatically uncompressed when the resource is used. This
 * is very useful e.g. for larger text files that are parsed once (or rarely) and then thrown away.
 * <p>
 * Resource files can also be marked to be preprocessed, by setting the value of the
 * {@code preprocess} attribute to a comma-separated list of preprocessing options.
 * The only options currently supported are:
 * <p>
 * {@code xml-stripblanks} which will use the xmllint command
 * to strip ignorable whitespace from the XML file. For this to work,
 * the {@code XMLLINT} environment variable must be set to the full path to
 * the xmllint executable, or xmllint must be in the {@code PATH}; otherwise
 * the preprocessing step is skipped.
 * <p>
 * {@code to-pixdata} (deprecated since gdk-pixbuf 2.32) which will use the
 * {@code gdk-pixbuf-pixdata} command to convert images to the {@code GdkPixdata} format,
 * which allows you to create pixbufs directly using the data inside the
 * resource file, rather than an (uncompressed) copy of it. For this, the
 * {@code gdk-pixbuf-pixdata} program must be in the {@code PATH}, or the
 * {@code GDK_PIXBUF_PIXDATA} environment variable must be set to the full path to the
 * {@code gdk-pixbuf-pixdata} executable; otherwise the resource compiler will abort.
 * {@code to-pixdata} has been deprecated since gdk-pixbuf 2.32, as {@link Resource}
 * supports embedding modern image formats just as well. Instead of using it,
 * embed a PNG or SVG file in your {@link Resource}.
 * <p>
 * {@code json-stripblanks} which will use the {@code json-glib-format} command to strip
 * ignorable whitespace from the JSON file. For this to work, the
 * {@code JSON_GLIB_FORMAT} environment variable must be set to the full path to the
 * {@code json-glib-format} executable, or it must be in the {@code PATH};
 * otherwise the preprocessing step is skipped. In addition, at least version
 * 1.6 of {@code json-glib-format} is required.
 * <p>
 * Resource files will be exported in the GResource namespace using the
 * combination of the given {@code prefix} and the filename from the {@code file} element.
 * The {@code alias} attribute can be used to alter the filename to expose them at a
 * different location in the resource namespace. Typically, this is used to
 * include files from a different source directory without exposing the source
 * directory in the resource namespace, as in the example below.
 * <p>
 * Resource bundles are created by the [glib-compile-resources][glib-compile-resources] program
 * which takes an XML file that describes the bundle, and a set of files that the XML references. These
 * are combined into a binary resource bundle.
 * <p>
 * An example resource description:
 * <pre>{@code 
 * <?xml version="1.0" encoding="UTF-8"?>
 * <gresources>
 *   <gresource prefix="/org/gtk/Example">
 *     <file>data/splashscreen.png</file>
 *     <file compressed="true">dialog.ui</file>
 *     <file preprocess="xml-stripblanks">menumarkup.xml</file>
 *     <file alias="example.css">data/example.css</file>
 *   </gresource>
 * </gresources>
 * }</pre>
 * <p>
 * This will create a resource bundle with the following files:
 * <pre>{@code 
 * /org/gtk/Example/data/splashscreen.png
 * /org/gtk/Example/dialog.ui
 * /org/gtk/Example/menumarkup.xml
 * /org/gtk/Example/example.css
 * }</pre>
 * <p>
 * Note that all resources in the process share the same namespace, so use Java-style
 * path prefixes (like in the above example) to avoid conflicts.
 * <p>
 * You can then use [glib-compile-resources][glib-compile-resources] to compile the XML to a
 * binary bundle that you can load with g_resource_load(). However, its more common to use the --generate-source and
 * --generate-header arguments to create a source file and header to link directly into your application.
 * This will generate {@code get_resource()}, {@code register_resource()} and
 * {@code unregister_resource()} functions, prefixed by the {@code --c-name} argument passed
 * to [glib-compile-resources][glib-compile-resources]. {@code get_resource()} returns
 * the generated {@link Resource} object. The register and unregister functions
 * register the resource so its files can be accessed using
 * g_resources_lookup_data().
 * <p>
 * Once a {@link Resource} has been created and registered all the data in it can be accessed globally in the process by
 * using API calls like g_resources_open_stream() to stream the data or g_resources_lookup_data() to get a direct pointer
 * to the data. You can also use URIs like "resource:///org/gtk/Example/data/splashscreen.png" with {@link File} to access
 * the resource data.
 * <p>
 * Some higher-level APIs, such as {@link org.gtk.gtk.Application}, will automatically load
 * resources from certain well-known paths in the resource namespace as a
 * convenience. See the documentation for those APIs for details.
 * <p>
 * There are two forms of the generated source, the default version uses the compiler support for constructor
 * and destructor functions (where available) to automatically create and register the {@link Resource} on startup
 * or library load time. If you pass {@code --manual-register}, two functions to register/unregister the resource are created
 * instead. This requires an explicit initialization call in your application/library, but it works on all platforms,
 * even on the minor ones where constructors are not supported. (Constructor support is available for at least Win32, Mac OS and Linux.)
 * <p>
 * Note that resource data can point directly into the data segment of e.g. a library, so if you are unloading libraries
 * during runtime you need to be very careful with keeping around pointers to data from a resource, as this goes away
 * when the library is unloaded. However, in practice this is not generally a problem, since most resource accesses
 * are for your own resources, and resource data is often used once, during parsing, and then released.
 * <p>
 * When debugging a program or testing a change to an installed version, it is often useful to be able to
 * replace resources in the program or library, without recompiling, for debugging or quick hacking and testing
 * purposes. Since GLib 2.50, it is possible to use the {@code G_RESOURCE_OVERLAYS} environment variable to selectively overlay
 * resources with replacements from the filesystem.  It is a {@code G_SEARCHPATH_SEPARATOR}-separated list of substitutions to perform
 * during resource lookups. It is ignored when running in a setuid process.
 * <p>
 * A substitution has the form
 * <pre>{@code 
 *    /org/gtk/libgtk=/home/desrt/gtk-overlay
 * }</pre>
 * <p>
 * The part before the {@code =} is the resource subpath for which the overlay applies.  The part after is a
 * filesystem path which contains files and subdirectories as you would like to be loaded as resources with the
 * equivalent names.
 * <p>
 * In the example above, if an application tried to load a resource with the resource path
 * {@code /org/gtk/libgtk/ui/gtkdialog.ui} then GResource would check the filesystem path
 * {@code /home/desrt/gtk-overlay/ui/gtkdialog.ui}.  If a file was found there, it would be used instead.  This is an
 * overlay, not an outright replacement, which means that if a file is not found at that path, the built-in
 * version will be used instead.  Whiteouts are not currently supported.
 * <p>
 * Substitutions must start with a slash, and must not contain a trailing slash before the '='.  The path after
 * the slash should ideally be absolute, but this is not strictly required.  It is possible to overlay the
 * location of a single resource with an individual file.
 * @version 2.32
 */
public class Resource extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GResource";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Resource}
     * @return A new, uninitialized @{link Resource}
     */
    public static Resource allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Resource newInstance = new Resource(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Resource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Resource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewFromData(@NotNull org.gtk.glib.Bytes data) throws GErrorException {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resource_new_from_data.invokeExact(
                    data.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a GResource from a reference to the binary resource bundle.
     * This will keep a reference to {@code data} while the resource lives, so
     * the data should not be modified or freed.
     * <p>
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * <p>
     * Note: {@code data} must be backed by memory that is at least pointer aligned.
     * Otherwise this function will internally create a copy of the memory since
     * GLib 2.56, or in older versions fail and exit the process.
     * <p>
     * If {@code data} is empty or corrupt, {@link ResourceError#INTERNAL} will be returned.
     * @param data A {@link org.gtk.glib.Bytes}
     * @return a new {@link Resource}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Resource newFromData(@NotNull org.gtk.glib.Bytes data) throws GErrorException {
        return new Resource(constructNewFromData(data), Ownership.FULL);
    }
    
    /**
     * Registers the resource with the process-global set of resources.
     * Once a resource is registered the files in it can be accessed
     * with the global resource lookup functions like g_resources_lookup_data().
     */
    public void Register() {
        try {
            DowncallHandles.g_resources_register.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unregisters the resource from the process-global set of resources.
     */
    public void Unregister() {
        try {
            DowncallHandles.g_resources_unregister.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns all the names of children at the specified {@code path} in the resource.
     * The return result is a {@code null} terminated list of strings which should
     * be released with g_strfreev().
     * <p>
     * If {@code path} is invalid or does not exist in the {@link Resource},
     * {@link ResourceError#NOT_FOUND} will be returned.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookupFlags A {@link ResourceLookupFlags}
     * @return an array of constant strings
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull PointerString enumerateChildren(@NotNull java.lang.String path, @NotNull org.gtk.gio.ResourceLookupFlags lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(lookupFlags, "Parameter 'lookupFlags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resource_enumerate_children.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path),
                    lookupFlags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Looks for a file at the specified {@code path} in the resource and
     * if found returns information about it.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookupFlags A {@link ResourceLookupFlags}
     * @param size a location to place the length of the contents of the file,
     *    or {@code null} if the length is not needed
     * @param flags a location to place the flags about the file,
     *    or {@code null} if the length is not needed
     * @return {@code true} if the file was found. {@code false} if there were errors
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getInfo(@NotNull java.lang.String path, @NotNull org.gtk.gio.ResourceLookupFlags lookupFlags, Out<Long> size, Out<Integer> flags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(lookupFlags, "Parameter 'lookupFlags' must not be null");
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment flagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_resource_get_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path),
                    lookupFlags.getValue(),
                    (Addressable) sizePOINTER.address(),
                    (Addressable) flagsPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        flags.set(flagsPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Looks for a file at the specified {@code path} in the resource and
     * returns a {@link org.gtk.glib.Bytes} that lets you directly access the data in
     * memory.
     * <p>
     * The data is always followed by a zero byte, so you
     * can safely use the data as a C string. However, that byte
     * is not included in the size of the GBytes.
     * <p>
     * For uncompressed resource files this is a pointer directly into
     * the resource bundle, which is typically in some readonly data section
     * in the program binary. For compressed files we allocate memory on
     * the heap and automatically uncompress the data.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookupFlags A {@link ResourceLookupFlags}
     * @return {@link org.gtk.glib.Bytes} or {@code null} on error.
     *     Free the returned object with g_bytes_unref()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.Bytes lookupData(@NotNull java.lang.String path, @NotNull org.gtk.gio.ResourceLookupFlags lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(lookupFlags, "Parameter 'lookupFlags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resource_lookup_data.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path),
                    lookupFlags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Looks for a file at the specified {@code path} in the resource and
     * returns a {@link InputStream} that lets you read the data.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookupFlags A {@link ResourceLookupFlags}
     * @return {@link InputStream} or {@code null} on error.
     *     Free the returned object with g_object_unref()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.InputStream openStream(@NotNull java.lang.String path, @NotNull org.gtk.gio.ResourceLookupFlags lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(lookupFlags, "Parameter 'lookupFlags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resource_open_stream.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path),
                    lookupFlags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(RESULT, Ownership.FULL);
    }
    
    /**
     * Atomically increments the reference count of {@code resource} by one. This
     * function is MT-safe and may be called from any thread.
     * @return The passed in {@link Resource}
     */
    public @NotNull org.gtk.gio.Resource ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resource_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Resource(RESULT, Ownership.FULL);
    }
    
    /**
     * Atomically decrements the reference count of {@code resource} by one. If the
     * reference count drops to 0, all memory allocated by the resource is
     * released. This function is MT-safe and may be called from any
     * thread.
     */
    public void unref() {
        try {
            DowncallHandles.g_resource_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Loads a binary resource bundle and creates a {@link Resource} representation of it, allowing
     * you to query it for data.
     * <p>
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * <p>
     * If {@code filename} is empty or the data in it is corrupt,
     * {@link ResourceError#INTERNAL} will be returned. If {@code filename} doesn’t exist, or
     * there is an error in reading it, an error from g_mapped_file_new() will be
     * returned.
     * @param filename the path of a filename to load, in the GLib filename encoding
     * @return a new {@link Resource}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gio.Resource load(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resource_load.invokeExact(
                    Interop.allocateNativeString(filename),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Resource(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_resource_new_from_data = Interop.downcallHandle(
            "g_resource_new_from_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resources_register = Interop.downcallHandle(
            "g_resources_register",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resources_unregister = Interop.downcallHandle(
            "g_resources_unregister",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_enumerate_children = Interop.downcallHandle(
            "g_resource_enumerate_children",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_get_info = Interop.downcallHandle(
            "g_resource_get_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_lookup_data = Interop.downcallHandle(
            "g_resource_lookup_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_open_stream = Interop.downcallHandle(
            "g_resource_open_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_ref = Interop.downcallHandle(
            "g_resource_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_unref = Interop.downcallHandle(
            "g_resource_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resource_load = Interop.downcallHandle(
            "g_resource_load",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Resource struct;
        
         /**
         * A {@link Resource.Build} object constructs a {@link Resource} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Resource.allocate();
        }
        
         /**
         * Finish building the {@link Resource} struct.
         * @return A new instance of {@code Resource} with the fields 
         *         that were set in the Build object.
         */
        public Resource construct() {
            return struct;
        }
    }
}
