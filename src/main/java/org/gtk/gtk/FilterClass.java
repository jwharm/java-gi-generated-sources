package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FilterClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("match"),
            Interop.valueLayout.ADDRESS.withName("get_strictness"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved6"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved7"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved8")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FilterClass}
     * @return A new, uninitialized @{link FilterClass}
     */
    public static FilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FilterClass newInstance = new FilterClass(segment.address(), Ownership.NONE);
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
    public interface MatchCallback {
        boolean run(org.gtk.gtk.Filter self, @Nullable org.gtk.gobject.GObject item);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress item) {
            var RESULT = run((org.gtk.gtk.Filter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gtk.Filter.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(item)), org.gtk.gobject.GObject.fromAddress).marshal(item, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MatchCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code match}
     * @param match The new value of the field {@code match}
     */
    public void setMatch(MatchCallback match) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("match"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (match == null ? MemoryAddress.NULL : match.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetStrictnessCallback {
        org.gtk.gtk.FilterMatch run(org.gtk.gtk.Filter self);

        @ApiStatus.Internal default int upcall(MemoryAddress self) {
            var RESULT = run((org.gtk.gtk.Filter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gtk.Filter.fromAddress).marshal(self, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStrictnessCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_strictness}
     * @param getStrictness The new value of the field {@code get_strictness}
     */
    public void setGetStrictness(GetStrictnessCallback getStrictness) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_strictness"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStrictness == null ? MemoryAddress.NULL : getStrictness.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved5Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved5Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved5}
     * @param GtkReserved5 The new value of the field {@code _gtk_reserved5}
     */
    public void setGtkReserved5(GtkReserved5Callback GtkReserved5) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved6Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved6Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved6}
     * @param GtkReserved6 The new value of the field {@code _gtk_reserved6}
     */
    public void setGtkReserved6(GtkReserved6Callback GtkReserved6) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved6 == null ? MemoryAddress.NULL : GtkReserved6.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved7Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved7Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved7}
     * @param GtkReserved7 The new value of the field {@code _gtk_reserved7}
     */
    public void setGtkReserved7(GtkReserved7Callback GtkReserved7) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved7 == null ? MemoryAddress.NULL : GtkReserved7.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved8Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved8Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved8}
     * @param GtkReserved8 The new value of the field {@code _gtk_reserved8}
     */
    public void setGtkReserved8(GtkReserved8Callback GtkReserved8) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved8 == null ? MemoryAddress.NULL : GtkReserved8.toCallback()));
    }
    
    /**
     * Create a FilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FilterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FilterClass(input, ownership);
    
    /**
     * A {@link FilterClass.Builder} object constructs a {@link FilterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FilterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FilterClass struct;
        
        private Builder() {
            struct = FilterClass.allocate();
        }
        
         /**
         * Finish building the {@link FilterClass} struct.
         * @return A new instance of {@code FilterClass} with the fields 
         *         that were set in the Builder object.
         */
        public FilterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setMatch(MatchCallback match) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("match"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (match == null ? MemoryAddress.NULL : match.toCallback()));
            return this;
        }
        
        public Builder setGetStrictness(GetStrictnessCallback getStrictness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_strictness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStrictness == null ? MemoryAddress.NULL : getStrictness.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved5(GtkReserved5Callback GtkReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved6(GtkReserved6Callback GtkReserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved6 == null ? MemoryAddress.NULL : GtkReserved6.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved7(GtkReserved7Callback GtkReserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved7 == null ? MemoryAddress.NULL : GtkReserved7.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved8(GtkReserved8Callback GtkReserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved8 == null ? MemoryAddress.NULL : GtkReserved8.toCallback()));
            return this;
        }
    }
}
