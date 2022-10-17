package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is an opaque structure type.  You may not access it directly.
 */
public class SettingsSchemaSource extends io.github.jwharm.javagi.ResourceBase {

    public SettingsSchemaSource(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_settings_schema_source_new_from_directory = Interop.downcallHandle(
        "g_settings_schema_source_new_from_directory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromDirectory(@NotNull java.lang.String directory, @Nullable SettingsSchemaSource parent, @NotNull boolean trusted) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_settings_schema_source_new_from_directory.invokeExact(Interop.allocateNativeString(directory), parent.handle(), trusted ? 1 : 0, (Addressable) GERROR), true);
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
    public static SettingsSchemaSource newFromDirectory(@NotNull java.lang.String directory, @Nullable SettingsSchemaSource parent, @NotNull boolean trusted) throws GErrorException {
        return new SettingsSchemaSource(constructNewFromDirectory(directory, parent, trusted));
    }
    
    private static final MethodHandle g_settings_schema_source_lookup = Interop.downcallHandle(
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
    public @Nullable SettingsSchema lookup(@NotNull java.lang.String schemaId, @NotNull boolean recursive) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_settings_schema_source_lookup.invokeExact(handle(), Interop.allocateNativeString(schemaId), recursive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SettingsSchema(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_settings_schema_source_ref = Interop.downcallHandle(
        "g_settings_schema_source_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count of {@code source}, returning a new reference.
     */
    public @NotNull SettingsSchemaSource ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_settings_schema_source_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SettingsSchemaSource(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_settings_schema_source_unref = Interop.downcallHandle(
        "g_settings_schema_source_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the reference count of {@code source}, possibly freeing it.
     */
    public @NotNull void unref() {
        try {
            g_settings_schema_source_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_settings_schema_source_get_default = Interop.downcallHandle(
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
    public static @Nullable SettingsSchemaSource getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_settings_schema_source_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SettingsSchemaSource(Refcounted.get(RESULT, false));
    }
    
}
