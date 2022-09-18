package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkBuilder</code> reads XML descriptions of a user interface and
 * instantiates the described objects.
 * <p>
 * To create a <code>GtkBuilder</code> from a user interface description, call
 * {@link [ctor@Gtk.Builder.new_from_file] (ref=ctor)}, {@link [ctor@Gtk.Builder.new_from_resource] (ref=ctor)}
 * or {@link [ctor@Gtk.Builder.new_from_string] (ref=ctor)}.
 * <p>
 * In the (unusual) case that you want to add user interface
 * descriptions from multiple sources to the same <code>GtkBuilder</code> you can
 * call {@link [ctor@Gtk.Builder.new] (ref=ctor)} to get an empty builder and populate it by
 * (multiple) calls to {@link org.gtk.gtk.Builder<code>#addFromFile</code> ,
 * {@link org.gtk.gtk.Builder<code>#addFromResource</code>  or
 * {@link org.gtk.gtk.Builder<code>#addFromString</code> .
 * <p>
 * A <code>GtkBuilder</code> holds a reference to all objects that it has constructed
 * and drops these references when it is finalized. This finalization can
 * cause the destruction of non-widget objects or widgets which are not
 * contained in a toplevel window. For toplevel windows constructed by a
 * builder, it is the responsibility of the user to call
 * {@link org.gtk.gtk.Window<code>#destroy</code>  to get rid of them and all the widgets
 * they contain.
 * <p>
 * The functions {@link org.gtk.gtk.Builder<code>#getObject</code>  and
 * {@link org.gtk.gtk.Builder<code>#getObjects</code>  can be used to access the widgets in
 * the interface by the names assigned to them inside the UI description.
 * Toplevel windows returned by these functions will stay around until the
 * user explicitly destroys them with {@link org.gtk.gtk.Window<code>#destroy</code> . Other
 * widgets will either be part of a larger hierarchy constructed by the
 * builder (in which case you should not have to worry about their lifecycle),
 * or without a parent, in which case they have to be added to some container
 * to make use of them. Non-widget objects need to be reffed with
 * g_object_ref() to keep them beyond the lifespan of the builder.
 * <p>
 * <h1>GtkBuilder UI Definitions</h1>
 * <p><code>GtkBuilder</code> parses textual descriptions of user interfaces which are
 * specified in XML format. We refer to these descriptions as &<code>#8220</code> GtkBuilder
 * UI definitions&<code>#8221</code>  or just &<code>#8220</code> UI definitions&<code>#8221</code>  if the context is clear.
 * <p>
 * The toplevel element is <code>&<code>#60</code> interface&<code>#62</code> </code>. It optionally takes a &<code>#8220</code> domain&<code>#8221</code> 
 * attribute, which will make the builder look for translated strings
 * using <code>dgettext()</code> in the domain specified. This can also be done by
 * calling {@link org.gtk.gtk.Builder<code>#setTranslationDomain</code>  on the builder.
 * <p>
 * Objects are described by <code>&<code>#60</code> object&<code>#62</code> </code> elements, which can contain<code>&<code>#60</code> property&<code>#62</code> </code> elements to set properties, <code>&<code>#60</code> signal&<code>#62</code> </code> elements which
 * connect signals to handlers, and <code>&<code>#60</code> child&<code>#62</code> </code> elements, which describe
 * child objects (most often widgets inside a container, but also e.g.
 * actions in an action group, or columns in a tree model). A <code>&<code>#60</code> child&<code>#62</code> </code>
 * element contains an <code>&<code>#60</code> object&<code>#62</code> </code> element which describes the child object.
 * <p>
 * The target toolkit version(s) are described by <code>&<code>#60</code> requires&<code>#62</code> </code> elements,
 * the &<code>#8220</code> lib&<code>#8221</code>  attribute specifies the widget library in question (currently
 * the only supported value is &<code>#8220</code> gtk&<code>#8221</code> ) and the &<code>#8220</code> version&<code>#8221</code>  attribute specifies
 * the target version in the form &<code>#8220</code> <code>&<code>#60</code> major&<code>#62</code> </code>.<code>&<code>#60</code> minor&<code>#62</code> </code>&<code>#8221</code> . <code>GtkBuilder</code> will
 * error out if the version requirements are not met.
 * <p>
 * Typically, the specific kind of object represented by an <code>&<code>#60</code> object&<code>#62</code> </code>
 * element is specified by the &<code>#8220</code> class&<code>#8221</code>  attribute. If the type has not
 * been loaded yet, GTK tries to find the <code>get_type()</code> function from the
 * class name by applying heuristics. This works in most cases, but if
 * necessary, it is possible to specify the name of the <code>get_type()</code>
 * function explicitly with the &<code>#34</code> type-func&<code>#34</code>  attribute.
 * <p>
 * Objects may be given a name with the &<code>#8220</code> id&<code>#8221</code>  attribute, which allows the
 * application to retrieve them from the builder with
 * {@link org.gtk.gtk.Builder<code>#getObject</code> . An id is also necessary to use the
 * object as property value in other parts of the UI definition. GTK
 * reserves ids starting and ending with <code>___</code> (three consecutive
 * underscores) for its own purposes.
 * <p>
 * Setting properties of objects is pretty straightforward with the<code>&<code>#60</code> property&<code>#62</code> </code> element: the &<code>#8220</code> name&<code>#8221</code>  attribute specifies the name of the
 * property, and the content of the element specifies the value.
 * If the &<code>#8220</code> translatable&<code>#8221</code>  attribute is set to a true value, GTK uses<code>gettext()</code> (or <code>dgettext()</code> if the builder has a translation domain set)
 * to find a translation for the value. This happens before the value
 * is parsed, so it can be used for properties of any type, but it is
 * probably most useful for string properties. It is also possible to
 * specify a context to disambiguate short strings, and comments which
 * may help the translators.
 * <p><code>GtkBuilder</code> can parse textual representations for the most common
 * property types: characters, strings, integers, floating-point numbers,
 * booleans (strings like &<code>#8220</code> TRUE&<code>#8221</code> , &<code>#8220</code> t&<code>#8221</code> , &<code>#8220</code> yes&<code>#8221</code> , &<code>#8220</code> y&<code>#8221</code> , &<code>#8220</code> 1&<code>#8221</code>  are interpreted
 * as <code>true</code>  strings like &<code>#8220</code> FALSE&<code>#8221</code> , &<code>#8220</code> f&<code>#8221</code> , &<code>#8220</code> no&<code>#8221</code> , &<code>#8220</code> n&<code>#8221</code> , &<code>#8220</code> 0&<code>#8221</code>  are interpreted
 * as <code>false</code> , enumerations (can be specified by their name, nick or
 * integer value), flags (can be specified by their name, nick, integer
 * value, optionally combined with &<code>#8220</code> |&<code>#8221</code> , e.g.
 * &<code>#8220</code> GTK_INPUT_HINT_EMOJI|GTK_INPUT_HINT_LOWERCASE&<code>#8221</code> )
 * and colors (in a format understood by {@link org.gtk.gdk.RGBA<code>#parse</code> ).
 * <p><code>GVariant</code>s can be specified in the format understood by
 * g_variant_parse(), and pixbufs can be specified as a filename of an
 * image file to load.
 * <p>
 * Objects can be referred to by their name and by default refer to
 * objects declared in the local XML fragment and objects exposed via
 * {@link org.gtk.gtk.Builder<code>#exposeObject</code> . In general, <code>GtkBuilder</code> allows
 * forward references to objects &<code>#8212</code>  declared in the local XML; an object
 * doesn&<code>#8217</code> t have to be constructed before it can be referred to. The
 * exception to this rule is that an object has to be constructed before
 * it can be used as the value of a construct-only property.
 * <p>
 * It is also possible to bind a property value to another object&<code>#39</code> s
 * property value using the attributes &<code>#34</code> bind-source&<code>#34</code>  to specify the
 * source object of the binding, and optionally, &<code>#34</code> bind-property&<code>#34</code>  and
 * &<code>#34</code> bind-flags&<code>#34</code>  to specify the source property and source binding flags
 * respectively. Internally, <code>GtkBuilder</code> implements this using <code>GBinding</code>
 * objects. For more information see g_object_bind_property().
 * <p>
 * Sometimes it is necessary to refer to widgets which have implicitly
 * been constructed by GTK as part of a composite widget, to set
 * properties on them or to add further children (e.g. the content area
 * of a <code>GtkDialog</code>). This can be achieved by setting the &<code>#8220</code> internal-child&<code>#8221</code> 
 * property of the <code>&<code>#60</code> child&<code>#62</code> </code> element to a true value. Note that <code>GtkBuilder</code>
 * still requires an <code>&<code>#60</code> object&<code>#62</code> </code> element for the internal child, even if it
 * has already been constructed.
 * <p>
 * A number of widgets have different places where a child can be added
 * (e.g. tabs vs. page content in notebooks). This can be reflected in
 * a UI definition by specifying the &<code>#8220</code> type&<code>#8221</code>  attribute on a <code>&<code>#60</code> child&<code>#62</code> </code>
 * The possible values for the &<code>#8220</code> type&<code>#8221</code>  attribute are described in the
 * sections describing the widget-specific portions of UI definitions.
 * <p>
 * <h1>Signal handlers and function pointers</h1>
 * <p>
 * Signal handlers are set up with the <code>&<code>#60</code> signal&<code>#62</code> </code> element. The &<code>#8220</code> name&<code>#8221</code> 
 * attribute specifies the name of the signal, and the &<code>#8220</code> handler&<code>#8221</code>  attribute
 * specifies the function to connect to the signal.
 * The remaining attributes, &<code>#8220</code> after&<code>#8221</code> , &<code>#8220</code> swapped&<code>#8221</code>  and &<code>#8220</code> object&<code>#8221</code> , have the
 * same meaning as the corresponding parameters of the
 * g_signal_connect_object() or g_signal_connect_data() functions. A
 * &<code>#8220</code> last_modification_time&<code>#8221</code>  attribute is also allowed, but it does not
 * have a meaning to the builder.
 * <p>
 * If you rely on <code>GModule</code> support to lookup callbacks in the symbol table,
 * the following details should be noted:
 * <p>
 * When compiling applications for Windows, you must declare signal callbacks
 * with <code>G_MODULE_EXPORT</code>  or they will not be put in the symbol table.
 * On Linux and Unix, this is not necessary; applications should instead
 * be compiled with the -Wl,--export-dynamic <code>CFLAGS</code>, and linked against<code>gmodule-export-2.0</code>.
 * <p>
 * <h1>A GtkBuilder UI Definition</h1>
 * <p><pre>xml
 * &<code>#60</code> interface&<code>#62</code> 
 *   &<code>#60</code> object class=&<code>#34</code> GtkDialog&<code>#34</code>  id=&<code>#34</code> dialog1&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> child internal-child=&<code>#34</code> content_area&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> object class=&<code>#34</code> GtkBox&<code>#34</code>  id=&<code>#34</code> vbox1&<code>#34</code> &<code>#62</code> 
 *         &<code>#60</code> child internal-child=&<code>#34</code> action_area&<code>#34</code> &<code>#62</code> 
 *           &<code>#60</code> object class=&<code>#34</code> GtkBox&<code>#34</code>  id=&<code>#34</code> hbuttonbox1&<code>#34</code> &<code>#62</code> 
 *             &<code>#60</code> child&<code>#62</code> 
 *               &<code>#60</code> object class=&<code>#34</code> GtkButton&<code>#34</code>  id=&<code>#34</code> ok_button&<code>#34</code> &<code>#62</code> 
 *                 &<code>#60</code> property name=&<code>#34</code> label&<code>#34</code>  translatable=&<code>#34</code> yes&<code>#34</code> &<code>#62</code> _Ok&<code>#60</code> /property&<code>#62</code> 
 *                 &<code>#60</code> property name=&<code>#34</code> use-underline&<code>#34</code> &<code>#62</code> True&<code>#60</code> /property&<code>#62</code> 
 *                 &<code>#60</code> signal name=&<code>#34</code> clicked&<code>#34</code>  handler=&<code>#34</code> ok_button_clicked&<code>#34</code> /&<code>#62</code> 
 *               &<code>#60</code> /object&<code>#62</code> 
 *             &<code>#60</code> /child&<code>#62</code> 
 *           &<code>#60</code> /object&<code>#62</code> 
 *         &<code>#60</code> /child&<code>#62</code> 
 *       &<code>#60</code> /object&<code>#62</code> 
 *     &<code>#60</code> /child&<code>#62</code> 
 *   &<code>#60</code> /object&<code>#62</code> 
 * &<code>#60</code> /interface&<code>#62</code> 
 * </pre>
 * <p>
 * Beyond this general structure, several object classes define their
 * own XML DTD fragments for filling in the ANY placeholders in the DTD
 * above. Note that a custom element in a &<code>#60</code> child&<code>#62</code>  element gets parsed by
 * the custom tag handler of the parent object, while a custom element in
 * an &<code>#60</code> object&<code>#62</code>  element gets parsed by the custom tag handler of the object.
 * <p>
 * These XML fragments are explained in the documentation of the
 * respective objects.
 * <p>
 * A <code>&<code>#60</code> template&<code>#62</code> </code> tag can be used to define a widget class&<code>#8217</code> s components.
 * See the {@link [GtkWidget documentation]}(class.Widget.html<code>#building</code> composite-widgets-from-template-xml) for details.
 */
public class Builder extends org.gtk.gobject.Object {

    public Builder(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Builder */
    public static Builder castFrom(org.gtk.gobject.Object gobject) {
        return new Builder(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_builder_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty builder object.
     * 
     * This function is only useful if you intend to make multiple calls
     * to {@link org.gtk.gtk.Builder<code>#addFromFile</code> , {@link org.gtk.gtk.Builder<code>#addFromResource</code> 
     * or {@link org.gtk.gtk.Builder<code>#addFromString</code>  in order to merge multiple UI
     * descriptions into a single builder.
     */
    public Builder() {
        super(constructNew());
    }
    
    private static Reference constructNewFromFile(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.gtk_builder_new_from_file(Interop.allocateNativeString(filename).handle()), true);
        return RESULT;
    }
    
    /**
     * Parses the UI definition in the file @filename.
     * 
     * If there is an error opening the file or parsing the description then
     * the program will be aborted. You should only ever attempt to parse
     * user interface descriptions that are shipped as part of your program.
     */
    public static Builder newFromFile(java.lang.String filename) {
        return new Builder(constructNewFromFile(filename));
    }
    
    private static Reference constructNewFromResource(java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gtk_builder_new_from_resource(Interop.allocateNativeString(resourcePath).handle()), true);
        return RESULT;
    }
    
    /**
     * Parses the UI definition at @resource_path.
     * 
     * If there is an error locating the resource or parsing the
     * description, then the program will be aborted.
     */
    public static Builder newFromResource(java.lang.String resourcePath) {
        return new Builder(constructNewFromResource(resourcePath));
    }
    
    private static Reference constructNewFromString(java.lang.String string, long length) {
        Reference RESULT = References.get(gtk_h.gtk_builder_new_from_string(Interop.allocateNativeString(string).handle(), length), true);
        return RESULT;
    }
    
    /**
     * Parses the UI definition in @string.
     * 
     * If @string is <code>null</code> terminated, then @length should be -1.
     * If @length is not -1, then it is the length of @string.
     * 
     * If there is an error parsing @string then the program will be
     * aborted. You should not attempt to parse user interface description
     * from untrusted sources.
     */
    public static Builder newFromString(java.lang.String string, long length) {
        return new Builder(constructNewFromString(string, length));
    }
    
    /**
     * Parses a file containing a UI definition and merges it with
     * the current contents of @builder.
     * <p>
     * This function is useful if you need to call
     * {@link org.gtk.gtk.Builder<code>#setCurrentObject</code> ) to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want {@link [ctor@Gtk.Builder.new_from_file] (ref=ctor)} instead.
     * <p>
     * If an error occurs, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code>, <code>G_MARKUP_ERROR</code> or <code>G_FILE_ERROR</code>
     * domains.
     * <p>
     * It&<code>#8217</code> s not really reasonable to attempt to handle failures of this
     * call. You should not use this function with untrusted files (ie:
     * files that are not part of your application). Broken <code>GtkBuilder</code>
     * files can easily crash your program, and it&<code>#8217</code> s possible that memory
     * was leaked leading up to the reported failure. The only reasonable
     * thing to do when an error is detected is to call <code>g_error()</code>.
     */
    public boolean addFromFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_add_from_file(handle(), Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses a resource file containing a UI definition
     * and merges it with the current contents of @builder.
     * <p>
     * This function is useful if you need to call
     * {@link org.gtk.gtk.Builder<code>#setCurrentObject</code>  to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want {@link [ctor@Gtk.Builder.new_from_resource] (ref=ctor)} instead.
     * <p>
     * If an error occurs, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code>  <code>G_MARKUP_ERROR</code> or <code>G_RESOURCE_ERROR</code> domain.
     * 
     * It&<code>#8217</code> s not really reasonable to attempt to handle failures of this
     * call.  The only reasonable thing to do when an error is detected is
     * to call g_error().
     */
    public boolean addFromResource(java.lang.String resourcePath) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_add_from_resource(handle(), Interop.allocateNativeString(resourcePath).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses a string containing a UI definition and merges it
     * with the current contents of @builder.
     * <p>
     * This function is useful if you need to call
     * {@link org.gtk.gtk.Builder<code>#setCurrentObject</code>  to add user data to
     * callbacks before loading <code>GtkBuilder</code> UI. Otherwise, you probably
     * want {@link [ctor@Gtk.Builder.new_from_string] (ref=ctor)} instead.
     * <p>
     * Upon errors <code>false</code> will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code>  <code>G_MARKUP_ERROR</code> or
     * <code>G_VARIANT_PARSE_ERROR</code> domain.
     * 
     * It&<code>#8217</code> s not really reasonable to attempt to handle failures of this
     * call.  The only reasonable thing to do when an error is detected is
     * to call g_error().
     */
    public boolean addFromString(java.lang.String buffer, long length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_add_from_string(handle(), Interop.allocateNativeString(buffer).handle(), length, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses a file containing a UI definition building only the
     * requested objects and merges them with the current contents
     * of @builder.
     * <p>
     * Upon errors, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code>  <code>G_MARKUP_ERROR</code> or <code>G_FILE_ERROR</code> domain.
     * <p>
     * If you are adding an object that depends on an object that is not
     * its child (for instance a <code>GtkTreeView</code> that depends on its<code>GtkTreeModel</code>), you have to explicitly list all of them in @object_ids.
     */
    public boolean addObjectsFromFile(java.lang.String filename, java.lang.String[] objectIds) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_add_objects_from_file(handle(), Interop.allocateNativeString(filename).handle(), Interop.allocateNativeArray(objectIds).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses a resource file containing a UI definition, building
     * only the requested objects and merges them with the current
     * contents of @builder.
     * <p>
     * Upon errors, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code>  <code>G_MARKUP_ERROR</code> or <code>G_RESOURCE_ERROR</code> domain.
     * <p>
     * If you are adding an object that depends on an object that is not
     * its child (for instance a <code>GtkTreeView</code> that depends on its<code>GtkTreeModel</code>), you have to explicitly list all of them in @object_ids.
     */
    public boolean addObjectsFromResource(java.lang.String resourcePath, java.lang.String[] objectIds) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_add_objects_from_resource(handle(), Interop.allocateNativeString(resourcePath).handle(), Interop.allocateNativeArray(objectIds).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses a string containing a UI definition, building only the
     * requested objects and merges them with the current contents of
     * @builder.
     * <p>
     * Upon errors <code>false</code> will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code> or <code>G_MARKUP_ERROR</code> domain.
     * <p>
     * If you are adding an object that depends on an object that is not
     * its child (for instance a <code>GtkTreeView</code> that depends on its<code>GtkTreeModel</code>), you have to explicitly list all of them in @object_ids.
     */
    public boolean addObjectsFromString(java.lang.String buffer, long length, java.lang.String[] objectIds) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_add_objects_from_string(handle(), Interop.allocateNativeString(buffer).handle(), length, Interop.allocateNativeArray(objectIds).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a closure to invoke the function called @function_name.
     * 
     * This is using the create_closure() implementation of @builder&<code>#39</code> s
     * {@link [iface@Gtk.BuilderScope] (ref=iface)}.
     * 
     * If no closure could be created, <code>null</code> will be returned and @error
     * will be set.
     */
    public org.gtk.gobject.Closure createClosure(java.lang.String functionName, int flags, org.gtk.gobject.Object object) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_create_closure(handle(), Interop.allocateNativeString(functionName).handle(), flags, object.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Closure(References.get(RESULT, true));
    }
    
    /**
     * Add @object to the @builder object pool so it can be
     * referenced just like any other object built by builder.
     */
    public void exposeObject(java.lang.String name, org.gtk.gobject.Object object) {
        gtk_h.gtk_builder_expose_object(handle(), Interop.allocateNativeString(name).handle(), object.handle());
    }
    
    /**
     * Main private entry point for building composite components
     * from template XML.
     * <p>
     * This is exported purely to let <code>gtk-builder-tool</code> validate
     * templates, applications have no need to call this function.
     */
    public boolean extendWithTemplate(org.gtk.gobject.Object object, Type templateType, java.lang.String buffer, long length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_extend_with_template(handle(), object.handle(), templateType.getValue(), Interop.allocateNativeString(buffer).handle(), length, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the current object set via gtk_builder_set_current_object().
     */
    public org.gtk.gobject.Object getCurrentObject() {
        var RESULT = gtk_h.gtk_builder_get_current_object(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets the object named @name.
     * 
     * Note that this function does not increment the reference count
     * of the returned object.
     */
    public org.gtk.gobject.Object getObject(java.lang.String name) {
        var RESULT = gtk_h.gtk_builder_get_object(handle(), Interop.allocateNativeString(name).handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets all objects that have been constructed by @builder.
     * 
     * Note that this function does not increment the reference
     * counts of the returned objects.
     */
    public org.gtk.glib.SList getObjects() {
        var RESULT = gtk_h.gtk_builder_get_objects(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Gets the scope in use that was set via gtk_builder_set_scope().
     */
    public BuilderScope getScope() {
        var RESULT = gtk_h.gtk_builder_get_scope(handle());
        return new BuilderScope.BuilderScopeImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the translation domain of @builder.
     */
    public java.lang.String getTranslationDomain() {
        var RESULT = gtk_h.gtk_builder_get_translation_domain(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Looks up a type by name.
     * <p>
     * This is using the virtual function that <code>GtkBuilder</code> has
     * for that purpose. This is mainly used when implementing
     * the <code>GtkBuildable</code> interface on a type.
     */
    public org.gtk.gobject.Type getTypeFromName(java.lang.String typeName) {
        var RESULT = gtk_h.gtk_builder_get_type_from_name(handle(), Interop.allocateNativeString(typeName).handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Sets the current object for the @builder.
     * <p>
     * The current object can be thought of as the <code>this</code> object that the
     * builder is working for and will often be used as the default object
     * when an object is optional.
     * 
     * {@link org.gtk.gtk.Widget<code>#initTemplate</code>  for example will set the current
     * object to the widget the template is inited for. For functions like
     * {@link [ctor@Gtk.Builder.new_from_resource] (ref=ctor)}, the current object will be <code>null</code>
     */
    public void setCurrentObject(org.gtk.gobject.Object currentObject) {
        gtk_h.gtk_builder_set_current_object(handle(), currentObject.handle());
    }
    
    /**
     * Sets the scope the builder should operate in.
     * 
     * If @scope is <code>null</code>  a new {@link org.gtk.gtk.BuilderCScope} will be created.
     */
    public void setScope(BuilderScope scope) {
        gtk_h.gtk_builder_set_scope(handle(), scope.handle());
    }
    
    /**
     * Sets the translation domain of @builder.
     */
    public void setTranslationDomain(java.lang.String domain) {
        gtk_h.gtk_builder_set_translation_domain(handle(), Interop.allocateNativeString(domain).handle());
    }
    
    /**
     * Demarshals a value from a string.
     * <p>
     * This function calls g_value_init() on the @value argument,
     * so it need not be initialised beforehand.
     * <p>
     * Can handle char, uchar, boolean, int, uint, long,
     * ulong, enum, flags, float, double, string, <code>GdkRGBA</code> and<code>GtkAdjustment</code> type values.
     * <p>
     * Upon errors <code>false</code> will be returned and @error will be
     * assigned a <code>GError</code> from the <code>GTK_BUILDER_ERROR</code> domain.
     */
    public boolean valueFromString(org.gtk.gobject.ParamSpec pspec, java.lang.String string, org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_value_from_string(handle(), pspec.handle(), Interop.allocateNativeString(string).handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Demarshals a value from a string.
     * <p>
     * Unlike {@link org.gtk.gtk.Builder<code>#valueFromString</code> , this function
     * takes a <code>GType</code> instead of <code>GParamSpec</code>.
     * <p>
     * Calls g_value_init() on the @value argument, so it
     * need not be initialised beforehand.
     * <p>
     * Upon errors <code>false</code> will be returned and @error will be
     * assigned a <code>GError</code> from the <code>GTK_BUILDER_ERROR</code> domain.
     */
    public boolean valueFromStringType(Type type, java.lang.String string, org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_builder_value_from_string_type(handle(), type.getValue(), Interop.allocateNativeString(string).handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
