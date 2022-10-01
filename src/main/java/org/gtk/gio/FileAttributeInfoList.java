package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as {@code GFileAttributeInfos}.
 */
public class FileAttributeInfoList extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeInfoList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_file_attribute_info_list_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new file attribute info list.
     */
    public FileAttributeInfoList() {
        super(constructNew());
    }
    
    /**
     * Adds a new attribute with {@code name} to the {@code list}, setting
     * its {@code type} and {@code flags}.
     */
    public void add(java.lang.String name, FileAttributeType type, FileAttributeInfoFlags flags) {
        gtk_h.g_file_attribute_info_list_add(handle(), Interop.allocateNativeString(name).handle(), type.getValue(), flags.getValue());
    }
    
    /**
     * Makes a duplicate of a file attribute info list.
     */
    public FileAttributeInfoList dup() {
        var RESULT = gtk_h.g_file_attribute_info_list_dup(handle());
        return new FileAttributeInfoList(References.get(RESULT, true));
    }
    
    /**
     * Gets the file attribute with the name {@code name} from {@code list}.
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
     * Removes a reference from the given {@code list}. If the reference count
     * falls to zero, the {@code list} is deleted.
     */
    public void unref() {
        gtk_h.g_file_attribute_info_list_unref(handle());
    }
    
}
