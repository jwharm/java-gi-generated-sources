package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is an opaque structure type.  You may not access it directly.
 */
public class SettingsSchemaSource extends io.github.jwharm.javagi.interop.ResourceBase {

    public SettingsSchemaSource(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Lists the schemas in a given source.
     * 
     * If @recursive is %TRUE then include parent sources.  If %FALSE then
     * only include the schemas from one source (ie: one directory).  You
     * probably want %TRUE.
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
     * This function is not required for normal uses of #GSettings but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * 
     * If the schema isn't found directly in @source and @recursive is %TRUE
     * then the parent sources will also be checked.
     * 
     * If the schema isn't found, %NULL is returned.
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
    
}
