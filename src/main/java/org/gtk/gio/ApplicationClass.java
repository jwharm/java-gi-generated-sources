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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    
    @FunctionalInterface
    public interface StartupCallback {
        void run(org.gtk.gio.Application application);

        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code startup}
     * @param startup The new value of the field {@code startup}
     */
    public void setStartup(StartupCallback startup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("startup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startup == null ? MemoryAddress.NULL : startup.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateCallback {
        void run(org.gtk.gio.Application application);

        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        void run(org.gtk.gio.Application application, org.gtk.gio.File[] files, int nFiles, java.lang.String hint);

        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress files, int nFiles, MemoryAddress hint) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), new PointerProxy<org.gtk.gio.File>(files, org.gtk.gio.File.fromAddress).toArray((int) nFiles, org.gtk.gio.File.class), nFiles, Marshal.addressToString.marshal(hint, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
    }
    
    @FunctionalInterface
    public interface CommandLineCallback {
        int run(org.gtk.gio.Application application, org.gtk.gio.ApplicationCommandLine commandLine);

        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress commandLine) {
            var RESULT = run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), (org.gtk.gio.ApplicationCommandLine) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(commandLine)), org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(commandLine, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CommandLineCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code command_line}
     * @param commandLine The new value of the field {@code command_line}
     */
    public void setCommandLine(CommandLineCallback commandLine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("command_line"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commandLine == null ? MemoryAddress.NULL : commandLine.toCallback()));
    }
    
    @FunctionalInterface
    public interface LocalCommandLineCallback {
        boolean run(org.gtk.gio.Application application, PointerString arguments, Out<Integer> exitStatus);

        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress arguments, MemoryAddress exitStatus) {
            Out<Integer> exitStatusOUT = new Out<>(exitStatus.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), new PointerString(arguments), exitStatusOUT);
            exitStatus.set(Interop.valueLayout.C_INT, 0, exitStatusOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocalCommandLineCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code local_command_line}
     * @param localCommandLine The new value of the field {@code local_command_line}
     */
    public void setLocalCommandLine(LocalCommandLineCallback localCommandLine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_command_line"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localCommandLine == null ? MemoryAddress.NULL : localCommandLine.toCallback()));
    }
    
    @FunctionalInterface
    public interface BeforeEmitCallback {
        void run(org.gtk.gio.Application application, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress platformData) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BeforeEmitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code before_emit}
     * @param beforeEmit The new value of the field {@code before_emit}
     */
    public void setBeforeEmit(BeforeEmitCallback beforeEmit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("before_emit"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeEmit == null ? MemoryAddress.NULL : beforeEmit.toCallback()));
    }
    
    @FunctionalInterface
    public interface AfterEmitCallback {
        void run(org.gtk.gio.Application application, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress platformData) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AfterEmitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code after_emit}
     * @param afterEmit The new value of the field {@code after_emit}
     */
    public void setAfterEmit(AfterEmitCallback afterEmit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("after_emit"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afterEmit == null ? MemoryAddress.NULL : afterEmit.toCallback()));
    }
    
    @FunctionalInterface
    public interface AddPlatformDataCallback {
        void run(org.gtk.gio.Application application, org.gtk.glib.VariantBuilder builder);

        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress builder) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), org.gtk.glib.VariantBuilder.fromAddress.marshal(builder, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddPlatformDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_platform_data}
     * @param addPlatformData The new value of the field {@code add_platform_data}
     */
    public void setAddPlatformData(AddPlatformDataCallback addPlatformData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_platform_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addPlatformData == null ? MemoryAddress.NULL : addPlatformData.toCallback()));
    }
    
    @FunctionalInterface
    public interface QuitMainloopCallback {
        void run(org.gtk.gio.Application application);

        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QuitMainloopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code quit_mainloop}
     * @param quitMainloop The new value of the field {@code quit_mainloop}
     */
    public void setQuitMainloop(QuitMainloopCallback quitMainloop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quit_mainloop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quitMainloop == null ? MemoryAddress.NULL : quitMainloop.toCallback()));
    }
    
    @FunctionalInterface
    public interface RunMainloopCallback {
        void run(org.gtk.gio.Application application);

        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RunMainloopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code run_mainloop}
     * @param runMainloop The new value of the field {@code run_mainloop}
     */
    public void setRunMainloop(RunMainloopCallback runMainloop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("run_mainloop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runMainloop == null ? MemoryAddress.NULL : runMainloop.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShutdownCallback {
        void run(org.gtk.gio.Application application);

        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShutdownCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown}
     * @param shutdown The new value of the field {@code shutdown}
     */
    public void setShutdown(ShutdownCallback shutdown) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
    }
    
    @FunctionalInterface
    public interface DbusRegisterCallback {
        boolean run(org.gtk.gio.Application application, org.gtk.gio.DBusConnection connection, java.lang.String objectPath);

        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress connection, MemoryAddress objectPath) {
            var RESULT = run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(objectPath, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DbusRegisterCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dbus_register}
     * @param dbusRegister The new value of the field {@code dbus_register}
     */
    public void setDbusRegister(DbusRegisterCallback dbusRegister) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dbus_register"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusRegister == null ? MemoryAddress.NULL : dbusRegister.toCallback()));
    }
    
    @FunctionalInterface
    public interface DbusUnregisterCallback {
        void run(org.gtk.gio.Application application, org.gtk.gio.DBusConnection connection, java.lang.String objectPath);

        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress connection, MemoryAddress objectPath) {
            run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(objectPath, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DbusUnregisterCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dbus_unregister}
     * @param dbusUnregister The new value of the field {@code dbus_unregister}
     */
    public void setDbusUnregister(DbusUnregisterCallback dbusUnregister) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dbus_unregister"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusUnregister == null ? MemoryAddress.NULL : dbusUnregister.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleLocalOptionsCallback {
        int run(org.gtk.gio.Application application, org.gtk.glib.VariantDict options);

        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress options) {
            var RESULT = run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE), org.gtk.glib.VariantDict.fromAddress.marshal(options, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleLocalOptionsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_local_options}
     * @param handleLocalOptions The new value of the field {@code handle_local_options}
     */
    public void setHandleLocalOptions(HandleLocalOptionsCallback handleLocalOptions) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_local_options"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleLocalOptions == null ? MemoryAddress.NULL : handleLocalOptions.toCallback()));
    }
    
    @FunctionalInterface
    public interface NameLostCallback {
        boolean run(org.gtk.gio.Application application);

        @ApiStatus.Internal default int upcall(MemoryAddress application) {
            var RESULT = run((org.gtk.gio.Application) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(application)), org.gtk.gio.Application.fromAddress).marshal(application, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NameLostCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code name_lost}
     * @param nameLost The new value of the field {@code name_lost}
     */
    public void setNameLost(NameLostCallback nameLost) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_lost"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameLost == null ? MemoryAddress.NULL : nameLost.toCallback()));
    }
    
    /**
     * Create a ApplicationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ApplicationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationClass(input, ownership);
    
    /**
     * A {@link ApplicationClass.Builder} object constructs a {@link ApplicationClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ApplicationClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ApplicationClass struct;
        
        private Builder() {
            struct = ApplicationClass.allocate();
        }
        
         /**
         * Finish building the {@link ApplicationClass} struct.
         * @return A new instance of {@code ApplicationClass} with the fields 
         *         that were set in the Builder object.
         */
        public ApplicationClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setStartup(StartupCallback startup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("startup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startup == null ? MemoryAddress.NULL : startup.toCallback()));
            return this;
        }
        
        public Builder setActivate(ActivateCallback activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
            return this;
        }
        
        public Builder setOpen(OpenCallback open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
            return this;
        }
        
        public Builder setCommandLine(CommandLineCallback commandLine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commandLine == null ? MemoryAddress.NULL : commandLine.toCallback()));
            return this;
        }
        
        public Builder setLocalCommandLine(LocalCommandLineCallback localCommandLine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localCommandLine == null ? MemoryAddress.NULL : localCommandLine.toCallback()));
            return this;
        }
        
        public Builder setBeforeEmit(BeforeEmitCallback beforeEmit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeEmit == null ? MemoryAddress.NULL : beforeEmit.toCallback()));
            return this;
        }
        
        public Builder setAfterEmit(AfterEmitCallback afterEmit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afterEmit == null ? MemoryAddress.NULL : afterEmit.toCallback()));
            return this;
        }
        
        public Builder setAddPlatformData(AddPlatformDataCallback addPlatformData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_platform_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addPlatformData == null ? MemoryAddress.NULL : addPlatformData.toCallback()));
            return this;
        }
        
        public Builder setQuitMainloop(QuitMainloopCallback quitMainloop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quitMainloop == null ? MemoryAddress.NULL : quitMainloop.toCallback()));
            return this;
        }
        
        public Builder setRunMainloop(RunMainloopCallback runMainloop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runMainloop == null ? MemoryAddress.NULL : runMainloop.toCallback()));
            return this;
        }
        
        public Builder setShutdown(ShutdownCallback shutdown) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
            return this;
        }
        
        public Builder setDbusRegister(DbusRegisterCallback dbusRegister) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_register"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusRegister == null ? MemoryAddress.NULL : dbusRegister.toCallback()));
            return this;
        }
        
        public Builder setDbusUnregister(DbusUnregisterCallback dbusUnregister) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_unregister"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusUnregister == null ? MemoryAddress.NULL : dbusUnregister.toCallback()));
            return this;
        }
        
        public Builder setHandleLocalOptions(HandleLocalOptionsCallback handleLocalOptions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_local_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleLocalOptions == null ? MemoryAddress.NULL : handleLocalOptions.toCallback()));
            return this;
        }
        
        public Builder setNameLost(NameLostCallback nameLost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameLost == null ? MemoryAddress.NULL : nameLost.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
