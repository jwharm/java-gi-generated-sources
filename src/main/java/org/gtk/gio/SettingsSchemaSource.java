package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is an opaque structure type.  You may not access it directly.
 * @version 2.32
 */
public class SettingsSchemaSource extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsSchemaSource";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SettingsSchemaSource}
     * @return A new, uninitialized @{link SettingsSchemaSource}
     */
    public static SettingsSchemaSource allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SettingsSchemaSource newInstance = new SettingsSchemaSource(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SettingsSchemaSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SettingsSchemaSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SettingsSchemaSource> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SettingsSchemaSource(input, ownership);
    
    private static MemoryAddress constructNewFromDirectory(java.lang.String directory, @Nullable org.gtk.gio.SettingsSchemaSource parent, boolean trusted) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_source_new_from_directory.invokeExact(
                    Marshal.stringToAddress.marshal(directory, null),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Marshal.booleanToInteger.marshal(trusted, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     * @param directory the filename of a directory
     * @param parent a {@link SettingsSchemaSource}, or {@code null}
     * @param trusted {@code true}, if the directory is trusted
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static SettingsSchemaSource newFromDirectory(java.lang.String directory, @Nullable org.gtk.gio.SettingsSchemaSource parent, boolean trusted) throws GErrorException {
        var RESULT = constructNewFromDirectory(directory, parent, trusted);
        return org.gtk.gio.SettingsSchemaSource.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
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
     * @param recursive if we should recurse
     * @param nonRelocatable the
     *   list of non-relocatable schemas, in no defined order
     * @param relocatable the list
     *   of relocatable schemas, in no defined order
     */
    public void listSchemas(boolean recursive, java.lang.String[] nonRelocatable, java.lang.String[] relocatable) {
        try {
            DowncallHandles.g_settings_schema_source_list_schemas.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(recursive, null).intValue(),
                    Interop.allocateNativeArray(nonRelocatable, false),
                    Interop.allocateNativeArray(relocatable, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param schemaId a schema ID
     * @param recursive {@code true} if the lookup should be recursive
     * @return a new {@link SettingsSchema}
     */
    public @Nullable org.gtk.gio.SettingsSchema lookup(java.lang.String schemaId, boolean recursive) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_source_lookup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(schemaId, null),
                    Marshal.booleanToInteger.marshal(recursive, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SettingsSchema.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Increase the reference count of {@code source}, returning a new reference.
     * @return a new reference to {@code source}
     */
    public org.gtk.gio.SettingsSchemaSource ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_source_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SettingsSchemaSource.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decrease the reference count of {@code source}, possibly freeing it.
     */
    public void unref() {
        try {
            DowncallHandles.g_settings_schema_source_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @return the default schema source
     */
    public static @Nullable org.gtk.gio.SettingsSchemaSource getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_source_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SettingsSchemaSource.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_settings_schema_source_new_from_directory = Interop.downcallHandle(
            "g_settings_schema_source_new_from_directory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_source_list_schemas = Interop.downcallHandle(
            "g_settings_schema_source_list_schemas",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_source_lookup = Interop.downcallHandle(
            "g_settings_schema_source_lookup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_settings_schema_source_ref = Interop.downcallHandle(
            "g_settings_schema_source_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_source_unref = Interop.downcallHandle(
            "g_settings_schema_source_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_source_get_default = Interop.downcallHandle(
            "g_settings_schema_source_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
