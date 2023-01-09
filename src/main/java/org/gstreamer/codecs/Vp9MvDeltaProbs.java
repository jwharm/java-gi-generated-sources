package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Stores motion vectors probabilities updates. This is from the spec
 * and can be used as a binary.
 * @version 1.20
 */
public class Vp9MvDeltaProbs extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9MvDeltaProbs";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_BYTE).withName("joint"),
            MemoryLayout.paddingLayout(8),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("sign"),
            MemoryLayout.paddingLayout(112),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.C_BYTE).withName("klass"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("class0_bit"),
            MemoryLayout.paddingLayout(144),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.C_BYTE).withName("bits"),
            MemoryLayout.sequenceLayout(12, Interop.valueLayout.C_BYTE).withName("class0_fr"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(6, Interop.valueLayout.C_BYTE).withName("fr"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("class0_hp"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("hp")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9MvDeltaProbs}
     * @return A new, uninitialized @{link Vp9MvDeltaProbs}
     */
    public static Vp9MvDeltaProbs allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Vp9MvDeltaProbs newInstance = new Vp9MvDeltaProbs(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vp9MvDeltaProbs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9MvDeltaProbs(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9MvDeltaProbs> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9MvDeltaProbs(input);
    
    /**
     * A {@link Vp9MvDeltaProbs.Builder} object constructs a {@link Vp9MvDeltaProbs} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9MvDeltaProbs.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9MvDeltaProbs struct;
        
        private Builder() {
            struct = Vp9MvDeltaProbs.allocate();
        }
        
        /**
         * Finish building the {@link Vp9MvDeltaProbs} struct.
         * @return A new instance of {@code Vp9MvDeltaProbs} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9MvDeltaProbs build() {
            return struct;
        }
        
        public Builder setJoint(byte[] joint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("joint"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (joint == null ? MemoryAddress.NULL : Interop.allocateNativeArray(joint, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setSign(byte[] sign) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sign"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sign == null ? MemoryAddress.NULL : Interop.allocateNativeArray(sign, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setKlass(byte[] klass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("klass"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (klass == null ? MemoryAddress.NULL : Interop.allocateNativeArray(klass, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setClass0Bit(byte[] class0Bit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("class0_bit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (class0Bit == null ? MemoryAddress.NULL : Interop.allocateNativeArray(class0Bit, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setBits(byte[] bits) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bits == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bits, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setClass0Fr(byte[] class0Fr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("class0_fr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (class0Fr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(class0Fr, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setFr(byte[] fr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fr, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setClass0Hp(byte[] class0Hp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("class0_hp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (class0Hp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(class0Hp, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setHp(byte[] hp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hp, false, SCOPE)));
                return this;
            }
        }
    }
}
