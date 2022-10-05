package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as {@code GFileAttributeInfos}.
 */
public class FileAttributeInfoList extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeInfoList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_file_attribute_info_list_new = Interop.downcallHandle(
        "g_file_attribute_info_list_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_file_attribute_info_list_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new file attribute info list.
     */
    public FileAttributeInfoList() {
        super(constructNew());
    }
    
    static final MethodHandle g_file_attribute_info_list_add = Interop.downcallHandle(
        "g_file_attribute_info_list_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a new attribute with {@code name} to the {@code list}, setting
     * its {@code type} and {@code flags}.
     */
    public void add(java.lang.String name, FileAttributeType type, FileAttributeInfoFlags flags) {
        try {
            g_file_attribute_info_list_add.invokeExact(handle(), Interop.allocateNativeString(name).handle(), type.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_info_list_dup = Interop.downcallHandle(
        "g_file_attribute_info_list_dup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a duplicate of a file attribute info list.
     */
    public FileAttributeInfoList dup() {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_info_list_dup.invokeExact(handle());
            return new FileAttributeInfoList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_info_list_lookup = Interop.downcallHandle(
        "g_file_attribute_info_list_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file attribute with the name {@code name} from {@code list}.
     */
    public FileAttributeInfo lookup(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_info_list_lookup.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return new FileAttributeInfo(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_info_list_ref = Interop.downcallHandle(
        "g_file_attribute_info_list_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * References a file attribute info list.
     */
    public FileAttributeInfoList ref() {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_info_list_ref.invokeExact(handle());
            return new FileAttributeInfoList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_info_list_unref = Interop.downcallHandle(
        "g_file_attribute_info_list_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a reference from the given {@code list}. If the reference count
     * falls to zero, the {@code list} is deleted.
     */
    public void unref() {
        try {
            g_file_attribute_info_list_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
