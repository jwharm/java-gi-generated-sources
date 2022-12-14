package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * {@code gettext-domain} attribute of the &lt;schemalist&gt; or &lt;schema&gt;
 * elements and the category that is specified in the {@code l10n} attribute of
 * the &lt;default&gt; element. The string which is translated includes all text in
 * the &lt;default&gt; element, including any surrounding quotation marks.
 * <p>
 * The {@code l10n} attribute must be set to {@code messages} or {@code time}, and sets the
 * [locale category for
 * translation](https://www.gnu.org/software/gettext/manual/html_node/Aspects.html{@code index}-locale-categories-1).
 * The {@code messages} category should be used by default; use {@code time} for
 * translatable date or time formats. A translation comment can be added as an
 * XML comment immediately above the &lt;default&gt; element ??? it is recommended to
 * add these comments to aid translators understand the meaning and
 * implications of the default value. An optional translation {@code context}
 * attribute can be set on the &lt;default&gt; element to disambiguate multiple
 * defaults which use the same string.
 * <p>
 * For example:
 * <pre>{@code 
 *  <!-- Translators: A list of words which are not allowed to be typed, in
 *       GVariant serialization syntax.
 *       See: https://developer.gnome.org/glib/stable/gvariant-text.html -->
 *  <default l10n='messages' context='Banned words'>['bad', 'words']</default>
 * }</pre>
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
 * &lt;enum&gt; or &lt;flags&gt; element, as seen in the
 * [example][schema-enumerated]. The underlying type of such a key
 * is string, but you can use g_settings_get_enum(), g_settings_set_enum(),
 * g_settings_get_flags(), g_settings_set_flags() access the numeric values
 * corresponding to the string value of enum and flags keys.
 * <p>
 * An example for default value:
 * <pre>{@code 
 * <schemalist>
 *   <schema id="org.gtk.Test" path="/org/gtk/Test/" gettext-domain="test">
 * 
 *     <key name="greeting" type="s">
 *       <default l10n="messages">"Hello, earthlings"</default>
 *       <summary>A greeting</summary>
 *       <description>
 *         Greeting of the invading martians
 *       </description>
 *     </key>
 * 
 *     <key name="box" type="(ii)">
 *       <default>(20,30)</default>
 *     </key>
 * 
 *     <key name="empty-string" type="s">
 *       <default>""</default>
 *       <summary>Empty strings have to be provided in GVariant form</summary>
 *     </key>
 * 
 *   </schema>
 * </schemalist>
 * }</pre>
 * <p>
 * An example for ranges, choices and enumerated types:
 * <pre>{@code 
 * <schemalist>
 * 
 *   <enum id="org.gtk.Test.myenum">
 *     <value nick="first" value="1"/>
 *     <value nick="second" value="2"/>
 *   </enum>
 * 
 *   <flags id="org.gtk.Test.myflags">
 *     <value nick="flag1" value="1"/>
 *     <value nick="flag2" value="2"/>
 *     <value nick="flag3" value="4"/>
 *   </flags>
 * 
 *   <schema id="org.gtk.Test">
 * 
 *     <key name="key-with-range" type="i">
 *       <range min="1" max="100"/>
 *       <default>10</default>
 *     </key>
 * 
 *     <key name="key-with-choices" type="s">
 *       <choices>
 *         <choice value='Elisabeth'/>
 *         <choice value='Annabeth'/>
 *         <choice value='Joe'/>
 *       </choices>
 *       <aliases>
 *         <alias value='Anna' target='Annabeth'/>
 *         <alias value='Beth' target='Elisabeth'/>
 *       </aliases>
 *       <default>'Joe'</default>
 *     </key>
 * 
 *     <key name='enumerated-key' enum='org.gtk.Test.myenum'>
 *       <default>'first'</default>
 *     </key>
 * 
 *     <key name='flags-key' flags='org.gtk.Test.myflags'>
 *       <default>["flag1","flag2"]</default>
 *     </key>
 *   </schema>
 * </schemalist>
 * }</pre>
 * <p>
 * <strong>Vendor overrides</strong><br/>
 * Default values are defined in the schemas that get installed by
 * an application. Sometimes, it is necessary for a vendor or distributor
 * to adjust these defaults. Since patching the XML source for the schema
 * is inconvenient and error-prone,
 * [glib-compile-schemas][glib-compile-schemas] reads so-called vendor
 * override' files. These are keyfiles in the same directory as the XML
 * schema sources which can override default values. The schema id serves
 * as the group name in the key file, and the values are expected in
 * serialized GVariant form, as in the following example:
 * <pre>{@code 
 *     [org.gtk.Example]
 *     key1='string'
 *     key2=1.5
 * }</pre>
 * <p>
 * glib-compile-schemas expects schema files to have the extension
 * {@code .gschema.override}.
 * <p>
 * <strong>Binding</strong><br/>
 * A very convenient feature of GSettings lets you bind {@link org.gtk.gobject.GObject} properties
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
 * <strong>Relocatable schemas # {#gsettings-relocatable}</strong><br/>
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
 * <pre>{@code 
 * <schema id="org.foo.MyApp" path="/org/foo/MyApp/">
 *   <child name="main" schema="org.foo.MyApp.Window"/>
 * </schema>
 * }</pre>
 * <p>
 * <strong>Build system integration # {#gsettings-build-system}</strong><br/>
 * GSettings comes with autotools integration to simplify compiling and
 * installing schemas. To add GSettings support to an application, add the
 * following to your {@code configure.ac}:
 * <pre>{@code 
 * GLIB_GSETTINGS
 * }</pre>
 * <p>
 * In the appropriate {@code Makefile.am}, use the following snippet to compile and
 * install the named schema:
 * <pre>{@code 
 * gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
 * EXTRA_DIST = $(gsettings_SCHEMAS)
 * 
 * @GSETTINGS_RULES@
 * }</pre>
 * <p>
 * No changes are needed to the build system to mark a schema XML file for
 * translation. Assuming it sets the {@code gettext-domain} attribute, a schema may
 * be marked for translation by adding it to {@code POTFILES.in}, assuming gettext
 * 0.19 is in use (the preferred method for translation):
 * <pre>{@code 
 * data/org.foo.MyApp.gschema.xml
 * }</pre>
 * <p>
 * Alternatively, if intltool 0.50.1 is in use:
 * <pre>{@code 
 * [type: gettext/gsettings]data/org.foo.MyApp.gschema.xml
 * }</pre>
 * <p>
 * GSettings will use gettext to look up translations for the &lt;summary&gt; and
 * &lt;description&gt; elements, and also any &lt;default&gt; elements which have a {@code l10n}
 * attribute set. Translations must not be included in the {@code .gschema.xml} file
 * by the build system, for example by using intltool XML rules with a
 * {@code .gschema.xml.in} template.
 * <p>
 * If an enumerated type defined in a C header file is to be used in a GSettings
 * schema, it can either be defined manually using an &lt;enum&gt; element in the
 * schema XML, or it can be extracted automatically from the C header. This
 * approach is preferred, as it ensures the two representations are always
 * synchronised. To do so, add the following to the relevant {@code Makefile.am}:
 * <pre>{@code 
 * gsettings_ENUM_NAMESPACE = org.foo.MyApp
 * gsettings_ENUM_FILES = my-app-enums.h my-app-misc.h
 * }</pre>
 * <p>
 * {@code gsettings_ENUM_NAMESPACE} specifies the schema namespace for the enum files,
 * which are specified in {@code gsettings_ENUM_FILES}. This will generate a
 * {@code org.foo.MyApp.enums.xml} file containing the extracted enums, which will be
 * automatically included in the schema compilation, install and uninstall
 * rules. It should not be committed to version control or included in
 * {@code EXTRA_DIST}.
 */
public class Settings extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettings";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Settings proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Settings(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Settings> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Settings(input);
    
    private static MemoryAddress constructNew(java.lang.String schemaId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_new.invokeExact(Marshal.stringToAddress.marshal(schemaId, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * @param schemaId the id of the schema
     */
    public Settings(java.lang.String schemaId) {
        super(constructNew(schemaId));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFull(org.gtk.gio.SettingsSchema schema, @Nullable org.gtk.gio.SettingsBackend backend, @Nullable java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_new_full.invokeExact(
                        schema.handle(),
                        (Addressable) (backend == null ? MemoryAddress.NULL : backend.handle()),
                        (Addressable) (path == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(path, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * If {@code backend} is {@code null} then the default backend is used.
     * <p>
     * If {@code path} is {@code null} then the path from the schema is used.  It is an
     * error if {@code path} is {@code null} and the schema has no path of its own or if
     * {@code path} is non-{@code null} and not equal to the path that the schema does
     * have.
     * @param schema a {@link SettingsSchema}
     * @param backend a {@link SettingsBackend}
     * @param path the path to use
     * @return a new {@link Settings} object
     */
    public static Settings newFull(org.gtk.gio.SettingsSchema schema, @Nullable org.gtk.gio.SettingsBackend backend, @Nullable java.lang.String path) {
        var RESULT = constructNewFull(schema, backend, path);
        var OBJECT = (org.gtk.gio.Settings) Interop.register(RESULT, org.gtk.gio.Settings.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithBackend(java.lang.String schemaId, org.gtk.gio.SettingsBackend backend) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_new_with_backend.invokeExact(
                        Marshal.stringToAddress.marshal(schemaId, SCOPE),
                        backend.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * @param schemaId the id of the schema
     * @param backend the {@link SettingsBackend} to use
     * @return a new {@link Settings} object
     */
    public static Settings newWithBackend(java.lang.String schemaId, org.gtk.gio.SettingsBackend backend) {
        var RESULT = constructNewWithBackend(schemaId, backend);
        var OBJECT = (org.gtk.gio.Settings) Interop.register(RESULT, org.gtk.gio.Settings.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithBackendAndPath(java.lang.String schemaId, org.gtk.gio.SettingsBackend backend, java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_new_with_backend_and_path.invokeExact(
                        Marshal.stringToAddress.marshal(schemaId, SCOPE),
                        backend.handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@link Settings} object with the schema specified by
     * {@code schema_id} and a given {@link SettingsBackend} and path.
     * <p>
     * This is a mix of g_settings_new_with_backend() and
     * g_settings_new_with_path().
     * @param schemaId the id of the schema
     * @param backend the {@link SettingsBackend} to use
     * @param path the path to use
     * @return a new {@link Settings} object
     */
    public static Settings newWithBackendAndPath(java.lang.String schemaId, org.gtk.gio.SettingsBackend backend, java.lang.String path) {
        var RESULT = constructNewWithBackendAndPath(schemaId, backend, path);
        var OBJECT = (org.gtk.gio.Settings) Interop.register(RESULT, org.gtk.gio.Settings.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithPath(java.lang.String schemaId, java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_new_with_path.invokeExact(
                        Marshal.stringToAddress.marshal(schemaId, SCOPE),
                        Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * @param schemaId the id of the schema
     * @param path the path to use
     * @return a new {@link Settings} object
     */
    public static Settings newWithPath(java.lang.String schemaId, java.lang.String path) {
        var RESULT = constructNewWithPath(schemaId, path);
        var OBJECT = (org.gtk.gio.Settings) Interop.register(RESULT, org.gtk.gio.Settings.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Applies any changes that have been made to the settings.  This
     * function does nothing unless {@code settings} is in 'delay-apply' mode;
     * see g_settings_delay().  In the normal case settings are always
     * applied immediately.
     */
    public void apply() {
        try {
            DowncallHandles.g_settings_apply.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param key the key to bind
     * @param object a {@link org.gtk.gobject.GObject}
     * @param property the name of the property to bind
     * @param flags flags for the binding
     */
    public void bind(java.lang.String key, org.gtk.gobject.GObject object, java.lang.String property, org.gtk.gio.SettingsBindFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_bind.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        object.handle(),
                        Marshal.stringToAddress.marshal(property, SCOPE),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param key the key to bind
     * @param object a {@link org.gtk.gobject.GObject}
     * @param property the name of the property to bind
     * @param flags flags for the binding
     * @param getMapping a function that gets called to convert values
     *     from {@code settings} to {@code object}, or {@code null} to use the default GIO mapping
     * @param setMapping a function that gets called to convert values
     *     from {@code object} to {@code settings}, or {@code null} to use the default GIO mapping
     * @param destroy {@link org.gtk.glib.DestroyNotify} function for {@code user_data}
     */
    public void bindWithMapping(java.lang.String key, org.gtk.gobject.GObject object, java.lang.String property, org.gtk.gio.SettingsBindFlags flags, org.gtk.gio.SettingsBindGetMapping getMapping, org.gtk.gio.SettingsBindSetMapping setMapping, org.gtk.glib.DestroyNotify destroy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_bind_with_mapping.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        object.handle(),
                        Marshal.stringToAddress.marshal(property, SCOPE),
                        flags.getValue(),
                        (Addressable) getMapping.toCallback(),
                        (Addressable) setMapping.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) destroy.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     * When the {@code inverted} argument is {@code true}, the binding inverts the
     * value as it passes from the setting to the object, i.e. {@code property}
     * will be set to {@code true} if the key is not writable.
     * <p>
     * Note that the lifecycle of the binding is tied to {@code object},
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     * @param key the key to bind
     * @param object a {@link org.gtk.gobject.GObject}
     * @param property the name of a boolean property to bind
     * @param inverted whether to 'invert' the value
     */
    public void bindWritable(java.lang.String key, org.gtk.gobject.GObject object, java.lang.String property, boolean inverted) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_bind_writable.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        object.handle(),
                        Marshal.stringToAddress.marshal(property, SCOPE),
                        Marshal.booleanToInteger.marshal(inverted, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param key the name of a key in {@code settings}
     * @return a new {@link Action}
     */
    public org.gtk.gio.Action createAction(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_create_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.Action) Interop.register(RESULT, org.gtk.gio.Action.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Changes the {@link Settings} object into 'delay-apply' mode. In this
     * mode, changes to {@code settings} are not immediately propagated to the
     * backend, but kept locally until g_settings_apply() is called.
     */
    public void delay() {
        try {
            DowncallHandles.g_settings_delay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience function that combines g_settings_get_value() with
     * g_variant_get().
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or for the {@link org.gtk.glib.VariantType} of {@code format} to mismatch
     * the type given in the schema.
     * @param key the key to get the value for
     * @param format a {@link org.gtk.glib.Variant} format string
     * @param varargs arguments as per {@code format}
     */
    public void get(java.lang.String key, java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_get.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for booleans.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a boolean type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return a boolean
     */
    public boolean getBoolean(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_get_boolean.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param name the name of the child schema
     * @return a 'child' settings object
     */
    public org.gtk.gio.Settings getChild(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_child.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.Settings) Interop.register(RESULT, org.gtk.gio.Settings.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
     * @param key the key to get the default value for
     * @return the default value
     */
    public @Nullable org.gtk.glib.Variant getDefaultValue(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_default_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for doubles.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a 'double' type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return a double
     */
    public double getDouble(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            double RESULT;
            try {
                RESULT = (double) DowncallHandles.g_settings_get_double.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * @param key the key to get the value for
     * @return the enum value
     */
    public int getEnum(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_get_enum.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * @param key the key to get the value for
     * @return the flags value
     */
    public int getFlags(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_get_flags.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Returns whether the {@link Settings} object has any unapplied
     * changes.  This can only be the case if it is in 'delayed-apply' mode.
     * @return {@code true} if {@code settings} has unapplied changes
     */
    public boolean getHasUnapplied() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_settings_get_has_unapplied.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 32-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int32 type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return an integer
     */
    public int getInt(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_get_int.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 64-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int64 type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return a 64-bit integer
     */
    public long getInt64(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_settings_get_int64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * attempt is made: the mapping function is called with a {@code null} value.
     * If the mapping function still indicates failure at this point then
     * the application will be aborted.
     * <p>
     * The result parameter for the {@code mapping} function is pointed to a
     * {@code gpointer} which is initially set to {@code null}.  The same pointer is given
     * to each invocation of {@code mapping}.  The final value of that {@code gpointer} is
     * what is returned by this function.  {@code null} is valid; it is returned
     * just as any other value would be.
     * @param key the key to get the value for
     * @param mapping the function to map the value in the
     *           settings database to the value used by the application
     * @return the result, which may be {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getMapped(java.lang.String key, org.gtk.gio.SettingsGetMapping mapping) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_mapped.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) mapping.toCallback(),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Queries the range of a key.
     * @param key the key to query the range of
     * @deprecated Use g_settings_schema_key_get_range() instead.
     */
    @Deprecated
    public org.gtk.glib.Variant getRange(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_range.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for strings.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a string type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return a newly-allocated string
     */
    public java.lang.String getString(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * A convenience variant of g_settings_get() for string arrays.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having an array of strings type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return a
     * newly-allocated, {@code null}-terminated array of strings, the value that
     * is stored at {@code key} in {@code settings}.
     */
    public PointerString getStrv(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_strv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 32-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint32 type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return an unsigned integer
     */
    public int getUint(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_get_uint.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Gets the value that is stored at {@code key} in {@code settings}.
     * <p>
     * A convenience variant of g_settings_get() for 64-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint64 type in the schema for {@code settings}.
     * @param key the key to get the value for
     * @return a 64-bit unsigned integer
     */
    public long getUint64(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_settings_get_uint64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Checks the "user value" of a key, if there is one.
     * <p>
     * The user value of a key is the last value that was set by the user.
     * <p>
     * After calling g_settings_reset() this function should always return
     * {@code null} (assuming something is not wrong with the system
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
     * @param key the key to get the user value for
     * @return the user's value, if set
     */
    public @Nullable org.gtk.glib.Variant getUserValue(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_user_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the value that is stored in {@code settings} for {@code key}.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings}.
     * @param key the key to get the value for
     * @return a new {@link org.gtk.glib.Variant}
     */
    public org.gtk.glib.Variant getValue(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_get_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Finds out if a key can be written or not
     * @param name the name of a key
     * @return {@code true} if the key {@code name} is writable
     */
    public boolean isWritable(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_is_writable.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the list of children on {@code settings}.
     * <p>
     * The list is exactly the list of strings for which it is not an error
     * to call g_settings_get_child().
     * <p>
     * There is little reason to call this function from "normal" code, since
     * you should already know what children are in your schema. This function
     * may still be useful there for introspection reasons, however.
     * <p>
     * You should free the return value with g_strfreev() when you are done
     * with it.
     * @return a list of the children
     *    on {@code settings}, in no defined order
     */
    public PointerString listChildren() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_list_children.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Introspects the list of keys on {@code settings}.
     * <p>
     * You should probably not be calling this function from "normal" code
     * (since you should already know what keys are in your schema).  This
     * function is intended for introspection reasons.
     * <p>
     * You should free the return value with g_strfreev() when you are done
     * with it.
     * @return a list
     *    of the keys on {@code settings}, in no defined order
     * @deprecated Use g_settings_schema_list_keys() instead.
     */
    @Deprecated
    public PointerString listKeys() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_list_keys.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Checks if the given {@code value} is of the correct type and within the
     * permitted range for {@code key}.
     * @param key the key to check
     * @param value the value to check
     * @return {@code true} if {@code value} is valid for {@code key}
     * @deprecated Use g_settings_schema_key_range_check() instead.
     */
    @Deprecated
    public boolean rangeCheck(java.lang.String key, org.gtk.glib.Variant value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_range_check.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Resets {@code key} to its default value.
     * <p>
     * This call resets the key, as much as possible, to its default value.
     * That might be the value specified in the schema or the one set by the
     * administrator.
     * @param key the name of a key
     */
    public void reset(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_reset.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
        try {
            DowncallHandles.g_settings_revert.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience function that combines g_settings_set_value() with
     * g_variant_new().
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or for the {@link org.gtk.glib.VariantType} of {@code format} to mismatch
     * the type given in the schema.
     * @param key the name of the key to set
     * @param format a {@link org.gtk.glib.Variant} format string
     * @param varargs arguments as per {@code format}
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean set(java.lang.String key, java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for booleans.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a boolean type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setBoolean(java.lang.String key, boolean value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_boolean.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.booleanToInteger.marshal(value, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for doubles.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a 'double' type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setDouble(java.lang.String key, double value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_double.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param key a key, within {@code settings}
     * @param value an enumerated value
     * @return {@code true}, if the set succeeds
     */
    public boolean setEnum(java.lang.String key, int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_enum.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param key a key, within {@code settings}
     * @param value a flags value
     * @return {@code true}, if the set succeeds
     */
    public boolean setFlags(java.lang.String key, int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_flags.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 32-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int32 type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setInt(java.lang.String key, int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_int.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 64-bit integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a int64 type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setInt64(java.lang.String key, long value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_int64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for strings.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a string type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setString(java.lang.String key, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for string arrays.  If
     * {@code value} is {@code null}, then {@code key} is set to be the empty array.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having an array of strings type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to, or {@code null}
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setStrv(java.lang.String key, @Nullable java.lang.String[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_strv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeArray(value, false, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 32-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint32 type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setUint(java.lang.String key, int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_uint.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * A convenience variant of g_settings_set() for 64-bit unsigned
     * integers.
     * <p>
     * It is a programmer error to give a {@code key} that isn't specified as
     * having a uint64 type in the schema for {@code settings}.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setUint64(java.lang.String key, long value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_uint64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code key} in {@code settings} to {@code value}.
     * <p>
     * It is a programmer error to give a {@code key} that isn't contained in the
     * schema for {@code settings} or for {@code value} to have the incorrect type, per
     * the schema.
     * <p>
     * If {@code value} is floating then this function consumes the reference.
     * @param key the name of the key to set
     * @param value a {@link org.gtk.glib.Variant} of the correct type
     * @return {@code true} if setting the key succeeded,
     *     {@code false} if the key was not writable
     */
    public boolean setValue(java.lang.String key, org.gtk.glib.Variant value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_settings_set_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_settings_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Deprecated.
     * @return a list of
     *   relocatable {@link Settings} schemas that are available, in no defined order.
     *   The list must not be modified or freed.
     * @deprecated Use g_settings_schema_source_list_schemas() instead
     */
    @Deprecated
    public static PointerString listRelocatableSchemas() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_list_relocatable_schemas.invokeExact();
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Deprecated.
     * @return a list of
     *   {@link Settings} schemas that are available, in no defined order.  The list
     *   must not be modified or freed.
     * @deprecated Use g_settings_schema_source_list_schemas() instead.
     * If you used g_settings_list_schemas() to check for the presence of
     * a particular schema, use g_settings_schema_source_lookup() instead
     * of your whole loop.
     */
    @Deprecated
    public static PointerString listSchemas() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_settings_list_schemas.invokeExact();
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
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
        try {
            DowncallHandles.g_settings_sync.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes an existing binding for {@code property} on {@code object}.
     * <p>
     * Note that bindings are automatically removed when the
     * object is finalized, so it is rarely necessary to call this
     * function.
     * @param object the object
     * @param property the property whose binding is removed
     */
    public static void unbind(org.gtk.gobject.GObject object, java.lang.String property) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_unbind.invokeExact(
                        object.handle(),
                        Marshal.stringToAddress.marshal(property, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeEvent} callback.
     */
    @FunctionalInterface
    public interface ChangeEvent {
    
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
         * be {@code null} and {@code n_keys} will be 0.
         * <p>
         * The default handler for this signal invokes the "changed" signal
         * for each affected key.  If any other connected handler returns
         * {@code true} then this default functionality will be suppressed.
         */
        boolean run(@Nullable org.gtk.glib.Quark[] keys, int nKeys);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSettings, MemoryAddress keys, int nKeys) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(org.gtk.glib.Quark.fromNativeArray(keys, nKeys), nKeys);
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeEvent.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * be {@code null} and {@code n_keys} will be 0.
     * <p>
     * The default handler for this signal invokes the "changed" signal
     * for each affected key.  If any other connected handler returns
     * {@code true} then this default functionality will be suppressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Settings.ChangeEvent> onChangeEvent(Settings.ChangeEvent handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("change-event", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
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
        void run(java.lang.String key);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSettings, MemoryAddress key) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(key, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Settings.Changed> onChanged(@Nullable String detail, Settings.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code WritableChangeEvent} callback.
     */
    @FunctionalInterface
    public interface WritableChangeEvent {
    
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
         * connected handler returns {@code true} then this default functionality
         * will be suppressed.
         */
        boolean run(int key);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSettings, int key) {
            var RESULT = run(key);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WritableChangeEvent.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * connected handler returns {@code true} then this default functionality
     * will be suppressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Settings.WritableChangeEvent> onWritableChangeEvent(Settings.WritableChangeEvent handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("writable-change-event", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code WritableChanged} callback.
     */
    @FunctionalInterface
    public interface WritableChanged {
    
        /**
         * The "writable-changed" signal is emitted when the writability of a
         * key has potentially changed.  You should call
         * g_settings_is_writable() in order to determine the new status.
         * <p>
         * This signal supports detailed connections.  You can connect to the
         * detailed signal "writable-changed::x" in order to only receive
         * callbacks when the writability of "x" changes.
         */
        void run(java.lang.String key);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSettings, MemoryAddress key) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(key, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WritableChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The "writable-changed" signal is emitted when the writability of a
     * key has potentially changed.  You should call
     * g_settings_is_writable() in order to determine the new status.
     * <p>
     * This signal supports detailed connections.  You can connect to the
     * detailed signal "writable-changed::x" in order to only receive
     * callbacks when the writability of "x" changes.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Settings.WritableChanged> onWritableChanged(@Nullable String detail, Settings.WritableChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("writable-changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Settings.Builder} object constructs a {@link Settings} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Settings.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Settings} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Settings}.
         * @return A new instance of {@code Settings} with the properties 
         *         that were set in the Builder object.
         */
        public Settings build() {
            return (Settings) org.gtk.gobject.GObject.newWithProperties(
                Settings.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The name of the context that the settings are stored in.
         * @param backend The value for the {@code backend} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBackend(org.gtk.gio.SettingsBackend backend) {
            names.add("backend");
            values.add(org.gtk.gobject.Value.create(backend));
            return this;
        }
        
        /**
         * Whether the {@link Settings} object is in 'delay-apply' mode. See
         * g_settings_delay() for details.
         * @param delayApply The value for the {@code delay-apply} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDelayApply(boolean delayApply) {
            names.add("delay-apply");
            values.add(org.gtk.gobject.Value.create(delayApply));
            return this;
        }
        
        /**
         * If this property is {@code true}, the {@link Settings} object has outstanding
         * changes that will be applied when g_settings_apply() is called.
         * @param hasUnapplied The value for the {@code has-unapplied} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasUnapplied(boolean hasUnapplied) {
            names.add("has-unapplied");
            values.add(org.gtk.gobject.Value.create(hasUnapplied));
            return this;
        }
        
        /**
         * The path within the backend where the settings are stored.
         * @param path The value for the {@code path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPath(java.lang.String path) {
            names.add("path");
            values.add(org.gtk.gobject.Value.create(path));
            return this;
        }
        
        /**
         * The name of the schema that describes the types of keys
         * for this {@link Settings} object.
         * <p>
         * The type of this property is <em>not</em> {@link SettingsSchema}.
         * {@link SettingsSchema} has only existed since version 2.32 and
         * unfortunately this name was used in previous versions to refer to
         * the schema ID rather than the schema itself.  Take care to use the
         * 'settings-schema' property if you wish to pass in a
         * {@link SettingsSchema}.
         * @param schema The value for the {@code schema} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSchema(java.lang.String schema) {
            names.add("schema");
            values.add(org.gtk.gobject.Value.create(schema));
            return this;
        }
        
        /**
         * The name of the schema that describes the types of keys
         * for this {@link Settings} object.
         * @param schemaId The value for the {@code schema-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSchemaId(java.lang.String schemaId) {
            names.add("schema-id");
            values.add(org.gtk.gobject.Value.create(schemaId));
            return this;
        }
        
        /**
         * The {@link SettingsSchema} describing the types of keys for this
         * {@link Settings} object.
         * <p>
         * Ideally, this property would be called 'schema'.  {@link SettingsSchema}
         * has only existed since version 2.32, however, and before then the
         * 'schema' property was used to refer to the ID of the schema rather
         * than the schema itself.  Take care.
         * @param settingsSchema The value for the {@code settings-schema} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSettingsSchema(org.gtk.gio.SettingsSchema settingsSchema) {
            names.add("settings-schema");
            values.add(org.gtk.gobject.Value.create(settingsSchema));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_settings_new = Interop.downcallHandle(
                "g_settings_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_new_full = Interop.downcallHandle(
                "g_settings_new_full",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_new_with_backend = Interop.downcallHandle(
                "g_settings_new_with_backend",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_new_with_backend_and_path = Interop.downcallHandle(
                "g_settings_new_with_backend_and_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_new_with_path = Interop.downcallHandle(
                "g_settings_new_with_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_apply = Interop.downcallHandle(
                "g_settings_apply",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_bind = Interop.downcallHandle(
                "g_settings_bind",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_bind_with_mapping = Interop.downcallHandle(
                "g_settings_bind_with_mapping",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_bind_writable = Interop.downcallHandle(
                "g_settings_bind_writable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_create_action = Interop.downcallHandle(
                "g_settings_create_action",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_delay = Interop.downcallHandle(
                "g_settings_delay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get = Interop.downcallHandle(
                "g_settings_get",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_settings_get_boolean = Interop.downcallHandle(
                "g_settings_get_boolean",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_child = Interop.downcallHandle(
                "g_settings_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_default_value = Interop.downcallHandle(
                "g_settings_get_default_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_double = Interop.downcallHandle(
                "g_settings_get_double",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_enum = Interop.downcallHandle(
                "g_settings_get_enum",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_flags = Interop.downcallHandle(
                "g_settings_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_has_unapplied = Interop.downcallHandle(
                "g_settings_get_has_unapplied",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_int = Interop.downcallHandle(
                "g_settings_get_int",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_int64 = Interop.downcallHandle(
                "g_settings_get_int64",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_mapped = Interop.downcallHandle(
                "g_settings_get_mapped",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_range = Interop.downcallHandle(
                "g_settings_get_range",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_string = Interop.downcallHandle(
                "g_settings_get_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_strv = Interop.downcallHandle(
                "g_settings_get_strv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_uint = Interop.downcallHandle(
                "g_settings_get_uint",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_uint64 = Interop.downcallHandle(
                "g_settings_get_uint64",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_user_value = Interop.downcallHandle(
                "g_settings_get_user_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_value = Interop.downcallHandle(
                "g_settings_get_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_is_writable = Interop.downcallHandle(
                "g_settings_is_writable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_list_children = Interop.downcallHandle(
                "g_settings_list_children",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_list_keys = Interop.downcallHandle(
                "g_settings_list_keys",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_range_check = Interop.downcallHandle(
                "g_settings_range_check",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_reset = Interop.downcallHandle(
                "g_settings_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_revert = Interop.downcallHandle(
                "g_settings_revert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_set = Interop.downcallHandle(
                "g_settings_set",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_settings_set_boolean = Interop.downcallHandle(
                "g_settings_set_boolean",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_set_double = Interop.downcallHandle(
                "g_settings_set_double",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle g_settings_set_enum = Interop.downcallHandle(
                "g_settings_set_enum",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_set_flags = Interop.downcallHandle(
                "g_settings_set_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_set_int = Interop.downcallHandle(
                "g_settings_set_int",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_set_int64 = Interop.downcallHandle(
                "g_settings_set_int64",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_settings_set_string = Interop.downcallHandle(
                "g_settings_set_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_set_strv = Interop.downcallHandle(
                "g_settings_set_strv",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_set_uint = Interop.downcallHandle(
                "g_settings_set_uint",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_settings_set_uint64 = Interop.downcallHandle(
                "g_settings_set_uint64",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_settings_set_value = Interop.downcallHandle(
                "g_settings_set_value",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_get_type = Interop.downcallHandle(
                "g_settings_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_settings_list_relocatable_schemas = Interop.downcallHandle(
                "g_settings_list_relocatable_schemas",
                FunctionDescriptor.ofVoid(),
                false
        );
        
        private static final MethodHandle g_settings_list_schemas = Interop.downcallHandle(
                "g_settings_list_schemas",
                FunctionDescriptor.ofVoid(),
                false
        );
        
        private static final MethodHandle g_settings_sync = Interop.downcallHandle(
                "g_settings_sync",
                FunctionDescriptor.ofVoid(),
                false
        );
        
        private static final MethodHandle g_settings_unbind = Interop.downcallHandle(
                "g_settings_unbind",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_settings_get_type != null;
    }
}
