package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as {@code GFileAttributeInfos}.
 */
public class FileAttributeInfoList extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeInfoList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_file_attribute_info_list_new = Interop.downcallHandle(
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
    
    private static final MethodHandle g_file_attribute_info_list_add = Interop.downcallHandle(
        "g_file_attribute_info_list_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a new attribute with {@code name} to the {@code list}, setting
     * its {@code type} and {@code flags}.
     */
    public @NotNull void add(@NotNull java.lang.String name, @NotNull FileAttributeType type, @NotNull FileAttributeInfoFlags flags) {
        try {
            g_file_attribute_info_list_add.invokeExact(handle(), Interop.allocateNativeString(name), type.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_file_attribute_info_list_dup = Interop.downcallHandle(
        "g_file_attribute_info_list_dup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a duplicate of a file attribute info list.
     */
    public @NotNull FileAttributeInfoList dup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_info_list_dup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FileAttributeInfoList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_file_attribute_info_list_lookup = Interop.downcallHandle(
        "g_file_attribute_info_list_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file attribute with the name {@code name} from {@code list}.
     */
    public @NotNull FileAttributeInfo lookup(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_info_list_lookup.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FileAttributeInfo(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_file_attribute_info_list_ref = Interop.downcallHandle(
        "g_file_attribute_info_list_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * References a file attribute info list.
     */
    public @NotNull FileAttributeInfoList ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_info_list_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FileAttributeInfoList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_file_attribute_info_list_unref = Interop.downcallHandle(
        "g_file_attribute_info_list_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a reference from the given {@code list}. If the reference count
     * falls to zero, the {@code list} is deleted.
     */
    public @NotNull void unref() {
        try {
            g_file_attribute_info_list_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
