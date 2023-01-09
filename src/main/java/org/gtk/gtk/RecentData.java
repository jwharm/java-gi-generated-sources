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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("display_name"),
            Interop.valueLayout.ADDRESS.withName("description"),
            Interop.valueLayout.ADDRESS.withName("mime_type"),
            Interop.valueLayout.ADDRESS.withName("app_name"),
            Interop.valueLayout.ADDRESS.withName("app_exec"),
            Interop.valueLayout.ADDRESS.withName("groups"),
            Interop.valueLayout.C_INT.withName("is_private")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RecentData}
     * @return A new, uninitialized @{link RecentData}
     */
    public static RecentData allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RecentData newInstance = new RecentData(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code display_name}
     * @return The value of the field {@code display_name}
     */
    public java.lang.String getDisplayName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("display_name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code display_name}
     * @param displayName The new value of the field {@code display_name}
     */
    public void setDisplayName(java.lang.String displayName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (displayName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(displayName, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String getDescription() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void setDescription(java.lang.String description) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code mime_type}
     * @return The value of the field {@code mime_type}
     */
    public java.lang.String getMimeType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mime_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code mime_type}
     * @param mimeType The new value of the field {@code mime_type}
     */
    public void setMimeType(java.lang.String mimeType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mime_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mimeType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(mimeType, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code app_name}
     * @return The value of the field {@code app_name}
     */
    public java.lang.String getAppName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("app_name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code app_name}
     * @param appName The new value of the field {@code app_name}
     */
    public void setAppName(java.lang.String appName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("app_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(appName, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code app_exec}
     * @return The value of the field {@code app_exec}
     */
    public java.lang.String getAppExec() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("app_exec"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code app_exec}
     * @param appExec The new value of the field {@code app_exec}
     */
    public void setAppExec(java.lang.String appExec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("app_exec"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appExec == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(appExec, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code groups}
     * @return The value of the field {@code groups}
     */
    public PointerString getGroups() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("groups"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code groups}
     * @param groups The new value of the field {@code groups}
     */
    public void setGroups(java.lang.String[] groups) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("groups"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (groups == null ? MemoryAddress.NULL : Interop.allocateNativeArray(groups, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code is_private}
     * @return The value of the field {@code is_private}
     */
    public boolean getIsPrivate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_private"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code is_private}
     * @param isPrivate The new value of the field {@code is_private}
     */
    public void setIsPrivate(boolean isPrivate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_private"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isPrivate, null).intValue());
        }
    }
    
    /**
     * Create a RecentData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RecentData(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RecentData> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RecentData(input);
    
    /**
     * A {@link RecentData.Builder} object constructs a {@link RecentData} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RecentData.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RecentData struct;
        
        private Builder() {
            struct = RecentData.allocate();
        }
        
        /**
         * Finish building the {@link RecentData} struct.
         * @return A new instance of {@code RecentData} with the fields 
         *         that were set in the Builder object.
         */
        public RecentData build() {
            return struct;
        }
        
        /**
         * a UTF-8 encoded string, containing the name of the recently
         *   used resource to be displayed, or {@code null};
         * @param displayName The value for the {@code displayName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplayName(java.lang.String displayName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("display_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (displayName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(displayName, SCOPE)));
                return this;
            }
        }
        
        /**
         * a UTF-8 encoded string, containing a short description of
         *   the resource, or {@code null};
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
                return this;
            }
        }
        
        /**
         * the MIME type of the resource;
         * @param mimeType The value for the {@code mimeType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMimeType(java.lang.String mimeType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mime_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mimeType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(mimeType, SCOPE)));
                return this;
            }
        }
        
        /**
         * the name of the application that is registering this recently
         *   used resource;
         * @param appName The value for the {@code appName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAppName(java.lang.String appName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("app_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(appName, SCOPE)));
                return this;
            }
        }
        
        /**
         * command line used to launch this resource; may contain the
         *   “\\{@code f}” and “\\{@code u}” escape characters which will be expanded
         *   to the resource file path and URI respectively when the command line
         *   is retrieved;
         * @param appExec The value for the {@code appExec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAppExec(java.lang.String appExec) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("app_exec"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appExec == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(appExec, SCOPE)));
                return this;
            }
        }
        
        /**
         * a vector of strings containing
         *   groups names;
         * @param groups The value for the {@code groups} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGroups(java.lang.String[] groups) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("groups"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (groups == null ? MemoryAddress.NULL : Interop.allocateNativeArray(groups, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * whether this resource should be displayed only by the
         *   applications that have registered it or not.
         * @param isPrivate The value for the {@code isPrivate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsPrivate(boolean isPrivate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_private"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isPrivate, null).intValue());
                return this;
            }
        }
    }
}
