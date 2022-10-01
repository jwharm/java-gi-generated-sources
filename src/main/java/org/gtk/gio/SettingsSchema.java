package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link SettingsSchemaSource} and {@link SettingsSchema} APIs provide a
 * mechanism for advanced control over the loading of schemas and a
 * mechanism for introspecting their content.
 * <p>
 * Plugin loading systems that wish to provide plugins a way to access
 * settings face the problem of how to make the schemas for these
 * settings visible to GSettings.  Typically, a plugin will want to ship
 * the schema along with itself and it won't be installed into the
 * standard system directories for schemas.
 * <p>
 * {@link SettingsSchemaSource} provides a mechanism for dealing with this by
 * allowing the creation of a new 'schema source' from which schemas can
 * be acquired.  This schema source can then become part of the metadata
 * associated with the plugin and queried whenever the plugin requires
 * access to some settings.
 * <p>
 * Consider the following example:
 * <p>
 * <pre>{@code <!-- language="C" -->
 * typedef struct
 * {
 *    ...
 *    GSettingsSchemaSource *schema_source;
 *    ...
 * } Plugin;
 * 
 * Plugin *
 * initialise_plugin (const gchar *dir)
 * {
 *   Plugin *plugin;
 * 
 *   ...
 * 
 *   plugin->schema_source =
 *     g_settings_schema_source_new_from_directory (dir,
 *       g_settings_schema_source_get_default (), FALSE, NULL);
 * 
 *   ...
 * 
 *   return plugin;
 * }
 * 
 * ...
 * 
 * GSettings *
 * plugin_get_settings (Plugin      *plugin,
 *                      const gchar *schema_id)
 * {
 *   GSettingsSchema *schema;
 * 
 *   if (schema_id == NULL)
 *     schema_id = plugin->identifier;
 * 
 *   schema = g_settings_schema_source_lookup (plugin->schema_source,
 *                                             schema_id, FALSE);
 * 
 *   if (schema == NULL)
 *     {
 *       ... disable the plugin or abort, etc ...
 *     }
 * 
 *   return g_settings_new_full (schema, NULL, NULL);
 * }
 * }</pre>
 * <p>
 * The code above shows how hooks should be added to the code that
 * initialises (or enables) the plugin to create the schema source and
 * how an API can be added to the plugin system to provide a convenient
 * way for the plugin to access its settings, using the schemas that it
 * ships.
 * <p>
 * From the standpoint of the plugin, it would need to ensure that it
 * ships a gschemas.compiled file as part of itself, and then simply do
 * the following:
 * <p>
 * <pre>{@code <!-- language="C" -->
 * {
 *   GSettings *settings;
 *   gint some_value;
 * 
 *   settings = plugin_get_settings (self, NULL);
 *   some_value = g_settings_get_int (settings, "some-value");
 *   ...
 * }
 * }</pre>
 * <p>
 * It's also possible that the plugin system expects the schema source
 * files (ie: .gschema.xml files) instead of a gschemas.compiled file.
 * In that case, the plugin loading system must compile the schemas for
 * itself before attempting to create the settings source.
 */
public class SettingsSchema extends io.github.jwharm.javagi.ResourceBase {

    public SettingsSchema(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Get the ID of {@code schema}.
     */
    public java.lang.String getId() {
        var RESULT = gtk_h.g_settings_schema_get_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the key named {@code name} from {@code schema}.
     * <p>
     * It is a programmer error to request a key that does not exist.  See
     * g_settings_schema_list_keys().
     */
    public SettingsSchemaKey getKey(java.lang.String name) {
        var RESULT = gtk_h.g_settings_schema_get_key(handle(), Interop.allocateNativeString(name).handle());
        return new SettingsSchemaKey(References.get(RESULT, true));
    }
    
    /**
     * Gets the path associated with {@code schema}, or {@code null}.
     * <p>
     * Schemas may be single-instance or relocatable.  Single-instance
     * schemas correspond to exactly one set of keys in the backend
     * database: those located at the path returned by this function.
     * <p>
     * Relocatable schemas can be referenced by other schemas and can
     * therefore describe multiple sets of keys at different locations.  For
     * relocatable schemas, this function will return {@code null}.
     */
    public java.lang.String getPath() {
        var RESULT = gtk_h.g_settings_schema_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if {@code schema} has a key named {@code name}.
     */
    public boolean hasKey(java.lang.String name) {
        var RESULT = gtk_h.g_settings_schema_has_key(handle(), Interop.allocateNativeString(name).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the list of children in {@code schema}.
     * <p>
     * You should free the return value with g_strfreev() when you are done
     * with it.
     */
    public PointerIterator<java.lang.String> listChildren() {
        var RESULT = gtk_h.g_settings_schema_list_children(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Introspects the list of keys on {@code schema}.
     * <p>
     * You should probably not be calling this function from "normal" code
     * (since you should already know what keys are in your schema).  This
     * function is intended for introspection reasons.
     */
    public PointerIterator<java.lang.String> listKeys() {
        var RESULT = gtk_h.g_settings_schema_list_keys(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Increase the reference count of {@code schema}, returning a new reference.
     */
    public SettingsSchema ref() {
        var RESULT = gtk_h.g_settings_schema_ref(handle());
        return new SettingsSchema(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of {@code schema}, possibly freeing it.
     */
    public void unref() {
        gtk_h.g_settings_schema_unref(handle());
    }
    
}
