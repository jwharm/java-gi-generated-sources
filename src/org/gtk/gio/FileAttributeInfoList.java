package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as #GFileAttributeInfos.
 */
public class FileAttributeInfoList extends io.github.jwharm.javagi.interop.ResourceBase {

    public FileAttributeInfoList(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new file attribute info list.
     */
    public FileAttributeInfoList() {
        super(References.get(gtk_h.g_file_attribute_info_list_new(), true));
    }
    
    /**
     * Adds a new attribute with @name to the @list, setting
     * its @type and @flags.
     */
    public void add(java.lang.String name, FileAttributeType type, int flags) {
        gtk_h.g_file_attribute_info_list_add(handle(), Interop.allocateNativeString(name).handle(), type.getValue(), flags);
    }
    
    /**
     * Makes a duplicate of a file attribute info list.
     */
    public FileAttributeInfoList dup() {
        var RESULT = gtk_h.g_file_attribute_info_list_dup(handle());
        return new FileAttributeInfoList(References.get(RESULT, true));
    }
    
    /**
     * Gets the file attribute with the name @name from @list.
     */
    public FileAttributeInfo lookup(java.lang.String name) {
        var RESULT = gtk_h.g_file_attribute_info_list_lookup(handle(), Interop.allocateNativeString(name).handle());
        return new FileAttributeInfo(References.get(RESULT, false));
    }
    
    /**
     * References a file attribute info list.
     */
    public FileAttributeInfoList ref() {
        var RESULT = gtk_h.g_file_attribute_info_list_ref(handle());
        return new FileAttributeInfoList(References.get(RESULT, true));
    }
    
    /**
     * Removes a reference from the given @list. If the reference count
     * falls to zero, the @list is deleted.
     */
    public void unref() {
        gtk_h.g_file_attribute_info_list_unref(handle());
    }
    
}
