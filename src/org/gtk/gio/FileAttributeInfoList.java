package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as #GFileAttributeInfos.
 */
public class FileAttributeInfoList extends io.github.jwharm.javagi.interop.ResourceBase {

    public FileAttributeInfoList(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new file attribute info list.
     */
    public FileAttributeInfoList() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_info_list_new(), true));
    }
    
    /**
     * Adds a new attribute with @name to the @list, setting
     * its @type and @flags.
     */
    public void add(java.lang.String name, FileAttributeType type, int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_info_list_add(HANDLE(), Interop.getAllocator().allocateUtf8String(name), type.getValue(), flags);
    }
    
    /**
     * Makes a duplicate of a file attribute info list.
     */
    public FileAttributeInfoList dup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_info_list_dup(HANDLE());
        return new FileAttributeInfoList(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the file attribute with the name @name from @list.
     */
    public FileAttributeInfo lookup(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_info_list_lookup(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
        return new FileAttributeInfo(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * References a file attribute info list.
     */
    public FileAttributeInfoList ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_info_list_ref(HANDLE());
        return new FileAttributeInfoList(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Removes a reference from the given @list. If the reference count
     * falls to zero, the @list is deleted.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_info_list_unref(HANDLE());
    }
    
}
