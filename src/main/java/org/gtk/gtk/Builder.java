package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkBuilder} reads XML descriptions of a user interface and
 * instantiates the described objects.
 * <p>
 * To create a {@code GtkBuilder} from a user interface description, call
 * {@link Builder#newFromFile}, {@link Builder#newFromResource}
 * or {@link Builder#newFromString}.
 * <p>
 * In the (unusual) case that you want to add user interface
 * descriptions from multiple sources to the same {@code GtkBuilder} you can
 * call {@link Builder#Builder} to get an empty builder and populate it by
 * (multiple) calls to {@link Builder#addFromFile},
 * {@link Builder#addFromResource} or
 * {@link Builder#addFromString}.
 * <p>
 * A {@code GtkBuilder} holds a reference to all objects that it has constructed
 * and drops these references when it is finalized. This finalization can
 * cause the destruction of non-widget objects or widgets which are not
 * contained in a toplevel window. For toplevel windows constructed by a
 * builder, it is the responsibility of the user to call
 * {@link Window#destroy} to get rid of them and all the widgets
 * they contain.
 * <p>
 * The functions {@link Builder#getObject} and
 * {@link Builder#getObjects} can be used to access the widgets in
 * the interface by the names assigned to them inside the UI description.
 * Toplevel windows returned by these functions will stay around until the
 * user explicitly destroys them with {@link Window#destroy}. Other
 * widgets will either be part of a larger hierarchy constructed by the
 * builder (in which case you should not have to worry about their lifecycle),
 * or without a parent, in which case they have to be added to some container
 * to make use of them. Non-widget objects need to be reffed with
 * g_object_ref() to keep them beyond the lifespan of the builder.
 * <p>
 * <strong>GtkBuilder UI Definitions</strong><br/>
 * {@code GtkBuilder} parses textual descriptions of user interfaces which are
 * specified in XML format. We refer to these descriptions as “GtkBuilder
 * UI definitions” or just “UI definitions” if the context is clear.
 * <p>
 * The toplevel element is {@code <interface>}. It optionally takes a “domain”
 * attribute, which will make the builder look for translated strings
 * using {@code dgettext()} in the domain specified. This can also be done by
 * calling {@link Builder#setTranslationDomain} on the builder.
 * <p>
 * Objects are described by {@code <object>} elements, which can contain
 * {@code <property>} elements to set properties, {@code <signal>} elements which
 * connect signals to handlers, and {@code <child>} elements, which describe
 * child objects (most often widgets inside a container, but also e.g.
 * actions in an action group, or columns in a tree model). A {@code <child>}
 * element contains an {@code <object>} element which describes the child object.
 * <p>
 * The target toolkit version(s) are described by {@code <requires>} elements,
 * the “lib” attribute specifies the widget library in question (currently
 * the only supported value is “gtk”) and the “version” attribute specifies
 * the target version in the form “{@code <major>}.{@code <minor>}”. {@code GtkBuilder} will
 * error out if the version requirements are not met.
 * <p>
 * Typically, the specific kind of object represented by an {@code <object>}
 * element is specified by the “class” attribute. If the type has not
 * been loaded yet, GTK tries to find the {@code get_type()} function from the
 * class name by applying heuristics. This works in most cases, but if
 * necessary, it is possible to specify the name of the {@code get_type()}
 * function explicitly with the "type-func" attribute.
 * <p>
 * Objects may be given a name with the “id” attribute, which allows the
 * application to retrieve them from the builder with
 * {@link Builder#getObject}. An id is also necessary to use the
 * object as property value in other parts of the UI definition. GTK
 * reserves ids starting and ending with {@code ___} (three consecutive
 * underscores) for its own purposes.
 * <p>
 * Setting properties of objects is pretty straightforward with the
 * {@code <property>} element: the “name” attribute specifies the name of the
 * property, and the content of the element specifies the value.
 * If the “translatable” attribute is set to a true value, GTK uses
 * {@code gettext()} (or {@code dgettext()} if the builder has a translation domain set)
 * to find a translation for the value. This happens before the value
 * is parsed, so it can be used for properties of any type, but it is
 * probably most useful for string properties. It is also possible to
 * specify a context to disambiguate short strings, and comments which
 * may help the translators.
 * <p>
 * {@code GtkBuilder} can parse textual representations for the most common
 * property types: characters, strings, integers, floating-point numbers,
 * booleans (strings like “TRUE”, “t”, “yes”, “y”, “1” are interpreted
 * as {@code true}, strings like “FALSE”, “f”, “no”, “n”, “0” are interpreted
 * as {@code false}), enumerations (can be specified by their name, nick or
 * integer value), flags (can be specified by their name, nick, integer
 * value, optionally combined with “|”, e.g.
 * “GTK_INPUT_HINT_EMOJI|GTK_INPUT_HINT_LOWERCASE”)
 * and colors (in a format understood by {@link org.gtk.gdk.RGBA#parse}).
 * <p>
 * {@code GVariant}s can be specified in the format understood by
 * g_variant_parse(), and pixbufs can be specified as a filename of an
 * image file to load.
 * <p>
 * Objects can be referred to by their name and by default refer to
 * objects declared in the local XML fragment and objects exposed via
 * {@link Builder#exposeObject}. In general, {@code GtkBuilder} allows
 * forward references to objects — declared in the local XML; an object
 * doesn’t have to be constructed before it can be referred to. The
 * exception to this rule is that an object has to be constructed before
 * it can be used as the value of a construct-only property.
 * <p>
 * It is also possible to bind a property value to another object's
 * property value using the attributes "bind-source" to specify the
 * source object of the binding, and optionally, "bind-property" and
 * "bind-flags" to specify the source property and source binding flags
 * respectively. Internally, {@code GtkBuilder} implements this using {@code GBinding}
 * objects. For more information see g_object_bind_property().
 * <p>
 * Sometimes it is necessary to refer to widgets which have implicitly
 * been constructed by GTK as part of a composite widget, to set
 * properties on them or to add further children (e.g. the content area
 * of a {@code GtkDialog}). This can be achieved by setting the “internal-child”
 * property of the {@code <child>} element to a true value. Note that {@code GtkBuilder}
 * still requires an {@code <object>} element for the internal child, even if it
 * has already been constructed.
 * <p>
 * A number of widgets have different places where a child can be added
 * (e.g. tabs vs. page content in notebooks). This can be reflected in
 * a UI definition by specifying the “type” attribute on a {@code <child>}
 * The possible values for the “type” attribute are described in the
 * sections describing the widget-specific portions of UI definitions.
 * <p>
 * <strong>Signal handlers and function pointers</strong><br/>
 * Signal handlers are set up with the {@code <signal>} element. The “name”
 * attribute specifies the name of the signal, and the “handler” attribute
 * specifies the function to connect to the signal.
 * The remaining attributes, “after”, “swapped” and “object”, have the
 * same meaning as the corresponding parameters of the
 * g_signal_connect_object() or g_signal_connect_data() functions. A
 * “last_modification_time” attribute is also allowed, but it does not
 * have a meaning to the builder.
 * <p>
 * If you rely on {@code GModule} support to lookup callbacks in the symbol table,
 * the following details should be noted:
 * <p>
 * When compiling applications for Windows, you must declare signal callbacks
 * with {@code G_MODULE_EXPORT}, or they will not be put in the symbol table.
 * On Linux and Unix, this is not necessary; applications should instead
 * be compiled with the -Wl,--export-dynamic {@code CFLAGS}, and linked against
 * {@code gmodule-export-2.0}.
 * <p>
 * <strong>A GtkBuilder UI Definition</strong><br/>
 * <pre>{@code xml
 * <interface>
 *   <object class="GtkDialog" id="dialog1">
 *     <child internal-child="content_area">
 *       <object class="GtkBox" id="vbox1">
 *         <child internal-child="action_area">
 *           <object class="GtkBox" id="hbuttonbox1">
 *             <child>
 *               <object class="GtkButton" id="ok_button">
 *                 <property name="label" translatable="yes">_Ok</property>
 *                 <property name="use-underline">True</property>
 *                 <signal name="clicked" handler="ok_button_clicked"/>
 *               </object>
 *             </child>
 *           </object>
 *         </child>
 *       </object>
 *     </child>
 *   </object>
 * </interface>
 * }</pre>
 * <p>
 * Beyond this general structure, several object classes define their
 * own XML DTD fragments for filling in the ANY placeholders in the DTD
 * above. Note that a custom element in a &lt;child&gt; element gets parsed by
 * the custom tag handler of the parent object, while a custom element in
 * an &lt;object&gt; element gets parsed by the custom tag handler of the object.
 * <p>
 * These XML fragments are explained in the documentation of the
 * respective objects.
 * <p>
 * A {@code <template>} tag can be used to define a widget class’s components.
 * See the <a href="class.Widget.html#building-composite-widgets-from-template-xml">GtkWidget documentation</a> for details.
 */
public class Builder extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilder";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Builder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Builder(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Builder if its GType is a (or inherits from) "GtkBuilder".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Builder} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuilder", a ClassCastException will be thrown.
     */
    public static Builder castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Builder.getType())) {
            return new Builder(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuilder");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty builder object.
     * <p>
     * This function is only useful if you intend to make multiple calls
     * to {@link Builder#addFromFile}, {@link Builder#addFromResource}
     * or {@link Builder#addFromString} in order to merge multiple UI
     * descriptions into a single builder.
     */
    public Builder() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromFile(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_new_from_file.invokeExact(
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses the UI definition in the file {@code filename}.
     * <p>
     * If there is an error opening the file or parsing the description then
     * the program will be aborted. You should only ever attempt to parse
     * user interface descriptions that are shipped as part of your program.
     * @param filename filename of user interface description file
     * @return a {@code GtkBuilder} containing the described interface
     */
    public static Builder newFromFile(@NotNull java.lang.String filename) {
        return new Builder(constructNewFromFile(filename), Ownership.FULL);
    }
    
    private static Addressable constructNewFromResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_new_from_resource.invokeExact(
                    Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses the UI definition at {@code resource_path}.
     * <p>
     * If there is an error locating the resource or parsing the
     * description, then the program will be aborted.
     * @param resourcePath a {@code GResource} resource path
     * @return a {@code GtkBuilder} containing the described interface
     */
    public static Builder newFromResource(@NotNull java.lang.String resourcePath) {
        return new Builder(constructNewFromResource(resourcePath), Ownership.FULL);
    }
    
    private static Addressable constructNewFromString(@NotNull java.lang.String string, long length) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_new_from_string.invokeExact(
                    Interop.allocateNativeString(string),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses the UI definition in {@code string}.
     * <p>
     * If {@code string} is {@code null}-terminated, then {@code length} should be -1.
     * If {@code length} is not -1, then it is the length of {@code string}.
     * <p>
     * If there is an error parsing {@code string} then the program will be
     * aborted. You should not attempt to parse user interface description
     * from untrusted sources.
     * @param string a user interface (XML) description
     * @param length the length of {@code string}, or -1
     * @return a {@code GtkBuilder} containing the interface described by {@code string}
     */
    public static Builder newFromString(@NotNull java.lang.String string, long length) {
        return new Builder(constructNewFromString(string, length), Ownership.FULL);
    }
    
    /**
     * Parses a file containing a UI definition and merges it with
     * the current contents of {@code builder}.
     * <p>
     * This function is useful if you need to call
     * {@link Builder#setCurrentObject}) to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want {@link Builder#newFromFile} instead.
     * <p>
     * If an error occurs, 0 will be returned and {@code error} will be assigned a
     * {@code GError} from the {@code GTK_BUILDER_ERROR}, {@code G_MARKUP_ERROR} or {@code G_FILE_ERROR}
     * domains.
     * <p>
     * It’s not really reasonable to attempt to handle failures of this
     * call. You should not use this function with untrusted files (ie:
     * files that are not part of your application). Broken {@code GtkBuilder}
     * files can easily crash your program, and it’s possible that memory
     * was leaked leading up to the reported failure. The only reasonable
     * thing to do when an error is detected is to call {@code g_error()}.
     * @param filename the name of the file to parse
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addFromFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_add_from_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses a resource file containing a UI definition
     * and merges it with the current contents of {@code builder}.
     * <p>
     * This function is useful if you need to call
     * {@link Builder#setCurrentObject} to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want {@link Builder#newFromResource} instead.
     * <p>
     * If an error occurs, 0 will be returned and {@code error} will be assigned a
     * {@code GError} from the {@code GTK_BUILDER_ERROR}, {@code G_MARKUP_ERROR} or {@code G_RESOURCE_ERROR}
     * domain.
     * <p>
     * It’s not really reasonable to attempt to handle failures of this
     * call.  The only reasonable thing to do when an error is detected is
     * to call g_error().
     * @param resourcePath the path of the resource file to parse
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addFromResource(@NotNull java.lang.String resourcePath) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_add_from_resource.invokeExact(
                    handle(),
                    Interop.allocateNativeString(resourcePath),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses a string containing a UI definition and merges it
     * with the current contents of {@code builder}.
     * <p>
     * This function is useful if you need to call
     * {@link Builder#setCurrentObject} to add user data to
     * callbacks before loading {@code GtkBuilder} UI. Otherwise, you probably
     * want {@link Builder#newFromString} instead.
     * <p>
     * Upon errors {@code false} will be returned and {@code error} will be assigned a
     * {@code GError} from the {@code GTK_BUILDER_ERROR}, {@code G_MARKUP_ERROR} or
     * {@code G_VARIANT_PARSE_ERROR} domain.
     * <p>
     * It’s not really reasonable to attempt to handle failures of this
     * call.  The only reasonable thing to do when an error is detected is
     * to call g_error().
     * @param buffer the string to parse
     * @param length the length of {@code buffer} (may be -1 if {@code buffer} is nul-terminated)
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addFromString(@NotNull java.lang.String buffer, long length) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_add_from_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(buffer),
                    length,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses a file containing a UI definition building only the
     * requested objects and merges them with the current contents
     * of {@code builder}.
     * <p>
     * Upon errors, 0 will be returned and {@code error} will be assigned a
     * {@code GError} from the {@code GTK_BUILDER_ERROR}, {@code G_MARKUP_ERROR} or {@code G_FILE_ERROR}
     * domain.
     * <p>
     * If you are adding an object that depends on an object that is not
     * its child (for instance a {@code GtkTreeView} that depends on its
     * {@code GtkTreeModel}), you have to explicitly list all of them in {@code object_ids}.
     * @param filename the name of the file to parse
     * @param objectIds nul-terminated array of objects to build
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addObjectsFromFile(@NotNull java.lang.String filename, @NotNull java.lang.String[] objectIds) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        java.util.Objects.requireNonNull(objectIds, "Parameter 'objectIds' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_add_objects_from_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename),
                    Interop.allocateNativeArray(objectIds, false),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses a resource file containing a UI definition, building
     * only the requested objects and merges them with the current
     * contents of {@code builder}.
     * <p>
     * Upon errors, 0 will be returned and {@code error} will be assigned a
     * {@code GError} from the {@code GTK_BUILDER_ERROR}, {@code G_MARKUP_ERROR} or {@code G_RESOURCE_ERROR}
     * domain.
     * <p>
     * If you are adding an object that depends on an object that is not
     * its child (for instance a {@code GtkTreeView} that depends on its
     * {@code GtkTreeModel}), you have to explicitly list all of them in {@code object_ids}.
     * @param resourcePath the path of the resource file to parse
     * @param objectIds nul-terminated array of objects to build
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addObjectsFromResource(@NotNull java.lang.String resourcePath, @NotNull java.lang.String[] objectIds) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        java.util.Objects.requireNonNull(objectIds, "Parameter 'objectIds' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_add_objects_from_resource.invokeExact(
                    handle(),
                    Interop.allocateNativeString(resourcePath),
                    Interop.allocateNativeArray(objectIds, false),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses a string containing a UI definition, building only the
     * requested objects and merges them with the current contents of
     * {@code builder}.
     * <p>
     * Upon errors {@code false} will be returned and {@code error} will be assigned a
     * {@code GError} from the {@code GTK_BUILDER_ERROR} or {@code G_MARKUP_ERROR} domain.
     * <p>
     * If you are adding an object that depends on an object that is not
     * its child (for instance a {@code GtkTreeView} that depends on its
     * {@code GtkTreeModel}), you have to explicitly list all of them in {@code object_ids}.
     * @param buffer the string to parse
     * @param length the length of {@code buffer} (may be -1 if {@code buffer} is nul-terminated)
     * @param objectIds nul-terminated array of objects to build
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addObjectsFromString(@NotNull java.lang.String buffer, long length, @NotNull java.lang.String[] objectIds) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(objectIds, "Parameter 'objectIds' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_add_objects_from_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(buffer),
                    length,
                    Interop.allocateNativeArray(objectIds, false),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a closure to invoke the function called {@code function_name}.
     * <p>
     * This is using the create_closure() implementation of {@code builder}'s
     * {@code Gtk.BuilderScope}.
     * <p>
     * If no closure could be created, {@code null} will be returned and {@code error}
     * will be set.
     * @param functionName name of the function to look up
     * @param flags closure creation flags
     * @param object Object to create the closure with
     * @return A new closure for invoking {@code function_name}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gobject.Closure createClosure(@NotNull java.lang.String functionName, @NotNull org.gtk.gtk.BuilderClosureFlags flags, @Nullable org.gtk.gobject.Object object) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(functionName, "Parameter 'functionName' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_create_closure.invokeExact(
                    handle(),
                    Interop.allocateNativeString(functionName),
                    flags.getValue(),
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Closure(RESULT, Ownership.FULL);
    }
    
    /**
     * Add {@code object} to the {@code builder} object pool so it can be
     * referenced just like any other object built by builder.
     * <p>
     * Only a single object may be added using {@code name}. However,
     * it is not an error to expose the same object under multiple
     * names. {@code gtk_builder_get_object()} may be used to determine
     * if an object has already been added with {@code name}.
     * @param name the name of the object exposed to the builder
     * @param object the object to expose
     */
    public void exposeObject(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Object object) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        try {
            DowncallHandles.gtk_builder_expose_object.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Main private entry point for building composite components
     * from template XML.
     * <p>
     * Most likely you do not need to call this function in applications as
     * templates are handled by {@code GtkWidget}.
     * @param object the object that is being extended
     * @param templateType the type that the template is for
     * @param buffer the string to parse
     * @param length the length of {@code buffer} (may be -1 if {@code buffer} is nul-terminated)
     * @return A positive value on success, 0 if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean extendWithTemplate(@NotNull org.gtk.gobject.Object object, @NotNull org.gtk.glib.Type templateType, @NotNull java.lang.String buffer, long length) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(templateType, "Parameter 'templateType' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_extend_with_template.invokeExact(
                    handle(),
                    object.handle(),
                    templateType.getValue().longValue(),
                    Interop.allocateNativeString(buffer),
                    length,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the current object set via gtk_builder_set_current_object().
     * @return the current object
     */
    public @Nullable org.gtk.gobject.Object getCurrentObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_get_current_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the object named {@code name}.
     * <p>
     * Note that this function does not increment the reference count
     * of the returned object.
     * @param name name of object to get
     * @return the object named {@code name}
     */
    public @Nullable org.gtk.gobject.Object getObject(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_get_object.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets all objects that have been constructed by {@code builder}.
     * <p>
     * Note that this function does not increment the reference
     * counts of the returned objects.
     * @return a
     *   newly-allocated {@code GSList} containing all the objects
     *   constructed by the {@code GtkBuilder instance}. It should be
     *   freed by g_slist_free()
     */
    public @NotNull org.gtk.glib.SList getObjects() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_get_objects.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Gets the scope in use that was set via gtk_builder_set_scope().
     * @return the current scope
     */
    public @NotNull org.gtk.gtk.BuilderScope getScope() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_get_scope.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BuilderScope.BuilderScopeImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the translation domain of {@code builder}.
     * @return the translation domain
     */
    public @Nullable java.lang.String getTranslationDomain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_get_translation_domain.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Looks up a type by name.
     * <p>
     * This is using the virtual function that {@code GtkBuilder} has
     * for that purpose. This is mainly used when implementing
     * the {@code GtkBuildable} interface on a type.
     * @param typeName type name to lookup
     * @return the {@code GType} found for {@code type_name} or {@code G_TYPE_INVALID}
     *   if no type was found
     */
    public @NotNull org.gtk.glib.Type getTypeFromName(@NotNull java.lang.String typeName) {
        java.util.Objects.requireNonNull(typeName, "Parameter 'typeName' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_builder_get_type_from_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(typeName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Sets the current object for the {@code builder}.
     * <p>
     * The current object can be thought of as the {@code this} object that the
     * builder is working for and will often be used as the default object
     * when an object is optional.
     * <p>
     * {@link Widget#initTemplate} for example will set the current
     * object to the widget the template is inited for. For functions like
     * {@link Builder#newFromResource}, the current object will be {@code null}.
     * @param currentObject the new current object
     */
    public void setCurrentObject(@Nullable org.gtk.gobject.Object currentObject) {
        try {
            DowncallHandles.gtk_builder_set_current_object.invokeExact(
                    handle(),
                    (Addressable) (currentObject == null ? MemoryAddress.NULL : currentObject.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the scope the builder should operate in.
     * <p>
     * If {@code scope} is {@code null}, a new {@link BuilderCScope} will be created.
     * @param scope the scope to use
     */
    public void setScope(@Nullable org.gtk.gtk.BuilderScope scope) {
        try {
            DowncallHandles.gtk_builder_set_scope.invokeExact(
                    handle(),
                    (Addressable) (scope == null ? MemoryAddress.NULL : scope.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the translation domain of {@code builder}.
     * @param domain the translation domain
     */
    public void setTranslationDomain(@Nullable java.lang.String domain) {
        try {
            DowncallHandles.gtk_builder_set_translation_domain.invokeExact(
                    handle(),
                    (Addressable) (domain == null ? MemoryAddress.NULL : Interop.allocateNativeString(domain)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Demarshals a value from a string.
     * <p>
     * This function calls g_value_init() on the {@code value} argument,
     * so it need not be initialised beforehand.
     * <p>
     * Can handle char, uchar, boolean, int, uint, long,
     * ulong, enum, flags, float, double, string, {@code GdkRGBA} and
     * {@code GtkAdjustment} type values.
     * <p>
     * Upon errors {@code false} will be returned and {@code error} will be
     * assigned a {@code GError} from the {@code GTK_BUILDER_ERROR} domain.
     * @param pspec the {@code GParamSpec} for the property
     * @param string the string representation of the value
     * @param value the {@code GValue} to store the result in
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean valueFromString(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull java.lang.String string, @NotNull org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_value_from_string.invokeExact(
                    handle(),
                    pspec.handle(),
                    Interop.allocateNativeString(string),
                    value.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Demarshals a value from a string.
     * <p>
     * Unlike {@link Builder#valueFromString}, this function
     * takes a {@code GType} instead of {@code GParamSpec}.
     * <p>
     * Calls g_value_init() on the {@code value} argument, so it
     * need not be initialised beforehand.
     * <p>
     * Upon errors {@code false} will be returned and {@code error} will be
     * assigned a {@code GError} from the {@code GTK_BUILDER_ERROR} domain.
     * @param type the {@code GType} of the value
     * @param string the string representation of the value
     * @param value the {@code GValue} to store the result in
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean valueFromStringType(@NotNull org.gtk.glib.Type type, @NotNull java.lang.String string, @NotNull org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_value_from_string_type.invokeExact(
                    handle(),
                    type.getValue().longValue(),
                    Interop.allocateNativeString(string),
                    value.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_builder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Builder.Build} object constructs a {@link Builder} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Builder} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Builder} using {@link Builder#castFrom}.
         * @return A new instance of {@code Builder} with the properties 
         *         that were set in the Build object.
         */
        public Builder construct() {
            return Builder.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Builder.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The object the builder is evaluating for.
         * @param currentObject The value for the {@code current-object} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCurrentObject(org.gtk.gobject.Object currentObject) {
            names.add("current-object");
            values.add(org.gtk.gobject.Value.create(currentObject));
            return this;
        }
        
        /**
         * The scope the builder is operating in
         * @param scope The value for the {@code scope} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScope(org.gtk.gtk.BuilderScope scope) {
            names.add("scope");
            values.add(org.gtk.gobject.Value.create(scope));
            return this;
        }
        
        /**
         * The translation domain used when translating property values that
         * have been marked as translatable.
         * <p>
         * If the translation domain is {@code null}, {@code GtkBuilder} uses gettext(),
         * otherwise g_dgettext().
         * @param translationDomain The value for the {@code translation-domain} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTranslationDomain(java.lang.String translationDomain) {
            names.add("translation-domain");
            values.add(org.gtk.gobject.Value.create(translationDomain));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_builder_new = Interop.downcallHandle(
            "gtk_builder_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_new_from_file = Interop.downcallHandle(
            "gtk_builder_new_from_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_new_from_resource = Interop.downcallHandle(
            "gtk_builder_new_from_resource",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_new_from_string = Interop.downcallHandle(
            "gtk_builder_new_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_builder_add_from_file = Interop.downcallHandle(
            "gtk_builder_add_from_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_add_from_resource = Interop.downcallHandle(
            "gtk_builder_add_from_resource",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_add_from_string = Interop.downcallHandle(
            "gtk_builder_add_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_add_objects_from_file = Interop.downcallHandle(
            "gtk_builder_add_objects_from_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_add_objects_from_resource = Interop.downcallHandle(
            "gtk_builder_add_objects_from_resource",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_add_objects_from_string = Interop.downcallHandle(
            "gtk_builder_add_objects_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_create_closure = Interop.downcallHandle(
            "gtk_builder_create_closure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_expose_object = Interop.downcallHandle(
            "gtk_builder_expose_object",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_extend_with_template = Interop.downcallHandle(
            "gtk_builder_extend_with_template",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_current_object = Interop.downcallHandle(
            "gtk_builder_get_current_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_object = Interop.downcallHandle(
            "gtk_builder_get_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_objects = Interop.downcallHandle(
            "gtk_builder_get_objects",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_scope = Interop.downcallHandle(
            "gtk_builder_get_scope",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_translation_domain = Interop.downcallHandle(
            "gtk_builder_get_translation_domain",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_type_from_name = Interop.downcallHandle(
            "gtk_builder_get_type_from_name",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_set_current_object = Interop.downcallHandle(
            "gtk_builder_set_current_object",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_set_scope = Interop.downcallHandle(
            "gtk_builder_set_scope",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_set_translation_domain = Interop.downcallHandle(
            "gtk_builder_set_translation_domain",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_value_from_string = Interop.downcallHandle(
            "gtk_builder_value_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_value_from_string_type = Interop.downcallHandle(
            "gtk_builder_value_from_string_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_get_type = Interop.downcallHandle(
            "gtk_builder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
