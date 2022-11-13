package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 */
public class RecentData extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentData";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("display_name"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("mime_type"),
        Interop.valueLayout.ADDRESS.withName("app_name"),
        Interop.valueLayout.ADDRESS.withName("app_exec"),
        Interop.valueLayout.ADDRESS.withName("groups"),
        ValueLayout.JAVA_INT.withName("is_private")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static RecentData allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RecentData newInstance = new RecentData(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code display_name}
     * @return The value of the field {@code display_name}
     */
    public java.lang.String display_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("display_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code display_name}
     * @param display_name The new value of the field {@code display_name}
     */
    public void display_name$set(java.lang.String display_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("display_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(display_name));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Get the value of the field {@code mime_type}
     * @return The value of the field {@code mime_type}
     */
    public java.lang.String mime_type$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mime_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code mime_type}
     * @param mime_type The new value of the field {@code mime_type}
     */
    public void mime_type$set(java.lang.String mime_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mime_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(mime_type));
    }
    
    /**
     * Get the value of the field {@code app_name}
     * @return The value of the field {@code app_name}
     */
    public java.lang.String app_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("app_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code app_name}
     * @param app_name The new value of the field {@code app_name}
     */
    public void app_name$set(java.lang.String app_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("app_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(app_name));
    }
    
    /**
     * Get the value of the field {@code app_exec}
     * @return The value of the field {@code app_exec}
     */
    public java.lang.String app_exec$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("app_exec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code app_exec}
     * @param app_exec The new value of the field {@code app_exec}
     */
    public void app_exec$set(java.lang.String app_exec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("app_exec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(app_exec));
    }
    
    /**
     * Get the value of the field {@code is_private}
     * @return The value of the field {@code is_private}
     */
    public boolean is_private$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_private"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code is_private}
     * @param is_private The new value of the field {@code is_private}
     */
    public void is_private$set(boolean is_private) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_private"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_private ? 1 : 0);
    }
    
    /**
     * Create a RecentData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RecentData(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
