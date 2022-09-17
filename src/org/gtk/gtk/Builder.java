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
 * (multiple) calls to {@link org.gtk.gtk.Builder#addFromFile},
 * {@link org.gtk.gtk.Builder#addFromResource} or
 * {@link org.gtk.gtk.Builder#addFromString}.
 * <p>
 * A <code>GtkBuilder</code> holds a reference to all objects that it has constructed
 * and drops these references when it is finalized. This finalization can
 * cause the destruction of non-widget objects or widgets which are not
 * contained in a toplevel window. For toplevel windows constructed by a
 * builder, it is the responsibility of the user to call
 * {@link org.gtk.gtk.Window#destroy} to get rid of them and all the widgets
 * they contain.
 * <p>
 * The functions {@link org.gtk.gtk.Builder#getObject} and
 * {@link org.gtk.gtk.Builder#getObjects} can be used to access the widgets in
 * the interface by the names assigned to them inside the UI description.
 * Toplevel windows returned by these functions will stay around until the
 * user explicitly destroys them with {@link org.gtk.gtk.Window#destroy}. Other
 * widgets will either be part of a larger hierarchy constructed by the
 * builder (in which case you should not have to worry about their lifecycle),
 * or without a parent, in which case they have to be added to some container
 * to make use of them. Non-widget objects need to be reffed with
 * g_object_ref() to keep them beyond the lifespan of the builder.
 * <p>
 * <h1>tkBuilder UI Definitions</h1>
 * <p><code>GtkBuilder</code> parses textual descriptions of user interfaces which are
 * specified in XML format. We refer to these descriptions as &#8220;GtkBuilder
 * UI definitions&#8221; or just &#8220;UI definitions&#8221; if the context is clear.
 * <p>
 * The toplevel element is <code>&#60;interface&#62;</code>. It optionally takes a &#8220;domain&#8221;
 * attribute, which will make the builder look for translated strings
 * using <code>dgettext()</code> in the domain specified. This can also be done by
 * calling {@link org.gtk.gtk.Builder#setTranslationDomain} on the builder.
 * <p>
 * Objects are described by <code>&#60;object&#62;</code> elements, which can contain<code>&#60;property&#62;</code> elements to set properties, <code>&#60;signal&#62;</code> elements which
 * connect signals to handlers, and <code>&#60;child&#62;</code> elements, which describe
 * child objects (most often widgets inside a container, but also e.g.
 * actions in an action group, or columns in a tree model). A <code>&#60;child&#62;</code>
 * element contains an <code>&#60;object&#62;</code> element which describes the child object.
 * <p>
 * The target toolkit version(s) are described by <code>&#60;requires&#62;</code> elements,
 * the &#8220;lib&#8221; attribute specifies the widget library in question (currently
 * the only supported value is &#8220;gtk&#8221;) and the &#8220;version&#8221; attribute specifies
 * the target version in the form &#8220;<code>&#60;major&#62;</code>.<code>&#60;minor&#62;</code>&#8221;. <code>GtkBuilder</code> will
 * error out if the version requirements are not met.
 * <p>
 * Typically, the specific kind of object represented by an <code>&#60;object&#62;</code>
 * element is specified by the &#8220;class&#8221; attribute. If the type has not
 * been loaded yet, GTK tries to find the <code>get_type()</code> function from the
 * class name by applying heuristics. This works in most cases, but if
 * necessary, it is possible to specify the name of the <code>get_type()</code>
 * function explicitly with the &#34;type-func&#34; attribute.
 * <p>
 * Objects may be given a name with the &#8220;id&#8221; attribute, which allows the
 * application to retrieve them from the builder with
 * {@link org.gtk.gtk.Builder#getObject}. An id is also necessary to use the
 * object as property value in other parts of the UI definition. GTK
 * reserves ids starting and ending with <code>___</code> (three consecutive
 * underscores) for its own purposes.
 * <p>
 * Setting properties of objects is pretty straightforward with the<code>&#60;property&#62;</code> element: the &#8220;name&#8221; attribute specifies the name of the
 * property, and the content of the element specifies the value.
 * If the &#8220;translatable&#8221; attribute is set to a true value, GTK uses<code>gettext()</code> (or <code>dgettext()</code> if the builder has a translation domain set)
 * to find a translation for the value. This happens before the value
 * is parsed, so it can be used for properties of any type, but it is
 * probably most useful for string properties. It is also possible to
 * specify a context to disambiguate short strings, and comments which
 * may help the translators.
 * <p><code>GtkBuilder</code> can parse textual representations for the most common
 * property types: characters, strings, integers, floating-point numbers,
 * booleans (strings like &#8220;TRUE&#8221;, &#8220;t&#8221;, &#8220;yes&#8221;, &#8220;y&#8221;, &#8220;1&#8221; are interpreted
 * as <code>TRUE,</code> strings like &#8220;FALSE&#8221;, &#8220;f&#8221;, &#8220;no&#8221;, &#8220;n&#8221;, &#8220;0&#8221; are interpreted
 * as <code>FALSE),</code> enumerations (can be specified by their name, nick or
 * integer value), flags (can be specified by their name, nick, integer
 * value, optionally combined with &#8220;|&#8221;, e.g.
 * &#8220;GTK_INPUT_HINT_EMOJI|GTK_INPUT_HINT_LOWERCASE&#8221;)
 * and colors (in a format understood by {@link org.gtk.gdk.RGBA#parse}).
 * <p><code>GVariant</code>s can be specified in the format understood by
 * g_variant_parse(), and pixbufs can be specified as a filename of an
 * image file to load.
 * <p>
 * Objects can be referred to by their name and by default refer to
 * objects declared in the local XML fragment and objects exposed via
 * {@link org.gtk.gtk.Builder#exposeObject}. In general, <code>GtkBuilder</code> allows
 * forward references to objects &#8212; declared in the local XML; an object
 * doesn&#8217;t have to be constructed before it can be referred to. The
 * exception to this rule is that an object has to be constructed before
 * it can be used as the value of a construct-only property.
 * <p>
 * It is also possible to bind a property value to another object&#39;s
 * property value using the attributes &#34;bind-source&#34; to specify the
 * source object of the binding, and optionally, &#34;bind-property&#34; and
 * &#34;bind-flags&#34; to specify the source property and source binding flags
 * respectively. Internally, <code>GtkBuilder</code> implements this using <code>GBinding</code>
 * objects. For more information see g_object_bind_property().
 * <p>
 * Sometimes it is necessary to refer to widgets which have implicitly
 * been constructed by GTK as part of a composite widget, to set
 * properties on them or to add further children (e.g. the content area
 * of a <code>GtkDialog</code>). This can be achieved by setting the &#8220;internal-child&#8221;
 * property of the <code>&#60;child&#62;</code> element to a true value. Note that <code>GtkBuilder</code>
 * still requires an <code>&#60;object&#62;</code> element for the internal child, even if it
 * has already been constructed.
 * <p>
 * A number of widgets have different places where a child can be added
 * (e.g. tabs vs. page content in notebooks). This can be reflected in
 * a UI definition by specifying the &#8220;type&#8221; attribute on a <code>&#60;child&#62;</code>
 * The possible values for the &#8220;type&#8221; attribute are described in the
 * sections describing the widget-specific portions of UI definitions.
 * <p>
 * <h1>ignal handlers and function pointers</h1>
 * <p>
 * Signal handlers are set up with the <code>&#60;signal&#62;</code> element. The &#8220;name&#8221;
 * attribute specifies the name of the signal, and the &#8220;handler&#8221; attribute
 * specifies the function to connect to the signal.
 * The remaining attributes, &#8220;after&#8221;, &#8220;swapped&#8221; and &#8220;object&#8221;, have the
 * same meaning as the corresponding parameters of the
 * g_signal_connect_object() or g_signal_connect_data() functions. A
 * &#8220;last_modification_time&#8221; attribute is also allowed, but it does not
 * have a meaning to the builder.
 * <p>
 * If you rely on <code>GModule</code> support to lookup callbacks in the symbol table,
 * the following details should be noted:
 * <p>
 * When compiling applications for Windows, you must declare signal callbacks
 * with <code>G_MODULE_EXPORT,</code> or they will not be put in the symbol table.
 * On Linux and Unix, this is not necessary; applications should instead
 * be compiled with the -Wl,--export-dynamic <code>CFLAGS</code>, and linked against<code>gmodule-export-2.0</code>.
 * <p>
 * <h1>GtkBuilder UI Definition</h1>
 * <p><pre>xml
 * &#60;interface&#62;
 *   &#60;object class=&#34;GtkDialog&#34; id=&#34;dialog1&#34;&#62;
 *     &#60;child internal-child=&#34;content_area&#34;&#62;
 *       &#60;object class=&#34;GtkBox&#34; id=&#34;vbox1&#34;&#62;
 *         &#60;child internal-child=&#34;action_area&#34;&#62;
 *           &#60;object class=&#34;GtkBox&#34; id=&#34;hbuttonbox1&#34;&#62;
 *             &#60;child&#62;
 *               &#60;object class=&#34;GtkButton&#34; id=&#34;ok_button&#34;&#62;
 *                 &#60;property name=&#34;label&#34; translatable=&#34;yes&#34;&#62;_Ok&#60;/property&#62;
 *                 &#60;property name=&#34;use-underline&#34;&#62;True&#60;/property&#62;
 *                 &#60;signal name=&#34;clicked&#34; handler=&#34;ok_button_clicked&#34;/&#62;
 *               &#60;/object&#62;
 *             &#60;/child&#62;
 *           &#60;/object&#62;
 *         &#60;/child&#62;
 *       &#60;/object&#62;
 *     &#60;/child&#62;
 *   &#60;/object&#62;
 * &#60;/interface&#62;
 * </pre>
 * <p>
 * Beyond this general structure, several object classes define their
 * own XML DTD fragments for filling in the ANY placeholders in the DTD
 * above. Note that a custom element in a &#60;child&#62; element gets parsed by
 * the custom tag handler of the parent object, while a custom element in
 * an &#60;object&#62; element gets parsed by the custom tag handler of the object.
 * <p>
 * These XML fragments are explained in the documentation of the
 * respective objects.
 * <p>
 * A <code>&#60;template&#62;</code> tag can be used to define a widget class&#8217;s components.
 * See the {@link [GtkWidget documentation]}(class.Widget.html#building-composite-widgets-from-template-xml) for details.
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
     * to {@link org.gtk.gtk.Builder#addFromFile}, {@link org.gtk.gtk.Builder#addFromResource}
     * or {@link org.gtk.gtk.Builder#addFromString} in order to merge multiple UI
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
     * If @string is <code>NULL-terminated,</code> then @length should be -1.
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
     * {@link org.gtk.gtk.Builder#setCurrentObject}) to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want {@link [ctor@Gtk.Builder.new_from_file] (ref=ctor)} instead.
     * <p>
     * If an error occurs, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR</code>, <code>G_MARKUP_ERROR</code> or <code>G_FILE_ERROR</code>
     * domains.
     * <p>
     * It&#8217;s not really reasonable to attempt to handle failures of this
     * call. You should not use this function with untrusted files (ie:
     * files that are not part of your application). Broken <code>GtkBuilder</code>
     * files can easily crash your program, and it&#8217;s possible that memory
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
     * {@link org.gtk.gtk.Builder#setCurrentObject} to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want {@link [ctor@Gtk.Builder.new_from_resource] (ref=ctor)} instead.
     * <p>
     * If an error occurs, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR,</code> <code>G_MARKUP_ERROR</code> or <code>G_RESOURCE_ERROR
     * domain.
     * 
     * It&#8217;s</code> not really reasonable to attempt to handle failures of this
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
     * {@link org.gtk.gtk.Builder#setCurrentObject} to add user data to
     * callbacks before loading <code>GtkBuilder</code> UI. Otherwise, you probably
     * want {@link [ctor@Gtk.Builder.new_from_string] (ref=ctor)} instead.
     * <p>
     * Upon errors <code>false</code> will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR,</code> <code>G_MARKUP_ERROR</code> or
     * <code>G_VARIANT_PARSE_ERROR</code> domain.
     * 
     * It&#8217;s not really reasonable to attempt to handle failures of this
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
     * Upon errors, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR,</code> <code>G_MARKUP_ERROR</code> or <code>G_FILE_ERROR
     * domain.
     * <p>
     * If</code> you are adding an object that depends on an object that is not
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
     * Upon errors, 0 will be returned and @error will be assigned a<code>GError</code> from the <code>GTK_BUILDER_ERROR,</code> <code>G_MARKUP_ERROR</code> or <code>G_RESOURCE_ERROR
     * domain.
     * <p>
     * If</code> you are adding an object that depends on an object that is not
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
     * This is using the create_closure() implementation of @builder&#39;s
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
     * {@link org.gtk.gtk.Widget#initTemplate} for example will set the current
     * object to the widget the template is inited for. For functions like
     * {@link [ctor@Gtk.Builder.new_from_resource] (ref=ctor)}, the current object will be 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Sets the current object for the @builder.
     * <p>
     * The current object can be thought of as the <code>this</code> object that the
     * builder is working for and will often be used as the default object
     * when an object is optional.
     * 
     * {@link org.gtk.gtk.Widget#initTemplate} for example will set the current
     * object to the widget the template is inited for. For functions like
     * {@link [ctor@Gtk.Builder.new_from_resource] (ref=ctor)}, the current object will be %NULL.
     */
    public void setCurrentObject(org.gtk.gobject.Object currentObject) {
        gtk_h.gtk_builder_set_current_object(handle(), currentObject.handle());
    }
    
    /**
     * Sets the scope the builder should operate in.
     * 
     * If @scope is <code>NULL,</code> a new {@link org.gtk.gtk.BuilderCScope} will be created.
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
     * Unlike {@link org.gtk.gtk.Builder#valueFromString}, this function
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
