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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9MvDeltaProbs}
     * @return A new, uninitialized @{link Vp9MvDeltaProbs}
     */
    public static Vp9MvDeltaProbs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9MvDeltaProbs newInstance = new Vp9MvDeltaProbs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vp9MvDeltaProbs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9MvDeltaProbs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9MvDeltaProbs struct;
        
         /**
         * A {@link Vp9MvDeltaProbs.Build} object constructs a {@link Vp9MvDeltaProbs} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9MvDeltaProbs.allocate();
        }
        
         /**
         * Finish building the {@link Vp9MvDeltaProbs} struct.
         * @return A new instance of {@code Vp9MvDeltaProbs} with the fields 
         *         that were set in the Build object.
         */
        public Vp9MvDeltaProbs construct() {
            return struct;
        }
        
        public Build setJoint(byte[] joint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("joint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (joint == null ? MemoryAddress.NULL : Interop.allocateNativeArray(joint, false)));
            return this;
        }
        
        public Build setSign(byte[] sign) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sign"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sign == null ? MemoryAddress.NULL : Interop.allocateNativeArray(sign, false)));
            return this;
        }
        
        public Build setKlass(byte[] klass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("klass"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (klass == null ? MemoryAddress.NULL : Interop.allocateNativeArray(klass, false)));
            return this;
        }
        
        public Build setClass0Bit(byte[] class0Bit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class0_bit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (class0Bit == null ? MemoryAddress.NULL : Interop.allocateNativeArray(class0Bit, false)));
            return this;
        }
        
        public Build setBits(byte[] bits) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bits == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bits, false)));
            return this;
        }
        
        public Build setClass0Fr(byte[] class0Fr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class0_fr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (class0Fr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(class0Fr, false)));
            return this;
        }
        
        public Build setFr(byte[] fr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fr, false)));
            return this;
        }
        
        public Build setClass0Hp(byte[] class0Hp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class0_hp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (class0Hp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(class0Hp, false)));
            return this;
        }
        
        public Build setHp(byte[] hp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hp, false)));
            return this;
        }
    }
}
