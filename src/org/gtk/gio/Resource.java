package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Applications and libraries often contain binary or textual data that is
 * really part of the application, rather than user data. For instance
 * {@link org.gtk.gtk.Builder} .ui files, splashscreen images, GMenu markup XML, CSS files,
 * icons, etc. These are often shipped as files in <code>$datadir/appname</code>, or
 * manually included as literal strings in the code.
 * <p>
 * The {@link org.gtk.gio.Resource} API and the {@link [glib-compile-resources]}{@link [glib-compile-resources]} program
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
 * Resource files can also be marked to be preprocessed, by setting the value of the<code>preprocess</code> attribute to a comma-separated list of preprocessing options.
 * The only options currently supported are:
 * <p><code>xml-stripblanks</code> which will use the xmllint command
 * to strip ignorable whitespace from the XML file. For this to work,
 * the <code>XMLLINT</code> environment variable must be set to the full path to
 * the xmllint executable, or xmllint must be in the <code>PATH</code>; otherwise
 * the preprocessing step is skipped.
 * <p><code>to-pixdata</code> (deprecated since gdk-pixbuf 2.32) which will use the<code>gdk-pixbuf-pixdata</code> command to convert images to the <code>#GdkPixdata</code> format,
 * which allows you to create pixbufs directly using the data inside the
 * resource file, rather than an (uncompressed) copy of it. For this, the<code>gdk-pixbuf-pixdata</code> program must be in the <code>PATH</code>, or the<code>GDK_PIXBUF_PIXDATA</code> environment variable must be set to the full path to the<code>gdk-pixbuf-pixdata</code> executable; otherwise the resource compiler will abort.<code>to-pixdata</code> has been deprecated since gdk-pixbuf 2.32, as {@link org.gtk.gio.Resource} supports embedding modern image formats just as well. Instead of using it,
 * embed a PNG or SVG file in your {@link org.gtk.gio.Resource} 
 * <p><code>json-stripblanks</code> which will use the <code>json-glib-format</code> command to strip
 * ignorable whitespace from the JSON file. For this to work, the<code>JSON_GLIB_FORMAT</code> environment variable must be set to the full path to the<code>json-glib-format</code> executable, or it must be in the <code>PATH</code>;
 * otherwise the preprocessing step is skipped. In addition, at least version
 * 1.6 of <code>json-glib-format</code> is required.
 * <p>
 * Resource files will be exported in the GResource namespace using the
 * combination of the given <code>prefix</code> and the filename from the <code>file</code> element.
 * The <code>alias</code> attribute can be used to alter the filename to expose them at a
 * different location in the resource namespace. Typically, this is used to
 * include files from a different source directory without exposing the source
 * directory in the resource namespace, as in the example below.
 * <p>
 * Resource bundles are created by the {@link [glib-compile-resources]}{@link [glib-compile-resources]} program
 * which takes an XML file that describes the bundle, and a set of files that the XML references. These
 * are combined into a binary resource bundle.
 * <p>
 * An example resource description:
 * |{@link [
 * &<code>#60</code> ?xml version=&<code>#34</code> 1.0&<code>#34</code>  encoding=&<code>#34</code> UTF-8&<code>#34</code> ?&<code>#62</code> 
 * &<code>#60</code> gresources&<code>#62</code> 
 *   &<code>#60</code> gresource prefix=&<code>#34</code> /org/gtk/Example&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> file&<code>#62</code> data/splashscreen.png&<code>#60</code> /file&<code>#62</code> 
 *     &<code>#60</code> file compressed=&<code>#34</code> true&<code>#34</code> &<code>#62</code> dialog.ui&<code>#60</code> /file&<code>#62</code> 
 *     &<code>#60</code> file preprocess=&<code>#34</code> xml-stripblanks&<code>#34</code> &<code>#62</code> menumarkup.xml&<code>#60</code> /file&<code>#62</code> 
 *     &<code>#60</code> file alias=&<code>#34</code> example.css&<code>#34</code> &<code>#62</code> data/example.css&<code>#60</code> /file&<code>#62</code> 
 *   &<code>#60</code> /gresource&<code>#62</code> 
 * &<code>#60</code> /gresources&<code>#62</code> 
 * ]}|
 * <p>
 * This will create a resource bundle with the following files:
 * |{@link [
 * /org/gtk/Example/data/splashscreen.png
 * /org/gtk/Example/dialog.ui
 * /org/gtk/Example/menumarkup.xml
 * /org/gtk/Example/example.css
 * ]}|
 * <p>
 * Note that all resources in the process share the same namespace, so use Java-style
 * path prefixes (like in the above example) to avoid conflicts.
 * <p>
 * You can then use {@link [glib-compile-resources]}{@link [glib-compile-resources]} to compile the XML to a
 * binary bundle that you can load with g_resource_load(). However, its more common to use the --generate-source and
 * --generate-header arguments to create a source file and header to link directly into your application.
 * This will generate <code>get_resource()</code>, <code>register_resource()</code> and<code>unregister_resource()</code> functions, prefixed by the <code>--c-name</code> argument passed
 * to {@link [glib-compile-resources]}{@link [glib-compile-resources]}. <code>get_resource()</code> returns
 * the generated {@link org.gtk.gio.Resource} object. The register and unregister functions
 * register the resource so its files can be accessed using
 * g_resources_lookup_data().
 * <p>
 * Once a {@link org.gtk.gio.Resource} has been created and registered all the data in it can be accessed globally in the process by
 * using API calls like g_resources_open_stream() to stream the data or g_resources_lookup_data() to get a direct pointer
 * to the data. You can also use URIs like &<code>#34</code> resource:///org/gtk/Example/data/splashscreen.png&<code>#34</code>  with {@link org.gtk.gio.File} to access
 * the resource data.
 * <p>
 * Some higher-level APIs, such as {@link org.gtk.gtk.Application}  will automatically load
 * resources from certain well-known paths in the resource namespace as a
 * convenience. See the documentation for those APIs for details.
 * <p>
 * There are two forms of the generated source, the default version uses the compiler support for constructor
 * and destructor functions (where available) to automatically create and register the {@link org.gtk.gio.Resource} on startup
 * or library load time. If you pass <code>--manual-register</code>, two functions to register/unregister the resource are created
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
 * purposes. Since GLib 2.50, it is possible to use the <code>G_RESOURCE_OVERLAYS</code> environment variable to selectively overlay
 * resources with replacements from the filesystem.  It is a <code>G_SEARCHPATH_SEPARATOR</code> separated list of substitutions to perform
 * during resource lookups. It is ignored when running in a setuid process.
 * <p>
 * A substitution has the form
 * <p>
 * |{@link [
 *    /org/gtk/libgtk=/home/desrt/gtk-overlay
 * ]}|
 * <p>
 * The part before the <code>=</code> is the resource subpath for which the overlay applies.  The part after is a
 * filesystem path which contains files and subdirectories as you would like to be loaded as resources with the
 * equivalent names.
 * <p>
 * In the example above, if an application tried to load a resource with the resource path<code>/org/gtk/libgtk/ui/gtkdialog.ui</code> then GResource would check the filesystem path<code>/home/desrt/gtk-overlay/ui/gtkdialog.ui</code>.  If a file was found there, it would be used instead.  This is an
 * overlay, not an outright replacement, which means that if a file is not found at that path, the built-in
 * version will be used instead.  Whiteouts are not currently supported.
 * 
 * Substitutions must start with a slash, and must not contain a trailing slash before the &<code>#39</code> =&<code>#39</code> .  The path after
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
     * This will keep a reference to @data while the resource lives, so
     * the data should not be modified or freed.
     * 
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * 
     * Note: @data must be backed by memory that is at least pointer aligned.
     * Otherwise this function will internally create a copy of the memory since
     * GLib 2.56, or in older versions fail and exit the process.
     * 
     * If @data is empty or corrupt, {@link org.gtk.gio.ResourceError<code>#INTERNAL</code>  will be returned.
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
     * Looks for a file at the specified @path in the resource and
     * returns a {@link org.gtk.glib.Bytes} that lets you directly access the data in
     * memory.
     * 
     * The data is always followed by a zero byte, so you
     * can safely use the data as a C string. However, that byte
     * is not included in the size of the GBytes.
     * 
     * For uncompressed resource files this is a pointer directly into
     * the resource bundle, which is typically in some readonly data section
     * in the program binary. For compressed files we allocate memory on
     * the heap and automatically uncompress the data.
     * 
     * @lookup_flags controls the behaviour of the lookup.
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
     * Looks for a file at the specified @path in the resource and
     * returns a {@link org.gtk.gio.InputStream} that lets you read the data.
     * 
     * @lookup_flags controls the behaviour of the lookup.
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
     * Atomically increments the reference count of @resource by one. This
     * function is MT-safe and may be called from any thread.
     */
    public Resource ref() {
        var RESULT = gtk_h.g_resource_ref(handle());
        return new Resource(References.get(RESULT, true));
    }
    
    /**
     * Atomically decrements the reference count of @resource by one. If the
     * reference count drops to 0, all memory allocated by the resource is
     * released. This function is MT-safe and may be called from any
     * thread.
     */
    public void unref() {
        gtk_h.g_resource_unref(handle());
    }
    
    /**
     * Loads a binary resource bundle and creates a {@link org.gtk.gio.Resource} representation of it, allowing
     * you to query it for data.
     * 
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * 
     * If @filename is empty or the data in it is corrupt,
     * {@link org.gtk.gio.ResourceError<code>#INTERNAL</code>  will be returned. If @filename doesn&<code>#8217</code> t exist, or
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
