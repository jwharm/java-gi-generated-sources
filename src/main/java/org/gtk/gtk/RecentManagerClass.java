package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkRecentManagerClass} contains only private data.
 */
public class RecentManagerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentManagerClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("_gtk_recent1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_recent2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_recent3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_recent4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RecentManagerClass}
     * @return A new, uninitialized @{link RecentManagerClass}
     */
    public static RecentManagerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RecentManagerClass newInstance = new RecentManagerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface ChangedCallback {
        void run(org.gtk.gtk.RecentManager manager);

        @ApiStatus.Internal default void upcall(MemoryAddress manager) {
            run((org.gtk.gtk.RecentManager) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(manager)), org.gtk.gtk.RecentManager.fromAddress).marshal(manager, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkRecent1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkRecent1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_recent1}
     * @param GtkRecent1 The new value of the field {@code _gtk_recent1}
     */
    public void setGtkRecent1(GtkRecent1Callback GtkRecent1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent1 == null ? MemoryAddress.NULL : GtkRecent1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkRecent2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkRecent2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_recent2}
     * @param GtkRecent2 The new value of the field {@code _gtk_recent2}
     */
    public void setGtkRecent2(GtkRecent2Callback GtkRecent2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent2 == null ? MemoryAddress.NULL : GtkRecent2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkRecent3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkRecent3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_recent3}
     * @param GtkRecent3 The new value of the field {@code _gtk_recent3}
     */
    public void setGtkRecent3(GtkRecent3Callback GtkRecent3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent3 == null ? MemoryAddress.NULL : GtkRecent3.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkRecent4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkRecent4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_recent4}
     * @param GtkRecent4 The new value of the field {@code _gtk_recent4}
     */
    public void setGtkRecent4(GtkRecent4Callback GtkRecent4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent4 == null ? MemoryAddress.NULL : GtkRecent4.toCallback()));
    }
    
    /**
     * Create a RecentManagerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RecentManagerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RecentManagerClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RecentManagerClass(input, ownership);
    
    /**
     * A {@link RecentManagerClass.Builder} object constructs a {@link RecentManagerClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RecentManagerClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RecentManagerClass struct;
        
        private Builder() {
            struct = RecentManagerClass.allocate();
        }
        
         /**
         * Finish building the {@link RecentManagerClass} struct.
         * @return A new instance of {@code RecentManagerClass} with the fields 
         *         that were set in the Builder object.
         */
        public RecentManagerClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setChanged(ChangedCallback changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
            return this;
        }
        
        public Builder setGtkRecent1(GtkRecent1Callback GtkRecent1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent1 == null ? MemoryAddress.NULL : GtkRecent1.toCallback()));
            return this;
        }
        
        public Builder setGtkRecent2(GtkRecent2Callback GtkRecent2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent2 == null ? MemoryAddress.NULL : GtkRecent2.toCallback()));
            return this;
        }
        
        public Builder setGtkRecent3(GtkRecent3Callback GtkRecent3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent3 == null ? MemoryAddress.NULL : GtkRecent3.toCallback()));
            return this;
        }
        
        public Builder setGtkRecent4(GtkRecent4Callback GtkRecent4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_recent4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkRecent4 == null ? MemoryAddress.NULL : GtkRecent4.toCallback()));
            return this;
        }
    }
}
