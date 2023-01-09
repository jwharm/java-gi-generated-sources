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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ApplicationClass newInstance = new ApplicationClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code StartupCallback} callback.
     */
    @FunctionalInterface
    public interface StartupCallback {
    
        void run(org.gtk.gio.Application application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartupCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code startup}
     * @param startup The new value of the field {@code startup}
     */
    public void setStartup(StartupCallback startup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("startup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startup == null ? MemoryAddress.NULL : startup.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateCallback {
    
        void run(org.gtk.gio.Application application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OpenCallback} callback.
     */
    @FunctionalInterface
    public interface OpenCallback {
    
        void run(org.gtk.gio.Application application, org.gtk.gio.File[] files, int nFiles, java.lang.String hint);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress files, int nFiles, MemoryAddress hint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), new PointerProxy<org.gtk.gio.File>(files, org.gtk.gio.File.fromAddress).toArray((int) nFiles, org.gtk.gio.File.class), nFiles, Marshal.addressToString.marshal(hint, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CommandLineCallback} callback.
     */
    @FunctionalInterface
    public interface CommandLineCallback {
    
        int run(org.gtk.gio.Application application, org.gtk.gio.ApplicationCommandLine commandLine);
        
        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress commandLine) {
            var RESULT = run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), (org.gtk.gio.ApplicationCommandLine) Interop.register(commandLine, org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(commandLine, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CommandLineCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code command_line}
     * @param commandLine The new value of the field {@code command_line}
     */
    public void setCommandLine(CommandLineCallback commandLine) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (commandLine == null ? MemoryAddress.NULL : commandLine.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LocalCommandLineCallback} callback.
     */
    @FunctionalInterface
    public interface LocalCommandLineCallback {
    
        boolean run(org.gtk.gio.Application application, PointerString arguments, Out<Integer> exitStatus);
        
        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress arguments, MemoryAddress exitStatus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> exitStatusOUT = new Out<>(exitStatus.get(Interop.valueLayout.C_INT, 0));
                var RESULT = run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), new PointerString(arguments), exitStatusOUT);
                exitStatus.set(Interop.valueLayout.C_INT, 0, exitStatusOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LocalCommandLineCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code local_command_line}
     * @param localCommandLine The new value of the field {@code local_command_line}
     */
    public void setLocalCommandLine(LocalCommandLineCallback localCommandLine) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_command_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (localCommandLine == null ? MemoryAddress.NULL : localCommandLine.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeforeEmitCallback} callback.
     */
    @FunctionalInterface
    public interface BeforeEmitCallback {
    
        void run(org.gtk.gio.Application application, org.gtk.glib.Variant platformData);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress platformData) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), org.gtk.glib.Variant.fromAddress.marshal(platformData, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeforeEmitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code before_emit}
     * @param beforeEmit The new value of the field {@code before_emit}
     */
    public void setBeforeEmit(BeforeEmitCallback beforeEmit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beforeEmit == null ? MemoryAddress.NULL : beforeEmit.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AfterEmitCallback} callback.
     */
    @FunctionalInterface
    public interface AfterEmitCallback {
    
        void run(org.gtk.gio.Application application, org.gtk.glib.Variant platformData);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress platformData) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), org.gtk.glib.Variant.fromAddress.marshal(platformData, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AfterEmitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code after_emit}
     * @param afterEmit The new value of the field {@code after_emit}
     */
    public void setAfterEmit(AfterEmitCallback afterEmit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_emit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (afterEmit == null ? MemoryAddress.NULL : afterEmit.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AddPlatformDataCallback} callback.
     */
    @FunctionalInterface
    public interface AddPlatformDataCallback {
    
        void run(org.gtk.gio.Application application, org.gtk.glib.VariantBuilder builder);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress builder) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), org.gtk.glib.VariantBuilder.fromAddress.marshal(builder, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddPlatformDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_platform_data}
     * @param addPlatformData The new value of the field {@code add_platform_data}
     */
    public void setAddPlatformData(AddPlatformDataCallback addPlatformData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_platform_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addPlatformData == null ? MemoryAddress.NULL : addPlatformData.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QuitMainloopCallback} callback.
     */
    @FunctionalInterface
    public interface QuitMainloopCallback {
    
        void run(org.gtk.gio.Application application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QuitMainloopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code quit_mainloop}
     * @param quitMainloop The new value of the field {@code quit_mainloop}
     */
    public void setQuitMainloop(QuitMainloopCallback quitMainloop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (quitMainloop == null ? MemoryAddress.NULL : quitMainloop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RunMainloopCallback} callback.
     */
    @FunctionalInterface
    public interface RunMainloopCallback {
    
        void run(org.gtk.gio.Application application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RunMainloopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code run_mainloop}
     * @param runMainloop The new value of the field {@code run_mainloop}
     */
    public void setRunMainloop(RunMainloopCallback runMainloop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_mainloop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (runMainloop == null ? MemoryAddress.NULL : runMainloop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShutdownCallback} callback.
     */
    @FunctionalInterface
    public interface ShutdownCallback {
    
        void run(org.gtk.gio.Application application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application) {
            run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShutdownCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown}
     * @param shutdown The new value of the field {@code shutdown}
     */
    public void setShutdown(ShutdownCallback shutdown) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DbusRegisterCallback} callback.
     */
    @FunctionalInterface
    public interface DbusRegisterCallback {
    
        boolean run(org.gtk.gio.Application application, org.gtk.gio.DBusConnection connection, java.lang.String objectPath);
        
        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress connection, MemoryAddress objectPath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), (org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(objectPath, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DbusRegisterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dbus_register}
     * @param dbusRegister The new value of the field {@code dbus_register}
     */
    public void setDbusRegister(DbusRegisterCallback dbusRegister) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_register"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dbusRegister == null ? MemoryAddress.NULL : dbusRegister.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DbusUnregisterCallback} callback.
     */
    @FunctionalInterface
    public interface DbusUnregisterCallback {
    
        void run(org.gtk.gio.Application application, org.gtk.gio.DBusConnection connection, java.lang.String objectPath);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress connection, MemoryAddress objectPath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), (org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(objectPath, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DbusUnregisterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dbus_unregister}
     * @param dbusUnregister The new value of the field {@code dbus_unregister}
     */
    public void setDbusUnregister(DbusUnregisterCallback dbusUnregister) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_unregister"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dbusUnregister == null ? MemoryAddress.NULL : dbusUnregister.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleLocalOptionsCallback} callback.
     */
    @FunctionalInterface
    public interface HandleLocalOptionsCallback {
    
        int run(org.gtk.gio.Application application, org.gtk.glib.VariantDict options);
        
        @ApiStatus.Internal default int upcall(MemoryAddress application, MemoryAddress options) {
            var RESULT = run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null), org.gtk.glib.VariantDict.fromAddress.marshal(options, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleLocalOptionsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_local_options}
     * @param handleLocalOptions The new value of the field {@code handle_local_options}
     */
    public void setHandleLocalOptions(HandleLocalOptionsCallback handleLocalOptions) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_local_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleLocalOptions == null ? MemoryAddress.NULL : handleLocalOptions.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NameLostCallback} callback.
     */
    @FunctionalInterface
    public interface NameLostCallback {
    
        boolean run(org.gtk.gio.Application application);
        
        @ApiStatus.Internal default int upcall(MemoryAddress application) {
            var RESULT = run((org.gtk.gio.Application) Interop.register(application, org.gtk.gio.Application.fromAddress).marshal(application, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NameLostCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code name_lost}
     * @param nameLost The new value of the field {@code name_lost}
     */
    public void setNameLost(NameLostCallback nameLost) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nameLost == null ? MemoryAddress.NULL : nameLost.toCallback()));
        }
    }
    
    /**
     * Create a ApplicationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ApplicationClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setStartup(StartupCallback startup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("startup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startup == null ? MemoryAddress.NULL : startup.toCallback()));
                return this;
            }
        }
        
        public Builder setActivate(ActivateCallback activate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
                return this;
            }
        }
        
        public Builder setOpen(OpenCallback open) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
                return this;
            }
        }
        
        public Builder setCommandLine(CommandLineCallback commandLine) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("command_line"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (commandLine == null ? MemoryAddress.NULL : commandLine.toCallback()));
                return this;
            }
        }
        
        public Builder setLocalCommandLine(LocalCommandLineCallback localCommandLine) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("local_command_line"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (localCommandLine == null ? MemoryAddress.NULL : localCommandLine.toCallback()));
                return this;
            }
        }
        
        public Builder setBeforeEmit(BeforeEmitCallback beforeEmit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("before_emit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beforeEmit == null ? MemoryAddress.NULL : beforeEmit.toCallback()));
                return this;
            }
        }
        
        public Builder setAfterEmit(AfterEmitCallback afterEmit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("after_emit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (afterEmit == null ? MemoryAddress.NULL : afterEmit.toCallback()));
                return this;
            }
        }
        
        public Builder setAddPlatformData(AddPlatformDataCallback addPlatformData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_platform_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addPlatformData == null ? MemoryAddress.NULL : addPlatformData.toCallback()));
                return this;
            }
        }
        
        public Builder setQuitMainloop(QuitMainloopCallback quitMainloop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("quit_mainloop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (quitMainloop == null ? MemoryAddress.NULL : quitMainloop.toCallback()));
                return this;
            }
        }
        
        public Builder setRunMainloop(RunMainloopCallback runMainloop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("run_mainloop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (runMainloop == null ? MemoryAddress.NULL : runMainloop.toCallback()));
                return this;
            }
        }
        
        public Builder setShutdown(ShutdownCallback shutdown) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
                return this;
            }
        }
        
        public Builder setDbusRegister(DbusRegisterCallback dbusRegister) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dbus_register"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dbusRegister == null ? MemoryAddress.NULL : dbusRegister.toCallback()));
                return this;
            }
        }
        
        public Builder setDbusUnregister(DbusUnregisterCallback dbusUnregister) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dbus_unregister"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dbusUnregister == null ? MemoryAddress.NULL : dbusUnregister.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleLocalOptions(HandleLocalOptionsCallback handleLocalOptions) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_local_options"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleLocalOptions == null ? MemoryAddress.NULL : handleLocalOptions.toCallback()));
                return this;
            }
        }
        
        public Builder setNameLost(NameLostCallback nameLost) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name_lost"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nameLost == null ? MemoryAddress.NULL : nameLost.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
