package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is an opaque structure type.  You may not access it directly.
 */
public class SettingsSchemaSource extends io.github.jwharm.javagi.ResourceBase {

    public SettingsSchemaSource(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewFromDirectory(java.lang.String directory, SettingsSchemaSource parent, boolean trusted) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_settings_schema_source_new_from_directory(Interop.allocateNativeString(directory).handle(), parent.handle(), trusted ? 1 : 0, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Attempts to create a new schema source corresponding to the contents
     * of the given directory.
     * <p>
     * This function is not required for normal uses of {@link org.gtk.gio.Settings} but it
     * may be useful to authors of plugin management systems.
     * <p>
     * The directory should contain a file called <code>gschemas.compiled</code> as
     * produced by the {@link [glib-compile-schemas]}{@link [glib-compile-schemas]} tool.
     * <p>
     * If @trusted is <code>true</code> then <code>gschemas.compiled</code> is trusted not to be
     * corrupted. This assumption has a performance advantage, but can result
     * in crashes or inconsistent behaviour in the case of a corrupted file.
     * Generally, you should set @trusted to <code>true</code> for files installed by the
     * system and to <code>false</code> for files in the home directory.
     * <p>
     * In either case, an empty file or some types of corruption in the file will
     * result in {@link org.gtk.glib.FileError<code>#INVAL</code>  being returned.
     * <p>
     * If @parent is non-<code>null</code> then there are two effects.
     * <p>
     * First, if g_settings_schema_source_lookup() is called with the
     * @recursive flag set to <code>true</code> and the schema can not be found in the
     * source, the lookup will recurse to the parent.
     * <p>
     * Second, any references to other schemas specified within this
     * source (ie: <code>child</code> or <code>extends</code>) references may be resolved
     * from the @parent.
     * 
     * For this second reason, except in very unusual situations, the
     * @parent should probably be given as the default schema source, as
     * returned by g_settings_schema_source_get_default().
     */
    public static SettingsSchemaSource newFromDirectory(java.lang.String directory, SettingsSchemaSource parent, boolean trusted) throws GErrorException {
        return new SettingsSchemaSource(constructNewFromDirectory(directory, parent, trusted));
    }
    
    /**
     * Lists the schemas in a given source.
     * 
     * If @recursive is <code>true</code> then include parent sources.  If <code>false</code> then
     * only include the schemas from one source (ie: one directory).  You
     * probably want <code>true</code> 
     * 
     * Non-relocatable schemas are those for which you can call
     * g_settings_new().  Relocatable schemas are those for which you must
     * use g_settings_new_with_path().
     * 
     * Do not call this function from normal programs.  This is designed for
     * use by database editors, commandline tools, etc.
     */
    public void listSchemas(boolean recursive, java.lang.String[] nonRelocatable, java.lang.String[] relocatable) {
        gtk_h.g_settings_schema_source_list_schemas(handle(), recursive ? 1 : 0, Interop.allocateNativeArray(nonRelocatable).handle(), Interop.allocateNativeArray(relocatable).handle());
    }
    
    /**
     * Looks up a schema with the identifier @schema_id in @source.
     * 
     * This function is not required for normal uses of {@link org.gtk.gio.Settings} but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * 
     * If the schema isn&<code>#39</code> t found directly in @source and @recursive is <code>true</code> then the parent sources will also be checked.
     * 
     * If the schema isn&<code>#39</code> t found, <code>null</code> is returned.
     */
    public SettingsSchema lookup(java.lang.String schemaId, boolean recursive) {
        var RESULT = gtk_h.g_settings_schema_source_lookup(handle(), Interop.allocateNativeString(schemaId).handle(), recursive ? 1 : 0);
        return new SettingsSchema(References.get(RESULT, true));
    }
    
    /**
     * Increase the reference count of @source, returning a new reference.
     */
    public SettingsSchemaSource ref() {
        var RESULT = gtk_h.g_settings_schema_source_ref(handle());
        return new SettingsSchemaSource(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of @source, possibly freeing it.
     */
    public void unref() {
        gtk_h.g_settings_schema_source_unref(handle());
    }
    
    /**
     * Gets the default system schema source.
     * <p>
     * This function is not required for normal uses of {@link org.gtk.gio.Settings} but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * <p>
     * If no schemas are installed, <code>null</code> will be returned.
     * <p>
     * The returned source may actually consist of multiple schema sources
     * from different directories, depending on which directories were given
     * in <code>XDG_DATA_DIRS</code> and <code>GSETTINGS_SCHEMA_DIR</code>. For this reason, all
     * lookups performed against the default source should probably be done
     * recursively.
     */
    public static SettingsSchemaSource getDefault() {
        var RESULT = gtk_h.g_settings_schema_source_get_default();
        return new SettingsSchemaSource(References.get(RESULT, false));
    }
    
}
