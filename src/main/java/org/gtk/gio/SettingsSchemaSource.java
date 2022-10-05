package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * This is an opaque structure type.  You may not access it directly.
 */
public class SettingsSchemaSource extends io.github.jwharm.javagi.ResourceBase {

    public SettingsSchemaSource(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_settings_schema_source_new_from_directory = Interop.downcallHandle(
        "g_settings_schema_source_new_from_directory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromDirectory(java.lang.String directory, SettingsSchemaSource parent, boolean trusted) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_settings_schema_source_new_from_directory.invokeExact(Interop.allocateNativeString(directory).handle(), parent.handle(), trusted ? 1 : 0, GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attempts to create a new schema source corresponding to the contents
     * of the given directory.
     * <p>
     * This function is not required for normal uses of {@link Settings} but it
     * may be useful to authors of plugin management systems.
     * <p>
     * The directory should contain a file called {@code gschemas.compiled} as
     * produced by the [glib-compile-schemas][glib-compile-schemas] tool.
     * <p>
     * If {@code trusted} is {@code true} then {@code gschemas.compiled} is trusted not to be
     * corrupted. This assumption has a performance advantage, but can result
     * in crashes or inconsistent behaviour in the case of a corrupted file.
     * Generally, you should set {@code trusted} to {@code true} for files installed by the
     * system and to {@code false} for files in the home directory.
     * <p>
     * In either case, an empty file or some types of corruption in the file will
     * result in {@link org.gtk.glib.FileError#INVAL} being returned.
     * <p>
     * If {@code parent} is non-{@code null} then there are two effects.
     * <p>
     * First, if g_settings_schema_source_lookup() is called with the
     * {@code recursive} flag set to {@code true} and the schema can not be found in the
     * source, the lookup will recurse to the parent.
     * <p>
     * Second, any references to other schemas specified within this
     * source (ie: {@code child} or {@code extends}) references may be resolved
     * from the {@code parent}.
     * <p>
     * For this second reason, except in very unusual situations, the
     * {@code parent} should probably be given as the default schema source, as
     * returned by g_settings_schema_source_get_default().
     */
    public static SettingsSchemaSource newFromDirectory(java.lang.String directory, SettingsSchemaSource parent, boolean trusted) throws GErrorException {
        return new SettingsSchemaSource(constructNewFromDirectory(directory, parent, trusted));
    }
    
    static final MethodHandle g_settings_schema_source_list_schemas = Interop.downcallHandle(
        "g_settings_schema_source_list_schemas",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the schemas in a given source.
     * <p>
     * If {@code recursive} is {@code true} then include parent sources.  If {@code false} then
     * only include the schemas from one source (ie: one directory).  You
     * probably want {@code true}.
     * <p>
     * Non-relocatable schemas are those for which you can call
     * g_settings_new().  Relocatable schemas are those for which you must
     * use g_settings_new_with_path().
     * <p>
     * Do not call this function from normal programs.  This is designed for
     * use by database editors, commandline tools, etc.
     */
    public void listSchemas(boolean recursive, java.lang.String[] nonRelocatable, java.lang.String[] relocatable) {
        try {
            g_settings_schema_source_list_schemas.invokeExact(handle(), recursive ? 1 : 0, Interop.allocateNativeArray(nonRelocatable).handle(), Interop.allocateNativeArray(relocatable).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_source_lookup = Interop.downcallHandle(
        "g_settings_schema_source_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up a schema with the identifier {@code schema_id} in {@code source}.
     * <p>
     * This function is not required for normal uses of {@link Settings} but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * <p>
     * If the schema isn't found directly in {@code source} and {@code recursive} is {@code true}
     * then the parent sources will also be checked.
     * <p>
     * If the schema isn't found, {@code null} is returned.
     */
    public SettingsSchema lookup(java.lang.String schemaId, boolean recursive) {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_source_lookup.invokeExact(handle(), Interop.allocateNativeString(schemaId).handle(), recursive ? 1 : 0);
            return new SettingsSchema(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_source_ref = Interop.downcallHandle(
        "g_settings_schema_source_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count of {@code source}, returning a new reference.
     */
    public SettingsSchemaSource ref() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_source_ref.invokeExact(handle());
            return new SettingsSchemaSource(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_source_unref = Interop.downcallHandle(
        "g_settings_schema_source_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the reference count of {@code source}, possibly freeing it.
     */
    public void unref() {
        try {
            g_settings_schema_source_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_source_get_default = Interop.downcallHandle(
        "g_settings_schema_source_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default system schema source.
     * <p>
     * This function is not required for normal uses of {@link Settings} but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * <p>
     * If no schemas are installed, {@code null} will be returned.
     * <p>
     * The returned source may actually consist of multiple schema sources
     * from different directories, depending on which directories were given
     * in {@code XDG_DATA_DIRS} and {@code GSETTINGS_SCHEMA_DIR}. For this reason, all
     * lookups performed against the default source should probably be done
     * recursively.
     */
    public static SettingsSchemaSource getDefault() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_source_get_default.invokeExact();
            return new SettingsSchemaSource(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
