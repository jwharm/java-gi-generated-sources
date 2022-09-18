package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.gio.Settings} class provides a convenient API for storing and retrieving
 * application settings.
 * <p>
 * Reads and writes can be considered to be non-blocking.  Reading
 * settings with {@link org.gtk.gio.Settings} is typically extremely fast: on
 * approximately the same order of magnitude (but slower than) a
 * {@link org.gtk.glib.HashTable} lookup.  Writing settings is also extremely fast in terms
 * of time to return to your application, but can be extremely expensive
 * for other threads and other processes.  Many settings backends
 * (including dconf) have lazy initialisation which means in the common
 * case of the user using their computer without modifying any settings
 * a lot of work can be avoided.  For dconf, the D-Bus service doesn&<code>#39</code> t
 * even need to be started in this case.  For this reason, you should
 * only ever modify {@link org.gtk.gio.Settings} keys in response to explicit user action.
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
 * can also be &<code>#39</code> {@link [relocatable]}{@link [gsettings-relocatable]}&<code>#39</code> , i.e. not equipped with
 * a fixed path. This is
 * useful e.g. when the schema describes an &<code>#39</code> account&<code>#39</code> , and you want to be
 * able to store a arbitrary number of accounts.
 * <p>
 * Paths must start with and end with a forward slash character (&<code>#39</code> /&<code>#39</code> )
 * and must not contain two sequential slash characters.  Paths should
 * be chosen based on a domain name associated with the program or
 * library to which the settings belong.  Examples of paths are
 * &<code>#34</code> /org/gtk/settings/file-chooser/&<code>#34</code>  and &<code>#34</code> /ca/desrt/dconf-editor/&<code>#34</code> .
 * Paths should not start with &<code>#34</code> /apps/&<code>#34</code> , &<code>#34</code> /desktop/&<code>#34</code>  or &<code>#34</code> /system/&<code>#34</code>  as
 * they often did in GConf.
 * <p>
 * Unlike other configuration systems (like GConf), GSettings does not
 * restrict keys to basic types like strings and numbers. GSettings stores
 * values as {@link org.gtk.glib.Variant}  and allows any {@link org.gtk.glib.VariantType} for keys. Key names
 * are restricted to lowercase characters, numbers and &<code>#39</code> -&<code>#39</code> . Furthermore,
 * the names must begin with a lowercase character, must not end
 * with a &<code>#39</code> -&<code>#39</code> , and must not contain consecutive dashes.
 * <p>
 * Similar to GConf, the default values in GSettings schemas can be
 * localized, but the localized values are stored in gettext catalogs
 * and looked up with the domain that is specified in the<code>gettext-domain</code> attribute of the &<code>#60</code> schemalist&<code>#62</code>  or &<code>#60</code> schema&<code>#62</code> 
 * elements and the category that is specified in the <code>l10n</code> attribute of
 * the &<code>#60</code> default&<code>#62</code>  element. The string which is translated includes all text in
 * the &<code>#60</code> default&<code>#62</code>  element, including any surrounding quotation marks.
 * <p>
 * The <code>l10n</code> attribute must be set to <code>messages</code> or <code>time</code>, and sets the
 * {@link [locale category for
 * translation]}(https://www.gnu.org/software/gettext/manual/html_node/Aspects.html<code>#index</code> locale-categories-1).
 * The <code>messages</code> category should be used by default; use <code>time</code> for
 * translatable date or time formats. A translation comment can be added as an
 * XML comment immediately above the &<code>#60</code> default&<code>#62</code>  element &<code>#8212</code>  it is recommended to
 * add these comments to aid translators understand the meaning and
 * implications of the default value. An optional translation <code>context</code>
 * attribute can be set on the &<code>#60</code> default&<code>#62</code>  element to disambiguate multiple
 * defaults which use the same string.
 * <p>
 * For example:
 * |{@link [
 *  &<code>#60</code> !-- Translators: A list of words which are not allowed to be typed, in
 *       GVariant serialization syntax.
 *       See: https://developer.gnome.org/glib/stable/gvariant-text.html --&<code>#62</code> 
 *  &<code>#60</code> default l10n=&<code>#39</code> messages&<code>#39</code>  context=&<code>#39</code> Banned words&<code>#39</code> &<code>#62</code> [&<code>#39</code> bad&<code>#39</code> , &<code>#39</code> words&<code>#39</code> ]}&<code>#60</code> /default&<code>#62</code> 
 * ]|
 * <p>
 * Translations of default values must remain syntactically valid serialized
 * <code>#GVariants</code> (e.g. retaining any surrounding quotation marks) or runtime
 * errors will occur.
 * <p>
 * GSettings uses schemas in a compact binary form that is created
 * by the {@link [glib-compile-schemas]}{@link [glib-compile-schemas]}
 * utility. The input is a schema description in an XML format.
 * <p>
 * A DTD for the gschema XML format can be found here:
 * {@link [gschema.dtd]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/gschema.dtd)
 * <p>
 * The {@link [glib-compile-schemas]}{@link [glib-compile-schemas]} tool expects schema
 * files to have the extension <code>.gschema.xml</code>.
 * <p>
 * At runtime, schemas are identified by their id (as specified in the
 * id attribute of the &<code>#60</code> schema&<code>#62</code>  element). The convention for schema
 * ids is to use a dotted name, similar in style to a D-Bus bus name,
 * e.g. &<code>#34</code> org.gnome.SessionManager&<code>#34</code> . In particular, if the settings are
 * for a specific service that owns a D-Bus bus name, the D-Bus bus name
 * and schema id should match. For schemas which deal with settings not
 * associated with one named application, the id should not use
 * StudlyCaps, e.g. &<code>#34</code> org.gnome.font-rendering&<code>#34</code> .
 * <p>
 * In addition to {@link org.gtk.glib.Variant} types, keys can have types that have
 * enumerated types. These can be described by a &<code>#60</code> choice&<code>#62</code> ,
 * &<code>#60</code> enum&<code>#62</code>  or &<code>#60</code> flags&<code>#62</code>  element, as seen in the
 * {@link [example]}{@link [schema-enumerated]}. The underlying type of such a key
 * is string, but you can use g_settings_get_enum(), g_settings_set_enum(),
 * g_settings_get_flags(), g_settings_set_flags() access the numeric values
 * corresponding to the string value of enum and flags keys.
 * <p>
 * An example for default value:
 * |{@link [
 * &<code>#60</code> schemalist&<code>#62</code> 
 *   &<code>#60</code> schema id=&<code>#34</code> org.gtk.Test&<code>#34</code>  path=&<code>#34</code> /org/gtk/Test/&<code>#34</code>  gettext-domain=&<code>#34</code> test&<code>#34</code> &<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#34</code> greeting&<code>#34</code>  type=&<code>#34</code> s&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> default l10n=&<code>#34</code> messages&<code>#34</code> &<code>#62</code> &<code>#34</code> Hello, earthlings&<code>#34</code> &<code>#60</code> /default&<code>#62</code> 
 *       &<code>#60</code> summary&<code>#62</code> A greeting&<code>#60</code> /summary&<code>#62</code> 
 *       &<code>#60</code> description&<code>#62</code> 
 *         Greeting of the invading martians
 *       &<code>#60</code> /description&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#34</code> box&<code>#34</code>  type=&<code>#34</code> (ii)&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> default&<code>#62</code> (20,30)&<code>#60</code> /default&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#34</code> empty-string&<code>#34</code>  type=&<code>#34</code> s&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> default&<code>#62</code> &<code>#34</code> &<code>#34</code> &<code>#60</code> /default&<code>#62</code> 
 *       &<code>#60</code> summary&<code>#62</code> Empty strings have to be provided in GVariant form&<code>#60</code> /summary&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 * <p>
 *   &<code>#60</code> /schema&<code>#62</code> 
 * &<code>#60</code> /schemalist&<code>#62</code> 
 * ]}|
 * <p>
 * An example for ranges, choices and enumerated types:
 * |{@link [
 * &<code>#60</code> schemalist&<code>#62</code> 
 * <p>
 *   &<code>#60</code> enum id=&<code>#34</code> org.gtk.Test.myenum&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> value nick=&<code>#34</code> first&<code>#34</code>  value=&<code>#34</code> 1&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> value nick=&<code>#34</code> second&<code>#34</code>  value=&<code>#34</code> 2&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /enum&<code>#62</code> 
 * <p>
 *   &<code>#60</code> flags id=&<code>#34</code> org.gtk.Test.myflags&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> value nick=&<code>#34</code> flag1&<code>#34</code>  value=&<code>#34</code> 1&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> value nick=&<code>#34</code> flag2&<code>#34</code>  value=&<code>#34</code> 2&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> value nick=&<code>#34</code> flag3&<code>#34</code>  value=&<code>#34</code> 4&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /flags&<code>#62</code> 
 * <p>
 *   &<code>#60</code> schema id=&<code>#34</code> org.gtk.Test&<code>#34</code> &<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#34</code> key-with-range&<code>#34</code>  type=&<code>#34</code> i&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> range min=&<code>#34</code> 1&<code>#34</code>  max=&<code>#34</code> 100&<code>#34</code> /&<code>#62</code> 
 *       &<code>#60</code> default&<code>#62</code> 10&<code>#60</code> /default&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#34</code> key-with-choices&<code>#34</code>  type=&<code>#34</code> s&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> choices&<code>#62</code> 
 *         &<code>#60</code> choice value=&<code>#39</code> Elisabeth&<code>#39</code> /&<code>#62</code> 
 *         &<code>#60</code> choice value=&<code>#39</code> Annabeth&<code>#39</code> /&<code>#62</code> 
 *         &<code>#60</code> choice value=&<code>#39</code> Joe&<code>#39</code> /&<code>#62</code> 
 *       &<code>#60</code> /choices&<code>#62</code> 
 *       &<code>#60</code> aliases&<code>#62</code> 
 *         &<code>#60</code> alias value=&<code>#39</code> Anna&<code>#39</code>  target=&<code>#39</code> Annabeth&<code>#39</code> /&<code>#62</code> 
 *         &<code>#60</code> alias value=&<code>#39</code> Beth&<code>#39</code>  target=&<code>#39</code> Elisabeth&<code>#39</code> /&<code>#62</code> 
 *       &<code>#60</code> /aliases&<code>#62</code> 
 *       &<code>#60</code> default&<code>#62</code> &<code>#39</code> Joe&<code>#39</code> &<code>#60</code> /default&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#39</code> enumerated-key&<code>#39</code>  enum=&<code>#39</code> org.gtk.Test.myenum&<code>#39</code> &<code>#62</code> 
 *       &<code>#60</code> default&<code>#62</code> &<code>#39</code> first&<code>#39</code> &<code>#60</code> /default&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 * <p>
 *     &<code>#60</code> key name=&<code>#39</code> flags-key&<code>#39</code>  flags=&<code>#39</code> org.gtk.Test.myflags&<code>#39</code> &<code>#62</code> 
 *       &<code>#60</code> default&<code>#62</code> [&<code>#34</code> flag1&<code>#34</code> ,&<code>#34</code> flag2&<code>#34</code> ]}&<code>#60</code> /default&<code>#62</code> 
 *     &<code>#60</code> /key&<code>#62</code> 
 *   &<code>#60</code> /schema&<code>#62</code> 
 * &<code>#60</code> /schemalist&<code>#62</code> 
 * ]|
 * <p>
 * <h2>Vendor overrides</h2>
 * <p>
 * Default values are defined in the schemas that get installed by
 * an application. Sometimes, it is necessary for a vendor or distributor
 * to adjust these defaults. Since patching the XML source for the schema
 * is inconvenient and error-prone,
 * {@link [glib-compile-schemas]}{@link [glib-compile-schemas]} reads so-called vendor
 * override&<code>#39</code>  files. These are keyfiles in the same directory as the XML
 * schema sources which can override default values. The schema id serves
 * as the group name in the key file, and the values are expected in
 * serialized GVariant form, as in the following example:
 * |{@link [
 *     [org.gtk.Example]}
 *     key1=&<code>#39</code> string&<code>#39</code> 
 *     key2=1.5
 * ]|
 * <p>
 * glib-compile-schemas expects schema files to have the extension<code>.gschema.override</code>.
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
 * looks for a boolean property with the name &<code>#34</code> sensitivity&<code>#34</code>  and
 * automatically binds it to the writability of the bound setting.
 * If this &<code>#39</code> magic&<code>#39</code>  gets in the way, it can be suppressed with the
 * {@link org.gtk.gio.SettingsBindFlags<code>#NO_SENSITIVITY</code>  flag.
 * <p>
 * <h2>Relocatable schemas <code>#</code> {<code>#gsettings</code> relocatable}</h2>
 * <p>
 * A relocatable schema is one with no <code>path</code> attribute specified on its
 * &<code>#60</code> schema&<code>#62</code>  element. By using g_settings_new_with_path(), a {@link org.gtk.gio.Settings} object
 * can be instantiated for a relocatable schema, assigning a path to the
 * instance. Paths passed to g_settings_new_with_path() will typically be
 * constructed dynamically from a constant prefix plus some form of instance
 * identifier; but they must still be valid GSettings paths. Paths could also
 * be constant and used with a globally installed schema originating from a
 * dependency library.
 * <p>
 * For example, a relocatable schema could be used to store geometry information
 * for different windows in an application. If the schema ID was<code>org.foo.MyApp.Window</code>, it could be instantiated for paths<code>/org/foo/MyApp/main/</code>, <code>/org/foo/MyApp/document-1/</code>,<code>/org/foo/MyApp/document-2/</code>, etc. If any of the paths are well-known
 * they can be specified as &<code>#60</code> child&<code>#62</code>  elements in the parent schema, e.g.:
 * |{@link [
 * &<code>#60</code> schema id=&<code>#34</code> org.foo.MyApp&<code>#34</code>  path=&<code>#34</code> /org/foo/MyApp/&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> child name=&<code>#34</code> main&<code>#34</code>  schema=&<code>#34</code> org.foo.MyApp.Window&<code>#34</code> /&<code>#62</code> 
 * &<code>#60</code> /schema&<code>#62</code> 
 * ]}|
 * <p>
 * <h2>Build system integration <code>#</code> {<code>#gsettings</code> build-system}</h2>
 * <p>
 * GSettings comes with autotools integration to simplify compiling and
 * installing schemas. To add GSettings support to an application, add the
 * following to your <code>configure.ac</code>:
 * |{@link [
 * GLIB_GSETTINGS
 * ]}|
 * <p>
 * In the appropriate <code>Makefile.am</code>, use the following snippet to compile and
 * install the named schema:
 * |{@link [
 * gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
 * EXTRA_DIST = $(gsettings_SCHEMAS)
 * <p>
 * @GSETTINGS_RULES@
 * ] (ref=
 * gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
 * EXTRA_DIST = $(gsettings_SCHEMAS)
 * <p>
 * )}|
 * <p>
 * No changes are needed to the build system to mark a schema XML file for
 * translation. Assuming it sets the <code>gettext-domain</code> attribute, a schema may
 * be marked for translation by adding it to <code>POTFILES.in</code>, assuming gettext
 * 0.19 is in use (the preferred method for translation):
 * |{@link [
 * data/org.foo.MyApp.gschema.xml
 * ]}|
 * <p>
 * Alternatively, if intltool 0.50.1 is in use:
 * |{@link [
 * [type: gettext/gsettings]}data/org.foo.MyApp.gschema.xml
 * ]|
 * <p>
 * GSettings will use gettext to look up translations for the &<code>#60</code> summary&<code>#62</code>  and
 * &<code>#60</code> description&<code>#62</code>  elements, and also any &<code>#60</code> default&<code>#62</code>  elements which have a <code>l10n</code>
 * attribute set. Translations must not be included in the <code>.gschema.xml</code> file
 * by the build system, for example by using intltool XML rules with a<code>.gschema.xml.in</code> template.
 * <p>
 * If an enumerated type defined in a C header file is to be used in a GSettings
 * schema, it can either be defined manually using an &<code>#60</code> enum&<code>#62</code>  element in the
 * schema XML, or it can be extracted automatically from the C header. This
 * approach is preferred, as it ensures the two representations are always
 * synchronised. To do so, add the following to the relevant <code>Makefile.am</code>:
 * |{@link [
 * gsettings_ENUM_NAMESPACE = org.foo.MyApp
 * gsettings_ENUM_FILES = my-app-enums.h my-app-misc.h
 * ]}|
 * <p><code>gsettings_ENUM_NAMESPACE</code> specifies the schema namespace for the enum files,
 * which are specified in <code>gsettings_ENUM_FILES</code>. This will generate a<code>org.foo.MyApp.enums.xml</code> file containing the extracted enums, which will be
 * automatically included in the schema compilation, install and uninstall
 * rules. It should not be committed to version control or included in<code>EXTRA_DIST</code>.
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
     * Creates a new {@link org.gtk.gio.Settings} object with the schema specified by
     * @schema_id.
     * 
     * It is an error for the schema to not exist: schemas are an
     * essential part of a program, as they provide type information.
     * If schemas need to be dynamically loaded (for example, from an
     * optional runtime dependency), g_settings_schema_source_lookup()
     * can be used to test for their existence before loading them.
     * 
     * Signals on the newly created {@link org.gtk.gio.Settings} object will be dispatched
     * via the thread-default {@link org.gtk.glib.MainContext} in effect at the time of the
     * call to g_settings_new().  The new {@link org.gtk.gio.Settings} will hold a reference
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
     * Creates a new {@link org.gtk.gio.Settings} object with a given schema, backend and
     * path.
     * 
     * It should be extremely rare that you ever want to use this function.
     * It is made available for advanced use-cases (such as plugin systems
     * that want to provide access to schemas loaded from custom locations,
     * etc).
     * 
     * At the most basic level, a {@link org.gtk.gio.Settings} object is a pure composition of
     * 4 things: a {@link org.gtk.gio.SettingsSchema}  a {@link org.gtk.gio.SettingsBackend}  a path within that
     * backend, and a {@link org.gtk.glib.MainContext} to which signals are dispatched.
     * 
     * This constructor therefore gives you full control over constructing
     * {@link org.gtk.gio.Settings} instances.  The first 3 parameters are given directly as
     * @schema, @backend and @path, and the main context is taken from the
     * thread-default (as per g_settings_new()).
     * 
     * If @backend is <code>null</code> then the default backend is used.
     * 
     * If @path is <code>null</code> then the path from the schema is used.  It is an
     * error if @path is <code>null</code> and the schema has no path of its own or if
     * @path is non-<code>null</code> and not equal to the path that the schema does
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
     * Creates a new {@link org.gtk.gio.Settings} object with the schema specified by
     * @schema_id and a given {@link org.gtk.gio.SettingsBackend} 
     * 
     * Creating a {@link org.gtk.gio.Settings} object with a different backend allows accessing
     * settings from a database other than the usual one. For example, it may make
     * sense to pass a backend corresponding to the &<code>#34</code> defaults&<code>#34</code>  settings database on
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
     * Creates a new {@link org.gtk.gio.Settings} object with the schema specified by
     * @schema_id and a given {@link org.gtk.gio.SettingsBackend} and path.
     * 
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
     * Creates a new {@link org.gtk.gio.Settings} object with the relocatable schema specified
     * by @schema_id and a given path.
     * 
     * You only need to do this if you want to directly create a settings
     * object with a schema that doesn&<code>#39</code> t have a specified path of its own.
     * That&<code>#39</code> s quite rare.
     * 
     * It is a programmer error to call this function for a schema that
     * has an explicitly specified path.
     * 
     * It is a programmer error if @path is not a valid path.  A valid path
     * begins and ends with &<code>#39</code> /&<code>#39</code>  and does not contain two consecutive &<code>#39</code> /&<code>#39</code> 
     * characters.
     */
    public static Settings newWithPath(java.lang.String schemaId, java.lang.String path) {
        return new Settings(constructNewWithPath(schemaId, path));
    }
    
    /**
     * Applies any changes that have been made to the settings.  This
     * function does nothing unless @settings is in &<code>#39</code> delay-apply&<code>#39</code>  mode;
     * see g_settings_delay().  In the normal case settings are always
     * applied immediately.
     */
    public void apply() {
        gtk_h.g_settings_apply(handle());
    }
    
    /**
     * Create a binding between the @key in the @settings object
     * and the property @property of @object.
     * 
     * The binding uses the default GIO mapping functions to map
     * between the settings and property values. These functions
     * handle booleans, numeric types and string types in a
     * straightforward way. Use g_settings_bind_with_mapping() if
     * you need a custom mapping, or map between types that are not
     * supported by the default mapping functions.
     * 
     * Unless the @flags include {@link org.gtk.gio.SettingsBindFlags<code>#NO_SENSITIVITY</code>   this
     * function also establishes a binding between the writability of
     * @key and the &<code>#34</code> sensitive&<code>#34</code>  property of @object (if @object has
     * a boolean property by that name). See g_settings_bind_writable()
     * for more details about writable bindings.
     * 
     * Note that the lifecycle of the binding is tied to @object,
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     */
    public void bind(java.lang.String key, org.gtk.gobject.Object object, java.lang.String property, int flags) {
        gtk_h.g_settings_bind(handle(), Interop.allocateNativeString(key).handle(), object.handle(), Interop.allocateNativeString(property).handle(), flags);
    }
    
    /**
     * Create a binding between the @key in the @settings object
     * and the property @property of @object.
     * 
     * The binding uses the provided mapping functions to map between
     * settings and property values.
     * 
     * Note that the lifecycle of the binding is tied to @object,
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
     * Create a binding between the writability of @key in the
     * @settings object and the property @property of @object.
     * The property must be boolean; &<code>#34</code> sensitive&<code>#34</code>  or &<code>#34</code> visible&<code>#34</code> 
     * properties of widgets are the most likely candidates.
     * 
     * Writable bindings are always uni-directional; changes of the
     * writability of the setting will be propagated to the object
     * property, not the other way.
     * 
     * When the @inverted argument is <code>true</code>  the binding inverts the
     * value as it passes from the setting to the object, i.e. @property
     * will be set to <code>true</code> if the key is not writable.
     * 
     * Note that the lifecycle of the binding is tied to @object,
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     */
    public void bindWritable(java.lang.String key, org.gtk.gobject.Object object, java.lang.String property, boolean inverted) {
        gtk_h.g_settings_bind_writable(handle(), Interop.allocateNativeString(key).handle(), object.handle(), Interop.allocateNativeString(property).handle(), inverted ? 1 : 0);
    }
    
    /**
     * Creates a {@link org.gtk.gio.Action} corresponding to a given {@link org.gtk.gio.Settings} key.
     * 
     * The action has the same name as the key.
     * 
     * The value of the key becomes the state of the action and the action
     * is enabled when the key is writable.  Changing the state of the
     * action results in the key being written to.  Changes to the value or
     * writability of the key cause appropriate change notifications to be
     * emitted for the action.
     * 
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
     * Changes the {@link org.gtk.gio.Settings} object into &<code>#39</code> delay-apply&<code>#39</code>  mode. In this
     * mode, changes to @settings are not immediately propagated to the
     * backend, but kept locally until g_settings_apply() is called.
     */
    public void delay() {
        gtk_h.g_settings_delay(handle());
    }
    
    /**
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for booleans.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a boolean type in the schema for @settings.
     */
    public boolean getBoolean(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_boolean(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a child settings object which has a base path of<code>base-path/@name</code>, where <code>base-path</code> is the base path of
     * @settings.
     * <p>
     * The schema for the child settings object must have been declared
     * in the schema of @settings using a <code>&<code>#60</code> child&<code>#62</code> </code> element.
     * 
     * The created child settings object will inherit the {@link org.gtk.gio.Settings} delay-apply
     * mode from @settings.
     */
    public Settings getChild(java.lang.String name) {
        var RESULT = gtk_h.g_settings_get_child(handle(), Interop.allocateNativeString(name).handle());
        return new Settings(References.get(RESULT, true));
    }
    
    /**
     * Gets the &<code>#34</code> default value&<code>#34</code>  of a key.
     * 
     * This is the value that would be read if g_settings_reset() were to be
     * called on the key.
     * 
     * Note that this may be a different value than returned by
     * g_settings_schema_key_get_default_value() if the system administrator
     * has provided a default value.
     * 
     * Comparing the return values of g_settings_get_default_value() and
     * g_settings_get_value() is not sufficient for determining if a value
     * has been set because the user may have explicitly set the value to
     * something that happens to be equal to the default.  The difference
     * here is that if the default changes in the future, the user&<code>#39</code> s key
     * will still be set.
     * 
     * This function may be useful for adding an indication to a UI of what
     * the default value was before the user set it.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings.
     */
    public org.gtk.glib.Variant getDefaultValue(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_default_value(handle(), Interop.allocateNativeString(key).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for doubles.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a &<code>#39</code> double&<code>#39</code>  type in the schema for @settings.
     */
    public double getDouble(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_double(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored in @settings for @key and converts it
     * to the enum value that it represents.
     * 
     * In order to use this function the type of the value must be a string
     * and it must be marked in the schema file as an enumerated type.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings or is not marked as an enumerated type.
     * 
     * If the value stored in the configuration database is not a valid
     * value for the enumerated type then this function will return the
     * default value.
     */
    public int getEnum(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_enum(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored in @settings for @key and converts it
     * to the flags value that it represents.
     * 
     * In order to use this function the type of the value must be an array
     * of strings and it must be marked in the schema file as a flags type.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings or is not marked as a flags type.
     * 
     * If the value stored in the configuration database is not a valid
     * value for the flags type then this function will return the default
     * value.
     */
    public int getFlags(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_flags(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Returns whether the {@link org.gtk.gio.Settings} object has any unapplied
     * changes.  This can only be the case if it is in &<code>#39</code> delayed-apply&<code>#39</code>  mode.
     */
    public boolean getHasUnapplied() {
        var RESULT = gtk_h.g_settings_get_has_unapplied(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for 32-bit integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a int32 type in the schema for @settings.
     */
    public int getInt(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_int(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for 64-bit integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a int64 type in the schema for @settings.
     */
    public long getInt64(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_int64(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored at @key in @settings, subject to
     * application-level validation/mapping.
     * 
     * You should use this function when the application needs to perform
     * some processing on the value of the key (for example, parsing).  The
     * @mapping function performs that processing.  If the function
     * indicates that the processing was unsuccessful (due to a parse error,
     * for example) then the mapping is tried again with another value.
     * 
     * This allows a robust &<code>#39</code> fall back to defaults&<code>#39</code>  behaviour to be
     * implemented somewhat automatically.
     * 
     * The first value that is tried is the user&<code>#39</code> s setting for the key.  If
     * the mapping function fails to map this value, other values may be
     * tried in an unspecified order (system or site defaults, translated
     * schema default values, untranslated schema default values, etc).
     * 
     * If the mapping function fails for all possible values, one additional
     * attempt is made: the mapping function is called with a <code>null</code> value.
     * If the mapping function still indicates failure at this point then
     * the application will be aborted.
     * 
     * The result parameter for the @mapping function is pointed to a
     * <code>#gpointer</code> which is initially set to <code>null</code>   The same pointer is given
     * to each invocation of @mapping.  The final value of that <code>#gpointer</code> is
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
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for strings.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a string type in the schema for @settings.
     */
    public java.lang.String getString(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_string(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for 32-bit unsigned
     * integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a uint32 type in the schema for @settings.
     */
    public int getUint(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_uint(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets the value that is stored at @key in @settings.
     * 
     * A convenience variant of g_settings_get() for 64-bit unsigned
     * integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a uint64 type in the schema for @settings.
     */
    public long getUint64(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_uint64(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Checks the &<code>#34</code> user value&<code>#34</code>  of a key, if there is one.
     * 
     * The user value of a key is the last value that was set by the user.
     * 
     * After calling g_settings_reset() this function should always return
     * <code>null</code> (assuming something is not wrong with the system
     * configuration).
     * 
     * It is possible that g_settings_get_value() will return a different
     * value than this function.  This can happen in the case that the user
     * set a value for a key that was subsequently locked down by the system
     * administrator -- this function will return the user&<code>#39</code> s old value.
     * 
     * This function may be useful for adding a &<code>#34</code> reset&<code>#34</code>  option to a UI or
     * for providing indication that a particular value has been changed.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings.
     */
    public org.gtk.glib.Variant getUserValue(java.lang.String key) {
        var RESULT = gtk_h.g_settings_get_user_value(handle(), Interop.allocateNativeString(key).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the value that is stored in @settings for @key.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings.
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
     * Resets @key to its default value.
     * 
     * This call resets the key, as much as possible, to its default value.
     * That might be the value specified in the schema or the one set by the
     * administrator.
     */
    public void reset(java.lang.String key) {
        gtk_h.g_settings_reset(handle(), Interop.allocateNativeString(key).handle());
    }
    
    /**
     * Reverts all non-applied changes to the settings.  This function
     * does nothing unless @settings is in &<code>#39</code> delay-apply&<code>#39</code>  mode; see
     * g_settings_delay().  In the normal case settings are always applied
     * immediately.
     * 
     * Change notifications will be emitted for affected keys.
     */
    public void revert() {
        gtk_h.g_settings_revert(handle());
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for booleans.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a boolean type in the schema for @settings.
     */
    public boolean setBoolean(java.lang.String key, boolean value) {
        var RESULT = gtk_h.g_settings_set_boolean(handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for doubles.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a &<code>#39</code> double&<code>#39</code>  type in the schema for @settings.
     */
    public boolean setDouble(java.lang.String key, double value) {
        var RESULT = gtk_h.g_settings_set_double(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Looks up the enumerated type nick for @value and writes it to @key,
     * within @settings.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings or is not marked as an enumerated type, or for
     * @value not to be a valid value for the named type.
     * 
     * After performing the write, accessing @key directly with
     * g_settings_get_string() will return the &<code>#39</code> nick&<code>#39</code>  associated with
     * @value.
     */
    public boolean setEnum(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_enum(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Looks up the flags type nicks for the bits specified by @value, puts
     * them in an array of strings and writes the array to @key, within
     * @settings.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings or is not marked as a flags type, or for @value
     * to contain any bits that are not value for the named type.
     * 
     * After performing the write, accessing @key directly with
     * g_settings_get_strv() will return an array of &<code>#39</code> nicks&<code>#39</code> ; one for each
     * bit in @value.
     */
    public boolean setFlags(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_flags(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for 32-bit integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a int32 type in the schema for @settings.
     */
    public boolean setInt(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_int(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for 64-bit integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a int64 type in the schema for @settings.
     */
    public boolean setInt64(java.lang.String key, long value) {
        var RESULT = gtk_h.g_settings_set_int64(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for strings.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a string type in the schema for @settings.
     */
    public boolean setString(java.lang.String key, java.lang.String value) {
        var RESULT = gtk_h.g_settings_set_string(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for string arrays.  If
     * @value is <code>null</code>  then @key is set to be the empty array.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having an array of strings type in the schema for @settings.
     */
    public boolean setStrv(java.lang.String key, java.lang.String[] value) {
        var RESULT = gtk_h.g_settings_set_strv(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(value).handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for 32-bit unsigned
     * integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a uint32 type in the schema for @settings.
     */
    public boolean setUint(java.lang.String key, int value) {
        var RESULT = gtk_h.g_settings_set_uint(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * A convenience variant of g_settings_set() for 64-bit unsigned
     * integers.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t specified as
     * having a uint64 type in the schema for @settings.
     */
    public boolean setUint64(java.lang.String key, long value) {
        var RESULT = gtk_h.g_settings_set_uint64(handle(), Interop.allocateNativeString(key).handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Sets @key in @settings to @value.
     * 
     * It is a programmer error to give a @key that isn&<code>#39</code> t contained in the
     * schema for @settings or for @value to have the incorrect type, per
     * the schema.
     * 
     * If @value is floating then this function consumes the reference.
     */
    public boolean setValue(java.lang.String key, org.gtk.glib.Variant value) {
        var RESULT = gtk_h.g_settings_set_value(handle(), Interop.allocateNativeString(key).handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Ensures that all pending operations are complete for the default backend.
     * 
     * Writes made to a {@link org.gtk.gio.Settings} are handled asynchronously.  For this
     * reason, it is very unlikely that the changes have it to disk by the
     * time g_settings_set() returns.
     * 
     * This call will block until all of the writes have made it to the
     * backend.  Since the mainloop is not running, no change notifications
     * will be dispatched during this call (but some may be queued by the
     * time the call is done).
     */
    public static void sync() {
        gtk_h.g_settings_sync();
    }
    
    /**
     * Removes an existing binding for @property on @object.
     * 
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
     * The &<code>#34</code> change-event&<code>#34</code>  signal is emitted once per change event that
     * affects this settings object.  You should connect to this signal
     * only if you are interested in viewing groups of changes before they
     * are split out into multiple emissions of the &<code>#34</code> changed&<code>#34</code>  signal.
     * For most use cases it is more appropriate to use the &<code>#34</code> changed&<code>#34</code>  signal.
     * 
     * In the event that the change event applies to one or more specified
     * keys, @keys will be an array of {@link org.gtk.glib.Quark} of length @n_keys.  In the
     * event that the change event applies to the {@link org.gtk.gio.Settings} object as a
     * whole (ie: potentially every key has been changed) then @keys will
     * be <code>null</code> and @n_keys will be 0.
     * 
     * The default handler for this signal invokes the &<code>#34</code> changed&<code>#34</code>  signal
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
     * The &<code>#34</code> changed&<code>#34</code>  signal is emitted when a key has potentially changed.
     * You should call one of the g_settings_get() calls to check the new
     * value.
     * 
     * This signal supports detailed connections.  You can connect to the
     * detailed signal &<code>#34</code> changed::x&<code>#34</code>  in order to only receive callbacks
     * when key &<code>#34</code> x&<code>#34</code>  changes.
     * 
     * Note that @settings only emits this signal if you have read @key at
     * least once while a signal handler was already connected for @key.
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
     * The &<code>#34</code> writable-change-event&<code>#34</code>  signal is emitted once per writability
     * change event that affects this settings object.  You should connect
     * to this signal if you are interested in viewing groups of changes
     * before they are split out into multiple emissions of the
     * &<code>#34</code> writable-changed&<code>#34</code>  signal.  For most use cases it is more
     * appropriate to use the &<code>#34</code> writable-changed&<code>#34</code>  signal.
     * 
     * In the event that the writability change applies only to a single
     * key, @key will be set to the {@link org.gtk.glib.Quark} for that key.  In the event
     * that the writability change affects the entire settings object,
     * @key will be 0.
     * 
     * The default handler for this signal invokes the &<code>#34</code> writable-changed&<code>#34</code> 
     * and &<code>#34</code> changed&<code>#34</code>  signals for each affected key.  This is done because
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
     * The &<code>#34</code> writable-changed&<code>#34</code>  signal is emitted when the writability of a
     * key has potentially changed.  You should call
     * g_settings_is_writable() in order to determine the new status.
     * 
     * This signal supports detailed connections.  You can connect to the
     * detailed signal &<code>#34</code> writable-changed::x&<code>#34</code>  in order to only receive
     * callbacks when the writability of &<code>#34</code> x&<code>#34</code>  changes.
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
