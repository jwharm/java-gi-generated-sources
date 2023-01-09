package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkLayoutManagerClass} structure contains only private data, and
 * should only be accessed through the provided API, or when subclassing
 * {@code GtkLayoutManager}.
 */
public class LayoutManagerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLayoutManagerClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_request_mode"),
            Interop.valueLayout.ADDRESS.withName("measure"),
            Interop.valueLayout.ADDRESS.withName("allocate"),
            Interop.valueLayout.C_LONG.withName("layout_child_type"),
            Interop.valueLayout.ADDRESS.withName("create_layout_child"),
            Interop.valueLayout.ADDRESS.withName("root"),
            Interop.valueLayout.ADDRESS.withName("unroot"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LayoutManagerClass}
     * @return A new, uninitialized @{link LayoutManagerClass}
     */
    public static LayoutManagerClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LayoutManagerClass newInstance = new LayoutManagerClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code GetRequestModeCallback} callback.
     */
    @FunctionalInterface
    public interface GetRequestModeCallback {
    
        org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.LayoutManager manager, org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default int upcall(MemoryAddress manager, MemoryAddress widget) {
            var RESULT = run((org.gtk.gtk.LayoutManager) Interop.register(manager, org.gtk.gtk.LayoutManager.fromAddress).marshal(manager, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
    
        void run(org.gtk.gtk.LayoutManager manager, org.gtk.gtk.Widget widget, org.gtk.gtk.Orientation orientation, int forSize, Out<Integer> minimum, Out<Integer> natural, Out<Integer> minimumBaseline, Out<Integer> naturalBaseline);
        
        @ApiStatus.Internal default void upcall(MemoryAddress manager, MemoryAddress widget, int orientation, int forSize, MemoryAddress minimum, MemoryAddress natural, MemoryAddress minimumBaseline, MemoryAddress naturalBaseline) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumOUT = new Out<>(minimum.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalOUT = new Out<>(natural.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> minimumBaselineOUT = new Out<>(minimumBaseline.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalBaselineOUT = new Out<>(naturalBaseline.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.LayoutManager) Interop.register(manager, org.gtk.gtk.LayoutManager.fromAddress).marshal(manager, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gtk.Orientation.of(orientation), forSize, minimumOUT, naturalOUT, minimumBaselineOUT, naturalBaselineOUT);
                minimum.set(Interop.valueLayout.C_INT, 0, minimumOUT.get());
                natural.set(Interop.valueLayout.C_INT, 0, naturalOUT.get());
                minimumBaseline.set(Interop.valueLayout.C_INT, 0, minimumBaselineOUT.get());
                naturalBaseline.set(Interop.valueLayout.C_INT, 0, naturalBaselineOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Functional interface declaration of the {@code AllocateCallback} callback.
     */
    @FunctionalInterface
    public interface AllocateCallback {
    
        void run(org.gtk.gtk.LayoutManager manager, org.gtk.gtk.Widget widget, int width, int height, int baseline);
        
        @ApiStatus.Internal default void upcall(MemoryAddress manager, MemoryAddress widget, int width, int height, int baseline) {
            run((org.gtk.gtk.LayoutManager) Interop.register(manager, org.gtk.gtk.LayoutManager.fromAddress).marshal(manager, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), width, height, baseline);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AllocateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code allocate}
     * @param allocate The new value of the field {@code allocate}
     */
    public void setAllocate(AllocateCallback allocate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code layout_child_type}
     * @return The value of the field {@code layout_child_type}
     */
    public org.gtk.glib.Type getLayoutChildType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code layout_child_type}
     * @param layoutChildType The new value of the field {@code layout_child_type}
     */
    public void setLayoutChildType(org.gtk.glib.Type layoutChildType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (layoutChildType == null ? MemoryAddress.NULL : layoutChildType.getValue().longValue()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateLayoutChildCallback} callback.
     */
    @FunctionalInterface
    public interface CreateLayoutChildCallback {
    
        org.gtk.gtk.LayoutChild run(org.gtk.gtk.LayoutManager manager, org.gtk.gtk.Widget widget, org.gtk.gtk.Widget forChild);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress manager, MemoryAddress widget, MemoryAddress forChild) {
            var RESULT = run((org.gtk.gtk.LayoutManager) Interop.register(manager, org.gtk.gtk.LayoutManager.fromAddress).marshal(manager, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gtk.Widget) Interop.register(forChild, org.gtk.gtk.Widget.fromAddress).marshal(forChild, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateLayoutChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_layout_child}
     * @param createLayoutChild The new value of the field {@code create_layout_child}
     */
    public void setCreateLayoutChild(CreateLayoutChildCallback createLayoutChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_layout_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createLayoutChild == null ? MemoryAddress.NULL : createLayoutChild.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RootCallback} callback.
     */
    @FunctionalInterface
    public interface RootCallback {
    
        void run(org.gtk.gtk.LayoutManager manager);
        
        @ApiStatus.Internal default void upcall(MemoryAddress manager) {
            run((org.gtk.gtk.LayoutManager) Interop.register(manager, org.gtk.gtk.LayoutManager.fromAddress).marshal(manager, null));
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
    
        void run(org.gtk.gtk.LayoutManager manager);
        
        @ApiStatus.Internal default void upcall(MemoryAddress manager) {
            run((org.gtk.gtk.LayoutManager) Interop.register(manager, org.gtk.gtk.LayoutManager.fromAddress).marshal(manager, null));
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
     * Create a LayoutManagerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LayoutManagerClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LayoutManagerClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LayoutManagerClass(input);
    
    /**
     * A {@link LayoutManagerClass.Builder} object constructs a {@link LayoutManagerClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LayoutManagerClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LayoutManagerClass struct;
        
        private Builder() {
            struct = LayoutManagerClass.allocate();
        }
        
        /**
         * Finish building the {@link LayoutManagerClass} struct.
         * @return A new instance of {@code LayoutManagerClass} with the fields 
         *         that were set in the Builder object.
         */
        public LayoutManagerClass build() {
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
        
        public Builder setAllocate(AllocateCallback allocate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate.toCallback()));
                return this;
            }
        }
        
        /**
         * the type of {@code GtkLayoutChild} used by this layout manager
         * @param layoutChildType The value for the {@code layoutChildType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLayoutChildType(org.gtk.glib.Type layoutChildType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (layoutChildType == null ? MemoryAddress.NULL : layoutChildType.getValue().longValue()));
                return this;
            }
        }
        
        public Builder setCreateLayoutChild(CreateLayoutChildCallback createLayoutChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_layout_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createLayoutChild == null ? MemoryAddress.NULL : createLayoutChild.toCallback()));
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
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false, SCOPE)));
                return this;
            }
        }
    }
}
