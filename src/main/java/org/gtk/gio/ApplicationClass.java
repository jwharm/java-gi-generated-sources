package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual function table for {@link Application}.
 * @version 2.28
 */
public class ApplicationClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("startup"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("command_line"),
        Interop.valueLayout.ADDRESS.withName("local_command_line"),
        Interop.valueLayout.ADDRESS.withName("before_emit"),
        Interop.valueLayout.ADDRESS.withName("after_emit"),
        Interop.valueLayout.ADDRESS.withName("add_platform_data"),
        Interop.valueLayout.ADDRESS.withName("quit_mainloop"),
        Interop.valueLayout.ADDRESS.withName("run_mainloop"),
        Interop.valueLayout.ADDRESS.withName("shutdown"),
        Interop.valueLayout.ADDRESS.withName("dbus_register"),
        Interop.valueLayout.ADDRESS.withName("dbus_unregister"),
        Interop.valueLayout.ADDRESS.withName("handle_local_options"),
        Interop.valueLayout.ADDRESS.withName("name_lost"),
        MemoryLayout.sequenceLayout(7, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link ApplicationClass}
     * @return A new, uninitialized @{link ApplicationClass}
     */
    public static ApplicationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ApplicationClass newInstance = new ApplicationClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ApplicationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ApplicationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ApplicationClass struct;
        
         /**
         * A {@link ApplicationClass.Build} object constructs a {@link ApplicationClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ApplicationClass.allocate();
        }
        
         /**
         * Finish building the {@link ApplicationClass} struct.
         * @return A new instance of {@code ApplicationClass} with the fields 
         *         that were set in the Build object.
         */
        public ApplicationClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setStartup(java.lang.foreign.MemoryAddress startup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("startup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startup == null ? MemoryAddress.NULL : startup));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
            return this;
        }
        
        public Build setOpen(java.lang.foreign.MemoryAddress open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open));
            return this;
        }
        
        public Build setCommandLine(java.lang.foreign.MemoryAddress commandLine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commandLine == null ? MemoryAddress.NULL : commandLine));
            return this;
        }
        
        public Build setLocalCommandLine(java.lang.foreign.MemoryAddress localCommandLine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localCommandLine == null ? MemoryAddress.NULL : localCommandLine));
            return this;
        }
        
        public Build setBeforeEmit(java.lang.foreign.MemoryAddress beforeEmit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeEmit == null ? MemoryAddress.NULL : beforeEmit));
            return this;
        }
        
        public Build setAfterEmit(java.lang.foreign.MemoryAddress afterEmit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afterEmit == null ? MemoryAddress.NULL : afterEmit));
            return this;
        }
        
        public Build setAddPlatformData(java.lang.foreign.MemoryAddress addPlatformData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_platform_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addPlatformData == null ? MemoryAddress.NULL : addPlatformData));
            return this;
        }
        
        public Build setQuitMainloop(java.lang.foreign.MemoryAddress quitMainloop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quitMainloop == null ? MemoryAddress.NULL : quitMainloop));
            return this;
        }
        
        public Build setRunMainloop(java.lang.foreign.MemoryAddress runMainloop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runMainloop == null ? MemoryAddress.NULL : runMainloop));
            return this;
        }
        
        public Build setShutdown(java.lang.foreign.MemoryAddress shutdown) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown));
            return this;
        }
        
        public Build setDbusRegister(java.lang.foreign.MemoryAddress dbusRegister) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_register"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusRegister == null ? MemoryAddress.NULL : dbusRegister));
            return this;
        }
        
        public Build setDbusUnregister(java.lang.foreign.MemoryAddress dbusUnregister) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_unregister"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusUnregister == null ? MemoryAddress.NULL : dbusUnregister));
            return this;
        }
        
        public Build setHandleLocalOptions(java.lang.foreign.MemoryAddress handleLocalOptions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_local_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleLocalOptions == null ? MemoryAddress.NULL : handleLocalOptions));
            return this;
        }
        
        public Build setNameLost(java.lang.foreign.MemoryAddress nameLost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameLost == null ? MemoryAddress.NULL : nameLost));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
