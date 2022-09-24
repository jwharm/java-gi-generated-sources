package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
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
 */
public class Resource extends io.github.jwharm.javagi.ResourceBase {

    public Resource(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewFromData(org.gtk.glib.Bytes data) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_resource_new_from_data(data.handle(), GERROR), true);
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
     */
    public static Resource newFromData(org.gtk.glib.Bytes data) throws GErrorException {
        return new Resource(constructNewFromData(data));
    }
    
    /**
     * Registers the resource with the process-global set of resources.
     * Once a resource is registered the files in it can be accessed
     * with the global resource lookup functions like g_resources_lookup_data().
     */
    public void Register() {
        gtk_h.g_resources_register(handle());
    }
    
    /**
     * Unregisters the resource from the process-global set of resources.
     */
    public void Unregister() {
        gtk_h.g_resources_unregister(handle());
    }
    
    /**
     * Looks for a file at the specified {@code path} in the resource and
     * if found returns information about it.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     */
    public boolean getInfo(java.lang.String path, int lookupFlags, PointerLong size, PointerInteger flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resource_get_info(handle(), Interop.allocateNativeString(path).handle(), lookupFlags, size.handle(), flags.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
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
     */
    public org.gtk.glib.Bytes lookupData(java.lang.String path, int lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resource_lookup_data(handle(), Interop.allocateNativeString(path).handle(), lookupFlags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Looks for a file at the specified {@code path} in the resource and
     * returns a {@link InputStream} that lets you read the data.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     */
    public InputStream openStream(java.lang.String path, int lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resource_open_stream(handle(), Interop.allocateNativeString(path).handle(), lookupFlags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(References.get(RESULT, true));
    }
    
    /**
     * Atomically increments the reference count of {@code resource} by one. This
     * function is MT-safe and may be called from any thread.
     */
    public Resource ref() {
        var RESULT = gtk_h.g_resource_ref(handle());
        return new Resource(References.get(RESULT, true));
    }
    
    /**
     * Atomically decrements the reference count of {@code resource} by one. If the
     * reference count drops to 0, all memory allocated by the resource is
     * released. This function is MT-safe and may be called from any
     * thread.
     */
    public void unref() {
        gtk_h.g_resource_unref(handle());
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
     */
    public static Resource load(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resource_load(Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Resource(References.get(RESULT, true));
    }
    
}
