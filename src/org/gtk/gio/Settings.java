package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Settings} class provides a convenient API for storing and retrieving
 * application settings.
 * <p>
 * Reads and writes can be considered to be non-blocking.  Reading
 * settings with {@link Settings} is typically extremely fast: on
 * approximately the same order of magnitude (but slower than) a
 * {@link org.gtk.glib.HashTable} lookup.  Writing settings is also extremely fast in terms
 * of time to return to your application, but can be extremely expensive
 * for other threads and other processes.  Many settings backends
 * (including dconf) have lazy initialisation which means in the common
 * case of the user using their computer without modifying any settings
 * a lot of work can be avoided.  For dconf, the D-Bus service doesn't
 * even need to be started in this case.  For this reason, you should
 * only ever modify {@link Settings} keys in response to explicit user action.
 * Particular care should be paid to ensure that modifications are not
 * made during startup -- for example, when setting the initial value
 * of preferences widgets.  The built-in g_settings_bind() functionality
 * is careful not to write settings in response to notify signals as a
 * result of modifications that it makes to widgets.
 * <p>
 * When creating a GSettings instance, you have to specify a schema
 * that describes the keys in your settings and their types and default
 * values, as well as some other information.
 * <p>
 * Normally, a schema has a fixed path that determines where the settings
 * are stored in the conceptual global tree of settings. However, schemas
 * can also be '[relocatable][gsettings-relocatable]', i.e. not equipped with
 * a fixed path. This is
 * useful e.g. when the schema describes an 'account', and you want to be
 * able to store a arbitrary number of accounts.
 * <p>
 * Paths must start with and end with a forward slash character ('/')
 * and must not contain two sequential slash characters.  Paths should
 * be chosen based on a domain name associated with the program or
 * library to which the settings belong.  Examples of paths are
 * "/org/gtk/settings/file-chooser/" and "/ca/desrt/dconf-editor/".
 * Paths should not start with "/apps/", "/desktop/" or "/system/" as
 * they often did in GConf.
 * <p>
 * Unlike other configuration systems (like GConf), GSettings does not
 * restrict keys to basic types like strings and numbers. GSettings stores
 * values as {@link org.gtk.glib.Variant}, and allows any {@link org.gtk.glib.VariantType} for keys. Key names
 * are restricted to lowercase characters, numbers and '-'. Furthermore,
 * the names must begin with a lowercase character, must not end
 * with a '-', and must not contain consecutive dashes.
 * <p>
 * Similar to GConf, the default values in GSettings schemas can be
 * localized, but the localized values are stored in gettext catalogs
 * and looked up with the domain that is specified in the
 * {@code gettext-domain} attribute of the &lt;schemalist> or <schema&gt;
 * elements and the category that is specified in the {@code l10n} attribute of
 * the &lt;default&gt; element. The string which is translated includes all text in
 * the &lt;default&gt; element, including any surrounding quotation marks.
 * <p>
 * The {@code l10n} attribute must be set to {@code messages} or {@code time}, and sets the
 * [locale category for
 * translation](https://www.gnu.org/software/gettext/manual/html_node/Aspects.html{@code index}-locale-categories-1).
 * The {@code messages} category should be used by default; use {@code time} for
 * translatable date or time formats. A translation comment can be added as an
 * XML comment immediately above the &lt;default&gt; element — it is recommended to
 * add these comments to aid translators understand the meaning and
 * implications of the default value. An optional translation {@code context}
 * attribute can be set on the &lt;default&gt; element to disambiguate multiple
 * defaults which use the same string.
 * <p>
 * For example:
 * |[
 *  <!-- Translators: A list of words which are not allowed to be typed, in
 *       GVariant serialization syntax.
 *       See: https://developer.gnome.org/glib/stable/gvariant-text.html -->
 *  &lt;default l10n='messages' context='Banned words'>['bad', 'words']</default&gt;
 * ]|
 * <p>
 * Translations of default values must remain syntactically valid serialized
 * {@code GVariants} (e.g. retaining any surrounding quotation marks) or runtime
 * errors will occur.
 * <p>
 * GSettings uses schemas in a compact binary form that is created
 * by the [glib-compile-schemas][glib-compile-schemas]
 * utility. The input is a schema description in an XML format.
 * <p>
 * A DTD for the gschema XML format can be found here:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/gschema.dtd">gschema.dtd</a>
 * <p>
 * The [glib-compile-schemas][glib-compile-schemas] tool expects schema
 * files to have the extension {@code .gschema.xml}.
 * <p>
 * At runtime, schemas are identified by their id (as specified in the
 * id attribute of the &lt;schema&gt; element). The convention for schema
 * ids is to use a dotted name, similar in style to a D-Bus bus name,
 * e.g. "org.gnome.SessionManager". In particular, if the settings are
 * for a specific service that owns a D-Bus bus name, the D-Bus bus name
 * and schema id should match. For schemas which deal with settings not
 * associated with one named application, the id should not use
 * StudlyCaps, e.g. "org.gnome.font-rendering".
 * <p>
 * In addition to {@link org.gtk.glib.Variant} types, keys can have types that have
 * enumerated types. These can be described by a &lt;choice&gt;,
 * &lt;enum> or <flags&gt; element, as seen in the
 * [example][schema-enumerated]. The underlying type of such a key
 * is string, but you can use g_settings_get_enum(), g_settings_set_enum(),
 * g_settings_get_flags(), g_settings_set_flags() access the numeric values
 * corresponding to the string value of enum and flags keys.
 * <p>
 * An example for default value:
 * |[
 * &lt;schemalist&gt;
 *   &lt;schema id="org.gtk.Test" path="/org/gtk/Test/" gettext-domain="test"&gt;
 * <p>
 *     &lt;key name="greeting" type="s"&gt;
 *       &lt;default l10n="messages">"Hello, earthlings"</default&gt;
 *       &lt;summary>A greeting</summary&gt;
 *       &lt;description&gt;
 *         Greeting of the invading martians
 *       &lt;/description&gt;
 *     &lt;/key&gt;
 * <p>
 *     &lt;key name="box" type="(ii)"&gt;
 *       &lt;default>(20,30)</default&gt;
 *     &lt;/key&gt;
 * <p>
 *     &lt;key name="empty-string" type="s"&gt;
 *       &lt;default>""</default&gt;
 *       &lt;summary>Empty strings have to be provided in GVariant form</summary&gt;
 *     &lt;/key&gt;
 * <p>
 *   &lt;/schema&gt;
 * &lt;/schemalist&gt;
 * ]|
 * <p>
 * An example for ranges, choices and enumerated types:
 * |[
 * &lt;schemalist&gt;
 * <p>
 *   &lt;enum id="org.gtk.Test.myenum"&gt;
 *     &lt;value nick="first" value="1"/&gt;
 *     &lt;value nick="second" value="2"/&gt;
 *   &lt;/enum&gt;
 * <p>
 *   &lt;flags id="org.gtk.Test.myflags"&gt;
 *     &lt;value nick="flag1" value="1"/&gt;
 *     &lt;value nick="flag2" value="2"/&gt;
 *     &lt;value nick="flag3" value="4"/&gt;
 *   &lt;/flags&gt;
 * <p>
 *   &lt;schema id="org.gtk.Test"&gt;
 * <p>
 *     &lt;key name="key-with-range" type="i"&gt;
 *       &lt;range min="1" max="100"/&gt;
 *       &lt;default>10</default&gt;
 *     &lt;/key&gt;
 * <p>
 *     &lt;key name="key-with-choices" type="s"&gt;
 *       &lt;choices&gt;
 *         &lt;choice value='Elisabeth'/&gt;
 *         &lt;choice value='Annabeth'/&gt;
 *         &lt;choice value='Joe'/&gt;
 *       &lt;/choices&gt;
 *       &lt;aliases&gt;
 *         &lt;alias value='Anna' target='Annabeth'/&gt;
 *         &lt;alias value='Beth' target='Elisabeth'/&gt;
 *       &lt;/aliases&gt;
 *       &lt;default>'Joe'</default&gt;
 *     &lt;/key&gt;
 * <p>
 *     &lt;key name='enumerated-key' enum='org.gtk.Test.myenum'&gt;
 *       &lt;default>'first'</default&gt;
 *     &lt;/key&gt;
 * <p>
 *     &lt;key name='flags-key' flags='org.gtk.Test.myflags'&gt;
 *       &lt;default>["flag1","flag2"]</default&gt;
 *     &lt;/key&gt;
 *   &lt;/schema&gt;
 * &lt;/schemalist&gt;
 * ]|
 * <p>
 * <h2>Vendor overrides</h2>
 * <p>
 * Default values are defined in the schemas that get installed by
 * an application. Sometimes, it is necessary for a vendor or distributor
 * to adjust these defaults. Since patching the XML source for the schema
 * is inconvenient and error-prone,
 * [glib-compile-schemas][glib-compile-schemas] reads so-called vendor
 * override' files. These are keyfiles in the same directory as the XML
 * schema sources which can override default values. The schema id serves
 * as the group name in the key file, and the values are expected in
 * serialized GVariant form, as in the following example:
 * |[
 *     [org.gtk.Example]
 *     key1='string'
 *     key2=1.5
 * ]|
 * <p>
 * glib-compile-schemas expects schema files to have the extension
 * {@code .gschema.override}.
 * <p>
 * <h2>Binding</h2>
 * <p>
 * A very convenient feature of GSettings lets you bind {@link org.gtk.gobject.Object} properties
 * directly to settings, using g_settings_bind(). Once a GObject property
 * has been bound to a setting, changes on either side are automatically
 * propagated to the other side. GSettings handles details like mapping
 * between GObject and GVariant types, and preventing infinite cycles.
 * <p>
 * This makes it very easy to hook up a preferences dialog to the
 * underlying settings. To make this even more convenient, GSettings
 * looks for a boolean property with the name "sensitivity" and
 * automatically binds it to the writability of the bound setting.
 * If this 'magic' gets in the way, it can be suppressed with the
 * {@link SettingsBindFlags#NO_SENSITIVITY} flag.
 * <p>
 * <h2>Relocatable schemas # {#gsettings-relocatable}</h2>
 * <p>
 * A relocatable schema is one with no {@code path} attribute specified on its
 * &lt;schema&gt; element. By using g_settings_new_with_path(), a {@link Settings} object
 * can be instantiated for a relocatable schema, assigning a path to the
 * instance. Paths passed to g_settings_new_with_path() will typically be
 * constructed dynamically from a constant prefix plus some form of instance
 * identifier; but they must still be valid GSettings paths. Paths could also
 * be constant and used with a globally installed schema originating from a
 * dependency library.
 * <p>
 * For example, a relocatable schema could be used to store geometry information
 * for different windows in an application. If the schema ID was
 * {@code org.foo.MyApp.Window}, it could be instantiated for paths
 * {@code /org/foo/MyApp/main/}, {@code /org/foo/MyApp/document-1/},
 * {@code /org/foo/MyApp/document-2/}, etc. If any of the paths are well-known
 * they can be specified as &lt;child&gt; elements in the parent schema, e.g.:
 * |[
 * &lt;schema id="org.foo.MyApp" path="/org/foo/MyApp/"&gt;
 *   &lt;child name="main" schema="org.foo.MyApp.Window"/&gt;
 * &lt;/schema&gt;
 * ]|
 * <p>
 * <h2>Build system integration # {#gsettings-build-system}</h2>
 * <p>
 * GSettings comes with autotools integration to simplify compiling and
 * installing schemas. To add GSettings support to an application, add the
 * following to your {@code configure.ac}:
 * |[
 * GLIB_GSETTINGS
 * ]|
 * <p>
 * In the appropriate {@code Makefile.am}, use the following snippet to compile and
 * install the named schema:
 * |[
 * gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
 * EXTRA_DIST = $(gsettings_SCHEMAS)
 * <p>
 * {@code GSETTINGS_RULES}@
 * ]|
 * <p>
 * No changes are needed to the build system to mark a schema XML file for
 * translation. Assuming it sets the {@code gettext-domain} attribute, a schema may
 * be marked for translation by adding it to {@code POTFILES.in}, assuming gettext
 * 0.19 is in use (the preferred method for translation):
 * |[
 * data/org.foo.MyApp.gschema.xml
 * ]|
 * <p>
 * Alternatively, if intltool 0.50.1 is in use:
 * |[
 * [type: gettext/gsettings]data/org.foo.MyApp.gschema.xml
 * ]|
 * <p>
 * GSettings will use gettext to look up translations for the &lt;summary&gt; and
 * &lt;description> elements, and also any <default&gt; elements which have a {@code l10n}
 * attribute set. Translations must not be included in the {@code .gschema.xml} file
 * by the build system, for example by using intltool XML rules with a
 * {@code .gschema.xml.in} template.
 * <p>
 * If an enumerated type defined in a C header file is to be used in a GSettings
 * schema, it can either be defined manually using an &lt;enum&gt; element in the
 * schema XML, or it can be extracted automatically from the C header. This
 * approach is preferred, as it ensures the two representations are always
 * synchronised. To do so, add the following to the relevant {@code Makefile.am}:
 * |[
 * gsettings_ENUM_NAMESPACE = org.foo.MyApp
 * gsettings_ENUM_FILES = my-app-enums.h my-app-misc.h
 * ]|
 * <p>
 * {@code gsettings_ENUM_NAMESPACE} specifies the schema namespace for the enum files,
 * which are specified in {@code gsettings_ENUM_FILES}. This will generate a
 * {@code org.foo.MyApp.enums.xml} file containing the extracted enums, which will be
 * automatically included in the schema compilation, install and uninstall
 * rules. It should not be committed to version control or included in
 * {@code EXTRA_DIST}.
 */
public class Settings extends org.gtk.gobject.Object {

    public Settings(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Settings */
    public static Settings castFrom(org.gtk.gobject.Object gobject) {
        return new Settings(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String schemaId) {
        Reference RESULT = References.get(gtk_h.g_settings_new(Interop.allocateNativeString(schemaId).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Settings} object with the schema specified by
     * {@code schema_id}.
     * <p>
     * It is an error for the schema to not exist: schemas are an
     * essential part of a program, as they provide type information.
     * If schemas need to be dynamically loaded (for example, from an
     * optional runtime dependency), g_settings_schema_source_lookup()
     * can be used to test for their existence before loading them.
     * <p>
     * Signals on the newly created {@link Settings} object will be dispatched
     * via the thread-default {@link org.gtk.glib.MainContext} in effect at the time of the
     * call to g_settings_new().  The new {@link Settings} will hold a reference
     * on the context.  See g_main_context_push_thread_default().
     */
    public Settings(java.lang.String schemaId) {
        super(constructNew(schemaId));
    }
    
    private static Reference constructNewFull(SettingsSchema schema, SettingsBackend backend, java.lang.String path) {
        Reference RESULT = References.get(gtk_h.g_settings_new_full(schema.handle(), backend.handle(), Interop.allocateNativeString(path).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Settings} object with a given schema, backend and
     * path.
     * <p>
     * It should be extremely rare that you ever want to use this function.
     * It is made available for advanced use-cases (such as plugin systems
     * that want to provide access to schemas loaded from custom locations,
     * etc).
     * <p>
     * At the most basic level, a {@link Settings} object is a pure composition of
     * 4 things: a {@link SettingsSchema}, a {@link SettingsBackend}, a path within that
     * backend, and a {@link org.gtk.glib.MainContext} to which signals are dispatched.
     * <p>
     * This constructor therefore gives you full control over constructing
     * {@link Settings} instances.  The first 3 parameters are given directly as
     * {@code schema}, {@code backend} and {@code path}, and the main context is taken from the
     * thread-default (as per g_settings_new()).
     * <p>
     * If {@code backend} is <code>null</code> then the default backend is used.
     * <p>
     * If {@code path} is <code>null</code> then the path from the schema is used.  It is an
     * error if {@code path} is <code>null</code> and the schema has no path of its own or if
     * {@code path} is non-<code>null</code> and not equal to the path that the schema does
     * have.
     */
    public static Settings newFull(SettingsSchema schema, SettingsBackend backend, java.lang.String path) {
        return new Settings(constructNewFull(schema, backend, path));
    }
    
    private static Reference constructNewWithBackend(java.lang.String schemaId, SettingsBackend backend) {
        Reference RESULT = References.get(gtk_h.g_settings_new_with_backend(Interop.allocateNativeString(schemaId).handle(), backend.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Settings} object with the schema specified by
     * {@code schema_id} and a given {@link SettingsBackend}.
     * <p>
     * Creating a {@link Settings} object with a different backend allows accessing
     * settings from a database other than the usual one. For example, it may make
     * sense to pass a backend corresponding to the "defaults" settings database on
     * the system to get a settings object that modifies the system default
     * settings instead of the settings for this user.
     */
    public static Settings newWithBackend(java.lang.String schemaId, SettingsBackend backend) {
        return new Settings(constructNewWithBackend(schemaId, backend));
    }
    
    private static Reference constructNewWithBackendAndPath(java.lang.String schemaId, SettingsBackend backend, java.lang.String path) {
        Reference RESULT = References.get(gtk_h.g_settings_new_with_backend_and_path(Interop.allocateNativeString(schemaId).handle(), backend.handle(), Interop.allocateNativeString(path).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Settings} object with the schema specified by
     * {@code schema_id} and a given {@link SettingsBackend} and path.
     * <p>
     * This is a mix of g_settings_new_with_backend() and
     * g_settings_new_with_path().
     */
    public static Settings newWithBackendAndPath(java.lang.String schemaId, SettingsBackend backend, java.lang.String path) {
        return new Settings(constructNewWithBackendAndPath(schemaId, backend, path));
    }
    
    private static Reference constructNewWithPath(java.lang.String schemaId, java.lang.String path) {
        Reference RESULT = References.get(gtk_h.g_settings_new_with_path(Interop.allocateNativeString(schemaId).handle(), Interop.allocateNativeString(path).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Settings} object with the relocatable schema specified
     * by {@code schema_id} and a given path.
     * <p>
     * You only need to do this if you want to directly create a settings
     * object with a schema that doesn't have a specified path of its own.
     * That's quite rare.
     * <p>
     * It is a programmer error to call this function for a schema that
     * has an explicitly specified path.
     * <p>
     * It is a programmer error if {@code path} is not a valid path.  A valid path
     * begins and ends with '/' and does not contain two consecutive '/'
     * characters.
     */
    public static Settings newWithPath(java.lang.String schemaId, java.lang.String path) {
        return new Settings(constructNewWithPath(schemaId, path));
    }
    
    /**
     * Applies any changes that have been made to the settings.  This
     * function does nothing unless {@code settings} is in 'delay-apply' mode;
     * see g_settings_delay().  In the normal case settings are always
     * applied immediately.
     */
    public void apply() {
        gtk_h.g_settings_apply(handle());
    }
    
    /**
     * Create a binding between the {@code key} in the {@code settings} object
     * and the property {@code property} of {@code object}.
     * <p>
     * The binding uses the default GIO mapping functions to map
     * between the settings and property values. These functions
     * handle booleans, numeric types and string types in a
     * straightforward way. Use g_settings_bind_with_mapping() if
     * you need a custom mapping, or map between types that are not
     * supported by the default mapping functions.
     * <p>
     * Unless the {@code flags} include {@link SettingsBindFlags#NO_SENSITIVITY}, this
     * function also establishes a binding between the writability of
     * {@code key} and the "sensitive" property of {@code object} (if {@code object} has
     * a boolean property by that name). See g_settings_bind_writable()
     * for more details about writable bindings.
     * <p>
     * Note that the lifecycle of the binding is tied to {@code object},
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     */
    public void bind(java.lang.String key, org.gtk.gobject.Object object, java.lang.String property, int flags) {
        gtk_h.g_settings_bind(handle(), Interop.allocateNativeString(key).handle(), object.handle(), Interop.allocateNativeString(property).handle(), flags);
    }
    
    /**
     * Create a binding between the {@code key} in the {@code settings} object
     * and the property {@code property} of {@code object}.
     * <p>
     * The binding uses the provided mapping functions to map between
     * settings and property values.
     * <p>
     * Note that the lifecycle of the binding is tied to {@code object},
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     */
    public void bindWithMapping(java.lang.String key, org.gtk.gobject.Object object, java.lang.String property, int flags, SettingsBindGetMapping getMapping, SettingsBindSetMapping setMapping) {
        try {
            gtk_h.g_settings_bind_with_mapping(handle(), Interop.allocateNativeString(key).handle(), object.handle(), Interop.allocateNativeString(property).handle(), flags, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSettingsBindGetMapping",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSettingsBindSetMapping",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getMapping.hashCode(), getMapping)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Create a binding between the writability of {@code key} in the
     * {@code settings} object and the property {@code property} of {@code object}.
     * The property must be boolean; "sensitive" or "visible"
     * properties of widgets are the most likely candidates.
     * <p>
     * Writable bindings are always uni-directional; changes of the
     * writability of the setting will be propagated to the object
     * property, not the other way.
     * <p>
     * When the {@code inverted} argument is <code>true</code>, the binding inverts the
     * value as it passes from the setting to the object, i.e. {@code property}
     * will be set to <code>true</code> if the key is not writable.
     * <p>
     * Note that the lifecycle of the binding is tied to {@code object},
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     */
    public void bindWritable(java.lang.String key, org.gtk.gobject.Object object, java.lang.String property, boolean inverted) {
        gtk_h.g_settings_bind_writable(handle(), Interop.allocateNativeString(key).handle(), object.handle(), Interop.allocateNativeString(property).handle(), inverted ? 1 : 0);
    }
    
    /**
     * Creates a {@link Action} corresponding to a given {@link Settings} key.
     * <p>
     * The action has the same name as the key.
     * <p>
     * The value of the key becomes the state of the action and the action
     * is enabled when the key is writable.  Changing the state of the
     * action results in the key being written to.  Changes to the value or
     * writability of the key cause appropriate change notifications to be
     * emitted for the action.
     * <p>
     * For boolean-valued keys, action activations take no parameter and
     * result in the toggling of the value.  For all other types,
     * activations take the new value for the key (which must have the
     * correct type).
     */
    public Action createAction(java.lang.String key) {
        var RESULT = gtk_h.g_settings_create_action(handle(), Interop.allocateNativeString(key).handle());
        return new Action.ActionImpl(References.get(RESULT, true));
    }
    
    /**
     * Changes the {@link Settings} object into 'delay-apply' mode. In this
     * mode, changes to {@code settings} are not immediately propagated to the
     * backend, but kept locally until g_settings_apply() is called.
     */
    public void delay() {
        gtk_h.g_settings_delay(handle());
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for booleans.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a boolean type in the schema for {@code settings}.
     */
    public boolean getBoolean(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_boolean(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a child settings object which has a base path of
     * {@code base-path/@name}, where {@code base-path} is the base path of
     * {@code settings}.
     * <p>
     * The schema for the child settings object must have been declared
     * in the schema of {@code settings} using a {@code <child>} element.
     * <p>
     * The created child settings object will inherit the {@link Settings}:delay-apply
     * mode from {@code settings}.
     */
    public Settings getChild(java.lang.String name) {
        var RESULT = gtk_h.g_settings_get_child(handle(), Interop.allocateNativeString(name).handle());
        return new Settings(References.get(RESULT, true));
    }
    
    /**
     * Gets the "default value" of a key.
     * <p>
     * This is the value that would be read if g_settings_reset() were to be
     * called on the key.
     * <p>
     * Note that this may be a different value than returned by
     * g_settings_schema_key_get_default_value() if the system administrator
     * has provided a default value.
     * <p>
     * Comparing the return values of g_settings_get_default_value() and
     * g_settings_get_value() is not sufficient for determining if a value
     * has been set because the user may have explicitly set the value to
     * something that happens to be equal to the default.  The difference
     * here is that if the default changes in the future, the user's key
     * will still be set.
     * <p>
     * This function may be useful for adding an indication to a UI of what
     * the default value was before the user set it.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings}.
     */
    public org.gtk.glib.Variant getDefaultValue(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_default_value(handle(), Interop.allocateNativeString(key).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for doubles.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a 'double' type in the schema for {@code settings}.
     */
    public double getDouble(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_double(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored in {@code settings} for {@code key} and converts it
     * to the enum value that it represents.
     * <p>
     * In order to use this function the type of the value must be a string
     * and it must be marked in the schema file as an enumerated type.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or is not marked as an enumerated type.
     * <p>
     * If the value stored in the configuration database is not a valid
     * value for the enumerated type then this function will return the
     * default value.
     */
    public int getEnum(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_enum(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored in {@code settings} for {@code key} and converts it
     * to the flags value that it represents.
     * <p>
     * In order to use this function the type of the value must be an array
     * of strings and it must be marked in the schema file as a flags type.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or is not marked as a flags type.
     * <p>
     * If the value stored in the configuration database is not a valid
     * value for the flags type then this function will return the default
     * value.
     */
    public int getFlags(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_flags(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Returns whether the {@link Settings} object has any unapplied
     * changes.  This can only be the case if it is in 'delayed-apply' mode.
     */
    public boolean getHasUnapplied() {
        var RESULT = gtk_h.g_settings_get_has_unapplied(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 32-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int32 type in the schema for {@code settings}.
     */
    public int getInt(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_int(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 64-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int64 type in the schema for {@code settings}.
     */
    public long getInt64(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_int64(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}, subject to
     * application-level validation/mapping.
     * <p>
     * You should use this function when the application needs to perform
     * some processing on the value of the key (for example, parsing).  The
     * {@code mapping} function performs that processing.  If the function
     * indicates that the processing was unsuccessful (due to a parse error,
     * for example) then the mapping is tried again with another value.
     * <p>
     * This allows a robust 'fall back to defaults' behaviour to be
     * implemented somewhat automatically.
     * <p>
     * The first value that is tried is the user's setting for the key.  If
     * the mapping function fails to map this value, other values may be
     * tried in an unspecified order (system or site defaults, translated
     * schema default values, untranslated schema default values, etc).
     * <p>
     * If the mapping function fails for all possible values, one additional
     * attempt is made: the mapping function is called with a <code>null</code> value.
     * If the mapping function still indicates failure at this point then
     * the application will be aborted.
     * <p>
     * The result parameter for the {@code mapping} function is pointed to a
     * {@code gpointer} which is initially set to <code>null</code>.  The same pointer is given
     * to each invocation of {@code mapping}.  The final value of that {@code gpointer} is
     * what is returned by this function.  <code>null</code> is valid; it is returned
     * just as any other value would be.
     */
    public jdk.incubator.foreign.MemoryAddress getMapped(java.lang.String key, SettingsGetMapping mapping) {
        try {
            var RESULT = gtk_h.g_settings_get_mapped(handle(), Interop.allocateNativeString(key).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSettingsGetMapping",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(mapping.hashCode(), mapping)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for strings.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a string type in the schema for {@code settings}.
     */
    public java.lang.String getString(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_string(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 32-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint32 type in the schema for {@code settings}.
     */
    public int getUint(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_uint(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 64-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint64 type in the schema for {@code settings}.
     */
    public long getUint64(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_uint64(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Checks the "user value" of a key, if there is one.
     * <p>
     * The user value of a key is the last value that was set by the user.
     * <p>
     * After calling g_settings_reset() this function should always return
     * <code>null</code> (assuming something is not wrong with the system
     * configuration).
     * <p>
     * It is possible that g_settings_get_value() will return a different
     * value than this function.  This can happen in the case that the user
     * set a value for a key that was subsequently locked down by the system
     * administrator -- this function will return the user's old value.
     * <p>
     * This function may be useful for adding a "reset" option to a UI or
     * for providing indication that a particular value has been changed.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings}.
     */
    public org.gtk.glib.Variant getUserValue(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_user_value(handle(), Interop.allocateNativeString(key).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the value that is stored in {@code settings} for {@code key}.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings}.
     */
    public org.gtk.glib.Variant getValue(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_value(handle(), Interop.allocateNativeString(key).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Finds out if a key can be written or not
     */
    public boolean isWritable(java.lang.String name) {
        var RESULT = gtk_h.g_settings_is_writable(handle(), Interop.allocateNativeString(name).handle());
        return (RESULT != 0);
    }
    
    /**
     * Resets {@code key} to its default value.
     * <p>
     * This call resets the key, as much as possible, to its default value.
     * That might be the value specified in the schema or the one set by the
     * administrator.
     */
    public void reset(java.lang.String key) {
        gtk_h.g_settings_reset(handle(), Interop.allocateNativeString(key).handle());
    }
    
    /**
     * Reverts all non-applied changes to the settings.  This function
     * does nothing unless {@code settings} is in 'delay-apply' mode; see
     * g_settings_delay().  In the normal case settings are always applied
     * immediately.
     * <p>
     * Change notifications will be emitted for affected keys.
     */
    public void revert() {
        gtk_h.g_settings_revert(handle());
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for booleans.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a boolean type in the schema for {@code settings}.
     */
    public boolean setBoolean(java.lang.String key, boolean value) {
        var RESULT = gtk_h.g_settings_set_boolean(handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for doubles.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a 'double' type in the schema for {@code settings}.
     */
    public boolean setDouble(java.lang.String key, double value) {
        var RESULT = gtk_h.g_settings_set_double(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Looks up the enumerated type nick for {@code value} and writes it to {@code key},
     * within {@code settings}.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or is not marked as an enumerated type, or for
     * {@code value} not to be a valid value for the named type.
     * <p>
     * After performing the write, accessing {@code key} directly with
     * g_settings_get_string() will return the 'nick' associated with
     * {@code value}.
     */
    public boolean setEnum(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_enum(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Looks up the flags type nicks for the bits specified by {@code value}, puts
     * them in an array of strings and writes the array to {@code key}, within
     * {@code settings}.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or is not marked as a flags type, or for {@code value}
     * to contain any bits that are not value for the named type.
     * <p>
     * After performing the write, accessing {@code key} directly with
     * g_settings_get_strv() will return an array of 'nicks'; one for each
     * bit in {@code value}.
     */
    public boolean setFlags(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_flags(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 32-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int32 type in the schema for {@code settings}.
     */
    public boolean setInt(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_int(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 64-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int64 type in the schema for {@code settings}.
     */
    public boolean setInt64(java.lang.String key, long value) {
        var RESULT = gtk_h.g_settings_set_int64(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for strings.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a string type in the schema for {@code settings}.
     */
    public boolean setString(java.lang.String key, java.lang.String value) {
        var RESULT = gtk_h.g_settings_set_string(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for string arrays.  If
     * {@code value} is <code>null</code>, then {@code key} is set to be the empty array.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having an array of strings type in the schema for {@code settings}.
     */
    public boolean setStrv(java.lang.String key, java.lang.String[] value) {
        var RESULT = gtk_h.g_settings_set_strv(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(value).handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 32-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint32 type in the schema for {@code settings}.
     */
    public boolean setUint(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_uint(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 64-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint64 type in the schema for {@code settings}.
     */
    public boolean setUint64(java.lang.String key, long value) {
        var RESULT = gtk_h.g_settings_set_uint64(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or for {@code value} to have the incorrect type, per
     * the schema.
     * <p>
     * If {@code value} is floating then this function consumes the reference.
     */
    public boolean setValue(java.lang.String key, org.gtk.glib.Variant value) {
        var RESULT = gtk_h.g_settings_set_value(handle(), Interop.allocateNativeString(key).handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Ensures that all pending operations are complete for the default backend.
     * <p>
     * Writes made to a {@link Settings} are handled asynchronously.  For this
     * reason, it is very unlikely that the changes have it to disk by the
     * time g_settings_set() returns.
     * <p>
     * This call will block until all of the writes have made it to the
     * backend.  Since the mainloop is not running, no change notifications
     * will be dispatched during this call (but some may be queued by the
     * time the call is done).
     */
    public static void sync() {
        gtk_h.g_settings_sync();
    }
    
    /**
     * Removes an existing binding for {@code property} on {@code object}.
     * <p>
     * Note that bindings are automatically removed when the
     * object is finalized, so it is rarely necessary to call this
     * function.
     */
    public static void unbind(org.gtk.gobject.Object object, java.lang.String property) {
        gtk_h.g_settings_unbind(object.handle(), Interop.allocateNativeString(property).handle());
    }
    
    @FunctionalInterface
    public interface ChangeEventHandler {
        boolean signalReceived(Settings source, org.gtk.glib.Quark[] keys, int nKeys);
    }
    
    /**
     * The "change-event" signal is emitted once per change event that
     * affects this settings object.  You should connect to this signal
     * only if you are interested in viewing groups of changes before they
     * are split out into multiple emissions of the "changed" signal.
     * For most use cases it is more appropriate to use the "changed" signal.
     * <p>
     * In the event that the change event applies to one or more specified
     * keys, {@code keys} will be an array of {@link org.gtk.glib.Quark} of length {@code n_keys}.  In the
     * event that the change event applies to the {@link Settings} object as a
     * whole (ie: potentially every key has been changed) then {@code keys} will
     * be <code>null</code> and {@code n_keys} will be 0.
     * <p>
     * The default handler for this signal invokes the "changed" signal
     * for each affected key.  If any other connected handler returns
     * <code>true</code> then this default functionality will be suppressed.
     */
    public SignalHandle onChangeEvent(ChangeEventHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSettingsChangeEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("change-event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Settings source, java.lang.String key);
    }
    
    /**
     * The "changed" signal is emitted when a key has potentially changed.
     * You should call one of the g_settings_get() calls to check the new
     * value.
     * <p>
     * This signal supports detailed connections.  You can connect to the
     * detailed signal "changed::x" in order to only receive callbacks
     * when key "x" changes.
     * <p>
     * Note that {@code settings} only emits this signal if you have read {@code key} at
     * least once while a signal handler was already connected for {@code key}.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSettingsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface WritableChangeEventHandler {
        boolean signalReceived(Settings source, int key);
    }
    
    /**
     * The "writable-change-event" signal is emitted once per writability
     * change event that affects this settings object.  You should connect
     * to this signal if you are interested in viewing groups of changes
     * before they are split out into multiple emissions of the
     * "writable-changed" signal.  For most use cases it is more
     * appropriate to use the "writable-changed" signal.
     * <p>
     * In the event that the writability change applies only to a single
     * key, {@code key} will be set to the {@link org.gtk.glib.Quark} for that key.  In the event
     * that the writability change affects the entire settings object,
     * {@code key} will be 0.
     * <p>
     * The default handler for this signal invokes the "writable-changed"
     * and "changed" signals for each affected key.  This is done because
     * changes in writability might also imply changes in value (if for
     * example, a new mandatory setting is introduced).  If any other
     * connected handler returns <code>true</code> then this default functionality
     * will be suppressed.
     */
    public SignalHandle onWritableChangeEvent(WritableChangeEventHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSettingsWritableChangeEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("writable-change-event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface WritableChangedHandler {
        void signalReceived(Settings source, java.lang.String key);
    }
    
    /**
     * The "writable-changed" signal is emitted when the writability of a
     * key has potentially changed.  You should call
     * g_settings_is_writable() in order to determine the new status.
     * <p>
     * This signal supports detailed connections.  You can connect to the
     * detailed signal "writable-changed::x" in order to only receive
     * callbacks when the writability of "x" changes.
     */
    public SignalHandle onWritableChanged(WritableChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSettingsWritableChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("writable-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
