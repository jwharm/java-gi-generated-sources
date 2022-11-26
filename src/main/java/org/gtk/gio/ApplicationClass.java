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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
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
        
        public Build setCommandLine(java.lang.foreign.MemoryAddress command_line) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (command_line == null ? MemoryAddress.NULL : command_line));
            return this;
        }
        
        public Build setLocalCommandLine(java.lang.foreign.MemoryAddress local_command_line) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (local_command_line == null ? MemoryAddress.NULL : local_command_line));
            return this;
        }
        
        public Build setBeforeEmit(java.lang.foreign.MemoryAddress before_emit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (before_emit == null ? MemoryAddress.NULL : before_emit));
            return this;
        }
        
        public Build setAfterEmit(java.lang.foreign.MemoryAddress after_emit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (after_emit == null ? MemoryAddress.NULL : after_emit));
            return this;
        }
        
        public Build setAddPlatformData(java.lang.foreign.MemoryAddress add_platform_data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_platform_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_platform_data == null ? MemoryAddress.NULL : add_platform_data));
            return this;
        }
        
        public Build setQuitMainloop(java.lang.foreign.MemoryAddress quit_mainloop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quit_mainloop == null ? MemoryAddress.NULL : quit_mainloop));
            return this;
        }
        
        public Build setRunMainloop(java.lang.foreign.MemoryAddress run_mainloop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (run_mainloop == null ? MemoryAddress.NULL : run_mainloop));
            return this;
        }
        
        public Build setShutdown(java.lang.foreign.MemoryAddress shutdown) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown));
            return this;
        }
        
        public Build setDbusRegister(java.lang.foreign.MemoryAddress dbus_register) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_register"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbus_register == null ? MemoryAddress.NULL : dbus_register));
            return this;
        }
        
        public Build setDbusUnregister(java.lang.foreign.MemoryAddress dbus_unregister) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_unregister"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbus_unregister == null ? MemoryAddress.NULL : dbus_unregister));
            return this;
        }
        
        public Build setHandleLocalOptions(java.lang.foreign.MemoryAddress handle_local_options) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_local_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handle_local_options == null ? MemoryAddress.NULL : handle_local_options));
            return this;
        }
        
        public Build setNameLost(java.lang.foreign.MemoryAddress name_lost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name_lost == null ? MemoryAddress.NULL : name_lost));
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
