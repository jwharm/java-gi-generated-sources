package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.32
 */
public class SettingsSchema extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public SettingsSchema(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Get the ID of {@code schema}.
     * @return the ID
     */
    public @NotNull java.lang.String getId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_get_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the key named {@code name} from {@code schema}.
     * <p>
     * It is a programmer error to request a key that does not exist.  See
     * g_settings_schema_list_keys().
     * @param name the name of a key
     * @return the {@link SettingsSchemaKey} for {@code name}
     */
    public @NotNull org.gtk.gio.SettingsSchemaKey getKey(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_get_key.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SettingsSchemaKey(Refcounted.get(RESULT, true));
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
     * @return the path of the schema, or {@code null}
     */
    public @Nullable java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_get_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if {@code schema} has a key named {@code name}.
     * @param name the name of a key
     * @return {@code true} if such a key exists
     */
    public boolean hasKey(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_settings_schema_has_key.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the list of children in {@code schema}.
     * <p>
     * You should free the return value with g_strfreev() when you are done
     * with it.
     * @return a list of
     *    the children on {@code settings}, in no defined order
     */
    public @NotNull PointerString listChildren() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_list_children.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Introspects the list of keys on {@code schema}.
     * <p>
     * You should probably not be calling this function from "normal" code
     * (since you should already know what keys are in your schema).  This
     * function is intended for introspection reasons.
     * @return a list
     *   of the keys on {@code schema}, in no defined order
     */
    public @NotNull PointerString listKeys() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_list_keys.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Increase the reference count of {@code schema}, returning a new reference.
     * @return a new reference to {@code schema}
     */
    public @NotNull org.gtk.gio.SettingsSchema ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SettingsSchema(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of {@code schema}, possibly freeing it.
     */
    public void unref() {
        try {
            DowncallHandles.g_settings_schema_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_settings_schema_get_id = Interop.downcallHandle(
            "g_settings_schema_get_id",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_get_key = Interop.downcallHandle(
            "g_settings_schema_get_key",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_get_path = Interop.downcallHandle(
            "g_settings_schema_get_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_has_key = Interop.downcallHandle(
            "g_settings_schema_has_key",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_list_children = Interop.downcallHandle(
            "g_settings_schema_list_children",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_list_keys = Interop.downcallHandle(
            "g_settings_schema_list_keys",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_ref = Interop.downcallHandle(
            "g_settings_schema_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_settings_schema_unref = Interop.downcallHandle(
            "g_settings_schema_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
