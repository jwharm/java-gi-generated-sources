package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WidgetClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWidgetClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("show"),
            Interop.valueLayout.ADDRESS.withName("hide"),
            Interop.valueLayout.ADDRESS.withName("map"),
            Interop.valueLayout.ADDRESS.withName("unmap"),
            Interop.valueLayout.ADDRESS.withName("realize"),
            Interop.valueLayout.ADDRESS.withName("unrealize"),
            Interop.valueLayout.ADDRESS.withName("root"),
            Interop.valueLayout.ADDRESS.withName("unroot"),
            Interop.valueLayout.ADDRESS.withName("size_allocate"),
            Interop.valueLayout.ADDRESS.withName("state_flags_changed"),
            Interop.valueLayout.ADDRESS.withName("direction_changed"),
            Interop.valueLayout.ADDRESS.withName("get_request_mode"),
            Interop.valueLayout.ADDRESS.withName("measure"),
            Interop.valueLayout.ADDRESS.withName("mnemonic_activate"),
            Interop.valueLayout.ADDRESS.withName("grab_focus"),
            Interop.valueLayout.ADDRESS.withName("focus"),
            Interop.valueLayout.ADDRESS.withName("set_focus_child"),
            Interop.valueLayout.ADDRESS.withName("move_focus"),
            Interop.valueLayout.ADDRESS.withName("keynav_failed"),
            Interop.valueLayout.ADDRESS.withName("query_tooltip"),
            Interop.valueLayout.ADDRESS.withName("compute_expand"),
            Interop.valueLayout.ADDRESS.withName("css_changed"),
            Interop.valueLayout.ADDRESS.withName("system_setting_changed"),
            Interop.valueLayout.ADDRESS.withName("snapshot"),
            Interop.valueLayout.ADDRESS.withName("contains"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link WidgetClass}
     * @return A new, uninitialized @{link WidgetClass}
     */
    public static WidgetClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        WidgetClass newInstance = new WidgetClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.InitiallyUnownedClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.InitiallyUnownedClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowCallback} callback.
     */
    @FunctionalInterface
    public interface ShowCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show}
     * @param show The new value of the field {@code show}
     */
    public void setShow(ShowCallback show) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (show == null ? MemoryAddress.NULL : show.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HideCallback} callback.
     */
    @FunctionalInterface
    public interface HideCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HideCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code hide}
     * @param hide The new value of the field {@code hide}
     */
    public void setHide(HideCallback hide) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hide"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hide == null ? MemoryAddress.NULL : hide.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MapCallback} callback.
     */
    @FunctionalInterface
    public interface MapCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MapCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code map}
     * @param map The new value of the field {@code map}
     */
    public void setMap(MapCallback map) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : map.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnmapCallback} callback.
     */
    @FunctionalInterface
    public interface UnmapCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnmapCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmap}
     * @param unmap The new value of the field {@code unmap}
     */
    public void setUnmap(UnmapCallback unmap) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RealizeCallback} callback.
     */
    @FunctionalInterface
    public interface RealizeCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RealizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code realize}
     * @param realize The new value of the field {@code realize}
     */
    public void setRealize(RealizeCallback realize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("realize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (realize == null ? MemoryAddress.NULL : realize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnrealizeCallback} callback.
     */
    @FunctionalInterface
    public interface UnrealizeCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnrealizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unrealize}
     * @param unrealize The new value of the field {@code unrealize}
     */
    public void setUnrealize(UnrealizeCallback unrealize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unrealize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unrealize == null ? MemoryAddress.NULL : unrealize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RootCallback} callback.
     */
    @FunctionalInterface
    public interface RootCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RootCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code root}
     * @param root The new value of the field {@code root}
     */
    public void setRoot(RootCallback root) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("root"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (root == null ? MemoryAddress.NULL : root.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnrootCallback} callback.
     */
    @FunctionalInterface
    public interface UnrootCallback {
    
        void run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnrootCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unroot}
     * @param unroot The new value of the field {@code unroot}
     */
    public void setUnroot(UnrootCallback unroot) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unroot"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unroot == null ? MemoryAddress.NULL : unroot.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SizeAllocateCallback} callback.
     */
    @FunctionalInterface
    public interface SizeAllocateCallback {
    
        void run(org.gtk.gtk.Widget widget, int width, int height, int baseline);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, int width, int height, int baseline) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), width, height, baseline);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SizeAllocateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code size_allocate}
     * @param sizeAllocate The new value of the field {@code size_allocate}
     */
    public void setSizeAllocate(SizeAllocateCallback sizeAllocate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size_allocate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sizeAllocate == null ? MemoryAddress.NULL : sizeAllocate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StateFlagsChangedCallback} callback.
     */
    @FunctionalInterface
    public interface StateFlagsChangedCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.StateFlags previousStateFlags);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, int previousStateFlags) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), new org.gtk.gtk.StateFlags(previousStateFlags));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StateFlagsChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code state_flags_changed}
     * @param stateFlagsChanged The new value of the field {@code state_flags_changed}
     */
    public void setStateFlagsChanged(StateFlagsChangedCallback stateFlagsChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state_flags_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stateFlagsChanged == null ? MemoryAddress.NULL : stateFlagsChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DirectionChangedCallback} callback.
     */
    @FunctionalInterface
    public interface DirectionChangedCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.TextDirection previousDirection);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, int previousDirection) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.TextDirection.of(previousDirection));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DirectionChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code direction_changed}
     * @param directionChanged The new value of the field {@code direction_changed}
     */
    public void setDirectionChanged(DirectionChangedCallback directionChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (directionChanged == null ? MemoryAddress.NULL : directionChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetRequestModeCallback} callback.
     */
    @FunctionalInterface
    public interface GetRequestModeCallback {
    
        org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetRequestModeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_request_mode}
     * @param getRequestMode The new value of the field {@code get_request_mode}
     */
    public void setGetRequestMode(GetRequestModeCallback getRequestMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MeasureCallback} callback.
     */
    @FunctionalInterface
    public interface MeasureCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.Orientation orientation, int forSize, Out<Integer> minimum, Out<Integer> natural, Out<Integer> minimumBaseline, Out<Integer> naturalBaseline);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, int orientation, int forSize, MemoryAddress minimum, MemoryAddress natural, MemoryAddress minimumBaseline, MemoryAddress naturalBaseline) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumOUT = new Out<>(minimum.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalOUT = new Out<>(natural.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> minimumBaselineOUT = new Out<>(minimumBaseline.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalBaselineOUT = new Out<>(naturalBaseline.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.Orientation.of(orientation), forSize, minimumOUT, naturalOUT, minimumBaselineOUT, naturalBaselineOUT);
                minimum.set(Interop.valueLayout.C_INT, 0, minimumOUT.get());
                natural.set(Interop.valueLayout.C_INT, 0, naturalOUT.get());
                minimumBaseline.set(Interop.valueLayout.C_INT, 0, minimumBaselineOUT.get());
                naturalBaseline.set(Interop.valueLayout.C_INT, 0, naturalBaselineOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MeasureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure}
     * @param measure The new value of the field {@code measure}
     */
    public void setMeasure(MeasureCallback measure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measure == null ? MemoryAddress.NULL : measure.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MnemonicActivateCallback} callback.
     */
    @FunctionalInterface
    public interface MnemonicActivateCallback {
    
        boolean run(org.gtk.gtk.Widget widget, boolean groupCycling);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget, int groupCycling) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), Marshal.integerToBoolean.marshal(groupCycling, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MnemonicActivateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mnemonic_activate}
     * @param mnemonicActivate The new value of the field {@code mnemonic_activate}
     */
    public void setMnemonicActivate(MnemonicActivateCallback mnemonicActivate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mnemonic_activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mnemonicActivate == null ? MemoryAddress.NULL : mnemonicActivate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GrabFocusCallback} callback.
     */
    @FunctionalInterface
    public interface GrabFocusCallback {
    
        boolean run(org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GrabFocusCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code grab_focus}
     * @param grabFocus The new value of the field {@code grab_focus}
     */
    public void setGrabFocus(GrabFocusCallback grabFocus) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("grab_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (grabFocus == null ? MemoryAddress.NULL : grabFocus.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FocusCallback} callback.
     */
    @FunctionalInterface
    public interface FocusCallback {
    
        boolean run(org.gtk.gtk.Widget widget, org.gtk.gtk.DirectionType direction);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget, int direction) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.DirectionType.of(direction));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FocusCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code focus}
     * @param focus The new value of the field {@code focus}
     */
    public void setFocus(FocusCallback focus) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focus == null ? MemoryAddress.NULL : focus.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetFocusChildCallback} callback.
     */
    @FunctionalInterface
    public interface SetFocusChildCallback {
    
        void run(org.gtk.gtk.Widget widget, @Nullable org.gtk.gtk.Widget child);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, MemoryAddress child) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gtk.Widget) Interop.register(child, org.gtk.gtk.Widget.fromAddress).marshal(child, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetFocusChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_focus_child}
     * @param setFocusChild The new value of the field {@code set_focus_child}
     */
    public void setSetFocusChild(SetFocusChildCallback setFocusChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_focus_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFocusChild == null ? MemoryAddress.NULL : setFocusChild.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveFocusCallback} callback.
     */
    @FunctionalInterface
    public interface MoveFocusCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.DirectionType direction);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, int direction) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.DirectionType.of(direction));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveFocusCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_focus}
     * @param moveFocus The new value of the field {@code move_focus}
     */
    public void setMoveFocus(MoveFocusCallback moveFocus) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveFocus == null ? MemoryAddress.NULL : moveFocus.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code KeynavFailedCallback} callback.
     */
    @FunctionalInterface
    public interface KeynavFailedCallback {
    
        boolean run(org.gtk.gtk.Widget widget, org.gtk.gtk.DirectionType direction);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget, int direction) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.DirectionType.of(direction));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), KeynavFailedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code keynav_failed}
     * @param keynavFailed The new value of the field {@code keynav_failed}
     */
    public void setKeynavFailed(KeynavFailedCallback keynavFailed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keynav_failed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keynavFailed == null ? MemoryAddress.NULL : keynavFailed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryTooltipCallback} callback.
     */
    @FunctionalInterface
    public interface QueryTooltipCallback {
    
        boolean run(org.gtk.gtk.Widget widget, int x, int y, boolean keyboardTooltip, org.gtk.gtk.Tooltip tooltip);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget, int x, int y, int keyboardTooltip, MemoryAddress tooltip) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), x, y, Marshal.integerToBoolean.marshal(keyboardTooltip, null).booleanValue(), (org.gtk.gtk.Tooltip) Interop.register(tooltip, org.gtk.gtk.Tooltip.fromAddress).marshal(tooltip, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryTooltipCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_tooltip}
     * @param queryTooltip The new value of the field {@code query_tooltip}
     */
    public void setQueryTooltip(QueryTooltipCallback queryTooltip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_tooltip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryTooltip == null ? MemoryAddress.NULL : queryTooltip.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ComputeExpandCallback} callback.
     */
    @FunctionalInterface
    public interface ComputeExpandCallback {
    
        void run(org.gtk.gtk.Widget widget, PointerBoolean hexpandP, PointerBoolean vexpandP);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, MemoryAddress hexpandP, MemoryAddress vexpandP) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), new PointerBoolean(hexpandP), new PointerBoolean(vexpandP));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ComputeExpandCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code compute_expand}
     * @param computeExpand The new value of the field {@code compute_expand}
     */
    public void setComputeExpand(ComputeExpandCallback computeExpand) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compute_expand"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (computeExpand == null ? MemoryAddress.NULL : computeExpand.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CssChangedCallback} callback.
     */
    @FunctionalInterface
    public interface CssChangedCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.CssStyleChange change);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, MemoryAddress change) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.CssStyleChange.fromAddress.marshal(change, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CssChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code css_changed}
     * @param cssChanged The new value of the field {@code css_changed}
     */
    public void setCssChanged(CssChangedCallback cssChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("css_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cssChanged == null ? MemoryAddress.NULL : cssChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SystemSettingChangedCallback} callback.
     */
    @FunctionalInterface
    public interface SystemSettingChangedCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.SystemSetting settings);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, int settings) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.SystemSetting.of(settings));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SystemSettingChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code system_setting_changed}
     * @param systemSettingChanged The new value of the field {@code system_setting_changed}
     */
    public void setSystemSettingChanged(SystemSettingChangedCallback systemSettingChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_setting_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (systemSettingChanged == null ? MemoryAddress.NULL : systemSettingChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SnapshotCallback} callback.
     */
    @FunctionalInterface
    public interface SnapshotCallback {
    
        void run(org.gtk.gtk.Widget widget, org.gtk.gtk.Snapshot snapshot);
        
        @ApiStatus.Internal default void upcall(MemoryAddress widget, MemoryAddress snapshot) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gtk.Snapshot) Interop.register(snapshot, org.gtk.gtk.Snapshot.fromAddress).marshal(snapshot, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SnapshotCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ContainsCallback} callback.
     */
    @FunctionalInterface
    public interface ContainsCallback {
    
        boolean run(org.gtk.gtk.Widget widget, double x, double y);
        
        @ApiStatus.Internal default int upcall(MemoryAddress widget, double x, double y) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), x, y);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ContainsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code contains}
     * @param contains The new value of the field {@code contains}
     */
    public void setContains(ContainsCallback contains) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("contains"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (contains == null ? MemoryAddress.NULL : contains.toCallback()));
        }
    }
    
    /**
     * Create a WidgetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WidgetClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WidgetClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WidgetClass(input);
    
    /**
     * Creates a new shortcut for {@code widget_class} that calls the given {@code callback}
     * with arguments read according to {@code format_string}.
     * <p>
     * The arguments and format string must be provided in the same way as
     * with g_variant_new().
     * <p>
     * This function is a convenience wrapper around
     * {@link WidgetClass#addShortcut} and must be called during class
     * initialization. It does not provide for user_data, if you need that,
     * you will have to use {@code GtkWidgetClass#addShortcut} with a custom
     * shortcut.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param callback the callback to call upon activation
     * @param formatString GVariant format string for arguments
     *   or {@code null} for no arguments
     * @param varargs arguments, as given by format string
     */
    public void addBinding(int keyval, org.gtk.gdk.ModifierType mods, org.gtk.gtk.ShortcutFunc callback, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_add_binding.invokeExact(
                        handle(),
                        keyval,
                        mods.getValue(),
                        (Addressable) callback.toCallback(),
                        (Addressable) (formatString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(formatString, SCOPE)),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Creates a new shortcut for {@code widget_class} that activates the given
     * {@code action_name} with arguments read according to {@code format_string}.
     * <p>
     * The arguments and format string must be provided in the same way as
     * with g_variant_new().
     * <p>
     * This function is a convenience wrapper around
     * {@link WidgetClass#addShortcut} and must be called during class
     * initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param actionName the action to activate
     * @param formatString GVariant format string for arguments
     *   or {@code null} for no arguments
     * @param varargs arguments, as given by format string
     */
    public void addBindingAction(int keyval, org.gtk.gdk.ModifierType mods, java.lang.String actionName, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_add_binding_action.invokeExact(
                        handle(),
                        keyval,
                        mods.getValue(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        (Addressable) (formatString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(formatString, SCOPE)),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Creates a new shortcut for {@code widget_class} that emits the given action
     * {@code signal} with arguments read according to {@code format_string}.
     * <p>
     * The arguments and format string must be provided in the same way as
     * with g_variant_new().
     * <p>
     * This function is a convenience wrapper around
     * {@link WidgetClass#addShortcut} and must be called during class
     * initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param signal the signal to execute
     * @param formatString GVariant format string for arguments
     *   or {@code null} for no arguments
     * @param varargs arguments, as given by format string
     */
    public void addBindingSignal(int keyval, org.gtk.gdk.ModifierType mods, java.lang.String signal, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_add_binding_signal.invokeExact(
                        handle(),
                        keyval,
                        mods.getValue(),
                        Marshal.stringToAddress.marshal(signal, SCOPE),
                        (Addressable) (formatString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(formatString, SCOPE)),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Installs a shortcut in {@code widget_class}.
     * <p>
     * Every instance created for {@code widget_class} or its subclasses will
     * inherit this shortcut and trigger it.
     * <p>
     * Shortcuts added this way will be triggered in the {@link PropagationPhase#BUBBLE}
     * phase, which means they may also trigger if child widgets have focus.
     * <p>
     * This function must only be used in class initialization functions
     * otherwise it is not guaranteed that the shortcut will be installed.
     * @param shortcut the {@code GtkShortcut} to add
     */
    public void addShortcut(org.gtk.gtk.Shortcut shortcut) {
        try {
            DowncallHandles.gtk_widget_class_add_shortcut.invokeExact(
                    handle(),
                    shortcut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Declares a {@code callback_symbol} to handle {@code callback_name} from
     * the template XML defined for {@code widget_type}.
     * <p>
     * This function is not supported after {@link WidgetClass#setTemplateScope}
     * has been used on {@code widget_class}. See {@link BuilderCScope#addCallbackSymbol}.
     * <p>
     * Note that this must be called from a composite widget classes
     * class initializer after calling {@link WidgetClass#setTemplate}.
     * @param callbackName The name of the callback as expected in the template XML
     * @param callbackSymbol The callback symbol
     */
    public void bindTemplateCallbackFull(java.lang.String callbackName, org.gtk.gobject.Callback callbackSymbol) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_bind_template_callback_full.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(callbackName, SCOPE),
                        (Addressable) callbackSymbol.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Automatically assign an object declared in the class template XML to
     * be set to a location on a freshly built instance’s private data, or
     * alternatively accessible via {@link Widget#getTemplateChild}.
     * <p>
     * The struct can point either into the public instance, then you should
     * use {@code G_STRUCT_OFFSET(WidgetType, member)} for {@code struct_offset}, or in the
     * private struct, then you should use {@code G_PRIVATE_OFFSET(WidgetType, member)}.
     * <p>
     * An explicit strong reference will be held automatically for the duration
     * of your instance’s life cycle, it will be released automatically when
     * {@code GObjectClass.dispose()} runs on your instance and if a {@code struct_offset}
     * that is {@code != 0} is specified, then the automatic location in your instance
     * public or private data will be set to {@code null}. You can however access an
     * automated child pointer the first time your classes {@code GObjectClass.dispose()}
     * runs, or alternatively in {@code Gtk.Widget::destroy}.
     * <p>
     * If {@code internal_child} is specified, {@code Buildable#getInternalChild}
     * will be automatically implemented by the {@code GtkWidget} class so there is no
     * need to implement it manually.
     * <p>
     * The wrapper macros {@code Gtk#widgetClassBindTemplateChild},
     * {@code Gtk#widgetClassBindTemplateChildInternal},
     * {@code Gtk#widgetClassBindTemplateChildPrivate} and
     * {@code Gtk#widgetClassBindTemplateChildInternalPrivate}
     * might be more convenient to use.
     * <p>
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@link WidgetClass#setTemplate}.
     * @param name The “id” of the child defined in the template XML
     * @param internalChild Whether the child should be accessible as an “internal-child”
     *   when this class is used in GtkBuilder XML
     * @param structOffset The structure offset into the composite widget’s instance
     *   public or private structure where the automated child pointer should be set,
     *   or 0 to not assign the pointer.
     */
    public void bindTemplateChildFull(java.lang.String name, boolean internalChild, long structOffset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_bind_template_child_full.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.booleanToInteger.marshal(internalChild, null).intValue(),
                        structOffset);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Retrieves the accessible role used by the given {@code GtkWidget} class.
     * <p>
     * Different accessible roles have different states, and are rendered
     * differently by assistive technologies.
     * <p>
     * See also: {@link Accessible#getAccessibleRole}.
     * @return the accessible role for the widget class
     */
    public org.gtk.gtk.AccessibleRole getAccessibleRole() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_class_get_accessible_role.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.AccessibleRole.of(RESULT);
    }
    
    /**
     * Retrieves the signal id for the activation signal.
     * <p>
     * the activation signal is set using
     * {@link WidgetClass#setActivateSignal}.
     * @return a signal id, or 0 if the widget class does not
     *   specify an activation signal
     */
    public int getActivateSignal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_class_get_activate_signal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the name used by this class for matching in CSS code.
     * <p>
     * See {@link WidgetClass#setCssName} for details.
     * @return the CSS name of the given class
     */
    public java.lang.String getCssName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_class_get_css_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the type of the {@link LayoutManager}
     * used by widgets of class {@code widget_class}.
     * <p>
     * See also: {@link WidgetClass#setLayoutManagerType}.
     * @return type of a {@code GtkLayoutManager} subclass, or {@code G_TYPE_INVALID}
     */
    public org.gtk.glib.Type getLayoutManagerType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_widget_class_get_layout_manager_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * This should be called at class initialization time to specify
     * actions to be added for all instances of this class.
     * <p>
     * Actions installed by this function are stateless. The only state
     * they have is whether they are enabled or not.
     * @param actionName a prefixed action name, such as "clipboard.paste"
     * @param parameterType the parameter type
     * @param activate callback to use when the action is activated
     */
    public void installAction(java.lang.String actionName, @Nullable java.lang.String parameterType, org.gtk.gtk.WidgetActionActivateFunc activate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_install_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        (Addressable) (parameterType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(parameterType, SCOPE)),
                        (Addressable) activate.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Installs an action called {@code action_name} on {@code widget_class} and
     * binds its state to the value of the {@code property_name} property.
     * <p>
     * This function will perform a few santity checks on the property selected
     * via {@code property_name}. Namely, the property must exist, must be readable,
     * writable and must not be construct-only. There are also restrictions
     * on the type of the given property, it must be boolean, int, unsigned int,
     * double or string. If any of these conditions are not met, a critical
     * warning will be printed and no action will be added.
     * <p>
     * The state type of the action matches the property type.
     * <p>
     * If the property is boolean, the action will have no parameter and
     * toggle the property value. Otherwise, the action will have a parameter
     * of the same type as the property.
     * @param actionName name of the action
     * @param propertyName name of the property in instances of {@code widget_class}
     *   or any parent class.
     */
    public void installPropertyAction(java.lang.String actionName, java.lang.String propertyName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_install_property_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns details about the {@code index_}-th action that has been
     * installed for {@code widget_class} during class initialization.
     * <p>
     * See {@link WidgetClass#installAction} for details on
     * how to install actions.
     * <p>
     * Note that this function will also return actions defined
     * by parent classes. You can identify those by looking
     * at {@code owner}.
     * @param index position of the action to query
     * @param owner return location for the type where the action was defined
     * @param actionName return location for the action name
     * @param parameterType return location for the parameter type
     * @param propertyName return location for the property name
     * @return {@code true} if the action was found, {@code false} if {@code index_}
     *   is out of range
     */
    public boolean queryAction(int index, org.gtk.glib.Type owner, Out<java.lang.String> actionName, @Nullable Out<org.gtk.glib.VariantType> parameterType, @Nullable Out<java.lang.String> propertyName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment ownerPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment actionNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment parameterTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment propertyNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_widget_class_query_action.invokeExact(
                        handle(),
                        index,
                        (Addressable) ownerPOINTER.address(),
                        (Addressable) actionNamePOINTER.address(),
                        (Addressable) (parameterType == null ? MemoryAddress.NULL : (Addressable) parameterTypePOINTER.address()),
                        (Addressable) (propertyName == null ? MemoryAddress.NULL : (Addressable) propertyNamePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    owner.setValue(ownerPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    actionName.set(Marshal.addressToString.marshal(actionNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (parameterType != null) parameterType.set(org.gtk.glib.VariantType.fromAddress.marshal(parameterTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (propertyName != null) propertyName.set(Marshal.addressToString.marshal(propertyNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets the accessible role used by the given {@code GtkWidget} class.
     * <p>
     * Different accessible roles have different states, and are
     * rendered differently by assistive technologies.
     * @param accessibleRole the {@code GtkAccessibleRole} used by the {@code widget_class}
     */
    public void setAccessibleRole(org.gtk.gtk.AccessibleRole accessibleRole) {
        try {
            DowncallHandles.gtk_widget_class_set_accessible_role.invokeExact(
                    handle(),
                    accessibleRole.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkWidgetClass.activate_signal} field with the
     * given {@code signal_id}.
     * <p>
     * The signal will be emitted when calling {@link Widget#activate}.
     * <p>
     * The {@code signal_id} must have been registered with {@code g_signal_new()}
     * or g_signal_newv() before calling this function.
     * @param signalId the id for the activate signal
     */
    public void setActivateSignal(int signalId) {
        try {
            DowncallHandles.gtk_widget_class_set_activate_signal.invokeExact(
                    handle(),
                    signalId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkWidgetClass.activate_signal} field with the signal id for
     * the given {@code signal_name}.
     * <p>
     * The signal will be emitted when calling {@link Widget#activate}.
     * <p>
     * The {@code signal_name} of {@code widget_type} must have been registered with
     * g_signal_new() or g_signal_newv() before calling this function.
     * @param signalName the name of the activate signal of {@code widget_type}
     */
    public void setActivateSignalFromName(java.lang.String signalName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_set_activate_signal_from_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(signalName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the name to be used for CSS matching of widgets.
     * <p>
     * If this function is not called for a given class, the name
     * set on the parent class is used. By default, {@code GtkWidget}
     * uses the name "widget".
     * @param name name to use
     */
    public void setCssName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_set_css_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the type to be used for creating layout managers for
     * widgets of {@code widget_class}.
     * <p>
     * The given {@code type} must be a subtype of {@link LayoutManager}.
     * <p>
     * This function should only be called from class init functions
     * of widgets.
     * @param type The object type that implements the {@code GtkLayoutManager}
     *   for {@code widget_class}
     */
    public void setLayoutManagerType(org.gtk.glib.Type type) {
        try {
            DowncallHandles.gtk_widget_class_set_layout_manager_type.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This should be called at class initialization time to specify
     * the {@code GtkBuilder} XML to be used to extend a widget.
     * <p>
     * For convenience, {@link WidgetClass#setTemplateFromResource}
     * is also provided.
     * <p>
     * Note that any class that installs templates must call
     * {@link Widget#initTemplate} in the widget’s instance initializer.
     * @param templateBytes A {@code GBytes} holding the {@code GtkBuilder} XML
     */
    public void setTemplate(org.gtk.glib.Bytes templateBytes) {
        try {
            DowncallHandles.gtk_widget_class_set_template.invokeExact(
                    handle(),
                    templateBytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function that calls {@link WidgetClass#setTemplate}
     * with the contents of a {@code GResource}.
     * <p>
     * Note that any class that installs templates must call
     * {@link Widget#initTemplate} in the widget’s instance
     * initializer.
     * @param resourceName The name of the resource to load the template from
     */
    public void setTemplateFromResource(java.lang.String resourceName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_widget_class_set_template_from_resource.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(resourceName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * For use in language bindings, this will override the default
     * {@code GtkBuilderScope} to be used when parsing GtkBuilder XML from
     * this class’s template data.
     * <p>
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@code GtkWidgetClass#setTemplate}.
     * @param scope The {@code GtkBuilderScope} to use when loading
     *   the class template
     */
    public void setTemplateScope(org.gtk.gtk.BuilderScope scope) {
        try {
            DowncallHandles.gtk_widget_class_set_template_scope.invokeExact(
                    handle(),
                    scope.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_widget_class_add_binding = Interop.downcallHandle(
                "gtk_widget_class_add_binding",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_widget_class_add_binding_action = Interop.downcallHandle(
                "gtk_widget_class_add_binding_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_widget_class_add_binding_signal = Interop.downcallHandle(
                "gtk_widget_class_add_binding_signal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_widget_class_add_shortcut = Interop.downcallHandle(
                "gtk_widget_class_add_shortcut",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_bind_template_callback_full = Interop.downcallHandle(
                "gtk_widget_class_bind_template_callback_full",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_bind_template_child_full = Interop.downcallHandle(
                "gtk_widget_class_bind_template_child_full",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_widget_class_get_accessible_role = Interop.downcallHandle(
                "gtk_widget_class_get_accessible_role",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_get_activate_signal = Interop.downcallHandle(
                "gtk_widget_class_get_activate_signal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_get_css_name = Interop.downcallHandle(
                "gtk_widget_class_get_css_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_get_layout_manager_type = Interop.downcallHandle(
                "gtk_widget_class_get_layout_manager_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_install_action = Interop.downcallHandle(
                "gtk_widget_class_install_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_install_property_action = Interop.downcallHandle(
                "gtk_widget_class_install_property_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_query_action = Interop.downcallHandle(
                "gtk_widget_class_query_action",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_accessible_role = Interop.downcallHandle(
                "gtk_widget_class_set_accessible_role",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_activate_signal = Interop.downcallHandle(
                "gtk_widget_class_set_activate_signal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_activate_signal_from_name = Interop.downcallHandle(
                "gtk_widget_class_set_activate_signal_from_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_css_name = Interop.downcallHandle(
                "gtk_widget_class_set_css_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_layout_manager_type = Interop.downcallHandle(
                "gtk_widget_class_set_layout_manager_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_template = Interop.downcallHandle(
                "gtk_widget_class_set_template",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_template_from_resource = Interop.downcallHandle(
                "gtk_widget_class_set_template_from_resource",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_widget_class_set_template_scope = Interop.downcallHandle(
                "gtk_widget_class_set_template_scope",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link WidgetClass.Builder} object constructs a {@link WidgetClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link WidgetClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final WidgetClass struct;
        
        private Builder() {
            struct = WidgetClass.allocate();
        }
        
        /**
         * Finish building the {@link WidgetClass} struct.
         * @return A new instance of {@code WidgetClass} with the fields 
         *         that were set in the Builder object.
         */
        public WidgetClass build() {
            return struct;
        }
        
        /**
         * The object class structure needs to be the first
         *   element in the widget class structure in order for the class mechanism
         *   to work correctly. This allows a GtkWidgetClass pointer to be cast to
         *   a GObjectClass pointer.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setShow(ShowCallback show) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("show"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (show == null ? MemoryAddress.NULL : show.toCallback()));
                return this;
            }
        }
        
        public Builder setHide(HideCallback hide) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hide"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hide == null ? MemoryAddress.NULL : hide.toCallback()));
                return this;
            }
        }
        
        public Builder setMap(MapCallback map) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : map.toCallback()));
                return this;
            }
        }
        
        public Builder setUnmap(UnmapCallback unmap) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap.toCallback()));
                return this;
            }
        }
        
        public Builder setRealize(RealizeCallback realize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("realize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (realize == null ? MemoryAddress.NULL : realize.toCallback()));
                return this;
            }
        }
        
        public Builder setUnrealize(UnrealizeCallback unrealize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unrealize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unrealize == null ? MemoryAddress.NULL : unrealize.toCallback()));
                return this;
            }
        }
        
        public Builder setRoot(RootCallback root) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("root"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (root == null ? MemoryAddress.NULL : root.toCallback()));
                return this;
            }
        }
        
        public Builder setUnroot(UnrootCallback unroot) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unroot"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unroot == null ? MemoryAddress.NULL : unroot.toCallback()));
                return this;
            }
        }
        
        public Builder setSizeAllocate(SizeAllocateCallback sizeAllocate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size_allocate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sizeAllocate == null ? MemoryAddress.NULL : sizeAllocate.toCallback()));
                return this;
            }
        }
        
        public Builder setStateFlagsChanged(StateFlagsChangedCallback stateFlagsChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("state_flags_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stateFlagsChanged == null ? MemoryAddress.NULL : stateFlagsChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setDirectionChanged(DirectionChangedCallback directionChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("direction_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (directionChanged == null ? MemoryAddress.NULL : directionChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setGetRequestMode(GetRequestModeCallback getRequestMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
                return this;
            }
        }
        
        public Builder setMeasure(MeasureCallback measure) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("measure"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measure == null ? MemoryAddress.NULL : measure.toCallback()));
                return this;
            }
        }
        
        public Builder setMnemonicActivate(MnemonicActivateCallback mnemonicActivate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mnemonic_activate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mnemonicActivate == null ? MemoryAddress.NULL : mnemonicActivate.toCallback()));
                return this;
            }
        }
        
        public Builder setGrabFocus(GrabFocusCallback grabFocus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("grab_focus"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (grabFocus == null ? MemoryAddress.NULL : grabFocus.toCallback()));
                return this;
            }
        }
        
        public Builder setFocus(FocusCallback focus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focus == null ? MemoryAddress.NULL : focus.toCallback()));
                return this;
            }
        }
        
        public Builder setSetFocusChild(SetFocusChildCallback setFocusChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_focus_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFocusChild == null ? MemoryAddress.NULL : setFocusChild.toCallback()));
                return this;
            }
        }
        
        public Builder setMoveFocus(MoveFocusCallback moveFocus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move_focus"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveFocus == null ? MemoryAddress.NULL : moveFocus.toCallback()));
                return this;
            }
        }
        
        public Builder setKeynavFailed(KeynavFailedCallback keynavFailed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("keynav_failed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keynavFailed == null ? MemoryAddress.NULL : keynavFailed.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryTooltip(QueryTooltipCallback queryTooltip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_tooltip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryTooltip == null ? MemoryAddress.NULL : queryTooltip.toCallback()));
                return this;
            }
        }
        
        public Builder setComputeExpand(ComputeExpandCallback computeExpand) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("compute_expand"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (computeExpand == null ? MemoryAddress.NULL : computeExpand.toCallback()));
                return this;
            }
        }
        
        public Builder setCssChanged(CssChangedCallback cssChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("css_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cssChanged == null ? MemoryAddress.NULL : cssChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setSystemSettingChanged(SystemSettingChangedCallback systemSettingChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("system_setting_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (systemSettingChanged == null ? MemoryAddress.NULL : systemSettingChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
                return this;
            }
        }
        
        public Builder setContains(ContainsCallback contains) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("contains"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (contains == null ? MemoryAddress.NULL : contains.toCallback()));
                return this;
            }
        }
        
        public Builder setPriv(org.gtk.gtk.WidgetClassPrivate priv) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priv"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (priv == null ? MemoryAddress.NULL : priv.handle()));
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
