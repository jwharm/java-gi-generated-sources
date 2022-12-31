package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AppLaunchContextClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppLaunchContextClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_display"),
            Interop.valueLayout.ADDRESS.withName("get_startup_notify_id"),
            Interop.valueLayout.ADDRESS.withName("launch_failed"),
            Interop.valueLayout.ADDRESS.withName("launched"),
            Interop.valueLayout.ADDRESS.withName("launch_started"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AppLaunchContextClass}
     * @return A new, uninitialized @{link AppLaunchContextClass}
     */
    public static AppLaunchContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppLaunchContextClass newInstance = new AppLaunchContextClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetDisplayCallback {
        @Nullable java.lang.String run(org.gtk.gio.AppLaunchContext context, org.gtk.gio.AppInfo info, org.gtk.glib.List files);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress context, MemoryAddress info, MemoryAddress files) {
            var RESULT = run((org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.AppInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.List.fromAddress.marshal(files, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDisplayCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_display}
     * @param getDisplay The new value of the field {@code get_display}
     */
    public void setGetDisplay(GetDisplayCallback getDisplay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetStartupNotifyIdCallback {
        @Nullable java.lang.String run(org.gtk.gio.AppLaunchContext context, org.gtk.gio.AppInfo info, org.gtk.glib.List files);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress context, MemoryAddress info, MemoryAddress files) {
            var RESULT = run((org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.AppInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.List.fromAddress.marshal(files, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStartupNotifyIdCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_startup_notify_id}
     * @param getStartupNotifyId The new value of the field {@code get_startup_notify_id}
     */
    public void setGetStartupNotifyId(GetStartupNotifyIdCallback getStartupNotifyId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_startup_notify_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStartupNotifyId == null ? MemoryAddress.NULL : getStartupNotifyId.toCallback()));
    }
    
    @FunctionalInterface
    public interface LaunchFailedCallback {
        void run(org.gtk.gio.AppLaunchContext context, java.lang.String startupNotifyId);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress startupNotifyId) {
            run((org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE), Marshal.addressToString.marshal(startupNotifyId, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchFailedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_failed}
     * @param launchFailed The new value of the field {@code launch_failed}
     */
    public void setLaunchFailed(LaunchFailedCallback launchFailed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launch_failed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchFailed == null ? MemoryAddress.NULL : launchFailed.toCallback()));
    }
    
    @FunctionalInterface
    public interface LaunchedCallback {
        void run(org.gtk.gio.AppLaunchContext context, org.gtk.gio.AppInfo info, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress info, MemoryAddress platformData) {
            run((org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.AppInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launched}
     * @param launched The new value of the field {@code launched}
     */
    public void setLaunched(LaunchedCallback launched) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launched"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launched == null ? MemoryAddress.NULL : launched.toCallback()));
    }
    
    @FunctionalInterface
    public interface LaunchStartedCallback {
        void run(org.gtk.gio.AppLaunchContext context, org.gtk.gio.AppInfo info, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress info, MemoryAddress platformData) {
            run((org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.AppInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchStartedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_started}
     * @param launchStarted The new value of the field {@code launch_started}
     */
    public void setLaunchStarted(LaunchStartedCallback launchStarted) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launch_started"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchStarted == null ? MemoryAddress.NULL : launchStarted.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved1}
     * @param GReserved1 The new value of the field {@code _g_reserved1}
     */
    public void setGReserved1(GReserved1Callback GReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved2}
     * @param GReserved2 The new value of the field {@code _g_reserved2}
     */
    public void setGReserved2(GReserved2Callback GReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved3}
     * @param GReserved3 The new value of the field {@code _g_reserved3}
     */
    public void setGReserved3(GReserved3Callback GReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
    }
    
    /**
     * Create a AppLaunchContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppLaunchContextClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppLaunchContextClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppLaunchContextClass(input, ownership);
    
    /**
     * A {@link AppLaunchContextClass.Builder} object constructs a {@link AppLaunchContextClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AppLaunchContextClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AppLaunchContextClass struct;
        
        private Builder() {
            struct = AppLaunchContextClass.allocate();
        }
        
         /**
         * Finish building the {@link AppLaunchContextClass} struct.
         * @return A new instance of {@code AppLaunchContextClass} with the fields 
         *         that were set in the Builder object.
         */
        public AppLaunchContextClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetDisplay(GetDisplayCallback getDisplay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay.toCallback()));
            return this;
        }
        
        public Builder setGetStartupNotifyId(GetStartupNotifyIdCallback getStartupNotifyId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_startup_notify_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStartupNotifyId == null ? MemoryAddress.NULL : getStartupNotifyId.toCallback()));
            return this;
        }
        
        public Builder setLaunchFailed(LaunchFailedCallback launchFailed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_failed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchFailed == null ? MemoryAddress.NULL : launchFailed.toCallback()));
            return this;
        }
        
        public Builder setLaunched(LaunchedCallback launched) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launched"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launched == null ? MemoryAddress.NULL : launched.toCallback()));
            return this;
        }
        
        public Builder setLaunchStarted(LaunchStartedCallback launchStarted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_started"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchStarted == null ? MemoryAddress.NULL : launchStarted.toCallback()));
            return this;
        }
        
        public Builder setGReserved1(GReserved1Callback GReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
            return this;
        }
        
        public Builder setGReserved2(GReserved2Callback GReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
            return this;
        }
        
        public Builder setGReserved3(GReserved3Callback GReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
            return this;
        }
    }
}
