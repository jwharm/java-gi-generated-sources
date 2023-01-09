package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for swipeable widgets.
 * @version 1.0
 */
public class SwipeableInterface extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSwipeableInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("get_distance"),
            Interop.valueLayout.ADDRESS.withName("get_snap_points"),
            Interop.valueLayout.ADDRESS.withName("get_progress"),
            Interop.valueLayout.ADDRESS.withName("get_cancel_progress"),
            Interop.valueLayout.ADDRESS.withName("get_swipe_area"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SwipeableInterface}
     * @return A new, uninitialized @{link SwipeableInterface}
     */
    public static SwipeableInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SwipeableInterface newInstance = new SwipeableInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDistanceCallback} callback.
     */
    @FunctionalInterface
    public interface GetDistanceCallback {
    
        double run(org.gnome.adw.Swipeable self);
        
        @ApiStatus.Internal default double upcall(MemoryAddress self) {
            var RESULT = run((org.gnome.adw.Swipeable) Interop.register(self, org.gnome.adw.Swipeable.fromAddress).marshal(self, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDistanceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_distance}
     * @param getDistance The new value of the field {@code get_distance}
     */
    public void setGetDistance(GetDistanceCallback getDistance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_distance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDistance == null ? MemoryAddress.NULL : getDistance.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSnapPointsCallback} callback.
     */
    @FunctionalInterface
    public interface GetSnapPointsCallback {
    
        double[] run(org.gnome.adw.Swipeable self, Out<Integer> nSnapPoints);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress nSnapPoints) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> nSnapPointsOUT = new Out<>(nSnapPoints.get(Interop.valueLayout.C_INT, 0));
                run((org.gnome.adw.Swipeable) Interop.register(self, org.gnome.adw.Swipeable.fromAddress).marshal(self, null), nSnapPointsOUT);
                nSnapPoints.set(Interop.valueLayout.C_INT, 0, nSnapPointsOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSnapPointsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_snap_points}
     * @param getSnapPoints The new value of the field {@code get_snap_points}
     */
    public void setGetSnapPoints(GetSnapPointsCallback getSnapPoints) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_snap_points"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSnapPoints == null ? MemoryAddress.NULL : getSnapPoints.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetProgressCallback} callback.
     */
    @FunctionalInterface
    public interface GetProgressCallback {
    
        double run(org.gnome.adw.Swipeable self);
        
        @ApiStatus.Internal default double upcall(MemoryAddress self) {
            var RESULT = run((org.gnome.adw.Swipeable) Interop.register(self, org.gnome.adw.Swipeable.fromAddress).marshal(self, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetProgressCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_progress}
     * @param getProgress The new value of the field {@code get_progress}
     */
    public void setGetProgress(GetProgressCallback getProgress) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProgress == null ? MemoryAddress.NULL : getProgress.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCancelProgressCallback} callback.
     */
    @FunctionalInterface
    public interface GetCancelProgressCallback {
    
        double run(org.gnome.adw.Swipeable self);
        
        @ApiStatus.Internal default double upcall(MemoryAddress self) {
            var RESULT = run((org.gnome.adw.Swipeable) Interop.register(self, org.gnome.adw.Swipeable.fromAddress).marshal(self, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCancelProgressCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_cancel_progress}
     * @param getCancelProgress The new value of the field {@code get_cancel_progress}
     */
    public void setGetCancelProgress(GetCancelProgressCallback getCancelProgress) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cancel_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCancelProgress == null ? MemoryAddress.NULL : getCancelProgress.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSwipeAreaCallback} callback.
     */
    @FunctionalInterface
    public interface GetSwipeAreaCallback {
    
        void run(org.gnome.adw.Swipeable self, org.gnome.adw.NavigationDirection navigationDirection, boolean isDrag, org.gtk.gdk.Rectangle rect);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, int navigationDirection, int isDrag, MemoryAddress rect) {
            run((org.gnome.adw.Swipeable) Interop.register(self, org.gnome.adw.Swipeable.fromAddress).marshal(self, null), org.gnome.adw.NavigationDirection.of(navigationDirection), Marshal.integerToBoolean.marshal(isDrag, null).booleanValue(), org.gtk.gdk.Rectangle.fromAddress.marshal(rect, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSwipeAreaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_swipe_area}
     * @param getSwipeArea The new value of the field {@code get_swipe_area}
     */
    public void setGetSwipeArea(GetSwipeAreaCallback getSwipeArea) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_swipe_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSwipeArea == null ? MemoryAddress.NULL : getSwipeArea.toCallback()));
        }
    }
    
    /**
     * Create a SwipeableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SwipeableInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SwipeableInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SwipeableInterface(input);
    
    /**
     * A {@link SwipeableInterface.Builder} object constructs a {@link SwipeableInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SwipeableInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SwipeableInterface struct;
        
        private Builder() {
            struct = SwipeableInterface.allocate();
        }
        
        /**
         * Finish building the {@link SwipeableInterface} struct.
         * @return A new instance of {@code SwipeableInterface} with the fields 
         *         that were set in the Builder object.
         */
        public SwipeableInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.gobject.TypeInterface parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        public Builder setGetDistance(GetDistanceCallback getDistance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_distance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDistance == null ? MemoryAddress.NULL : getDistance.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSnapPoints(GetSnapPointsCallback getSnapPoints) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_snap_points"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSnapPoints == null ? MemoryAddress.NULL : getSnapPoints.toCallback()));
                return this;
            }
        }
        
        public Builder setGetProgress(GetProgressCallback getProgress) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_progress"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProgress == null ? MemoryAddress.NULL : getProgress.toCallback()));
                return this;
            }
        }
        
        public Builder setGetCancelProgress(GetCancelProgressCallback getCancelProgress) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_cancel_progress"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCancelProgress == null ? MemoryAddress.NULL : getCancelProgress.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSwipeArea(GetSwipeAreaCallback getSwipeArea) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_swipe_area"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSwipeArea == null ? MemoryAddress.NULL : getSwipeArea.toCallback()));
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
