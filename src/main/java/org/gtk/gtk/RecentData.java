package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 */
public class RecentData extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentData";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("display_name"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("mime_type"),
        Interop.valueLayout.ADDRESS.withName("app_name"),
        Interop.valueLayout.ADDRESS.withName("app_exec"),
        Interop.valueLayout.ADDRESS.withName("groups"),
        Interop.valueLayout.C_INT.withName("is_private")
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
    
    /**
     * Allocate a new {@link RecentData}
     * @return A new, uninitialized @{link RecentData}
     */
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RecentData struct;
        
         /**
         * A {@link RecentData.Build} object constructs a {@link RecentData} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RecentData.allocate();
        }
        
         /**
         * Finish building the {@link RecentData} struct.
         * @return A new instance of {@code RecentData} with the fields 
         *         that were set in the Build object.
         */
        public RecentData construct() {
            return struct;
        }
        
        /**
         * a UTF-8 encoded string, containing the name of the recently
         *   used resource to be displayed, or {@code null};
         * @param display_name The value for the {@code display_name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplayName(java.lang.String display_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (display_name == null ? MemoryAddress.NULL : Interop.allocateNativeString(display_name)));
            return this;
        }
        
        /**
         * a UTF-8 encoded string, containing a short description of
         *   the resource, or {@code null};
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
        
        /**
         * the MIME type of the resource;
         * @param mime_type The value for the {@code mime_type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMimeType(java.lang.String mime_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mime_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mime_type == null ? MemoryAddress.NULL : Interop.allocateNativeString(mime_type)));
            return this;
        }
        
        /**
         * the name of the application that is registering this recently
         *   used resource;
         * @param app_name The value for the {@code app_name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAppName(java.lang.String app_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("app_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (app_name == null ? MemoryAddress.NULL : Interop.allocateNativeString(app_name)));
            return this;
        }
        
        /**
         * command line used to launch this resource; may contain the
         *   “\\{@code f}” and “\\{@code u}” escape characters which will be expanded
         *   to the resource file path and URI respectively when the command line
         *   is retrieved;
         * @param app_exec The value for the {@code app_exec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAppExec(java.lang.String app_exec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("app_exec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (app_exec == null ? MemoryAddress.NULL : Interop.allocateNativeString(app_exec)));
            return this;
        }
        
        /**
         * a vector of strings containing
         *   groups names;
         * @param groups The value for the {@code groups} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGroups(java.lang.String[] groups) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("groups"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (groups == null ? MemoryAddress.NULL : Interop.allocateNativeArray(groups, false)));
            return this;
        }
        
        /**
         * whether this resource should be displayed only by the
         *   applications that have registered it or not.
         * @param is_private The value for the {@code is_private} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsPrivate(boolean is_private) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_private"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_private ? 1 : 0);
            return this;
        }
    }
}
