package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrClass} structure stores the type and operations for
 * a particular type of attribute.
 * <p>
 * The functions in this structure should not be called directly. Instead,
 * one should use the wrapper functions provided for {@code PangoAttribute}.
 */
public class AttrClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("copy"),
            Interop.valueLayout.ADDRESS.withName("destroy"),
            Interop.valueLayout.ADDRESS.withName("equal")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrClass}
     * @return A new, uninitialized @{link AttrClass}
     */
    public static AttrClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrClass newInstance = new AttrClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.pango.AttrType getType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.pango.AttrType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.pango.AttrType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
    }
    
    @FunctionalInterface
    public interface CopyCallback {
        org.pango.Attribute run(org.pango.Attribute attr);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress attr) {
            var RESULT = run(org.pango.Attribute.fromAddress.marshal(attr, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(CopyCallback copy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
    }
    
    @FunctionalInterface
    public interface DestroyCallback {
        void run(org.pango.Attribute attr);

        @ApiStatus.Internal default void upcall(MemoryAddress attr) {
            run(org.pango.Attribute.fromAddress.marshal(attr, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DestroyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code destroy}
     * @param destroy The new value of the field {@code destroy}
     */
    public void setDestroy(DestroyCallback destroy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : destroy.toCallback()));
    }
    
    @FunctionalInterface
    public interface EqualCallback {
        boolean run(org.pango.Attribute attr1, org.pango.Attribute attr2);

        @ApiStatus.Internal default int upcall(MemoryAddress attr1, MemoryAddress attr2) {
            var RESULT = run(org.pango.Attribute.fromAddress.marshal(attr1, Ownership.NONE), org.pango.Attribute.fromAddress.marshal(attr2, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EqualCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("equal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
    }
    
    /**
     * Create a AttrClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttrClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttrClass(input, ownership);
    
    /**
     * A {@link AttrClass.Builder} object constructs a {@link AttrClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrClass struct;
        
        private Builder() {
            struct = AttrClass.allocate();
        }
        
         /**
         * Finish building the {@link AttrClass} struct.
         * @return A new instance of {@code AttrClass} with the fields 
         *         that were set in the Builder object.
         */
        public AttrClass build() {
            return struct;
        }
        
        /**
         * the type ID for this attribute
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.pango.AttrType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        public Builder setCopy(CopyCallback copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
            return this;
        }
        
        public Builder setDestroy(DestroyCallback destroy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : destroy.toCallback()));
            return this;
        }
        
        public Builder setEqual(EqualCallback equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
            return this;
        }
    }
}
